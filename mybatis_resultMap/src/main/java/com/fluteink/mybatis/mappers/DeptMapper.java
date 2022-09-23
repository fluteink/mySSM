package com.fluteink.mybatis.mappers;

import com.fluteink.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

/**
 * @author 明宇
 * @version 1.0
 */
public interface DeptMapper {
    Dept getEmpAndDeptByStep2(@Param("deptId") Integer deptId);
    Dept getDeptAndEmpByDeptId(@Param("DeptId") Integer deptId);
}
