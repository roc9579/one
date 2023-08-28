package com.itany.mycorejava.BMS;

/**
 * @author 黄鹏程
 * @date 2023年08月21日11:31
 * 信用账户
 */
public class CreditAccount extends Account{
    private double limit;

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    @Override
    public boolean withdrawMoney(double money) {
        // 当账户余额+可透支额度 >= 需要取款的金额时,取款才能成功
        if (super.getBalance()+limit>=money){
            super.setBalance(super.getBalance()-money);
            return true;
        }else{
            return false;
        }
    }
}
