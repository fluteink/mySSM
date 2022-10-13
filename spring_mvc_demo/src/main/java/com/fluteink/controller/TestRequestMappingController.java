package com.fluteink.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 明宇
 * @version 1.0
 */
@Controller
//@RequestMapping("/test")
public class TestRequestMappingController {

    @RequestMapping(value = {"/hello","/abc"},
            method = {RequestMethod.POST,RequestMethod.GET},
            params = {"username"}
    )
    public String hello(){
        return "success";
    }
}
