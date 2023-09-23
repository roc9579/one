package com.itany.mycorejava.Test15_java8新特性;

import java.util.List;
import java.util.Optional;

/**
 * @author 黄鹏程
 * @date 2023年09月15日16:29
 */


public class 黄鹏程_9_15_hw {
    private static List<Emp> emps = Emp.getData();

    public static void main(String[] args) {
//        printAll();
//        print2();
//        print3();
//        print4();
//        print5();
//        printAvgSalary();
//        printadd();
    }


      // 1.找出所有员工,并按工资升序排序,打印出员工姓名与工资
    public static void printAll(){
        emps.stream()
                .sorted((o1,o2)-> (int) (o1.getSalary()-o2.getSalary()))
                .forEach(s-> System.out.println(s.getName()+"\t"+s.getSalary()));

    }

      // 2.找出所有研发部员工,按照工资降序排序,打印出员工姓名、工资、部门
    public static void print2(){
        emps.stream()
                .filter(s->s.getDept().getName().equals("研发部"))
                .sorted((o1,o2)-> (int) (o2.getSalary()-o1.getSalary()))
                .forEach(s-> System.out.println(s.getName()+"\t"+s.getSalary()+"\t"+s.getDept()));
    }

    // 3.找出员工都属于哪些部门
    public static void print3(){
        emps.stream()
                .sorted((o1,o2)->o1.getDept().getId()-o2.getDept().getId())
                .forEach(s-> System.out.println(s.getName()+"\t"+s.getDept().getName()));
    }

    // 4.输出最高工资的员工信息
    public static void printMaxSalary(){
        Optional<Emp> max = emps.stream().max((o1, o2) -> (int) (o1.getSalary() - o2.getSalary()));
        System.out.println(max.get());
    }

    // 5.输出最低工资的员工信息
    public static void printMinSalary(){
        Optional<Emp> min = emps.stream().min((o1, o2) -> (int) (o1.getSalary() - o2.getSalary()));
        System.out.println(min.get());
    }

    // 6.输出员工的平均工资
    public static void printAvgSalary(){
        long count = emps.stream().count();
        Optional<Emp> reduceSumSalary = emps.stream().reduce((o1, o2) -> new Emp(100, "sumSalary", o1.getSalary() + o2.getSalary(), null));
        System.out.println(reduceSumSalary.get().getSalary()/count);
    }

    // 7.在每一个员工姓名前加前缀itany_
    public static void printAdd(){
        emps.stream().map(s->{s.setName("itany_"+s.getName());return s;})
                .forEach(System.out::println);
    }

}
