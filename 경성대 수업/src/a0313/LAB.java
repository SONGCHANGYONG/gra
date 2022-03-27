package a0313;

public class LAB {
int balance = 0;
	
	void desposit(int amount) {
		balance = balance + amount;
	}
	
	void withdraw(int amount) {
		
		if (amount > balance ) {
			System.out.println("잔액이 부족합니다.");
		}else {
			balance = balance - amount;
		}
			
	}
	
	int getBalance() {
		
		return balance;
	}
	
	void addInterest() {
		double b = balance;
		b =(b*0.075); 
		System.out.println("연 이자는 " + b + " 원입니다." );
	}
	// BankAccount클래스를 간략히 실행하는 메소드
		public String toString() {
			return "현재 잔액은 " + balance;
		}
}
