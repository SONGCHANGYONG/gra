package day4;

import java.util.Random;
import java.util.Scanner;

public class Addfge {
    //��ĳ�ʷ� �����Է� �����Լ��� �Լ� ���ڽ� ��ȯ �Լ�blackbox �� �������� �߻�/ ���� ��ĳ�� �Է��� ���ڶ� �� �������� �� ũ�� 1 �ݴ�� -1 �μ��� ������ 0 1��Ů�ϴ� -1 ���۽��ϴ� 0 �����ϴ�. 
	
	    static void blackbox() {
	    	
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int blackbox = rd.nextInt(10)+1;
		
		System.out.println("���� ���� �Է��� �ּ��� >>");
		
		int user =  sc.nextInt();
		
		System.out.println("bkackbox �� ���� " + blackbox + "�Դϴ�");
		
		
		if( blackbox == user) {
			System.out.println();
			System.out.println("�����ϴ�.");
		}
		else {
			if( blackbox > user ) {
				System.out.println();
				System.out.println("blackbox�� ������ �۽��ϴ�.");	
			}
			else {
				System.out.println();
				System.out.println("blackbox�� ������ Ů�ϴ�.");
			}
		   
		
		
		}
		
	}

}
