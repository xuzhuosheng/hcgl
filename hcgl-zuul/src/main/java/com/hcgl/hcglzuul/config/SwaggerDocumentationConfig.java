package com.hcgl.hcglzuul.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.zuul.filters.Route;
import org.springframework.cloud.netflix.zuul.filters.RouteLocator;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Component
@Primary
public class SwaggerDocumentationConfig implements SwaggerResourcesProvider {


    @Autowired
    private final RouteLocator routeLocator;

    public SwaggerDocumentationConfig(RouteLocator routeLocator) {
        this.routeLocator = routeLocator;
    }


    @Override
    public List<SwaggerResource> get() {
        List<SwaggerResource> resources = new ArrayList<>();
        List<Route> routes = routeLocator.getRoutes();
        System.out.println(Arrays.toString(routes.toArray()));
        routes.forEach(route -> {
            resources.add(
                    swaggerResource(route.getFullPath().split("/")[1], route.getFullPath().replace("/**", "/v2/api-docs"), "2.0")
            );
            System.out.println(route.getFullPath().replace("/**", "/v2/api-docs"));
        });
        return resources;
    }


    private SwaggerResource swaggerResource(String name, String location, String version) {
        SwaggerResource swaggerResource = new SwaggerResource();
        swaggerResource.setName(name);
        swaggerResource.setLocation(location);
        swaggerResource.setSwaggerVersion(version);
        return swaggerResource;

    }
}

