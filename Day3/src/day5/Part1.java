package day5;

import java.util.Scanner;

public class Part1 {
	

	public static void main(String[] args) {
		//10명 학생 점수의 총점 과 평균(점수는 정수)
		//점수 중 최대값과 최소값 구함(같은 점수는 없음)
		Scanner sc = new Scanner(System.in); 
		int a = 0;
		int sd = 0;
		int total = 0;
		int nn = 0;
		int max = 0;
		int min =100;
	
		
		while(a<10) {
			System.out.println("점수를 입력해주세요." );
			sd = sc.nextInt();
			total = sd + total;
			nn = total/10;
			//스코어 변수 값과 max 변수값을 비교한다.
			//그래서 큰수를 max에 저장
		    if(max < sd ) {
		    	max = sd; 
		    		}else if (min > sd) {
		    			min = sd;
		    		}
			a++;
			
			
		}
		System.out.println("학생들의 총점은 " + total );
		System.out.println("학생들의 평균은 " + nn );
		System.out.println("학생들 중 촤고점수는 " + max );
		System.out.println("학생들 중 촤고점수는 " + min );
		}
	}


