package com.fluteink.ssm.mapper;

import com.fluteink.ssm.pojo.Employee;

import java.util.List;

/**
 * @author 明宇
 * @version 1.0
 */
public interface EmployeeMapper {

    List<Employee> getAllEmployees();
}
