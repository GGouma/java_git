package edu.global.study0717;

import edu.global.prj.shape.Circle;
import edu.global.prj.shape.Rectangle;
import edu.global.prj.shape.Shape;



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

public class Test {

	public static void main(String[] args) {
		Shape[] shape = { new Circle(10), new Rectangle(10, 20) };

        //
        double area = 0;

        for (Shape s : shape) {
                area = area + s.getArea();
        }

        System.out.println(area);
        
        
        Song song = new Song("Dancing Queen", "ABBA", "스웨덴", 1978);
        song.show();
        
	}

}
