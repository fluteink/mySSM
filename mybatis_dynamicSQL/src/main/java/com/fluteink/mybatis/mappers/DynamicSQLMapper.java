package com.fluteink.mybatis.mappers;

import com.fluteink.mybatis.pojo.Emp;

import java.util.List;

/**
 * @author 明宇
 * @version 1.0
 */
public interface DynamicSQLMapper
{
    List<Emp> getEmpsByCondition(Emp emp);
    List<Emp> getEmpsByChoose(Emp emp);
    void insertEmps(List<Emp> emps);
}
