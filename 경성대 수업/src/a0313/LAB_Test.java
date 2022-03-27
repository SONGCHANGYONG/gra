package a0313;

public class LAB_Test {

	public static void main(String[] args) {
			LAB b = new LAB();
			b.desposit(100);
			System.out.println("100원을 입금 헀습니다.");
			b.withdraw(60);
			System.out.println("60원을 출금 헀습니다.");
			b.getBalance(); 
			System.out.println("현재잔액은 " + b.getBalance() + "원 입니다.");
			b.addInterest();

	}

}
