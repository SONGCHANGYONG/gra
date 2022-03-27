package day4;

import java.util.Random;
import java.util.Scanner;

public class Addfge {
    //스캐너로 숫자입력 메인함수가 함수 블랙박스 소환 함수blackbox 안 랜덤숫자 발생/ 내가 스캐너 입력한 숫자랑 비교 랜덤수가 더 크면 1 반대면 -1 두수가 같으면 0 1더큽니다 -1 더작습니다 0 같습니다. 
	
	    static void blackbox() {
	    	
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int blackbox = rd.nextInt(10)+1;
		
		System.out.println("숫자 값을 입력해 주세요 >>");
		
		int user =  sc.nextInt();
		
		System.out.println("bkackbox 의 값은 " + blackbox + "입니다");
		
		
		if( blackbox == user) {
			System.out.println();
			System.out.println("같습니다.");
		}
		else {
			if( blackbox > user ) {
				System.out.println();
				System.out.println("blackbox의 수보다 작습니다.");	
			}
			else {
				System.out.println();
				System.out.println("blackbox의 수보다 큽니다.");
			}
		   
		
		
		}
		
	}

}
