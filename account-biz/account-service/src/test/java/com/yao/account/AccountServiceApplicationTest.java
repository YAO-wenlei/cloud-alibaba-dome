package com.yao.account;

import java.sql.SQLException;

/**
 * @author yaowenlei
 * @description
 * @date 2022年02月28日 7:32 下午
 */

public class AccountServiceApplicationTest {

    private static final int a = 1;
    Integer integer;

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        System.out.println(a == new AccountServiceApplicationTest().integer);
    }
}
