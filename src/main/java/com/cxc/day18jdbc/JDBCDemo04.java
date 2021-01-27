package com.cxc.day18jdbc;

import java.sql.*;

/**
 * @Author cxc
 * @Date 2021/1/18 21:01
 * @Version 1.0
 * @Email cxc_work@163.com
 * 演示预执行sql
 */
public class JDBCDemo04 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet res = null;
        try {
            //获取连接
            conn = DBUtils.getConnection();
            //执行sql对象
            String sql = "select * from account";
            statement = conn.prepareStatement(sql);
            res = statement.executeQuery();
            while (res.next()) {
                String name = res.getString("name");
                int moeny = res.getInt("moeny");
                System.out.println(name + ":" + moeny);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            DBUtils.close(res, statement, conn);
        }

    }
}
