import java.util.Scanner;

//interface = abstract = 자식이 구현하라
abstract class House {
	
	public abstract void build2();
	
	public void build() {
		System.out.println("집을 짓습니다.");
	}
}

class House2 extends House {

	@Override
	public void build2() {
		System.out.println("집을 짓습니다.2");
		
	}
	
}

abstract class Calc {
	protected int a;
    protected int b;
    void setValue(int a, int b) {this.a = a; this.b = b;}
    abstract int calculate();
}

class Add extends Calc {
	
	@Override
	int calculate() {
		return super.a + super.b;
	}
	
}

class Sub extends Calc {
	
	@Override
	int calculate() {
		return super.a - super.b;
	}
	
}

class Mul extends Calc {
	
	@Override
	int calculate() {
		return super.a * super.b;
	}
	
}

class Div extends Calc {
	
	@Override
	int calculate() {
		return super.a / super.b;
	}
	
}


class AAA {
	
	@Override
	public String toString() {
		return "이것도 메롱이다.";
	}
}

class Circle4 {
	private double radius;
	
	public Circle4(double rad) {
		radius = rad;
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	@Override
	
	public String toString() {
		
		return "원의 넓이는" + getArea() + "이고 반지름은" + radius + "인 원";
	}
}

class Member extends Object {
	
	private String color;
	
	public Member(String color) {
		this.color = color;
	}
	
	@Override
	public boolean equals(Object obj) {
		Member member = (Member) obj;
		
		if(color.equals(member.color))
			return true;
		
		return false;
	}
}

interface Printable2 { // MS가 정의하고 제공한 인터페이스
    public void print(String doc);
}

class SPrinterDriver implements Printable2 {
	
	@Override
	public void print(String doc) {
		System.out.println("From Samsung printer");
		System.out.println(doc);
	}
}

class LPrinterDriver implements Printable2 {
	
	@Override
	public void print(String doc) {
		System.out.println("From Samsung printer");
		System.out.println(doc);
	}
}


class Person2 extends Object {
	private String name;
	private int age;
	
	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		Person2 person = (Person2) obj;
		
		if(name.equals(person.name) && age == (person.age)) 
			return true;
		
		return false;
	}
}


public class Study0628 {

	public static void main(String[] args) {
		
		Person2 kim = new Person2("홍길동", 35);
		Person2 park = new Person2("홍길동", 35);
		Person2 heo = new Person2("홍길동", 34);
		
		if(kim.equals(park))
			System.out.println("같은 사람입니다.");
		else
			System.out.println("다른 사람입니다.");
		
		if(kim.equals(heo))
			System.out.println("같은 사람입니다.");
		else
			System.out.println("다른 사람입니다.");
		
		
		Scanner sc = new Scanner(System.in);
		
		try {
			int num = sc.nextInt();
			System.out.println(num);
//			System.out.println(3/0);
		} catch (Exception e) {
			System.out.println("캐취안 입니다.");
		}finally {
			System.out.println("파이널리 입니다.");
		}
		
		System.out.println("프로그램 종료 입니다.");
		
		
		
		

//		
//		Member obj1 = new Member("Black");
//		Member obj2 = new Member("Black");
//		Member obj3 = new Member("White");
//
//		System.out.println(obj1.equals(obj2)); // true가 출력
//		System.out.println(obj1.equals(obj3)); // false가 출력
//		
//        String myDoc = "This is a report about...";
//
//		// 삼성 프린터로 출력
//        Printable2 prn = new SPrinterDriver();
//        prn.print(myDoc);
//        System.out.println();
//
//        // LG 프린터로 출력
//        prn = new LPrinterDriver();
//        prn.print(myDoc);
        
//		Member obj1 = new Member("Black");
//		Member obj2 = new Member("Black");
//		Member obj3 = new Member("White");
//
//		System.out.println(obj1.equals(obj2)); // true가 출력
//		System.out.println(obj1.equals(obj3)); // false가 출력
		
//		String str = new String("메롱");
//		System.out.println(str);
//		AAA aaa = new AAA();
//		System.out.println(aaa);
//		
//		
//		AAA bbb = new AAA();
//		System.out.println(bbb);
//		boolean b = aaa.equals(bbb);
//		System.out.println(b);
//		
//		
//		Circle4 circle = new Circle4(10);
//		
//		System.out.println(circle); //원의 넓이는 314.1592 이고 반지름은 10 인 원
		
		
//        Scanner sc = new Scanner(System.in);
//        System.out.print("두 정수와 연산자를 입력하시오>> ");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        char c = sc.next().charAt(0);
//
//        if(c == '+'){
//            Add add = new Add();
//            add.setValue(a, b);
//            System.out.println(add.calculate());
//        }
//        else if(c == '-'){
//            Sub sub = new Sub();
//            sub.setValue(a, b);
//            System.out.println(sub.calculate());
//        }
//        else if(c == '*'){
//            Mul mul = new Mul();
//            mul.setValue(a, b);
//            System.out.println(mul.calculate());
//        }
//        else if(c == '/'){
//            Div div = new Div();
//            div.setValue(a, b);
//            System.out.println(div.calculate());
//        }

	}

}
