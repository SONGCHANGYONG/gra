package day3;

import java.util.Scanner;

public class Aaa {

	public static void main(String[] args) {
		
		//���������� ����
		//1.��ǻ�Ͱ� �����������߿� �ϳ��� �����Ѵ�.
		   //������ 1 ������ 2 ���� 3
		int com = 2;
		//2.����ڰ� �����������߿� �ϳ��� �����Ѵ�.
		   //������ 1 ������ 2 ���� 3 (Ű�����Է��ؾ���)
		Scanner sc = new Scanner(System.in);
		System.out.println("����,����,�� (1~3)>>");
		int user = sc.nextInt();
		//3.��ǻ�Ϳ� ����� �߿� ���� �̰������ �Ǵ��Ѵ�.
		if(com == user) {
			 System.out.println("�����ϴ�.");
		}
			else {
				if(com == 1 ) {
				    if(user == 3) { 
					System.out.println("�����ϴ�.");
			}
				else {
					System.out.println("�̰���ϴ�.");	
				}
		}
				else {
					if(com == 2) {
						if( user == 1 )
						System.out.println("�����ϴ�.");
					}
					else {
						System.out.println("�̰���ϴ�.");
					}
				}
			}
	}
}


	


