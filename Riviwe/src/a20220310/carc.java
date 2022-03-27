package a20220310;

import java.util.Scanner;

public class carc {
	
	static void p(String hi) {
		System.out.println("hi");
	}
	
	static String r = "안녕하세요";{
		r="안녕하세요";
	}

	public static void main(String[] args) {
		// 사칙연산이 가능한 계산기를 만들어라
		Scanner sc= new Scanner(System.in);
		p(r);
		
		System.out.println("정수를 하나 입력 해 주세요");
		int a = sc.nextInt();
		System.out.println("사칙연산 부호를 입력 해 주세요");
		String c = sc.next();
		System.out.println("정수를 하나 입력 해 주세요");
		int b = sc.nextInt();
		int q = 0;
		
		if( c.equals("+")) {
			q = a+b;
			System.out.println(a + c + b + "=" + q);
			}else if( c.equals("-")) {
				q = a-b;
				System.out.println(a + c + b + "=" + q);
			}else if( c.equals("*")) {
				q = a*b;
				System.out.println(a + c + b + "=" + q);
			}else if( c.equals("/")) {
				q = a/b;
				System.out.println(a + c + b + "=" + q);
			}

	}

}
