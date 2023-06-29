package edu.global.study0629;
import java.util.Scanner;

public class UpDown {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = 1;
		int num = (int) (Math.random() * 100) + 1;

		int num_enter = 0;

		while (true) {
			try {
				System.out.print("1~100 숫자 입력 : ");
				num_enter = sc.nextInt();
				
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("다시 입력하세요");
				continue;
			}
			if (num == num_enter) {

				System.out.println("정답입니다." + count + "회 만에 맞췄어요.");
				break;
			} else if (num > num_enter) {
				System.out.println("UP");
				
				
			} else if (num < num_enter) {
				System.out.println("Down");
				
				
			}
			count++;
		}

	}

}
