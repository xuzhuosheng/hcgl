package com.hcgl.jwtauthorization.common.interceptor;

import com.hcgl.jwtauthorization.common.annotation.JwtIgnore;
import com.hcgl.jwtauthorization.common.response.ResultCode;
import com.hcgl.jwtauthorization.entity.Audience;
import com.hcgl.jwtauthorization.utils.JwtTokenUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ========================
 * token验证拦截器
 * Created with IntelliJ IDEA.
 * User：pyy
 * Date：2019/7/18 9:46
 * Version: v1.0
 * ========================
 */

@Slf4j
public class JwtInterceptor implements HandlerInterceptor {
    @Autowired
    private Audience audience;
    private static Logger logger = LoggerFactory.getLogger(JwtInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info("==========token认证========");
        String url = request.getRequestURI();
        logger.info("==========拦截地址：========" + url);

        // 忽略带JwtIgnore注解的请求, 不做后续token认证校验
        if (handler instanceof HandlerMethod) {
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            JwtIgnore jwtIgnore = handlerMethod.getMethodAnnotation(JwtIgnore.class);
            if (jwtIgnore != null) {
                return true;
            }
        }

        if (HttpMethod.OPTIONS.equals(request.getMethod())) {
            response.setStatus(HttpServletResponse.SC_OK);
            return true;
        }

        // 获取请求头信息authorization信息
        final String authHeader = request.getHeader(JwtTokenUtil.AUTH_HEADER_KEY);
        logger.info("## authHeader= {}", authHeader);

        if (StringUtils.isBlank(authHeader) || !authHeader.startsWith(JwtTokenUtil.TOKEN_PREFIX)) {
            logger.info("### 用户未登录，请先登录 ###");
            logger.info(String.valueOf(ResultCode.USER_NOT_LOGGED_IN));
//            throw new CustomException(ResultCode.USER_NOT_LOGGED_IN);
        }

        // 获取token
        final String token = authHeader.substring(7);

        if (audience == null) {
            BeanFactory factory =
                    WebApplicationContextUtils.getRequiredWebApplicationContext(request.getServletContext());
            audience = (Audience) factory.getBean("audience");
        }

        // 验证token是否有效--无效已做异常抛出，由全局异常处理后返回对应信息
        JwtTokenUtil.parseJWT(token, audience.getBase64Secret());

        return true;
    }
}
