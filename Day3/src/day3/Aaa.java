package day3;

import java.util.Scanner;

public class Aaa {

	public static void main(String[] args) {
		
		//가위바위보 게임
		//1.컴퓨터가 가위바위보중에 하나를 내야한다.
		   //가위는 1 바위는 2 보는 3
		int com = 2;
		//2.사용자가 가위바위보중에 하나를 내야한다.
		   //가위는 1 바위는 2 보는 3 (키보드입력해야함)
		Scanner sc = new Scanner(System.in);
		System.out.println("가위,바위,보 (1~3)>>");
		int user = sc.nextInt();
		//3.컴퓨터와 사용자 중에 누가 이겼는지를 판단한다.
		if(com == user) {
			 System.out.println("비겼습니다.");
		}
			else {
				if(com == 1 ) {
				    if(user == 3) { 
					System.out.println("졌습니다.");
			}
				else {
					System.out.println("이겼습니다.");	
				}
		}
				else {
					if(com == 2) {
						if( user == 1 )
						System.out.println("졌습니다.");
					}
					else {
						System.out.println("이겼습니다.");
					}
				}
			}
	}
}


	


