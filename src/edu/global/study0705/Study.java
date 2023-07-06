package edu.global.study0705;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JOptionPane;


//class MyThread1 extends Thread {
//	public void run() {
//		System.out.println(getName());
//
//		for (int i = 0; i < 300; i++) {
//			System.out.println("-");
//		}
//	}
//}
//
//class MyThread2 extends Thread {
//	public void run() {
//		System.out.println(getName());
//
//		for (int i = 0; i < 300; i++) {
//			System.out.println("|");
//		}
//	}
//}
//class MyThread1 implements Runnable {
//	
//	public void rum() {
//		for (int i = 0; i < 300; i++) {
//			System.out.println("-");
//	}
//}

//class Study_1 extends Thread {
//	public void run() {
//		for (int i = 10; i > 0; i--) {
//			System.out.println(i);
//			try {sleep(1000);}
//			catch (Exception e) {}
//		}
//	}
//}


class Account {
	int balance = 1000;
	
	public void withdraw(int money) {
		if (balance >= money) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			balance = balance - money;
		}
	}
}

class RunnableAccount implements Runnable {
	
	Account acc = new Account();
	
	
	@Override
	public void run () {
		
		while(acc.balance > 0) {
			int money = (int)(Math.random() * 3 +1) * 100;
			acc.withdraw(money);
			System.out.println("::balance:" + acc.balance);
		}
	}
}


public class Study {

	public static void main(String[] args) throws Exception {
		
		Runnable r = new RunnableAccount();
		
		Thread t1 = new Thread(r, "첫 번째");
		Thread t2 = new Thread(r, "두 번째");
		
		t1.start();
		t2.start();
//		Study_1 th1 = new Study_1();
//		th1.start();
//		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
//		System.out.println("입력하신 값은" + input + "입니다.");
		
//		for (int i = 10; i > 0; i--) {
//			System.out.println(i);
//			try {
//				Thread.sleep(1000);
//			} catch (Exception e) {
//				
//			}
//		}
		
//		for (int i = 0; i < 300; i++) {
//			System.out.println("-");
//		}
//		
//		for (int i = 0; i < 300; i++ ) {
//			System.out.println("|");
//		}
		
		
//		String name = Thread.currentThread().getName();
//		System.out.println(name);
//		MyThread1 th1 = new MyThread1();
//		MyThread2 th2 = new MyThread2();
//		th1.start();
//		th2.start();
		
//		Runnable th1 = new MyThread1();
//		Thread runnable = new Thread(th1);
//		
//		runnable.start();
		
//		String ks = "공부에 있어서 돈이 꼭 필요한 것은 아니다.";
//		String es = "Life is long if you know how to use it.";
//		
//		try (BufferedWriter bw = new BufferedWriter(new FileWriter("String.txt"))){
//			bw.write(ks, 0, ks.length());
//			bw.newLine();
//			bw.write(es, 0, es.length());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		
//		try (BufferedReader br = new BufferedReader(new FileReader("String.txt"))){
//			String str;
//			while (true) {
//				str = br.readLine();
//				if (str == null)
//					break;
//				System.out.println(str);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
	}

}
