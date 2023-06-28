//polymorphysm 다형성


class AA {
	
	public void aa() {
		System.out.println("aa 함수 입니다.");
	}
	
	public void cc() {
		System.out.println("cc 함수 입니다.");
	}

}

class BB extends AA {
	public void bb() {
		System.out.println("bb 함수 입니다.");

	}	
	public void cc() {
		System.out.println("aa 함수 입니다.");
	}
}


class Cake {
	public void yummy() {
		System.out.println("Yummy Cake");
	}
}

class CheeseCake extends Cake {
	public void yummy() {
		System.out.println("Yummy CheeseCake");
	}
}


//다형성 + 오버라이딩
class Robot{
	public void work() {
		
	}
}

class DanceRobot extends Robot{
	public void work() {
		System.out.println("춤추는 로봇입니다.");
	}
}


class DrawRobot extends Robot{
	public void work() {
		System.out.println("그림을 그리는 로봇입니다.");
	}
}


class WashRobot extends Robot{
	public void work() {
		System.out.println("세탁하는 로봇입니다.");
	}
}


interface Printable{
	public void print(String doc);
}

class Printer implements Printable {

	@Override
	public void print(String doc) {
		System.out.println(doc);
		
	}
	
}

//삼성에서 만들어주는 클래스
class SamSungPrinter {
	public void printSamsung(String doc) {
		System.out.println(doc + "프린트 되었습니다.");
	}
}


//LG에서 만들어주는 클래스
//class LGPrinter {
//	public void printLG(String doc) {
//		System.out.println(doc + "프린트 되었습니다.");
//	}
//}

//마이크로소프트에서 인터페이스를 만듦(강제)
//class Pringtalble {
//	public void print(String dog) {
//		
//	}
//}
//
//
////삼성에서 만듦
//class SamPrinter implements Printable {
//	
//	@Override
//	public void print(String doc) {
//		System.out.println("From Samsung printer");
//		System.out.println(doc);
//	}
//}
//
////LG에서 만듦
//class LGPrinter implements Printable {
//	
//	@Override
//	public void print(String doc) {
//		System.out.println("From LG printer");
//		System.out.println(doc);
//	}
//}


//협업 = 외주 
interface ICalculator{
	public int add(int num1, int num2);
	public int sub(int num1, int num2);
	public int mul(int num1, int num2);
	public int div(int num1, int num2);
}

class Calculator implements ICalculator {
	public int num1;
	public int num2;
	
	
	@Override
	public int add(int num1, int num2) {
		return (num1 + num2);
		
	
	}
	@Override
	public int sub(int num1, int num2) {
		return (num1 - num2);
		
	
	}
	@Override
	public int mul(int num1, int num2) {
		return (num1 * num2);
		
		
	}
	@Override
	public int div(int num1, int num2) {
		
		if(num2 == 0)
			return 0;
		return (num1 / num2);
		
		
	}
	
}

//내가 짠 메모장
public class Study0627 {

	public static void main(String[] args) {
		String myDoc = "This is a report about";
		
		
//		Printable print = new SamPrinter();
//		print.print(myDoc);
//		System.out.println();
//		
//		print = new LGPrinter();
//		print.print(myDoc);
//		System.out.println();
	

	
	ICalculator cal = new Calculator();
	System.out.println(cal.add(3, 4));
	System.out.println(cal.sub(3, 4));
	System.out.println(cal.mul(3, 4));
	System.out.println(cal.div(3, 4));

}
	
}
