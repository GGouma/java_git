package edu.global.prj.noticeboard;

import java.util.Scanner;

public class Board {

public static void main(String[] args) {
		
		boolean s = true;

		System.out.println("===========================");
		System.out.println("번호      제목      작성자            작성일");
		System.out.println("---------------------------");
		
		while(s) {
			System.out.print("1.목록    2.등록    3.내용    4.삭제    0.종료>");
			Scanner sc = new Scanner(System.in);

			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				BoardList list = new BoardList();
				list.execute(sc);
				break;
			case 2:
				BoardAdd add = new BoardAdd();
				add.execute(sc);
				break;
			case 3:
				BoardContent content = new BoardContent();
				content.execute(sc);
				break;
			case 4:
				BoardDelete del = new BoardDelete();
				del.execute(sc);
				break;
			case 0:
				System.out.println("게시판 탐색을 종료합니다.");
				s = false;
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
	}
}
