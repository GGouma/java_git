package edu.global.study0704;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Study {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		   System.out.print("읽을 파일: ");
		   String src = sc.nextLine();
		   
		   try(Reader in = new FileReader(src)) { // 문자 입력 스트림 생성
		      int ch;
		      
		      while(true) {
		         ch = in.read(); // 문자를 하나씩 읽는다.
		         if(ch == -1) // 더 이상 읽을 문자가 없다면,
		            break;
		         System.out.print((char)ch); // 문자를 하나씩 출력한다.
		      }
		   }
		   catch(IOException e) {
		      e.printStackTrace();
		   }
//		try(Writer out = new FileWriter("data1.txt")) {
//			for(char ch = 'A'; ch <= 'Z'; ch++) {
//				
//				
//				out.write(ch);
//				
//			}
//			
//		}
//		catch(IOException e) {
//			e.printStackTrace();
//		}
		
//		 Scanner sc = new Scanner(System.in);
//	        System.out.print("대상 파일: ");
//	        String src = sc.nextLine();
//
//	        System.out.print("사본 이름: ");
//	        String dst = sc.nextLine();
//
//	        try(BufferedInputStream in = 
//	                   new BufferedInputStream(new FileInputStream(src)) ;
//	            BufferedOutputStream out = 
//	                   new BufferedOutputStream(new FileOutputStream(dst))) {
//
//	            int data;
//	            while(true) {
//	                data = in.read();             
//	                if(data == -1)
//	                    break;             
//	                out.write(data);
//	            }
//	        }
//	        catch(IOException e) {
//	            e.printStackTrace();       
//	        }
	    }
	}
