package edu.global.study0717;

import edu.global.prj.shape.Rectangle;
import edu.global.prj.shape.Shape;

interface Printable { // MS가 정의하고 제공한 인터페이스
	public void print(String doc);
}

class SPrinterDriver implements Printable {
	
	@Override
	public void print(String doc) {
		System.out.println("From Samsung printer");
		System.out.println(doc);
		
	}
}

class LPrinterDriver implements Printable {
	
	@Override
	public void print(String doc) {
		System.out.println("From LG printer");
		System.out.println(doc);
	}
}


class Song {
	String title;
	String artist;
	String country;
	int year;
	
	Song() {}
	
	Song(String title, String artist, String country, int year) {
		
		this.title = title;
		this.artist = artist;
		this.country = country;
		this.year = year;
	}
	
	
	void show() {
		System.out.println(year + "년" + country + "국적의" + artist + "가 부른" + title);
	}
}




class Circle {
	Circle () {
		
	}
	
	Circle(double a) {
		
	}
	
	@Override
	public String toString() {
		double a = 0;
		return "원의 넓이는" + a * a * Math.PI + "이고 반지름은" + a; 
	}
}

public class Test {

	public static void main(String[] args) {
//		Shape[] shape = { new Circle(10), new Rectangle(10, 20) };
//
//        //
//        double area = 0;
//
//        for (Shape s : shape) {
//                area = area + s.getArea();
//        }
//
//        System.out.println(area);
        
        
//        Song song = new Song("Dancing Queen", "ABBA", "스웨덴", 1978);
//        song.show();
//        
//		String myDoc = "This is a report about...";
//
//		// 삼성 프린터로 출력
//		Printable prn = new SPrinterDriver();
//		prn.print(myDoc);
//		System.out.println();
//
//		// LG 프린터로 출력
//		prn = new LPrinterDriver();
//		prn.print(myDoc);
//		System.out.println();
		Circle circle = new Circle(10);
        
		System.out.println(circle); //원의 넓이는 314.1592 이고 반지름은 10 인원 
        
	}

}
