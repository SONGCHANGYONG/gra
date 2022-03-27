package day4;

import java.util.Scanner;

public class RpeatEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		while(num > 0) {
			num--; //하나씩 감소
			if(num % 2 == 0) { // % 나머지 함수
				 System.out.println(num);
			}
			else {
				continue; // 반복문속 continue는 반복문이 한번 끝난후 continue 이후 명령을 실행하지 않고 다시 반복문 실행.
			}
			System.out.println("추가 명령문들이 올 수 있어요..."); 
		}

	}

}
