package com.itany.mycorejava.BMS;

import java.util.Scanner;

/**
 * @author 黄鹏程
 * @date 2023年08月21日16:34
 */
public class BankMenu {
    // 银行主菜单要求用户必须成功登录后才能访问
    // 创建一个有参构造方法,参数为Account对象,覆盖默认的无参
    private Account account;

    public BankMenu(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void showMenu(){
        Scanner sc=new Scanner(System.in);
        System.out.println("************************欢迎"+account.getName()+"进入银行主菜单************************");
        System.out.print("请选择服务功能(1.存款 2.取款 3.查询余额 4.转账 5.贷款 6.还贷 7.修改密码 8.退出登录):");
        int num=sc.nextInt();
        switch (num){
            case 1:
                System.out.print("请输入要存款的金额");
                account.deposit(sc.nextDouble());
                showMenu();
            case 2:
                System.out.print("请输入要取款的金额");
                boolean with = account.withdrawMoney(sc.nextDouble());
                if (with){
                    System.out.println("取款成功");
                }else{
                    System.out.println("取款失败");
                }
                showMenu();
            case 3:
                System.out.println("您的余额为"+account.getBalance());
                showMenu();
            case 4:
                trans();
                break;
            case 5:
                providerLoan();
                break;
            case 6:
                payLoan();
                break;
            case 7:
                System.out.print("请输入要修改的密码");
                String password=sc.next();
                account.setPassword(password);
                showMenu();
            case 8:
                layout();
                break;
            default:
                System.out.println("输入有误");
                showMenu();

        }
    }
    public void trans(){
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入要转账的用户id");
        int id=sc.nextInt();
        Account account1=Band.isId(id);
        if (account1!=null){
            System.out.println("请输入转账的金额");
            double money=sc.nextDouble();
            account.setBalance(account.getBalance()-money);
            account1.setBalance(account1.getBalance()+money);
            System.out.println("转账成功");

        }else{
            System.out.println("转账失败");
        }
        showMenu();
    }

    public void providerLoan(){
        Scanner sc=new Scanner(System.in);

        if (account instanceof Loanable){
            System.out.print("请输入要贷款的金额");
            double loadAmount= sc.nextDouble();
            Loanable loanable=(Loanable)account;
            loanable.providerLoan(loadAmount);
        }else{
            System.out.println("不是贷款账户");
        }
        showMenu();
    }

    public void payLoan(){
        Scanner sc=new Scanner(System.in);

        if (account instanceof Loanable){
            System.out.print("请输入要贷款的金额");
            double loadAmount= sc.nextDouble();
            Loanable loanable=(Loanable)account;
            loanable.payLoan(loadAmount);
        }else{
            System.out.println("不是贷款账户");
        }
        showMenu();
    }
    public void layout(){
        System.out.println("您成功退出登录了");
        Start start=new Start();
        start.showMenu();
    }

}
