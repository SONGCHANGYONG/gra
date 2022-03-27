package a0313;

class BankAccount {
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
			
		System.out.println("통장 잔액은 " + balance + " 원입니다.");
		
		return balance;
	}
	
	void addInterest() {
		double b = balance;
		b =(b*0.075); 
		System.out.println("이자는 " + b + " 원입니다." );
	}
	// BankAccount클래스를 간략히 실행하는 메소드
		public String toString() {
			return "현재 잔액은 " + balance;
		}
		
}	
public class Class_LAB {
	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		b.desposit(100);
		b.withdraw(60);
		b.getBalance();
		b.addInterest();
	}

}
