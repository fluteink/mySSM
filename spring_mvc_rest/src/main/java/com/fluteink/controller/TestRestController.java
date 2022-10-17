package com.fluteink.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author 明宇
 * @version 1.0
 * /user
 * * 查询所有的用户信息-->/user-->get
 * * 根据id查询用户信息-->/user/1-->get
 * * 添加用户信息-->/user-->post
 * * 修改用户信息-->/user-->put
 * * 删除用户信息-->/user/1-->delete
 */
@Controller
public class TestRestController {
    //    @RequestMapping(value = "/user",method = RequestMethod.GET)
    @GetMapping("/user")
    public String getAllUsers() {
        System.out.println("查询所有的用户信息-->/user-->get");
        return "success";
    }

    //    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    @GetMapping("/user/{id}")
    public String getUserById1(@PathVariable("id") Integer id) {
        System.out.println("根据id查询用户信息-->/user/" + id + "-->get");
        return "success";
    }

    //    @RequestMapping(value = "/user",method = RequestMethod.POST)
    @PostMapping("/user")
    public String insertUser() {
        System.out.println("添加用户信息-->/user-->post");
        return "success";
    }

    //    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    @PutMapping("/user")
    public String updateUser() {
        System.out.println("修改用户信息-->/user-->put");
        return "success";
    }

    //    @RequestMapping(value = "/user/{id}",method = RequestMethod.DELETE)
    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable("id") Integer id) {
        System.out.println("删除用户信息-->/user/" + id + "-->delete");
        return "success";
    }

}
