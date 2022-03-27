package a20220303;

import java.util.Scanner;

public class Prat2_while {

	public static void main(String[] args) {
		//comdmf 2로 나눠서 나머지가 0일떄 숫자를 띄운다 com 0이되면 종료된다.
		Scanner sc = new Scanner(System.in);
		
		int com = sc.nextInt();
		while(com >0) {
			com--;
			if(com % 2 == 0) {
			    System.out.println(com);
			    
			}
			else {
				System.out.println(" ");
				continue; // 반복문속 continue는 반복문이 한번 끝난후 continue 이후 명령을 실행하지 않고 다시 반복문을 실행.
				          // 
			}
			System.out.println("안녕하세요");
		}


	}

}
