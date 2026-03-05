
package com.coforge.Day7_JDBCPrj;

import java.sql.*;
import java.time.LocalDate;
import java.util.Scanner;

public class Assignment {

    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/cfgdb",
                "root",
                "Cfg@1234"
        );

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Insert");
            System.out.println("2. Update");
            System.out.println("3. Delete");
            System.out.println("4. Search by userID");
            System.out.println("5. Show All");
            System.out.println("0. Exit");
            System.out.print("Choice: ");
            int ch = sc.nextInt();
            sc.nextLine();
            if (ch == 0) break;

            switch (ch) {
                case 1: {
                    System.out.print("userName: ");
                    String name = sc.nextLine();

                    System.out.print("userID: ");
                    int id = sc.nextInt();

                    System.out.print("dob (yyyy-mm-dd): ");
                    String d = sc.next();

                    System.out.print("MobileNumber: ");
                    String mob = sc.next();   // changed from int to String

                    PreparedStatement ps = con.prepareStatement(
                            "insert into users(userName, userID, dob, MobileNumber) values (?,?,?,?)");
                    ps.setString(1, name);
                    ps.setInt(2, id);
                    ps.setDate(3, Date.valueOf(LocalDate.parse(d)));
                    ps.setString(4, mob);     
                    ps.executeUpdate();
                    System.out.println("Inserted.");
                    break;
                }

                case 2: {
                    System.out.print("userID to update: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("new userName: ");
                    String name = sc.nextLine();

                    System.out.print("new dob (yyyy-mm-dd): ");
                    String d = sc.next();

                    System.out.print("new MobileNumber: ");
                    String mob = sc.next();  

                    PreparedStatement ps = con.prepareStatement(
                            "update users set userName=?, dob=?, MobileNumber=? where userID=?");
                    ps.setString(1, name);
                    ps.setDate(2, Date.valueOf(LocalDate.parse(d)));
                    ps.setString(3, mob);     
                    ps.setInt(4, id);

                    int n = ps.executeUpdate();
                    System.out.println(n > 0 ? "Updated." : "Not found."); // fixed >
                    break;
                }

                case 3: {
                    System.out.print("userID to delete: ");
                    int id = sc.nextInt();

                    PreparedStatement ps = con.prepareStatement(
                            "delete from users where userID=?");
                    ps.setInt(1, id);

                    int n = ps.executeUpdate();
                    System.out.println(n > 0 ? "Deleted." : "Not found."); // fixed >
                    break;
                }

                case 4: {
                    System.out.print("userID to search: ");
                    int id = sc.nextInt();

                    PreparedStatement ps = con.prepareStatement(
                            "select userName, userID, dob, MobileNumber from users where userID=?");
                    ps.setInt(1, id);
                    ResultSet rs = ps.executeQuery();
                    if (rs.next()) {
                        System.out.println(rs.getString(1));
                        System.out.println(rs.getInt(2));
                        System.out.println(rs.getDate(3));
                        System.out.println(rs.getString(4)); 
                    } else {
                        System.out.println("No record.");
                    }
                    break;
                }

                case 5: {
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery("select userName, userID, dob, MobileNumber from users");
                    while (rs.next()) {
                        System.out.println(
                                rs.getString(1) + "  " +
                                rs.getInt(2) + "  " +
                                rs.getDate(3) + "  " +
                                rs.getString(4)
                        );
                    }
                    break;
                }
            }
        }

        con.close();
        System.out.println("Done.");
    }
}

