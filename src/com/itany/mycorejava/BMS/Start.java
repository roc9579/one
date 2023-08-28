package com.itany.mycorejava.BMS;

import java.util.Scanner;

/**
 * @author 黄鹏程
 * @date 2023年08月21日15:01
 */
public class Start {
    private Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Start start = new Start();
        start.showMenu();
    }

    public void showMenu() {

        System.out.println("*********************欢迎进入银行系统*********************");
        System.out.print("请选择对应的服务(1.开户 2.登录):");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                // 实现开户
                register();
                break;
            case 2:
                // 实现登录
                login();
                break;
            default:
                System.out.println("您输入的选项有误,请重新输入!");
                showMenu();
                break;
        }
    }

    public void register(){
        System.out.print("请选择开户的账户类型(1.储蓄账户 2.信用账户 3.贷款的储蓄账户 4.贷款的信用账户):");
        int choice = sc.nextInt();
        Account account = null;
        switch (choice){
            case 1:
                account=new SavingAccount();
                break;
            case 2:
                account=new CreditAccount();
                break;
            case 3:
                account=new LoanSavingAccount();
                break;
            case 4:
                account=new LoanCreditAccount();
                break;
            default:
                register();
        }
        // 输入姓名、密码、身份证号码、手机号码
        // 密码需要输入两次,两次必须一致
        // 如果两次输入的密码不一致,则重新输入,一直到一致为止
        // 账户余额初始为0
        System.out.println("请输入姓名");
        account.setName(sc.next());
        while (true){
            System.out.println("请输入密码");
            String password=sc.next();
            System.out.println("再次请输入密码");
            String password1=sc.next();
            if (password.equals(password1)){
                account.setPassword(password);
                break;
            }
        }
        System.out.println("请输入身份证号码");
        account.setPersonId(sc.next());
        System.out.println("请输入手机号码");
        account.setPhone(sc.next());
        // 如果是储蓄账户,直接开户
        // 如果是信用账户,需要设置透支额度
        if (account instanceof CreditAccount){
            CreditAccount creditAccount=(CreditAccount)account;
            System.out.println("请输入透支额度");
            creditAccount.setLimit(sc.nextDouble());
        }
        // 信息全部输入完成之后,需要保存到银行系统
        // 因此,调用银行类中提供的开户功能实现开户
        boolean flat=Band.register(account);
        if (flat){
            System.out.println(account.getId());
        }else{
            System.out.println("失败，请再来一次");
        }
        showMenu();
    }

    public void login(){
        // 输入卡号与密码
        // 根据银行提供的登录方法,判断是否登录成功
        // 如果登录成功,则进入到银行主菜单
        // 如果登录失败,返回系统入口重新登录
        System.out.println("请输入卡号");
        int id=sc.nextInt();
        System.out.println("请输入密码");
        String password=sc.next();
        Account account=Band.login(id, password);
        if (account!=null){
            System.out.println("成");
            new BankMenu(account).showMenu();
        }else{
            System.out.println("失败");
            showMenu();
        }
    }

}
