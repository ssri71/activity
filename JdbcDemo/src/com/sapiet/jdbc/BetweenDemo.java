package com.sapiet.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.util.Scanner;

public class BetweenDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		//Scanner sc=new Scanner(System.in);
		///double min=sc.nextInt();
		//double max=sc.nextInt();
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
			PreparedStatement ps=con.prepareStatement("select e.eid,e.ename,e.sal,d.dname from emp e join dept d on e.dept_id=d.did where d.dname='IT'");
			//ps.setDouble(1,min);
			//ps.setDouble(2, max);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				System.out.println(rs.getInt("eid")+" "+rs.getString("ename")+" "+rs.getString("sal")+" "+rs.getString("dname"));
			}
			rs.close();
			con.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
