package edu.global.study0705;


public class Test {

	public static void main(String[] args) {
    
		int month = 3;
    	switch (month) {
    		case 12:
    		case 1:
    		case 2:
    		case 3:
    			System.out.println("겨울 입니다.");
    			break;
    		case 4:
    		case 5:
    		case 6:
    			System.out.println("봄 입니다.");
    			break;
    		case 7:
    		case 8:
    			System.out.println("여름 입니다.");
    			break;
    		case 9:
    		case 10:
    		case 11:
    			System.out.println("가을 입니다.");
    			break;
    			
    			default:
    				System.out.println("잘못된 입력입니다.");
		
    		
    	
    	
    	}
    	System.out.println("프로그램 종료");
        }

}
