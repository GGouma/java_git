/*class Grade {
	int kor, eng, math;
	
	
	void setGrade(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
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
	
}*/

//class BankAccount {
//    int balance = 0;     // 예금 잔액
//
//    public int deposit(int amount) {
//        balance += amount;
//        return balance;
//    }    
//
//    public int withdraw(int amount) {
//        balance -= amount;
//        return balance;
//    }
//
//    public int checkMyBalance() {
//        System.out.println("잔액 : " + balance);
//        return balance;
//    }
//    
//}

/*class TV {
	String brand;
	int year, inch;
	
	
	TV(String brand, int year, int inch) {
		this.brand = brand;
		this.year = year;
		this.inch = inch;
	}
	
	void show() {
		System.out.println(brand + "에서 만든" + year + "년형" + inch + "인치 TV");
	}
}*/


/*class Song {
	String artist, title, country;
	int year;
	
	Song() {
		
	}
	
	Song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this. country = country;
	}
	
	void show() {
		System.out.println(year + "년" + country + "국적의" + artist + "가" + "부른" + title);
	}
	
}*/
public class Study2 {

	public static void main(String[] args) {
		
		/*
		 * Grade kim = new Grade();
		 * 
		 * kim.setGrade(90, 80, 75);
		 * 
		 * System.out.println(kim.getAvg()); System.out.println(kim.getGrade());
		 * 
		 * Grade park = new Grade();
		 * 
		 * park.setGrade(100, 50, 67);
		 * 
		 * System.out.println(park.getAvg()); System.out.println(park.getGrade());
		 */
		/*
		BankAccount ref1 = new BankAccount();
		BankAccount ref2 = ref1;
		
		ref1.deposit(3000);
		ref2.deposit(2000);
		ref1.withdraw(400);
		ref2.withdraw(300);
		ref1.checkMyBalance();
		ref2.checkMyBalance();*/
		/*
		 * TV myTV = new TV("LG", 2017, 32); myTV.show();
		 */
		
		/*
		 * Song song = new Song("Dancing Queen", "ABBA", 1978, "스웨덴"); song.show();
		 * 
		 * song = new Song("Yesterday", "비틀즈", 1963, "영국"); song.show();
		 */
	}

}
