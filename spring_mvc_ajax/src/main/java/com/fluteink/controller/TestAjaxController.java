package com.fluteink.controller;

import org.springframework.stereotype.Controller;
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
    public void testAjax(Integer id, HttpServletResponse response) throws IOException {
    System.out.println("id"+id);
    response.getWriter().write("hello,axios!!");
}
}
