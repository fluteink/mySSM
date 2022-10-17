package com.fluteink.controller;

import com.fluteink.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author 明宇
 * @version 1.0
 */
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeDao employeeDao;

}
