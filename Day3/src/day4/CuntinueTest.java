package day4;

import java.util.Random;
import java.util.Scanner;

public class CuntinueTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int win_cnt = 0;
		int lose_cnt = 0;
		int drew_cnt = 0;
		int count = 0;
		int cum = 0;
		int user = 0;
		
		String answer = null;
		
		while(true) { 
			System.out.println("가위 바위 보를 내주세요");
			count = count+1;
			cum = rd.nextInt(3)+1;
			user = sc.nextInt();
			System.out.println("cum = " + cum );
		if( cum == user ) {
			System.out.println("무승부입니다");
			drew_cnt++;
		}else {
			if( cum == 1 ) {
				if ( user == 2 ) {
					System.out.println("이겼습니다.");
					win_cnt++;
				}else {
					System.out.print("졌습니다.");
					lose_cnt++;
				}
			}else {
				if( cum == 2) {
					if (user == 1) {
						System.out.print("졌습니다.");
						lose_cnt++;
					}else {
						System.out.print("이겼습니다.");
						win_cnt++;
					}
				}else {
					if( cum == 3) {
						if(user == 1) {
							System.out.println("이겼습니다.");
							win_cnt++;
						}else {
							System.out.println("졌습니다.");
							lose_cnt++;
						}
					}
				}
		
		}
			
		}
		sc.nextLine();
		
		System.out.print("계속 하시겠습니까?");
		answer = sc.nextLine();
		if(answer.equals("y") || answer.equals("Y")) {
			
		 }else {
			 if(answer.equals("n") ||answer.equals("N")) {
				  System.out.println("종료합니다.");
				 break;
			 }
			 else {
				 System.out.println("y or n 중 선택하시오.");
		}
    }
		
		}
	System.out.println(count + "전" + win_cnt + "승" + lose_cnt + "패" + drew_cnt + "무" );
	
}
}