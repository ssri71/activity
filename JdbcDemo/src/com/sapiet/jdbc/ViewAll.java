package com.sapiet.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ViewAll {

	public static void main(String[] args)throws ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		try {
			Connection con=DriverManager.getConnection(url, "system","sapient123");
			/*PreparedStatement p=con.prepareStatement("insert into dept values (?,?)");
			p.setInt(1,5);
			p.setString(2, "Finanxce");
			int a=p.executeUpdate();
			if(a>0){
				System.out.println("successful");
			}else {
				System.out.println("Error");
			}*/
			PreparedStatement ps=con.prepareStatement("select * from dept");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
			rs.close();
			con.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
