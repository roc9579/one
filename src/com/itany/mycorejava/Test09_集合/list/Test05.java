package com.itany.mycorejava.Test09_集合.list;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 * @author 黄鹏程
 * @date 2023年08月28日16:50
 */
// 提示用户输入5名学生的学号和成绩,创建Student对象(属性:no、score),然后放到ArrayList集合中
// 1.遍历集合,删除学号为2的学生
// 2.不遍历集合,删除学号为3的学生
// 3.不遍历集合,判断集合中是否包含学号为5的学生

public class Test05 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

        zuoye();
    }

    public static void zuoye(){
        ArrayList<Student> arrayList=new ArrayList<>();
        ArrayList<Integer> arr=new ArrayList<>();
        for (int i=0;i<5;i++){
            System.out.print("请输入第"+(i+1)+"名学生的学号");
            int no= sc.nextInt();
            arr.add(no);
            System.out.print("请输入第"+(i+1)+"名学生的成绩");
            double score= sc.nextDouble();
            Student student0=new Student(no,score);
            arrayList.add(student0);
        }
        System.out.println(arrayList);

        for (int i=arrayList.size()-1;i>=0;i--){
            Student student=arrayList.get(i);
            if (student.getNo()==2){
                arrayList.remove(arrayList.get(i));
            }
        }
        System.out.println(arrayList);

        int i=arr.indexOf(3);
        if (i!=-1){
            System.out.println(arrayList.remove(i));
            System.out.println(arrayList);
        }

        int i2=arr.indexOf(5);
        if (i!=-1){
            System.out.println(arrayList.contains(i));
        }

    }

    static class Student{
        private int no;
        private double score;

        @Override
        public String toString() {
            return "Student{" +
                    "no=" + no +
                    ", score=" + score +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return no == student.no;
        }

        @Override
        public int hashCode() {
            return Objects.hash(no);
        }

        public Student() {
        }

        public Student(int no, double score) {
            this.no = no;
            this.score = score;
        }

        public int getNo() {
            return no;
        }

        public void setNo(int no) {
            this.no = no;
        }

        public double getScore() {
            return score;
        }

        public void setScore(double score) {
            this.score = score;
        }
    }
}