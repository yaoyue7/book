package cn.dao;

import java.util.ArrayList;

import cn.entity.Administrator;

public interface AdminDao {
	public int add(int bookid,String bookname,String bookautor,String booktype,float bookprice);		//���ͼ��
	public ArrayList<Administrator> show();		//�鿴����ͼ����Ϣ
	public int del(int bookid);		//ɾ��ͼ��
	public int alter(int bookid,String bookname,String bookautor,String booktype,float bookprice);	//�޸�ͼ����Ϣ
}
