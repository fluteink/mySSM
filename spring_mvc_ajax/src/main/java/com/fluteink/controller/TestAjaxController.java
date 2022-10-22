package com.fluteink.controller;

import com.fluteink.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 明宇
 * @version 1.0
 */
@Controller
public class TestAjaxController {
    @RequestMapping("hello")
    public String hello(){
        System.out.println(1/0);
        return "success";
    }
    @RequestMapping("/test/ajax")
    public void testAjax(Integer id, HttpServletResponse response, @RequestBody String requestBody) throws IOException {
        System.out.println("id" + id);
        System.out.println("requestBody" + requestBody);
        response.getWriter().write("hello,axios!!");
    }

//    @RequestMapping("/test/RequestBody/json")
    public void testRequestBody(@RequestBody User user, HttpServletResponse response) throws IOException {
        System.out.println(user);
        response.getWriter().write("hello,RequestBody!!");
    }
    @RequestMapping("/test/RequestBody/json")
    public void testRequestBody(@RequestBody Map<String,Object> map, HttpServletResponse response) throws IOException {
        System.out.println(map);
        response.getWriter().write("hello,RequestBody!!!!!!!");
    }
    @RequestMapping("/test/ResponseBody")
    @ResponseBody
    public String testResponseBody(){
        return "success";
    }
    @RequestMapping("SpringMVC/test/ResponseBody/json")
    @ResponseBody
    public List<User> testResponseBodyJson(){
        User user1 = new User(1001, "admin", "123456", 20, "男");
        User user2 = new User(1002, "admin", "123456", 20, "男");
        User user3 = new User(1003, "admin", "123456", 20, "男");
        List<User> list = Arrays.asList(user1, user2, user3);
        return list;
    }
//    public Map<String ,Object> testResponseBodyJson(){
//        User user1 = new User(1001, "admin", "123456", 20, "男");
//        User user2 = new User(1002, "admin", "123456", 20, "男");
//        User user3 = new User(1003, "admin", "123456", 20, "男");
//        HashMap<String, Object> map = new HashMap<>();
//        map.put("1001",user1);
//        map.put("1002",user2);
//        map.put("1003",user3);
//        return  map;
//    }
//    public User testResponseBodyJson(){
//        return new User(1001,"admin","123456",20,"男");
//    }
}
