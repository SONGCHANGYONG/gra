package b20220313;

import java.util.Scanner;

public class Bank {
	private int a;
	private int b;
	Scanner sc = new Scanner(System.in);

	public void inout(String anser) {
		System.out.println("입금 / 출금 을 선택 해 주세요");

		String d = sc.next();
		
		if (d.equals("입금")) {
			System.out.println("입금 할 금액을 입력해 주세요");
			a = a + sc.nextInt();
			
		} else if (d.equals("출금")) {
			System.out.println("출금 할 금액을 입력해 주세요");
			a = a - sc.nextInt();
		
		} else {
			System.out.println("입금 / 출금 을 선택 해 주세요");
			
		}
		
		
	}

	public void balance() {
		a = a;
		System.out.println("현재 잔액은 " + a + " 입니다.");
	}

	public void velue() {
		inout("a");

		balance();
	}

	public static void main(String[] args) {
		// 출, 입금이 가능한 시스템을 만든다.

		Bank bank = new Bank();
		bank.velue();

	}

}
