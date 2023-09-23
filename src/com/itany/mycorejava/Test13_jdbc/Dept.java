package com.itany.mycorejava.Test13_jdbc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 黄鹏程
 * @date 2023年09月13日11:22
 */
public class Dept implements Serializable {

        private Integer id;
        private String name;
        private String remark;
        private List<Emp> emps=new ArrayList<>();

    public Dept() {
    }

    public List<Emp> getEmps() {
        return emps;
    }

    public void setEmps(List<Emp> emps) {
        this.emps = emps;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", remark='" + remark + '\'' +
                ", emps=" + emps +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Dept(String name, String remark) {
        this.name = name;
        this.remark = remark;
    }

    public Dept(Integer id, String name, String remark) {
        this.id = id;
        this.name = name;
        this.remark = remark;
    }

    public void addEmp(Emp emp) {
        emps.add(emp);
    }
}
