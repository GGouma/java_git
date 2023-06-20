
public class Study {
	
	public static char gradChar(double avg) {
		char ch = '가';
		if(avg >= 90) {
			ch = '수';
		}
		else if(avg >= 80) {
			ch = '우';
		}
		else if(avg >= 70) {
			ch = '미';
		}
		else if(avg >= 60) {
			ch = '양';
		}
		else {
			ch = '가';
		}
		return ch;
	}
	public static double getCircleArea(double num) {
		final double PI = 3.14;
		return PI * num * num;		
	}
	
	public static double getRectangleArea(double num1, double num2) {
		return num1 * num2;
	}
	
	public static double getTriangleArea(double num1, double num2) {
		return 0.5 * num1 * num2;
	}
	
	public static int getAscCode(char ch) {
		return (int)ch;
	}

	public static void main(String[] args) {
		System.out.println(gradChar(90.8));
		System.out.println(gradChar(80.0));
		System.out.println(gradChar(50.0));
//		 double area = getCircleArea(10);
//	      System.out.println(area); //314.0
	      
	     double area = getRectangleArea(10, 20);
	      System.out.println(area); //200.0
	      
	      area = getTriangleArea(40, 20);
	      System.out.println(area); //200.0
	      
	      int code = getAscCode('A');
	      System.out.println(code); //65
	      
	      code = getAscCode('\n');
	      System.out.println(code); //65
	      
	      code = getAscCode(' ');
	      System.out.println(code); //65
	      
	      code = getAscCode('1');
	      System.out.println(code); //65
	      
	      code = getAscCode('a');
	      System.out.println(code); //65
	}

}
