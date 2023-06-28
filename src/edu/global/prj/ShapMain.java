package edu.global.prj;

import edu.global.two.Circle;
import edu.global.two.Rectangle;
import edu.global.two.Shape;




public class ShapMain {

	
	
	public static void main(String[] args) {
		Shape[] shape = {new Circle(10), new Rectangle(10,20)};

		
		double area = 0;
		
		for(Shape s : shape) {
			area += s.getArea();
		}
		System.out.println(area);
	}

}
