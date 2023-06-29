package edu.global.study0629;
import java.nio.file.Files;
import java.util.InputMismatchException;
import java.util.Scanner;


import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

import java.io.BufferedWriter;


class Board {}
class PBoard extends Board {}

public class Study0629 {
	
	
	
	public static void main(String[] args) {

		Path file = Paths.get("C:\\javastudy\\Simple.txt");
		BufferedWriter writer = null;
		
		
		
//		writer = Files.newBufferedWriter(file);
		
		
		
		Board pbd1 = new PBoard();
		PBoard pbd2 = (PBoard)pbd1;
		
		System.out.println("asdfasdf");
		Board ebd1 = new Board();
		PBoard ebd2 = (PBoard)ebd1;
		
		Scanner kb = new Scanner(System.in);
		try {
		System.out.print("a/b...a? ");
		int n1 = kb.nextInt();
		
		System.out.print("a/b...a? ");
		int n2 = kb.nextInt();
		
		System.out.println(n1/n2);
		}
		
		catch(ArithmeticException e) {
			e.printStackTrace();
//			System.out.println(e.getMessage());
		}
		
		catch(InputMismatchException e) {
			e.printStackTrace();
		}
		System.out.println("Good bye~~!");
		
	}
    
}
