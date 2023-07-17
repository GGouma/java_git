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

class TV2 {
	String brand;
	int year;
	int inch;
	
	TV2(String brand, int year, int inch){
		this.brand = brand;
		this.year = year;
		this.inch = inch;
	}
	
	void show() {
		System.out.println(brand + "에서 만든" + year + "년형" + inch + "인치 TV");
	}
	
}

class Song2 {
	String title;
	String artist;
	String country;
	int year;
	
	Song2() {}
	
	Song2(String title, String artist, String country, int year) {
		this.title = title;
		this.artist = artist;
		this.country = country;
		this.year = year;
	}
		
	void show() {
		System.out.println(year + "년" + country + "국적의" + artist + "가 부른" + title);
	}
	
}

public class Test {

	public static void main(String[] args) {
		
		GetSum getsum = new GetSum(); // 1)객체 생성
        int num; // 2)num 변수 선언
        num = 100;
        
        getsum.setNum(100);
        num = getsum.sum(); // 4)getsum객체의 sum함수 호출, 1-50까지 합 구함
        System.out.println(num);
        
       
		Grade kim = new Grade();
		kim.setGrade(80, 70, 54);
		System.out.println(kim.getAvg());
		System.out.println(kim.getGrade());
		
		TV2 myTV2 = new TV2("LG", 2017, 32);
		myTV2.show();
		
		Song2 song2 = new Song2("Dancing Queen", "ABBA", "스웨덴", 1978);
		song2.show();
	}

}
