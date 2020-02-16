package cn.controller;

import java.util.List;
import java.util.Scanner;

import cn.entity.Administrator;
import cn.service.Impl.AdminServiceImpl;
import cn.service.Impl.UserServiceImpl;

public class Book {

	AdminServiceImpl as=new AdminServiceImpl();
	UserServiceImpl us=new UserServiceImpl();
	Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		Book b=new Book();
		b.admin();
	}
	
	public void admin(){
		System.out.println("图书管理系统登录界面");
		System.out.print("用户名：");
		String s1=sc.next();
		System.out.print("密码：");
		String s2=sc.next();
		int i=us.login(s1, s2);
		if(i>0){
			System.out.println("登录成功！");
			menu();
		}else{
			System.out.println("用户名或密码错误！");
		}
		
	}

	public void menu() {
		while(true){
			System.out.println("----图书管理系统主界面----");
			System.out.println("1.添加图书");
			System.out.println("2.查看所有图书信息");
			System.out.println("3.删除图书");
			System.out.println("4.修改图书信息");
			System.out.println("5.退出系统");
			System.out.println("请选择(1-5):");
			int a=sc.nextInt();
			switch (a) {
			case 1:
				addBook();
				break;
			case 2:
				showBook();
				break;
			case 3:
				delBook();
				break;
			case 4:
				updateBook();
				break;
			case 5:
				System.out.println("欢迎下次使用！");
				System.exit(0);
				break;
			}
		}
	}

	public void updateBook() {
		System.out.println("\t图书信息修改页面");
		System.out.print("请输入想修改的图书编号:");
		int a=sc.nextInt();
		System.out.print("请输入修改后的图书名称:");
		String b=sc.next();
		System.out.print("请输入修改后的图书作者:");
		String c=sc.next();
		System.out.print("请输入修改后的图书类别:");
		String d=sc.next();
		System.out.print("请输入修改后的图书价格:");
		Float e=sc.nextFloat();
		int r=as.change(a, b, c, d, e);
		if(r>0){
			System.out.println("修改图书信息成功！");
		}else{
			System.out.println("修改图书信息失败！");
		}
	}

	public void delBook() {
		System.out.println("\t图书信息删除页面");
		System.out.println("请输入删除的图书编号:");
		int a=sc.nextInt();
		int r=as.del(a);
		if(r>0){
			System.out.println("删除图书信息成功！");
		}else{
			System.out.println("删除图书信息失败！");
		}
	}

	public void showBook() {
		System.out.println("\t查看所有图书信息");
		System.out.println("图书编号\t图书名称\t作者\t类别\t图书价格");
		List<Administrator> list=as.show();
		for (Administrator ad : list) {
			System.out.println(ad.getBookid()+"\t"+ad.getBookname()+"\t"+ad.getBookautor()+"\t"+ad.getBooktype()+"\t"+ad.getBookprice());
		}
	}

	public void addBook() {
		System.out.println("\t图书信息添加页面");
		System.out.print("编号:");
		int a=sc.nextInt();
		System.out.print("书名:");
		String b=sc.next();
		System.out.print("作者:");
		String c=sc.next();
		System.out.print("类别:");
		String d=sc.next();
		System.out.print("价格:");
		Float e=sc.nextFloat();
		int r=as.add(a, b, c, d, e);
		if(r>0){
			System.out.println("添加图书信息成功！");
		}else{
			System.out.println("添加图书信息失败！");
		}
	}

}
