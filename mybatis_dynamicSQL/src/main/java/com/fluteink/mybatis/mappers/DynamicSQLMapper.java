package com.fluteink.mybatis.mappers;

import com.fluteink.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 明宇
 * @version 1.0
 */
public interface DynamicSQLMapper
{
    List<Emp> getEmpsByCondition(Emp emp);
    List<Emp> getEmpsByChoose(Emp emp);
    void insertEmps(@Param("emps") List<Emp> emps);
    void deleteEmpsOne(@Param("empIds") Integer[] empIds);
    void deleteEmpsTwo(@Param("empIds") Integer[] empIds);
}
