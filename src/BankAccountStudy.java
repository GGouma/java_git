
class BankAccount {
    int balance = 0;     // 예금 잔액
    
    
    BankAccount(){
    	System.out.println("생성자 시작");
    }
    BankAccount(int balance){
    	this.balance = balance;
    	System.out.println("생성자 시작2");
    }
    public int deposit(int amount) {
        balance += amount;
        return balance;
    }    

    public int withdraw(int amount) {
        balance -= amount;
        return balance;
    }

    public int checkMyBalance() {
        System.out.println("잔액 : " + balance);
        return balance;
    }
    
}



public class BankAccountStudy {

	public static void main(String[] args) {
		
		/*
		 * BankAccount ref1 = new BankAccount(); BankAccount ref2 = ref1;
		 * 
		 * ref1.deposit(3000); ref2.deposit(2000); ref1.withdraw(400);
		 * ref2.withdraw(300); ref1.checkMyBalance(); ref2.checkMyBalance();
		 */
		
		BankAccount ref = new BankAccount();
		BankAccount ref2 = new BankAccount(2000);
	
		
		ref.deposit(3000);
		ref.withdraw(300);
		check(ref);
		
		String str1 = "Happy";
		String str2 = "Birthday";
		System.out.println(str1 + " " + str2);
		
		
		

	}
	public static void check(BankAccount acc) {
		acc.checkMyBalance();
	}
}

