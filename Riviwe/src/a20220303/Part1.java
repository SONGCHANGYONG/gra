package a20220303;

import java.util.Random;
import java.util.Scanner;

public class Part1 {
	
	public static void main(String[] args) {
		//���������� 1=���� 2=���� 3=��
		System.out.println( );
		System.out.println("������������ �����մϴ�. (���� = 1 ������ = 2 �� = 3)  ���ڸ� �Է��� �ּ���>>");
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
	
		int com = random.nextInt(3)+1;
		int user = sc.nextInt();
		
		
		if( com == user ) {
			System.out.println("�����ϴ�.");
		}
		else {
			if( com == 1 ) {
				if( user == 2) {
					System.out.println("user�� �̰���ϴ�.");
				}
					else {
						System.out.println("com�� �̰���ϴ�.");
					}
			if( com ==2 ) {
				if(user == 1) {
					System.out.println("com�� �̰���ϴ�.");
				}
				else {
					System.out.println("user�� �̰���ϴ�.");
				}
				
					}		
			else {
				if(com == 3) {
					if( user==1 ) {
						System.out.println("user�� �̰���ϴ�.");
					}
					else {
						System.out.println("com�� �̰���ϴ�.");
					}
				}
				
			}
			}
			}
			
}
	}
