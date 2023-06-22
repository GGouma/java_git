class InstCnt {
	static int instNum = 0;
	
	InstCnt() {
		instNum++;
		System.out.println("인스턴스 생성." + instNum);
	}
}


class A {
	public void a() {
		System.out.println("함수 a");
	}
	
	public void a(int a) {
		System.out.println("함수 a" + a);
	}
	
	public void a(double a) {
		System.out.println("함수 a double" + a);
	}
	
	public void a(int a, int b) {
		System.out.println("함수 a" + (a + b));
	}
}

class Person {
	private int regiNum;
	private int passNum;
	
	public Person(int rnum, int pnum) {
		this.regiNum = rnum;
		this.passNum = pnum;
	}
	
	public Person(int rnum) {
		this(rnum, 0);
	}
	
	void showPersonalInfo() {
	      System.out.println("주민등록 번호: " + regiNum);
	        
	        if(passNum != 0) {
	            System.out.println("여권 번호: " + passNum + '\n');
	        }
	        else {
	            System.out.println("여권을 가지고 있지 않습니다. \n");
	        }
	}
}

/*
 * class Accumulator { private static int sum = 0; public static void add(int i)
 * { sum += i; } public static void showResult() { System.out.println("sum =" +
 * sum); } }
 */
public class Study0622 {

	public static void main(String[] args) {
		/*
		 * InstCnt cnt1 = new InstCnt(); InstCnt cnt2 = new InstCnt(); InstCnt cnt3 =
		 * new InstCnt();
		 * 
		 * String str = "AAA";
		 * 
		 * A a = new A(); a.a(); a.a(7); a.a(7, 2); a.a(10.0);
		 * 
		 * int instNum;
		 * 
		 * Person jung = new Person(335577, 222222); Person hong = new Person(775544);
		 * 
		 * jung.showPersonalInfo(); hong.showPersonalInfo();
		 */
		for (int i = 0; i <= 10; i++)
		Accumulator.add(i); // 전달되는 값을 모두 누적

	    Accumulator.showResult(); // 최종 누적 결과를 출력

	}

}
