package edu.global.study0630;

import java.util.LinkedList;
import java.util.List;

class Apple {
    public String toString() {
        return "I am an apple.";
    }    
}

class Orange {
    public String toString() {
        return "I am an orange.";
    }
}

class DBox<L, R> {
	private L left;
	private R right;
	
	public void set(L o, R r) {
		left = o;
		right = r;
	}
	
	@Override
	public String toString() {
		return left + " & " + right;
	}
}
class Box<T> {
	   private T ob;

	   public void set(T o) {
	      ob = o;
	   }

	   public T get() {
	      return ob;
	   }
	}



class BoxFactory {
	public static <T> Box<T> makeBox(T o) {
		Box<T> box = new Box<T>();
		box.set(o);
		return box;
	}
}

class AAABox {
	public static <T extends Number> void swapBox(Box<T> box1, Box<T> box2) {
		
		T temp;
		temp = box1.get();
		box1.set(box2.get());
		box2.set(temp);
		
	}
}

//class DDBoxDemo {
//    public static void main(String[] args) {
//        DBox<String, Integer> box1 = new DBox<>();
//        box1.set("Apple", 25);
//
//        DBox<String, Integer> box2 = new DBox<>();
//        box2.set("Orange", 33);
//        
//        DDBox<DBox<String, Integer>, DBox<String, Integer>> ddbox = new DDBox<>();
//        ddbox.set(box1, box2);
//
//        System.out.println(ddbox);
//    }
//}

class MyLinkedList {
	int num;
	MyLinkedList myLinkedList;
}
public class Study {

public static <T extends Number> void swapBox(Box<T> box1, Box<T> box2) {
		
		T temp;
		temp = box1.get();
		box1.set(box2.get());
		box2.set(temp);
		
	}
	
	public static void main(String[] args) {
		
		MyLinkedList my1 = new MyLinkedList();
		my1.num = 10;
		
		MyLinkedList my2 = new MyLinkedList();
		my1.num = 11;
		my1.myLinkedList = my2;
		
		my2.myLinkedList = new MyLinkedList();
		
		List<String> list = new LinkedList<>();
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Toy");

		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + '\t');
		
		for (String str : list) {
			System.out.print(str + '\t');
		}
		System.out.println();
		
		list.remove(1);

		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + '\t');
		System.out.println();
		
		
		
//		int a = 10;
//		int b = 20;
//		
//		int temp;
//		
//		temp = a;
//		a = b;
//		b = temp;
		
//		DDBoxDemo<String, Integer> box = new DDBoxDemo<String, Integer>();
//		box.set("Apple", 25);
//				
//        DBox<String, Integer> box = new DBox<String, Integer>();        
//        box.set("Apple", 25);
//        System.out.println(box);
        
        
//		Box<Integer> box1 = new Box<>();
//		box1.set(99); // 오토 박싱
//
//		Box<Integer> box2 = new Box<>();
//		box2.set(55); // 오토 박싱
//
//		System.out.println(box1.get() + " & " + box2.get());
//		swapBox(box1, box2);
//		System.out.println(box1.get() + " & " + box2.get());
//		
//		
//		
//		Box<String> sBox = BoxFactory.<String>makeBox("Sweet");
//        System.out.println(sBox.get());
//
//        
//        Box<Double> dBox = BoxFactory.<Double>makeBox(7.59);
//        System.out.println(dBox.get());
//		Box<String> sBox = BoxFactory.<String>makeBox("Sweet");
//		Box<Double> dBox = BoxFactory.<Double>makeBox(7.59);
//		
//		System.out.println(sBox.get());
//		System.out.println(dBox.get());
		
//		DBox<String, Integer> box = new DBox<String, Integer>();
//		box.set("Apple", 25);
//		System.out.println(box);
		
		
//		Box<Apple> aBox = new Box<Apple>();
//		Box<Orange> oBox = new Box<Orange>();
//		
//		aBox.set(new Apple());
//		oBox.set(new Orange());
//		
//		Apple ap = aBox.get();
//		Orange og = oBox.get();
//		
//		System.out.println(ap);
//		System.out.println(og);

	}

}
