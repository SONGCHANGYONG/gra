package b20220312;

import java.util.Scanner;

public class carc_계산기01 {

	public static void main(String[] args) {
		//두수와 연산기호를 입력받아 사칙연산이 가능한 계산기를 만들어라
		
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		String c;
		int d = 0;
		String x = "y";
		while(true){
		
		System.out.println("계산 할 수를 입력 해 주세요. >> ");
		a = sc.nextInt();
		System.out.println("연산 기호를 입력 해 주세요. >> ");
		c = sc.next();
		System.out.println("계산 할 수를 입력 해 주세요. >> ");
		b = sc.nextInt();
		
		if (c.equals("+")) {
			d =a+b;
		}else if (c.equals("-")) {
			d =a-b;
		}else if (c.equals("*")) {
			d =a*b;
		}else if (c.equals("/")) {
			d =a/b;
		}else {
			System.out.println("연산기호를 입력해 주세요");
		}
		
		System.out.println("계산결과는 : " + d);
		System.out.println("게쏙 진행 하시겠습니까? (y/n)");
		x = sc.next();
		if( x.equals("y") || x.equals("Y")) {
			
		}else if( x.equals("n") || x.equals("N")) {
			System.out.println ("계산기를 종료합니다..");
			
		}
			
		}
	}

}
