package day3;

import java.util.Scanner;

public class RepeatTest {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int i= 0;
		int chk = 0;
		//조건식()안이 참인동안 블록안의 명령문을 반복 수행한다.
		while( true ) {
			System.out.println("숫자를 입력해주세요: ");
            chk = sc.nextInt();
            System.out.print(chk);
               
            if(chk ==9 ) {
            	break;
            }
            else {}
            
            System.out.print("다른수를 입력하세요. ");
			i = i + 1; //자기수에 수를더해 계속 증가함 누적연산자 =i++;
			
			
		}

	}
}


