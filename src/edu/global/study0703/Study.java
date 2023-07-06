package edu.global.study0703;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

import edu.global.prj.shape.Circle;



class Num {
	private int num;
	public Num(int n) {
		num = n;
	}

	@Override
	public String toString() {
		return String.valueOf(num);
	}

	@Override
	public int hashCode() {
		return num; 
	}

	@Override
	public boolean equals(Object obj) {
		if (num == ((Num)obj).num) {
			return true;
		}else {
			return false;
		}
	}
}

class Person2 extends Object {
	private int age;
	private String name;
	
	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		return age;
	}
	
	@Override
	public boolean equals (Object obj) {
		Person2 person = (Person2) obj;
		
		if(name.equals(person.name) && age == (person.age))
			return true;
		
		return false;
	}
	
	@Override
	public String toString() {
		return name + "(" + age + "세)";
	}
}



public class Study {

	public static void main(String[] args) {
		
		TreeSet<Integer> tree = new TreeSet<Integer>();
		tree.add(3);
		tree.add(1);
		tree.add(2);
		tree.add(4);
		System.out.println("인스턴스 수 : " + tree.size());
		
		for (Integer n : tree) {
			System.out.println(n.toString() + '\t');
		}
		System.out.println();
		
		for(Iterator<Integer> itr = tree.iterator(); itr.hasNext();) {
			System.out.println(itr.next().toString() + '\t');
		}
		System.out.println();
		
		
		Queue<String> que = new LinkedList<>();
		que.offer("Box");
		que.offer("Toy");
		que.offer("Box");
		que.offer("Robot");
		
		
		System.out.println("next : " + que.peek());
		
		System.out.println(que.poll());
		System.out.println(que.poll());
		System.out.println(que.poll());
		
		System.out.println("next : " + que.peek());
		
		System.out.println(que.poll());
		
//		List<Circle> circleList = new LinkedList<>();
//		for (int i = 1; i <= 10; i++) {
//			circleList.add(new Circle(i));
//		}
//		
//		double sum = 0;
//		for (Circle circle : circleList) {
//			sum += circle.getArea();
//		}
//		System.out.println(sum);
		
//		List<Integer> cirlist = new ArrayList<Integer>();
//		
//		cirlist.add(10);
//		cirlist.add(20);
//		cirlist.add(30);
//		
//		double totalsum = 0;
//		for (int radius : cirlist) {
//			double sum = Math.PI * radius * radius;
//			
//			totalsum += sum;
//		}
//		System.out.println(totalsum);
		
		HashSet<Num> set = new HashSet<>();
        set.add(new Num(7799));
        set.add(new Num(9955));
        set.add(new Num(7799));

        System.out.println("인스턴스 수: " + set.size());

        for(Num n : set)
            System.out.print(n.toString() + '\t');

        System.out.println();
		
		
		HashSet<Integer> lotto = new HashSet<Integer>();
		
		while (lotto.size() != 6) {
			int num = (int)(Math.random() * 45) + 1;
			lotto.add(num);
		}
		System.out.println(lotto);
		
		HashSet<Person2> hSet = new HashSet<Person2>();
		hSet.add(new Person2("LEE", 10));
		hSet.add(new Person2("LEE", 10));
		hSet.add(new Person2("PARK", 35));
		hSet.add(new Person2("PARK", 35));
	

		System.out.println("저장된 데이터 수: " + hSet.size());
		System.out.println(hSet);
		
//		Set<Num> set = new HashSet<>();
//		
//		set.add(new Num(3));
//		set.add(new Num(3));
//		set.add(new Num(2));
//		set.add(new Num(10));
//		
//		System.out.println(set.size());
		
		
		
//		Set<String> set = new HashSet<>(); {
//		
//		set.add("Toy");
//		set.add("Box");
//		set.add("Robot");
//		set.add("Box");
//		System.out.println("인스턴스 수 : " + set.size());
//		
//		for(Iterator<String> itr = set.iterator(); itr.hasNext();) {
//			System.out.print(itr.next() + '\t');
//			
//		}
//		System.out.println();
//		
//		for (String s : set) {
//			System.out.print(s + '\t');
//			
//		}
//		System.out.println();
//			
//		}
		
		
//		LinkedList<Integer> list = new LinkedList<>();
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		
//		int n;
//		for (Iterator<Integer> itr = list.iterator(); itr.hasNext();) {
//			n = itr.next();
//			System.out.print(n + "\t");
//		}
//		System.out.println();
		

//		List<Integer> numlist = new LinkedList<>();
//		
//		for(int i = 0; i <= 10; i++) {
//			numlist.add(i);
//		}
//		
//		int sum = 0;
//		
//		for (Integer num : numlist) {
//			sum += num;
//			System.out.println(sum);
//		}
		
//		List<String> list = new ArrayList<>();
//		
//		list.add("Spring");
//		list.add("Summer");
//		list.add("Fall");
//		list.add("Winter");
//		
//		int sum = 0;
//		
//		for (String string : list) {
//
//			sum += string.length();
//			System.out.println(sum);
//		}
		

	}

}
