package cn.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BaseDao {
	public Connection con=null;
	
	public Connection getConnection() throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");			//指定连接类型
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookmananger","root","123");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}