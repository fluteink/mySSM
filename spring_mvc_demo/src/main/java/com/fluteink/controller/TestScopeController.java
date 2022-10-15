package com.fluteink.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author 明宇
 * @version 1.0
 */
@Controller
public class TestScopeController {
    @RequestMapping("/test/mav")
    public ModelAndView testMAV() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("testRequestScope", "hello,ModelAndView");
        mav.setViewName("success");
        return mav;
    }
    @RequestMapping("/test/model")
    public String testModel(Model model) {
        model.addAttribute("testRequestScope","hello,model!");
        return "success";
    }
    @RequestMapping("/test/map")
    public String testMap(ModelMap modelMap) {
        modelMap.addAttribute("testRequestScope","hello,modelMap!");
        return "success";
    }
}
