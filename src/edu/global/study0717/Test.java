package edu.global.study0717;

import edu.global.prj.shape.Circle;
import edu.global.prj.shape.Rectangle;
import edu.global.prj.shape.Shape;

public class Test {

	public static void main(String[] args) {
		Shape[] shape = { new Circle(10), new Rectangle(10, 20) };

        //
        double area = 0;

        for (Shape s : shape) {
                area = area + s.getArea();
        }

        System.out.println(area);
	}

}
