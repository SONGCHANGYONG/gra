package carc;

import java.util.Scanner;

public class carc_app {

	public static void main(String[] args) { // main 함수 자바 실행 우선순위 1등 실행순서 위에서 아래 (절차적 프로그래밍,구조적 프로그래밍)
		                                     // 콜백 : 내가 직접 부르지 않은 함수 ex)void main 백: 내가 부른 함수 ex)op.equals("-"), x = sc.nextInt();
		//계산기 만들때 필요한것--> 계산할 숫자를 담을 변수, 연산자를 담을 변수, 결과 값을 닮을 변수가 필요
		Scanner sc = new Scanner(System.in); //(System.in)키보드를 사용해서 담겠다.
		
		int x; // 한 정수값을 대입
		int y; // 하나의 정수의 값을 대입 
		int c; // 두수의 연산 결과값을 대입
		String op = ""; // 계산할  연산자를 담을 변수
		
		System.out.println("첫번째 숫자값을 입력 : ");// ;명령 한 줄 종료후 무조건 써야 함
		x = sc.nextInt(); // 정수를 입력할때
		System.out.println("두번째 숫자값을 입력 : ");
		y = sc.nextInt();// 정수를 입력할때
		System.out.println("사칙연산 부호 입력(+ , - , * , /) : ");
		op= sc.next(); //키 하나 입력할때
		
		//입력한 값이 연산부로에 맞게 사칙연산 수행
		if (op.equals("+")) { // 숫자 비교는 ==, 문자비교는 .equals("")를 사용
			c=x+y;
			System.out.println( x + "+" + y + "= " + c);
		}else if(op.equals("-")) {
			c= x-y;
			System.out.println( x + "-" + y + "= " + c);
		}else if(op.equals("*")) {
			c=x*y;
			System.out.println( x + "*" + y + "= " + c);
		}else if(op.equals("/")) {
			c=x/y;
			System.out.println( x + "/" + y + "= " + c);
		}else{
			System.out.println("알맞은 연산자를 입력 해 주세요 (+, -, *, /)");
	    }
		

	}

}
