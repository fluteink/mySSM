package com.fluteink.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 明宇
 * @version 1.0
 */
@Controller
public class TestAjaxController {
    @RequestMapping("/test/ajax")
    public void testAjax(Integer id, HttpServletResponse response, @RequestBody String requestBody) throws IOException {
        System.out.println("id" + id);
        System.out.println("requestBody" + requestBody);
        response.getWriter().write("hello,axios!!");
    }

    @RequestMapping("test/RequestBody/json")
    public void testRequestBody(HttpServletResponse response) throws IOException {
        response.getWriter().write("hello,RequestBody!!");
    }
}
