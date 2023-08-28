package com.itany.mycorejava.homework._8_18.黄鹏程;

import java.util.Scanner;

/**
 * @author 黄鹏程
 * @date 2023年08月18日16:10
 */
public class 租车系统 {


}
abstract class MotorVehicle{
    private String no;
    private String brand;

    public MotorVehicle(){

    }
    public MotorVehicle(String no,String brand){
        this.no=no;
        this.brand=brand;
    }


    public void setNo(String no) {
        this.no = no;
    }

    public String getNo() {
        return no;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public abstract double  zujin(int day);
}
class Car extends MotorVehicle{
    private String type;



    public Car(){

    }
    public Car(String no,String brand,String type){
        super(no,brand);
        this.type=type;

    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public double  zujin(int day) {

        //int num=0;
        Scanner sc=new Scanner(System.in);
        CarConstant carConstant=new CarConstant();
        int price=0;
        //while(true){
            System.out.println("请选择具体车型:1,宝马X1 2,奔驰GLC 3,保驰捷帕拉梅拉 4,劳斯莱斯幻影");
            int choice=sc.nextInt();
            switch (choice){
                case 1:
                    price=carConstant.bmx1;
                    //num++;
                    break;
                case 2:
                    price=carConstant.bcGLC;
                    //num++;
                    break;
                case 3:
                    price=carConstant.plml;
                    //num++;
                    break;
                case 4:
                    price=carConstant.hy;
                    //num++;
                    break;
            }


        double zujin=price* day;
        return zujin;
    }
}
class Bus extends MotorVehicle{
    private int seatCount;

    public Bus(){

    }
    public Bus(String no,String brand,int seatCount){
        super(no,brand);
        this.seatCount=seatCount;
    }
    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }
    public int getSeatCount() {
        return seatCount;
    }

    @Override
    public double  zujin(int day) {
        //int num=0;
        Scanner sc=new Scanner(System.in);
        CarConstant carConstant=new CarConstant();
        int price=0;
        //while(true){
            System.out.println("请选择具体车型:1,20座考斯特 2,25座奔驰凌特 3,35座宇通客车 4,45座金龙客车");
            int choice=sc.nextInt();
            switch (choice){
                case 1:
                    price=carConstant.x30;
                    //num++;
                    break;
                case 2:
                    price=carConstant.x30;
                    //num++;
                    break;
                case 3:
                    price=carConstant.s30;
                    //num++;
                    break;
                case 4:
                    price=carConstant.s30;
                    //num++;
                    break;
            }

        Test test=new Test();

        double zujin=price*day;
        return zujin;
    }
}
final class CarConstant{
    public static final String BMW="BMWX1";
    public static final String ww="BMWX1";
    public static final int bmx1=200;
    public static final int bcGLC=300;
    public static final int plml=800;
    public static final int hy=2000;
    public static final int x30=1000;
    public static final int s30=2000;
}
class Customer{
    private String name;
    private String phone;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }
}

class Test{
    private static int day;

    public void setDay(int day) {
        this.day = day;
    }

    public  int getDay() {
        return day;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Customer customer=new Customer();
        System.out.println("欢迎进入租车系统,请输入客户信息");
        System.out.print("请输入客户姓名");
        customer.setName(sc.next());
        //System.out.println();
        System.out.print("请输入客户手机号");
        customer.setPhone(sc.next());
        int num=0;
        double sumzujin=0;
        while(true){
            double zujin=0;
            System.out.print("选择需要租赁的汽车类型:1,轿车、2,客车、3,退出");
            int choice1=sc.nextInt();
            if(choice1==1){
                Car car=new Car("no","brand","type");
                zujin=car.zujin(3);
                num++;
                sumzujin=sumzujin+zujin;
            } else if(choice1==2){
                Bus bus=new Bus("no","brand",0);
                zujin=bus.zujin(3);
                num++;
                sumzujin=sumzujin+zujin;
            }else{
                break;
            }

        }
        System.out.println("选择租赁的天数");
        Car car=new Car("no","brand","type");
        Bus bus=new Bus("no","brand",0);
        System.out.println("用户："+customer.getName()+"，号码；"+customer.getPhone()+",共租赁了"+num+"辆车"+"，租赁了"+day+"天,"+"总租金"+sumzujin+"元");
    }
}