package edu.global.prj.noticeboard;

import java.util.Scanner;

public class BoardContent implements BoardAction {

	@Override
	public BoardCommand execute(Scanner sc) {
		
		if (arr.isEmpty()) {
			System.out.println("게시글이 없습니다.");
			return null;
		}
		
		System.out.print("조회할 게시글 번호>");
		int see = sc.nextInt();

		if (((BoardCommand) arr.get(see - 1)).equals(null)) {
			System.out.println("조회할 내용이 없습니다.");
			return null;
		} else {
			System.out.println("---------------내용---------------");
			System.out.println("제목 : " + ((BoardCommand) arr.get(see - 1)).getTitle());
			System.out.println("내용 : " + ((BoardCommand) arr.get(see - 1)).getContent());
			System.out.println("작성자 : " + ((BoardCommand) arr.get(see - 1)).getName());
			System.out.println("---------------------------------");
		}
		return null;
	}
}