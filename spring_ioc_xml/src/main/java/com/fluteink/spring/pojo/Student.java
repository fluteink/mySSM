package com.fluteink.spring.pojo;

import java.util.Arrays;
import java.util.Map;

/**
 * @author 明宇
 * @version 1.0
 */
public class Student {
    private Integer sid;
    private String sname;
    private Integer age;
    private String gender;
    private Double score;
    private String[] hobby;
    private Clazz clazz;

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", score=" + score +
                ", hobby=" + Arrays.toString(hobby) +
                ", clazz=" + clazz +
                ", teacherMap=" + teacherMap +
                '}';
    }

    public Map<String, Teacher> getTeacherMap() {
        return teacherMap;
    }

    public void setTeacherMap(Map<String, Teacher> teacherMap) {
        this.teacherMap = teacherMap;
    }

    private Map<String,Teacher> teacherMap;

    public Student(Integer sid, String sname, Integer age, String gender, Double score, Clazz clazz) {
        this.sid = sid;
        this.sname = sname;
        this.age = age;
        this.gender = gender;
        this.score = score;
        this.clazz = clazz;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public Student(Integer sid, String sname, Integer age, String gender, Double score, String[] hobby, Clazz clazz) {
        this.sid = sid;
        this.sname = sname;
        this.age = age;
        this.gender = gender;
        this.score = score;
        this.hobby = hobby;
        this.clazz = clazz;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public Student(Integer sid, String sname, Integer age, String gender, Double score) {
        this.sid = sid;
        this.sname = sname;
        this.age = age;
        this.gender = gender;
        this.score = score;
    }

    public Student(String s, String s2, String s23, String age) {
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Student(Integer sid, String sname,  String gender,Double score) {
        this.sid = sid;
        this.sname = sname;
        this.score=score;
        this.gender = gender;
    }

    public Student() {
    }
}
