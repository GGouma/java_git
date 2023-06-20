class StarPrint {
	
	public void printTriangle(int num) {
		
	
	for(int i = 1; i <= num; i++) {
		for(int j = 1; j <= i; j++) {
			
				System.out.print("*");				
		}
		
			System.out.println();
	}
	
	}
	public void printReverseTriangle(int num) {
		for(int i = 1; i <= num; i++) {
			for(int j = i; j <= num; j++) {
				
					System.out.print("*");				
			}
			
				System.out.println();
		}
	}	
	
}

public class Practice {

	public static void main(String[] args) {
		/*
		 * GetSum getsum = new GetSum(); int num; // 2)num 변수 선언
		 * 
		 * num = 100;
		 * 
		 * getsum.setNum(num); // 3)getsum 객체의 setNum함수 호출, num값 50 저장
		 * 
		 * num = getsum.sum(); // 4)getsum객체의 sum함수 호출, 1-50까지 합 구함
		 * System.out.println(num);
		 */
		/*
		 * Gugudan gugudan = new Gugudan(); gugudan.printGugu(10); //1단부터 10단까지 출력
		 * System.out.println(); gugudan.printGugu(20); //1단부터 20단까지 출력
		 */
		
		StarPrint strPrint = new StarPrint();
		 
		strPrint.printTriangle(3);
		System.out.println();
		strPrint.printReverseTriangle(3);
		
		
		
	}

}



