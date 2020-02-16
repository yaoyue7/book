package cn.dao.Impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import cn.dao.BaseDao;
import cn.dao.UserDao;

public class UserDaoImpl extends BaseDao implements UserDao {
	//�鿴
	@Override
	public int admin(String username,String userpwd) {
		int i=-1;
		try {
			Connection c = super.getConnection();
			String sql="select * from USERS where username=? and userpwd=?";
			PreparedStatement ps=c.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, userpwd);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				i=1;
			}
			rs.close();
			ps.close();
			c.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

}
