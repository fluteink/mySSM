package com.fluteink.mybatis.pojo;

import java.util.List;

/**
 * @author 明宇
 * @version 1.0
 */
public class Dept
{
    private Integer deptId;
    private String deptName;
private List<Emp> emps;

    public List<Emp> getEmps() {
        return emps;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                ", emps=" + emps +
                '}';
    }

    public void setEmps(List<Emp> emps) {
        this.emps = emps;
    }

    public Dept(Integer deptId, String deptName, List<Emp> emps) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.emps = emps;
    }

    public Dept(Integer deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }

    public Dept() {
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
