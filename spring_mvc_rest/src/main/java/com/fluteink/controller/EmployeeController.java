package com.fluteink.controller;

import com.fluteink.dao.EmployeeDao;
import com.fluteink.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;

/**
 * @author 明宇
 * @version 1.0
 */
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeDao employeeDao;

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public String getAllEmployees(Model model) {
        Collection<Employee> allEmployees = employeeDao.getAll();
        model.addAttribute("allEmployees",allEmployees);
        return "employee_list";
    }
    @RequestMapping(value = "/employee",method = RequestMethod.POST)
    public String addEmployee(Employee employee){
        employeeDao.save(employee);
        return "redirect:/employee";
    }
}
