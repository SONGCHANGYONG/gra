package day3;

import java.util.Random;
import java.util.Scanner;

public class Game02 {

	public static void main(String[] args) {
		Random rd = new Random();
		 int com =rd.nextInt(100)+1;
		while( true ) {
		
		 System.out.println("com : " + com );
		 System.out.println("1~100중 하나를 입력해 보세요");
		 Scanner sc = new Scanner(System.in);
		 int user = sc.nextInt();
		 
		 if( com == user) {
			 System.out.println("Good!");
			 System.out.println("Good!");
			 break;
		 }
			 else{
				 if( com > user ) {
					 System.out.println("입력한 숫자가 작습니다. 더큰수를 입력하세요!");
				 }
				 else {
					 System.out.println("입력한 숫자가 큽니다 작은수를 입력하세요 !");
				 }
		 }
		   
	  }

	}
}
