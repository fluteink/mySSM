package com.fluteink.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 明宇
 * @version 1.0
 */
@Controller
//@RequestMapping("/test")
public class TestRequestMappingController {

    @RequestMapping(value = {"/hello", "/abc"},
            method = {RequestMethod.POST, RequestMethod.GET}
//            params = {"username","!password","age=20","gender!=女"}
//            headers = {"referer"}

    )
    public String hello() {
        return "success";
    }

    //    @RequestMapping("/a?a/test/ant")
//    @RequestMapping("/a*a/test/ant")
    @RequestMapping("/**/test/ant")
    public String testAnt() {
        return "success";
    }

    @RequestMapping("/test/rest/{username}/{id}")
    public String testRest(@PathVariable("id") Integer id, @PathVariable("username") String username) {
        System.out.println("id: " + id + ",username : " + username);
        return "success";
    }
}
