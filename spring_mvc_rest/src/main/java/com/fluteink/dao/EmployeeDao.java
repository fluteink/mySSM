package com.fluteink.dao;

import com.fluteink.pojo.Employee;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 明宇
 * @version 1.0
 *  * 查询所有的员工信息-->/employee-->get
 *  * 跳转到添加页面-->/to/add-->get
 *  * 新增员工信息-->/employee-->post
 *  * 跳转到修改页面-->/employee/1-->get
 *  * 修改员工信息-->/employee-->put
 *  * 删除员工信息-->/employee/1-->delete
 */
@Repository
public class EmployeeDao {
    private static Map<Integer, Employee> employees = null;

    static {
        employees = new HashMap<Integer, Employee>();
        employees.put(1001, new Employee(1001, "E-AA", "aa@163.com", 1));
        employees.put(1002, new Employee(1002, "E-BB", "bb@163.com", 1));
        employees.put(1003, new Employee(1003, "E-CC", "cc@163.com", 0));
        employees.put(1004, new Employee(1004, "E-DD", "dd@163.com", 0));
        employees.put(1005, new Employee(1005, "E-EE", "ee@163.com", 1));
    }

    private static Integer initId = 1006;

    public void save(Employee employee) {
        if (employee.getId() == null) {
            employee.setId(initId++);
        }
        employees.put(employee.getId(), employee);
    }

    public Collection<Employee> getAll() {
        return employees.values();
    }

    public Employee get(Integer id) {
        return employees.get(id);
    }

    public void delete(Integer id) {
        employees.remove(id);
    }

}
