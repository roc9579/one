package com.itany.mycorejava.BMS;

/**
 * @author 黄鹏程
 * @date 2023年08月21日11:32
 * 贷款接口
 */
public interface Loanable {
    /**
     * 贷款方法
     * @param money 贷款的金额
     */
    void providerLoan(double money);

    /**
     * 还贷方法
     * @param money 还贷的金额
     * @return      还贷是否成功
     */
    boolean payLoan(double money);

    /**
     * 查询剩余的贷款金额
     * @return
     */
    double queryLoan();

}
