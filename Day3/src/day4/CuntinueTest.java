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
			System.out.println("���� ���� ���� ���ּ���");
			count = count+1;
			cum = rd.nextInt(3)+1;
			user = sc.nextInt();
			System.out.println("cum = " + cum );
		if( cum == user ) {
			System.out.println("���º��Դϴ�");
			drew_cnt++;
		}else {
			if( cum == 1 ) {
				if ( user == 2 ) {
					System.out.println("�̰���ϴ�.");
					win_cnt++;
				}else {
					System.out.print("�����ϴ�.");
					lose_cnt++;
				}
			}else {
				if( cum == 2) {
					if (user == 1) {
						System.out.print("�����ϴ�.");
						lose_cnt++;
					}else {
						System.out.print("�̰���ϴ�.");
						win_cnt++;
					}
				}else {
					if( cum == 3) {
						if(user == 1) {
							System.out.println("�̰���ϴ�.");
							win_cnt++;
						}else {
							System.out.println("�����ϴ�.");
							lose_cnt++;
						}
					}
				}
		
		}
			
		}
		sc.nextLine();
		
		System.out.print("��� �Ͻðڽ��ϱ�?");
		answer = sc.nextLine();
		if(answer.equals("y") || answer.equals("Y")) {
			
		 }else {
			 if(answer.equals("n") ||answer.equals("N")) {
				  System.out.println("�����մϴ�.");
				 break;
			 }
			 else {
				 System.out.println("y or n �� �����Ͻÿ�.");
		}
    }
		
		}
	System.out.println(count + "��" + win_cnt + "��" + lose_cnt + "��" + drew_cnt + "��" );
	
}
}