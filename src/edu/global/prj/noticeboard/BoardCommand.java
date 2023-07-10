package edu.global.prj.noticeboard;

public class BoardCommand {
	
	private int totalNum;	// 전체 글번호
	private int num;		// 현재 글번호
	private String title;
	private String content;
	private String name;
	private String date;
	
	public int getTotalNum() {
		return totalNum;
	}
	public void setTotalNum(int totalnum) {
		this.totalNum = totalnum;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
}
