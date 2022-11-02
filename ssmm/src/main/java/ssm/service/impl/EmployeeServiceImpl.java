package com.fluteink.ssm.service.impl;

import com.fluteink.ssm.mapper.EmployeeMapper;
import com.fluteink.ssm.pojo.Employee;
import com.fluteink.ssm.service.EmployeeService;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 明宇
 * @version 1.0
 */
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;
    @Override
    public List<Employee> getAllEmployees() {
       return employeeMapper.getAllEmployees();
    }
}
