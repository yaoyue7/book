package cn.entity;

public class Administrator {
	private int bookid;
	private String bookname;
	private String bookautor;
	private String booktype;
	private float bookprice;
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getBookautor() {
		return bookautor;
	}
	public void setBookautor(String bookautor) {
		this.bookautor = bookautor;
	}
	public String getBooktype() {
		return booktype;
	}
	public void setBooktype(String booktype) {
		this.booktype = booktype;
	}
	public float getBookprice() {
		return bookprice;
	}
	public void setBookprice(float bookprice) {
		this.bookprice = bookprice;
	}
}
