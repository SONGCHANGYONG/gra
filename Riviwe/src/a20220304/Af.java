package a20220304;

import java.util.Random;
import java.util.Scanner;

public class Af {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Random rd = new Random();
		
		int com = 0;
		int user = 0;
		
		System.out.println("���� ���� ���� �����մϴ� ");
		
		while(true) {
			System.out.println("���� ���� �� �� �ϳ��� ���ּ���(����=1 ����=2 ��=3  >>  ");

			
			com = rd.nextInt(3)+1;
			if(user ==1 ) {
				System.out.println("user = " + "����");
			}else if(user == 2) {
				System.out.println("user = " + "����");
			}else {
				System.out.println("user = " + "��");
			}
			if( com ==1 ) {
				System.out.println("com = " + "����");
			}else if( com == 2) {
				System.out.println("com = " + "����");
			}else {
				System.out.println("com = " + "��");
			}

			
			if(com == user) {
				System.out.println("���º� �Դϴ�.");
			} else if(com == 1) {
				if(user == 2) {
					System.out.println("�̰���ϴ�.");
				}else {
					System.out.println("�����ϴ�.");
				}
			        }else if(com == 2) {
			        	if(user == 1) {
			        		System.out.println("�����ϴ�.");
			        	}else {
			        		System.out.println("�̰���ϴ�");
			        	}
			        }else if(com == 3) {
			        	if(user == 1) {
			        		System.out.println("�̰���ϴ�.");
			        	}else{
			        		System.out.println("�����ϴ�.");
			        	}
			        }
			String a = null; 
			
			while(true) {
			System.out.println("������ ��� ���� �Ͻðڽ��ϱ�?(y/n)");
			a = sc.nextLine();
			
			
			
			if (a.equals("y") || a.equals("Y")) { break;
			}else {
				if(a.equals("n") || a.equals("N")) {
					System.out.println("���� ���� ���� �����մϴ� .");
					break;
				}else {
					System.out.println("y �Ǵ� n�� �Է��� �ּ���.");
				}
				
			}
			}			
		}
	}
}


