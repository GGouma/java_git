package edu.global.prj.noticeboard;

import java.util.Scanner;

public class BoardDelete implements BoardAction{

	@Override
	public BoardCommand execute(Scanner sc) {
	
		System.out.print("삭제하려는 글의 번호를 입력해주세요.>");
		int inNum = sc.nextInt();
		arr.remove(arr.get(inNum-1));	// 객체 삭제
		System.out.println(inNum + "번 목록이 삭제되었습니다.");
		return null;
	}
}
