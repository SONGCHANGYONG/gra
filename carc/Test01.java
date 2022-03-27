package carc;

import java.util.Scanner;

public class Test01 {
	static int st[];
	static int Ko[];
	static int En[];
	static int ma[];
	static final int MAX = 10;
	static final int MIN = 0;

	public static void main(String[] args) {
		//3명의 국어 성적을 입력 받아 평균과 총합을 구하여라
		
		Scanner sc = new Scanner(System.in);
		
		Ko = new int[3];
		st = new int[3];
		float sum = 0;
	    float div = 0;
		
		for (int i = 0; i<Ko.length; i++) {
			System.out.println("학생" + i+1 + "의 국어성적을 입력해 주세요.");
			Ko[i] = sc.nextInt();
			st[i] = Ko[i];
			sum =  sum + Ko[i];
		}
		div = sum/Ko.length;
		
		System.out.println("국어 성적의 총점 = " + sum );
		System.out.println("국어 성적의 평균 = " + div );	
		
		}
}


