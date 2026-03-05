package com.coforge.Day8_JDBCPrj;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class MultipleOperations_Assignment {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/cfgdb";
        String uname = "root";
        String password = "Cfg@1234";
        Connection con = DriverManager.getConnection(url, uname, password);

        int a = 96;
        int b = 24;

        String qAdd = "{call add_numbers(?,?,?)}";
        CallableStatement csAdd = con.prepareCall(qAdd);
        csAdd.setInt(1, a);
        csAdd.setInt(2, b);
        csAdd.registerOutParameter(3, Types.INTEGER);
        csAdd.execute();
        int sum = csAdd.getInt(3);

        String qSub = "{call sub_numbers(?,?,?)}";
        CallableStatement csSub = con.prepareCall(qSub);
        csSub.setInt(1, a);
        csSub.setInt(2, b);
        csSub.registerOutParameter(3, Types.INTEGER);
        csSub.execute();
        int diff = csSub.getInt(3);

        String qMul = "{call mul_numbers(?,?,?)}";
        CallableStatement csMul = con.prepareCall(qMul);
        csMul.setInt(1, a);
        csMul.setInt(2, b);
        csMul.registerOutParameter(3, Types.INTEGER);
        csMul.execute();
        int prod = csMul.getInt(3);

        String qDiv = "{call div_numbers(?,?,?)}";
        CallableStatement csDiv = con.prepareCall(qDiv);
        csDiv.setInt(1, a);
        csDiv.setInt(2, b);
        csDiv.registerOutParameter(3, Types.DECIMAL);
        csDiv.execute();
        String quot = csDiv.getString(3);

        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + diff);
        System.out.println("Multiplication: " + prod);
        System.out.println("Division: " + quot);

        csAdd.close();
        csSub.close();
        csMul.close();
        csDiv.close();
        con.close();
    }
}

