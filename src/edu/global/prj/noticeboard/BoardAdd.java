package edu.global.prj.noticeboard;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BoardAdd implements BoardAction{
	
	private static final String FILE_DIRECTORY = "notice";
	
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
		
		BoardList.arr.add(command);
		SimpleDateFormat dt = new SimpleDateFormat("yyyyMMdd_HHmmss");
		String date = dt.format(new Date());
		command.setDate(date);
		
		String fileName = FILE_DIRECTORY+"_"+date+".txt";

		try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
			writer.println("제목: " + title);
			writer.println("내용: " + content);
			writer.println("작성자: " + name);
			writer.println("작성일: " + date);
			writer.println();
			
			System.out.println("등록이 완료되었습니다.");
		} catch (IOException e) {
			System.out.println("파일에 쓰기 오류가 발생했습니다: " + e.getMessage());
		}
		
		return command;
	}
}