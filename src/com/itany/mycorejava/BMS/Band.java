package com.itany.mycorejava.BMS;

/**
 * @author 黄鹏程
 * @date 2023年08月21日11:32
 * 银行类
 */
public class Band {
    // 定义一个静态变量,用于存放所有的开户的账户信息
    // 由于无法确定开户的账户数量,可以给一个初始值
    static Account[] accounts = new Account[100];
    // 定义当前已开户账户总数量
    static int count = 0;


    /**
     * 开户功能,用户开户的账户数量不能超出银行给定的总数量
     * @param account
     * @return
     */
    public static boolean register(Account account){
        // 只要当前开户的总数量没有达到最大值,则可以开户
        // 开户即表示将一个新的账户添加到银行的账户数组中
        if (count<accounts.length-1){
            accounts[count++]=account;
            return true;
        }else{
            return false;
        }

    }

    /**
     * 账户登录
     * @param id    卡号
     * @param password  密码
     * @return
     */
    public static Account login(int id,String password){
        // 如何判断用户输入的卡号与密码是否正确?
        // 遍历银行的所有的已开户账户信息
        // 查看是否有某一个账户与提供了卡号和密码一致
        // 如果存在,则返回该账户,表示是这个账户登录了
        // 如果不存在,则返回卡号或密码错误,此时可以返回null,表示没找到
        for(int i=0;i< accounts.length-1;i++){
            // 取出当前遍历的Account对象
            Account account = accounts[i];
            // 查看是否有某一个账户与提供了卡号和密码一致
            if(account.getId() == id && password.equals(account.getPassword())){
                // 如果存在,则返回该账户,表示是这个账户登录了
                return account;
            }
        }
        return null;
    }

    public static Account isId(int id){
        for(int i=0;i< count;i++){
            // 取出当前遍历的Account对象
            Account account = Band.accounts[i];
            // 查看是否有某一个账户与提供了卡号和密码一致
            if(account.getId() == id ){
                // 如果存在,则返回该账户,表示是这个账户登录了
                return account;
            }
        }
        return null;
    }

    public static Account[] getAccounts() {
        return accounts;
    }

    public static void setAccounts(Account[] accounts) {
        Band.accounts = accounts;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Band.count = count;
    }
}
