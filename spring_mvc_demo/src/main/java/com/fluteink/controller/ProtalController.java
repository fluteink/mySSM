package com.fluteink.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 明宇
 * @version 1.0
 */
@Controller
public class ProtalController {
    @RequestMapping("/")
    public String protal(){
        return "index";
    }
}
