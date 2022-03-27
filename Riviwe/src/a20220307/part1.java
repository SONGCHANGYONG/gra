package a20220307;

import java.util.Scanner;

public class part1 {

	public static void main(String[] args) {
		//입력 받은공 색별로 빨간 노란 파란공이 몇개인지 카운트 해야함 카운트값 노출 어떤공이 제일 많이 들어 왔는지 적게들어 왔는지 표시 많이들어온공 표시
		//10번 입력받은 결과 도출
		Scanner sc =new Scanner(System.in);
	    int count = 0; //입력 횟수 카운트
	    int b_cnt = 0; //파란공 카운트
	    int r_cnt = 0; //빨간공 카운트
	    int y_cnt = 0; //노란공 카운트
	    
	    while(count<10){ //카운트 횟수가 10번될떄 까지 반복
	    	System.out.println("숫자를 입력해 주세요(1 = 빨간공 , 2 = 파란공 , 3 = 노란공)");
	    	int num =0;
	        num = sc.nextInt();
	   	    if (num ==1) {
	 	    	r_cnt++;
	 	    	count++;
		    }else if (num ==2) {
		    	b_cnt++;
		    	count++;
		    }else if (num == 3) {
		    	y_cnt++;
		    	count++;
		    }else {
		    	System.out.println("잘못 입력 됐어요");
		}
	  }
	    System.out.println("총 " + count + "번 입력 했습니다." + "  빨간공 = " + r_cnt + "개" + "  노란공 = " + y_cnt + "개" + "  파란공 = "+ b_cnt + "개" );
	    if (r_cnt > y_cnt && r_cnt > y_cnt ) {
 	    	System.out.println("빨간공이 제일 많습니다.");
	    }else if (r_cnt > y_cnt && r_cnt > y_cnt ) {
	    	System.out.println("파란공이 제일 많습니다."); 	
	    }else  {
	    	System.out.println("노란공이 제일 많습니다.");	
	    }
	    /*최대값 구하는 법 
	     *a=1/ b=2/ c=3 : 1.두 수를 비교한다 a 와 b
	     *          2.큰 수와 나머지 수를 비교한다. b 와 c
	     *          3.큰 수가 최대값이다.  
	     *if(a > b){ 
	     *if(a > c){ a가 제일많다
	     *}else if (b > c){ b가 제일많다
	     *}else{ c가 제일많다           
	     */
	    
  }
}
