package edu.global.prj.noticeboard;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BoardAdd implements BoardAction{
	
	@Override
	public BoardCommand execute(Scanner sc) {
		System.out.print("제목>");
		String title = sc.next();
		
		System.out.print("내용>");
		String content = sc.next();
		
		System.out.print("작성자>");
		String name = sc.next();
		
		BoardCommand command = new BoardCommand();
		
		command.setTitle(title);
		command.setContent(content);
		command.setName(name);
		
		arr.add(command);
		SimpleDateFormat dt = new SimpleDateFormat("yyyy MM/d HH:mm:ss");
		String date = dt.format(new Date());
		command.setDate(date);
		
		System.out.println("등록이 완료되었습니다.");
		return command;
	}
}