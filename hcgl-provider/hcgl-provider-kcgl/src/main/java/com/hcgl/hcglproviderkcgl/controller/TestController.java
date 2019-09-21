package com.hcgl.hcglproviderkcgl.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value ("${myname}")
    private String myname;

    public String toTest() {
        return myname;
    }
}
