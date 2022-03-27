package a20220303;

import java.util.Random;
import java.util.Scanner;

public class Part1 {
	
	public static void main(String[] args) {
		//가위바위보 1=가위 2=바위 3=보
		System.out.println( );
		System.out.println("가위바위보를 시작합니다. (가위 = 1 바위는 = 2 보 = 3)  숫자를 입력해 주세요>>");
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
	
		int com = random.nextInt(3)+1;
		int user = sc.nextInt();
		
		
		if( com == user ) {
			System.out.println("비겼습니다.");
		}
		else {
			if( com == 1 ) {
				if( user == 2) {
					System.out.println("user가 이겼습니다.");
				}
					else {
						System.out.println("com이 이겼습니다.");
					}
			if( com ==2 ) {
				if(user == 1) {
					System.out.println("com이 이겼습니다.");
				}
				else {
					System.out.println("user가 이겼습니다.");
				}
				
					}		
			else {
				if(com == 3) {
					if( user==1 ) {
						System.out.println("user가 이겼습니다.");
					}
					else {
						System.out.println("com이 이겼습니다.");
					}
				}
				
			}
			}
			}
			
}
	}
