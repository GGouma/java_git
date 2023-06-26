//class A {
//	int a = 10;
//	
//	public void aa() {
//		System.out.println(a);
//	}
//}
//
//class B extends A {
//	int b = 20;
//	
//	public void bb() {
//		System.out.println(b);
//	}
//}

class TV3 {
	private int size;

	public TV3(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}
}

class ColorTV extends TV3 {

	public int color;

	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}

	public void printProperty() {
		System.out.println(super.getSize() + "인치" + color + "컬러");
	}
}

class IPTV extends ColorTV {
	private String ip;

	public IPTV(String ip, int size, int color) {
		super(size, color);
		this.ip = ip;
	}

	public void printProperty() {
		System.out.print("나의 IPTV는" + ip + "주소의 ");
		super.printProperty();
	}

}

public class Study0626 {

	public static void main(String[] args) {
//		int[] ar = {1, 2, 3, 4, 5, 6, 7}; 
//		int sum = sumOfAry(ar);
//		
//		System.out.println(sum);
//		
//	
//
//	}
//	static int sumOfAry(int[] ar) {
//		int sum = 0;
//		for(int i = 0; i < ar.length; i++)
//			sum += ar[i];
//		return sum;
//	}
//	
//	static int[] makeNewIntAry(int len) {
//		int[] ar = new int[len];
//		return ar;
//	}
//	
//
//	A a = new A();
//	
//	B b = new B();

		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();

		IPTV iptv = new IPTV("192.1.1.2", 32, 2048); // "192.1.1.2" 주소에 32인치, 2048컬러
		iptv.printProperty();

	}
}
