package day3;

import java.util.Random;
import java.util.Scanner;

public class Game02 {

	public static void main(String[] args) {
		Random rd = new Random();
		 int com =rd.nextInt(100)+1;
		while( true ) {
		
		 System.out.println("com : " + com );
		 System.out.println("1~100�� �ϳ��� �Է��� ������");
		 Scanner sc = new Scanner(System.in);
		 int user = sc.nextInt();
		 
		 if( com == user) {
			 System.out.println("Good!");
			 System.out.println("Good!");
			 break;
		 }
			 else{
				 if( com > user ) {
					 System.out.println("�Է��� ���ڰ� �۽��ϴ�. ��ū���� �Է��ϼ���!");
				 }
				 else {
					 System.out.println("�Է��� ���ڰ� Ů�ϴ� �������� �Է��ϼ��� !");
				 }
		 }
		   
	  }

	}
}
