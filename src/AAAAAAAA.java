class Accumulator {
	private static int sum;
	
	public static void add(int i) {
		sum += i;
		
	}
	
	static void showResult() {
		System.out.println("sum =" + sum);
	}
}

class AAAAAAAA {
	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++)
			Accumulator.add(i); // 전달되는 값을 모두 누적

		    Accumulator.showResult(); // 최종 누적 결과를 출력 sum = 55
	}
}