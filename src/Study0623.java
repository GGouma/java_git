import java.util.Scanner;


class Circle2{
	   private double radius; //변수선언 > 게터세터 넣기
	   
	   public Circle2() {}
	   
	   public Circle2(double radius) {
		   this.radius = radius;
	   }

	   public double getRadius() {
	      return radius;  //원의 넓이를 가져오는 함수
	   }

	   public void setRadius(double radius) { //외부값받아서 원의넓이를 변경하는 함수
	      this.radius = radius;
	   }
	   
	   public double getArea() {
	      return radius*radius*Math.PI;  //원의 넓이 곱하는 함수만듦
	   }
	   
	}

class Rectangle3 {
	
	private double width;
	private double height;
	
	public Rectangle3() {}
	
	public Rectangle3(double width, double height) {
		this.width = width;
		this.height = height;
	}
	

	
	public double getArea() {
		return width * height;
	}
}

class Grade2 {
	   private String name;
	   private int kor, eng, math; // 인스턴트 변수

	   public Grade2(String name,int kor, int eng, int math) {
	      this.name = name;
	      this.kor = kor;
	      this.eng = eng;
	      this.math = math;
	   }

	   public double getAvg() {
	      return (kor + eng + math) / 3.0;
	   }

	   public void showInfo() {
	      System.out.println(name + "님의 평균은" + getAvg() + "성적은" + getGrade() + "입니다.");
	   }
	   
	   public char getGrade() {
	      char ch = '가';
	      double avg = getAvg();

	      if (avg >= 90) {
	         ch = '수';
	      } else if (avg >= 80) {
	         ch = '우';
	      } else if (avg >= 70) {
	         ch = '미';
	      } else if (avg >= 60) {
	         ch = '양';
	      }else {
	         ch ='가';
	      }

	      return ch;
	   }
	}

public class Study0623 {

	public static void main(String[] args) {
		/*
		 * String st1 = "Coffee"; String st2 = "Bread";
		 * 
		 * String st3 = st1.concat(st2); System.out.println(st3);
		 * 
		 * String st4 = "Fresh".concat(st3); System.out.println(st4);
		 * 
		 * String str = "abcdefg"; System.out.println(str.substring(2, 4));
		 * 
		 * double e = 2.718281; System.out.println(e); String se = String.valueOf(e);
		 * System.out.println(se);
		 * 
		 * StringBuilder stbuf = new StringBuilder("123");
		 * 
		 * stbuf.append(45678); System.out.println(stbuf.toString());
		 * 
		 * stbuf.delete(0, 2); System.out.println(stbuf.toString());
		 * 
		 * stbuf.replace(0, 3, "AB"); System.out.println(stbuf.toString());
		 * 
		 * stbuf.reverse(); System.out.println(stbuf.toString());
		 * 
		 * String sub = stbuf.substring(2, 4); System.out.println(sub);
		 * 
		 * Scanner sc = new Scanner(System.in); System.out.print("num1:"); int num1 =
		 * sc.nextInt(); System.out.print("num2:"); int num2 = sc.nextInt();
		 * System.out.print("num3:"); int num3 = sc.nextInt();
		 * 
		 * int sum = num1 + num2 + num3; System.out.println(sum);
		 */
		
//		Scanner sc = new Scanner(System.in);
//		Circle2 r;
//		
//		System.out.print("반지름: ");
//		double radius = sc.nextDouble();
//		
//		r = new Circle2(radius);
//		System.out.println("넓이는:" + r.getArea());
		
		
//		Scanner sc = new Scanner(System.in);
//		Rectangle3 rectangle;
//		
//		System.out.print("가로: ");
//		double width = sc.nextDouble();
//		System.out.print("세로: ");
//		double height = sc.nextDouble();
//		
//		rectangle = new Rectangle3(width, height);
//		
//		System.out.println("넓이는 :" + rectangle.getArea());
//		System.out.println("계속하시겠습니까?" + "(yes, no)");
//		
//		int inputINT = sc.nextInt();
//		String inputaSTR = sc.nextLine();
//		
//		   Scanner sc = null;
//		   Grade2 grade = null;
//		   int kor, eng, math;
//		   String name;
//		      ///////////////////////////////////
//		            
//		      while (true) {
//		         sc = new Scanner(System.in);         
//
//		         System.out.print("이름:");
//		         name = sc.next();
//		         
//		         System.out.print("국어:");
//		         kor = sc.nextInt();
//
//		         System.out.print("영어:");
//		         eng = sc.nextInt();
//		         
//		         System.out.print("수학:");
//		         math = sc.nextInt();
//		         
//		         grade = new Grade2(name, kor, eng, math);
//
//		         grade.showInfo();
//		         
//
//		         System.out.print("계속?");
//		         String choice = sc.next();
//
//		         if (choice.compareToIgnoreCase("yes") == 0 || choice.compareToIgnoreCase("y") == 0)
//		            continue;
//		         else
//		            break;
//		      }
//
//		      System.out.println("종료되었습니다.");
//		      
//		      //선언 방법 = 메모리 할당
//		      int[] arrNum = new int[5];
//		      double[] arrDou = new double[5];
//		      
//		      String[] arrStr = new String[5];
//		      Circle2[] arrCircle = new Circle2[5];
		      
		      //로또
//		      System.out.println((int)(Math.random() * 10 + 1));
//		      System.out.println((int)(Math.random() * 45 + 1));
//		      
//			//변수 선언
//			int[] arrLotto = new int[6];			
//		    
//			//입력
//		      for(int i = 0; i <arrLotto.length; i++) {		    	  
//		    	 arrLotto[i] = (int)(Math.random() * 45 + 1);
//		    	 
//		    	 for(int j= 0; j < i; j++) {
//		    		 if(arrLotto[i] == arrLotto[j]) {
//		    			 i--;
//		    			 break;
//		    		 }
//		    	 }
//		      }
//		     
//		    //출력
//		      for(int i = 0; i <arrLotto.length; i++) {
//		    	  System.out.print(arrLotto[i] + "\t");
//		      }
//		      
		      
		      
		      String[] arrStr = new String[2];
		      
		      arrStr[0] = "String 1";
		      arrStr[1] = "String 2";
		      int sum = 0;
		      
		      for(int i = 0; i < arrStr.length; i++) {
		    	  sum += arrStr[i].length();
		    	  
		      }
		      
		      
		      
		      System.out.println(arrStr[0].length());
		      System.out.println(sum);
		      
//		      Circle2[] arrCircle = new Circle2[2];
//		      
//		      arrCircle[0] = new Circle2(10.0);
//		      arrCircle[1] = new Circle2(5);
//		      
//		      double area = 0;
//		      for(int i = 0; i < arrCircle.length;i++) {
//		    	  area = area + arrCircle[i].getArea();
//		      }
//		      System.out.println(area);
		      
		      Rectangle3[] arrRec = new Rectangle3[2];
		      
		      arrRec[0] = new Rectangle3(40, 50);
		      arrRec[1] = new Rectangle3(20, 50);
		      
		      double area = 0;
		      for(int i=0; i < arrRec.length;i++) {
		          int width, height;
		          Scanner sc = new Scanner(System.in);
		          width = sc.nextInt();
		          height = sc.nextInt();         
		       
		          arrRec[i] = new Rectangle3(width,height);
		       }
		      
		      System.out.println(area);
		      
		      
		      
	}

}
