package com.coforge.dao;
 
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
 
import com.coforge.model.Account;
import com.sun.tools.javac.util.List;
 
public class AccountDAO {
	public ArrayList<Account> getAllAccounts(Connection con) throws SQLException {
		String query="select * from account";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		ArrayList<Account>accList=new ArrayList<Account>();
		while(rs.next()) {
			Account acc=new Account();
			acc.setAccNo(rs.getLong("accno"));
			acc.setAccHolderName(rs.getString("accholdername"));
			acc.setAcctype(rs.getString("acctype"));
			acc.setBalance(rs.getDouble("balance"));
			accList.add(acc);
		}
		return accList;
	}
 
}
 
 