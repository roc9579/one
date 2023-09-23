package com.itany.mycorejava.Test13_jdbc;

import java.io.Serializable;

/**
 * @author 黄鹏程
 * @date 2023年09月13日11:23
 */
public class Emp implements Serializable {

        private Integer id;
        private String name;
        private Double salary;
        private Integer dept_id;
        private Dept dept;

        public Emp() {
        }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Emp(String name, Double salary, Integer dept_id) {
            this.name = name;
            this.salary = salary;
            this.dept_id = dept_id;
        }

        public Emp(Integer id, String name, Double salary, Integer dept_id) {
            this.id = id;
            this.name = name;
            this.salary = salary;
            this.dept_id = dept_id;
        }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", dept_id=" + dept_id +
                ", dept=" + dept +
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

        public Double getSalary() {
            return salary;
        }

        public void setSalary(Double salary) {
            this.salary = salary;
        }

        public Integer getDept_id() {
            return dept_id;
        }

        public void setDept_id(Integer dept_id) {
            this.dept_id = dept_id;
        }

}
