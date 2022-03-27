package day3;

import java.util.Scanner;

public class ExFuncion03 {
	
	public static void main(String[] args) {
		//1:가위 2:주먹 3:보
		int user = 0;
		//컨트롤 쉬프트 o 빨간줄사라지고 위에import java.util.Scanner; 생성
		Scanner sc = new Scanner(System.in);
		System.out.print("1~3 사이의 숫자를 입력해 주세요>>");
		user = sc.nextInt();
		System.out.println("user : " + user);
	
	}
	
}

