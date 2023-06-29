import java.util.Scanner;

public class Timer {

	public static void main(String[] args) {

		int kotae = (int) (Math.random() * 100 + 1);
		int nyu = 0;
		int count = 1;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1~100 사이에 숫자를 맞춰보세요 : ");

			try {
				sc = new Scanner(System.in);
				nyu = sc.nextInt();
			} catch (Exception e) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}

			if (nyu > kotae) {
				System.out.println("Down");
			} else if (nyu < kotae) {
				System.out.println("Up");
			} else if (nyu == kotae) {
				System.out.println("정답입니다." + count + "번 만에 맞췄습니다.");
				break;
			}
			count++;

		}

	}

}
