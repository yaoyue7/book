package cn.service.Impl;

import java.util.ArrayList;
import cn.dao.Impl.AdminDaoImpl;
import cn.entity.Administrator;
import cn.service.AdminService;

public class AdminServiceImpl implements AdminService {

	AdminDaoImpl ad=new AdminDaoImpl();
	@Override
	public int add(int bookid,String bookname,String bookautor,String booktype,float bookprice) {
		return ad.add(bookid,bookname, bookautor, booktype, bookprice);
	}

	@Override
	public ArrayList<Administrator> show() {
		// TODO Auto-generated method stub
		return ad.show();
	}

	@Override
	public int del(int bookid) {
		// TODO Auto-generated method stub
		return ad.del(bookid);
	}

	@Override
	public int change(int bookid,String bookname,String bookautor,String booktype,float bookprice) {
		// TODO Auto-generated method stub
		return ad.alter(bookid, bookname, bookautor, booktype, bookprice);
	}

}
