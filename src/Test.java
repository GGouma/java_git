class Grade {
	int kor, eng, math, total;
	double avg;
	Grade() {}
	
	void setGrade(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		/*
		 * this.total = total; this.avg = avg;
		 */
				
	}
	double getAvg() {
		return (kor + eng + math) / 3.0;
		
	}
	
	char getGrade() {
		char ch = '가';
		double avg = getAvg();
		
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
	}


public class Test {

	public static void main(String[] args) {
		
		GetSum getsum = new GetSum(); // 1)객체 생성
        int num; // 2)num 변수 선언
        num = 100;
        
        getsum.setNum(1000);
        num = getsum.sum(); // 4)getsum객체의 sum함수 호출, 1-50까지 합 구함
        System.out.println(num);
        
       
		Grade kim = new Grade();
		kim.setGrade(80, 70, 54);
		System.out.println(kim.getAvg());
		System.out.println(kim.getGrade());
	}

}
