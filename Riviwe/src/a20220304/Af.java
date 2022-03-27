package a20220304;

import java.util.Random;
import java.util.Scanner;

public class Af {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Random rd = new Random();
		
		int com = 0;
		int user = 0;
		
		System.out.println("가위 바위 보를 시작합니다 ");
		
		while(true) {
			System.out.println("가위 바위 보 중 하나를 내주세요(가위=1 바위=2 보=3  >>  ");

			
			com = rd.nextInt(3)+1;
			if(user ==1 ) {
				System.out.println("user = " + "가위");
			}else if(user == 2) {
				System.out.println("user = " + "바위");
			}else {
				System.out.println("user = " + "보");
			}
			if( com ==1 ) {
				System.out.println("com = " + "가위");
			}else if( com == 2) {
				System.out.println("com = " + "바위");
			}else {
				System.out.println("com = " + "보");
			}

			
			if(com == user) {
				System.out.println("무승부 입니다.");
			} else if(com == 1) {
				if(user == 2) {
					System.out.println("이겼습니다.");
				}else {
					System.out.println("졌습니다.");
				}
			        }else if(com == 2) {
			        	if(user == 1) {
			        		System.out.println("졌습니다.");
			        	}else {
			        		System.out.println("이겼습니다");
			        	}
			        }else if(com == 3) {
			        	if(user == 1) {
			        		System.out.println("이겼습니다.");
			        	}else{
			        		System.out.println("졌습니다.");
			        	}
			        }
			String a = null; 
			
			while(true) {
			System.out.println("게임을 계속 진행 하시겠습니까?(y/n)");
			a = sc.nextLine();
			
			
			
			if (a.equals("y") || a.equals("Y")) { break;
			}else {
				if(a.equals("n") || a.equals("N")) {
					System.out.println("가위 바위 보를 종료합니다 .");
					break;
				}else {
					System.out.println("y 또는 n을 입력해 주세요.");
				}
				
			}
			}			
		}
	}
}


