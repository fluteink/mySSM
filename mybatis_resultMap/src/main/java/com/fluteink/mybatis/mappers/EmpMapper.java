package com.fluteink.mybatis.mappers;

import com.fluteink.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

/**
 * @author 明宇
 * @version 1.0
 */
public interface EmpMapper {
    Emp getEmpByEmpId (@Param("empId") Integer empId);
}
