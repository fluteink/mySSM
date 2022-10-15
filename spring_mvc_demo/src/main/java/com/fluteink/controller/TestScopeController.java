package com.fluteink.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.util.Map;

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
        System.out.println(model.getClass().getName());
        model.addAttribute("testRequestScope","hello,model!");
        return "success";
    }
    @RequestMapping("/test/modelmap")
    public String testModelMap(ModelMap modelMap) {
        modelMap.addAttribute("testRequestScope","hello,modelMap!");
        return "success";
    }
    @RequestMapping("/test/map")
    public String testMap(Map<String,Object> map) {
        map.put("testRequestScope","hello,Map!");
        return "success";
    }
    @RequestMapping("/test/session")
    public String testSession(HttpSession session){
        session.setAttribute("testSessionScope","hello,session!!");
        return "success";
    }
    @RequestMapping("/test/application")
    public String testApplication(HttpSession session){
        ServletContext servletContext = session.getServletContext();
        servletContext.setAttribute("testApplicationScope","hello.Application!!!");
        return "success";
    }
}
