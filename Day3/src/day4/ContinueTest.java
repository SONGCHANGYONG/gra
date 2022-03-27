package day4;

import java.util.Random;
import java.util.Scanner;

public class ContinueTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //ctrl + shift + o
		Random rd = new Random();
		System.out.println("가위 바위 보(가위=1 바위는=2 보=3) >>");
		//게임이 한번 수행 된 후에 계쏙할건지 물어봐야한다.
		//yes를 응담하면 계속하게되고 no 를 응담하면 중단해야해.
		//가위바위보를할 컴과 사용자를 준비
		//가위바위보는 숫자로 표현 가위1, 바위2, 보3
		int win_cnt =0;
		int lose_cnt = 0;
		int drow_cnt = 0;
		int com = sc.nextInt(3)+1;
	

	    int user =sc.nextInt();
	    int count = 0;  //횟수를 저장하는 변수
	    
	    
		String answer = null;
		while(true) {
			
			count = rd.nextInt(3)+1;  //횟수를 저장하는 변수
		    count = count +1;
			com = sc.nextInt(3)+1;
		    user = sc.nextInt();
		    //가위바위보를 낸 후 횟수 증가시켜야함.  여기다 count 변수갓을 1만큼 증가
		    

		    //승부를 판별 해야함
		    //먼저 무승부 부터 처리
		    
		    if(com == user) {
		    	 System.out.println("무승부.");
		    	 drow_cnt++;
		    }
		    else{
		    	//컴이 가위를 냈을때 사용자는 바위 또는 보를 낸경우를 처리해야함
		    	if(com == 1) {
		    		if(user == 2) {
		    			//사용자가 바위를 낸거임
		    			 System.out.println("user win.");
		    			 win_cnt++;
		    		}
		    		else {
		    			//사용자가 보를 낸경우 컴이이김
		    			 System.out.println("com win.");
		    			 lose_cnt++;
		    		}
		    	}
		    	else {
		    		//컴이 바위나 보를낸경우
		    		if (com ==2) {
		    			//사용자는 가위나 보를 냄 가위부터 처리 사용자짐
		    			if(user == 1 ) {
		    				 System.out.println("com win.");
		    				 lose_cnt++;
		    			}
		    			else {
		    				//사용자가 보를 낸경우 사용자가 이김
		    				 System.out.println("user win.");
		    				 win_cnt++;
		    			}
		    			
		    		}
		    		else {
		    			//보만 처리하면됨
		    			if( com == 3) {
		    				if( user == 1)
		    					 System.out.println("user win.");
		    				win_cnt++;
		    			 	
		    			}
		    			else {
		    				 System.out.println("com win.");
		    				 lose_cnt++;
		    			}
		    			}
		    		}
		    	}
		    
			
			System.out.print("게임을 계속 하시겠습니까?(y/n)");
			answer = sc. nextLine();
			
			 if(answer.equals("y") || answer.equals("Y")) { 
				 if(answer.equals("n") ||answer.equals("N")) {
					 System.out.println("종료합니다.");
					 break;
				 }
				 else {
					 System.out.println("y or n 중 선택하시오.");
				 }
			 }	 
		  }
	System.out.println(count + "전" + win_cnt + "승" + lose_cnt + "패" + drow_cnt + "무" );

		}

}
	


