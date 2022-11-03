package com.fluteink.ssm.controller;

import com.fluteink.ssm.pojo.Employee;
import com.fluteink.ssm.service.EmployeeService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author 明宇
 * @version 1.0
 */
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;



    @RequestMapping(value = "employee/page/{pageNum}",method = RequestMethod.GET)
    public String getEmployeePage(@PathVariable("pageNum")Integer pageNum,Model model) {
        PageInfo<Employee> page=employeeService.getEmployeePage(pageNum);
        model.addAttribute("page",page);
        return "employee_list_page";
    }



    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public String getAllEmployee(Model model){
        //查询所有的员工信息
        List<Employee> list = employeeService.getAllEmployee();
        //将员工信息在请求域中共享
        model.addAttribute("list", list);
        //跳转到employee_list.html
        return "employee_list";
    }
}
