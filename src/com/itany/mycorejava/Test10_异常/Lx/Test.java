package com.itany.mycorejava.Test10_异常.Lx;



import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 黄鹏程
 * @date 2023年08月31日17:18
 */
// 定义一个用户类User,拥有以下属性:id、username、password、phone、address
// 通过控制台输入的方式实现以下方法,数据存储到集合中
// 根据以下说明,所有不符合要求的场景都设计成自定义异常
// 所有异常在方法中声明抛出,在菜单中捕获处理
// 1.注册,注册时用户名不能重复,注册时密码需要输入两次,两次的密码必须一致
// 2.登录,根据用户名与密码进行登录,登录的用户必须是注册过的用户
// 登录成功返回:欢迎您:xxx用户
// 3.修改密码,控制台输入一个需要修改密码的用户名,修改指定用户的密码
// 修改密码时指定的用户必须存在
// 修改密码时需要输入原密码,只有原密码正确才能修改
// 修改密码时输入的两次新密码必须一致
public class Test {
    public static void main(String[] args) {
        User.menu();
    }
}

// 定义一个用户类User,拥有以下属性:id、username、password、phone、address
class User{
    private static int id;
    private static String username;
    private static String password;
    private static String phone;
    private static String address;
    private static int startId=1000;
    static Scanner sc=new Scanner(System.in);
    static ArrayList<User> users=new ArrayList<>();

    // 通过控制台输入的方式实现以下方法,数据存储到集合中
    // 根据以下说明,所有不符合要求的场景都设计成自定义异常
    // 所有异常在方法中声明抛出,在菜单中捕获处理
    public static void menu(){

        System.out.println("请选择要进入的菜单：1，注册 2，登录 3，修改密码 4，退出");
        int choice=sc.nextInt();
        try {
            switch (choice){
                case 1:
                    register();
                    menu();
                    break;
                case 2:
                    login();
                    menu();
                    break;
                case 3:
                    mod();
                    menu();
                    break;
                case 4:
                    System.out.println("成功退出");
                    break;
                default:
                    throw new InputError("输入错误");
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
            menu();
        }
    }

    // 1.注册,注册时用户名不能重复,注册时密码需要输入两次,两次的密码必须一致
    public static void register() throws UserExistException, PasswordNotSimple {
        id=startId++;
//        try{
            System.out.print("请输入用户名");
            username= sc.next();
            for (int i=0;i<users.size();i++){
                if (username.equals(users.get(i).getUsername())){
                    throw new UserExistException("用户名重复");
                }
            }
            System.out.print("请输入密码");
            password=sc.next();
            System.out.print("请再次输入密码");
            if (!password.equals(sc.next())){
                throw new PasswordNotSimple("两次输入密码不一致");
            }
            System.out.print("请输入手机号码");
            phone=sc.next();
            System.out.print("请输入地址");
            address=sc.next();
            users.add(new User(id,username,password,phone,address));
//        } catch (UserExistException | PasswordNotSimple e) {
//            System.err.println(e.getMessage());
//            register();
//        }

    }
    // 2.登录,根据用户名与密码进行登录,登录的用户必须是注册过的用户
    // 登录成功返回:欢迎您:xxx用户
    public static void login() throws UserExistException, PasswordNotSimple {
            System.out.print("请输入用户名");
            String username1=sc.next();
            int num=0;
            for (int i=0;i<users.size();i++){
                if (username1.equals(users.get(i).getUsername())){
                    System.out.print("请输入密码");
                    String password1=sc.next();
                    if (password1.equals(users.get(i).getPassword())){
                        System.out.println("欢迎您:"+users.get(i).getUsername()+"用户");
                    }else{
                        throw new PasswordNotSimple("密码不正确");
                    }
                    num++;
                }
            }
            if (num==0){
                throw new UserExistException("用户不存在");
            }
//        } catch (PasswordNotSimple | UserExistException e) {
//            System.err.println(e.getMessage());
//            login();
//        }

    }

    // 3.修改密码,控制台输入一个需要修改密码的用户名,修改指定用户的密码
    // 修改密码时指定的用户必须存在
    // 修改密码时需要输入原密码,只有原密码正确才能修改
    // 修改密码时输入的两次新密码必须一致
    public static void mod() throws UserExistException, PasswordNotSimple {
//        try {
            System.out.print("请输入需要修改的用户名");
            String name=sc.next();
            int num=0;
            for (int i=0;i<users.size();i++){
                if (name.equals(users.get(i).getUsername())){
                    System.out.print("请输入原密码");
                    String password=sc.next();
                    if (password.equals(users.get(i).getPassword())){
                        System.out.print("请输入新密码");
                        String password1=sc.next();
                        System.out.print("请再次输入新密码");
                        String password2=sc.next();
                        if (password1.equals(password2)){
                            users.get(i).setPassword(password1);
                            System.out.println("修该密码成功");
                        }else{
                            throw new PasswordNotSimple("密码不一致");
                        }
                    }else{
                        throw new PasswordNotSimple("密码不正确");
                    }
                    num++;
                }
            }
            if (num==0){
                throw new UserExistException("用户不存在");
            }
//        } catch (PasswordNotSimple  | UserExistException e) {
//            System.err.println(e.getMessage());
//            mod();
//        }
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User() {
    }

    public User(int id, String username, String password, String phone, String address) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.address = address;
    }
}