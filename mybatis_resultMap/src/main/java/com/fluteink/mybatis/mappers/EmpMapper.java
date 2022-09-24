package com.fluteink.mybatis.mappers;

import com.fluteink.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 明宇
 * @version 1.0
 */
public interface EmpMapper {
    Emp getEmpByEmpId (@Param("empId") Integer empId);
    Emp getEmpAndDeptByEmpId (@Param("empId") Integer empId);
    Emp getEmpAndDeptByStep (@Param("empId") Integer empId);
    List<Emp> getEmpsByDeptId (@Param("deptId") Integer deptId);
}
