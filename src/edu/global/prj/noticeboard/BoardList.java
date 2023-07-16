package edu.global.prj.noticeboard;

import java.util.Scanner;

public class BoardList implements BoardArray{
	
	@Override
	public BoardCommand execute(Scanner sc) {
		System.out.println("===========================");
		System.out.println("번호      제목      작성자            작성일");
		System.out.println("---------------------------");
		if(arr.size() > 0) {
			int count = 1;
			for (int i = 0; i < arr.size(); i++) {
				
				System.out.print(((BoardCommand) arr.get(i)).getNum()+count + "  ");
				System.out.print(((BoardCommand) arr.get(i)).getTitle() + "  ");
				System.out.print(((BoardCommand) arr.get(i)).getName() + "  ");
				System.out.print(((BoardCommand) arr.get(i)).getDate());
				System.out.println();
				count++;
			}
		}else {
			System.out.println("등록된 글이 없습니다.");
		}
		return null;
	}
}
