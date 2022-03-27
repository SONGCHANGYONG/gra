package carc;

import java.util.Scanner;

public class Carc_app_Test {

	public static void main(String[] args) {
	 
		Scanner sc = new Scanner(System.in);
		
		String c = "";
		
		System.out.println("숫자를 입력 해 주세요 ");
		double a = sc.nextInt();
		System.out.println("연산기호를 입력 해 주세요 ");
		c=sc.next();
		System.out.println("숫자를 입력 해 주세요 ");
		double b = sc.nextInt();
		
		
		
		if(c.equals("+")) {
			System.out.println(a+b);
		}else if(c.equals("-")) {
			System.out.println(a-b);
		}else if(c.equals("*")) {
			System.out.println(a*b);
		}else if(c.equals("/")) {
			System.out.println(a/b);
		}
			
		}
	}
	


