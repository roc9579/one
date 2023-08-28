package com.itany.mycorejava.BMS;

/**
 * @author 黄鹏程
 * @date 2023年08月21日11:31
 * 贷款的储蓄账户
 */
public class LoanSavingAccount extends SavingAccount implements Loanable {

    private double loadAmount;//贷款金额

    public double getLoadAmount() {
        return loadAmount;
    }

    public void setLoadAmount(double loadAmount) {
        this.loadAmount = loadAmount;
    }

    @Override
    public void providerLoan(double money) {
        loadAmount=loadAmount+money;
    }

    @Override
    public boolean payLoan(double money) {
        // 只有账户余额 >= 还贷金额,才能成功还贷
        // 还贷之后账户余额减少,剩余贷款金额也随之减少
        if (super.getBalance()>=money){
            super.setBalance(super.getBalance()-money);
            loadAmount=loadAmount-money;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public double queryLoan() {
        return loadAmount;
    }
}

