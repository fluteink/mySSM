package com.fluteink.ssm.controller;

import com.fluteink.ssm.pojo.Employee;
import com.fluteink.ssm.service.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    private EmployeeServiceImpl employeeService;
    @RequestMapping(value = "employee",method = RequestMethod.GET)
    public String getAllEmployees(Model model) {
    List<Employee> list= employeeService.getAllEmployees();
    model.addAttribute("list",list);
    return "employee_list";
}
}
