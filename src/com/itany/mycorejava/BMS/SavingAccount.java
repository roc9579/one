package com.itany.mycorejava.BMS;

/**
 * @author 黄鹏程
 * @date 2023年08月21日11:30
 * 储蓄账户
 */
public class SavingAccount extends Account {


    @Override
    public boolean withdrawMoney(double money) {
        // 当账户余额 >= 需要取款的金额时,取款才能成功
        // 取款成功之后,账户余额随之减少
        if(super.getBalance()>=money){
            super.setBalance(super.getBalance()-money);
            return true;
        }else{
            return false;
        }
    }
}
