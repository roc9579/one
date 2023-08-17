package com.itany.mycorejava.code06;

/**
 * @author 黄鹏程
 * @date 2023年08月16日13:46
 */
public class Test02_练习 {
    public static void main(String[] args) {
        Account account =new Account();
        account.name="张三";
        account.money=100;
        account.cq=10;
        account.zzz="李四";
        account.zz=10;
        account.cq();
        account.zz();
    }

}

class Account{
    String name;
    double money=100;
    double cq;
    String zzz;
    double zz;
    double qq;
    public void ye(){
        System.out.println("户主姓名："+name+",余额："+money);
    }
    public void cq(){
        double money=this.money+cq;
        System.out.println("存了"+cq+"元，余额"+money);
    }
    public void zz(){
        double money=this.money+zz;
        System.out.println(zzz+"给您转了"+zz+"元，余额"+money);
    }
    public void qq(){
        double money=this.money-qq;
        if(qq<=money){
            System.out.println("取了"+qq+"元，剩余"+money);
        } else{
            System.out.println("您没有怎么多钱");
        }
    }
}