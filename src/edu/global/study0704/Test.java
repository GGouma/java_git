package edu.global.study0704;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {
		
		List<Integer> list = new LinkedList<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수(-1이 입력 될 때까지)");
		while (true) {
			try {
				int num = sc.nextInt();
				
				if (num == -1) {
					break;
				}
				
				list.add(num);	
			} catch (Exception e) {
				System.out.println("잘못된입력입니다. 다시 넣어주세요");
				sc = new Scanner(System.in);
				continue;
			}
					
		}
		
		int max = 0;
		
		for (int num : list) {
			if (num > max) {
				max = num;
			}
		}
		System.out.println("가장 큰 수는" + max);
		System.out.println(list);
		
//		TreeMap<Integer, String> map = new TreeMap<>();
//		map.put(45, "Brown");
//		map.put(37, "James");
//		map.put(23, "Martin");
//		
//		Set<Integer> ks = map.keySet();
//		
//		for(Integer n : ks)
//			System.out.print(n.toString()+ '\t');
//		System.out.println();
//		
//		for(Integer n : ks)
//			System.out.print(map.get(n).toString() + '\t');
		
		
		
//		int max = Integer.MIN_VALUE;
//		
//		while (true) {
//			
//			int num = sc.nextInt();
//			
//			if (num == -1) {
//				break;
//			}
//			
//			if (num > max) {
//				max = num;
//			}
//			
//		}
//		
//		
//		if (max == Integer.MIN_VALUE) {
//			System.out.println("양의 정수가 입력되지 않았습니다.");
//		} else {
//			System.out.println("가장 큰 수는 " + max + "입니다.");
//		}
		
	}
	
}
