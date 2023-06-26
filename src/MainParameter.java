import java.util.Scanner;

public class MainParameter {
	
	public static int getArr() {
		Scanner sc = null;
		int num = 0;
		
		while(true) {
			sc = new Scanner(System.in);
			num = sc.nextInt();
			if(num < 1 || num > 10) {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
				continue;
			}else {
				break;
			}
		}
		
		return num;
	}
	public static void main(String[] args) {
		//변수선언
		int row;
		int col;
		int[][] arr;
		
		System.out.print("행 크기");
		row = getArr();
		
		System.out.print("열 크기");
		col = getArr();
		
		//배열선언
		
		arr = new int[row][col];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int)(Math.random() * 26 +65);
				
				System.out.print((char)arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
