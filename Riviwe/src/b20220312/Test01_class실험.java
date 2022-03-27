package b20220312;

import java.util.Scanner;

public class Test01_class실험 {
	public String c; //클레스명
	public int[] a; // 국어성적
	public int b; //학생수

 
	//성적을 입력받을 함수를 만든다.
	public int[] A(){
		Scanner sc = new Scanner(System.in);
		a = new int[b]; 
		System.out.println(this.c + "의 국어성적 입력 해 주세요."+"😊😊"); 
		for(int i = 0; i< a.length ; i++) {
			System.out.println((i+1) +"번 학생의 성적을 입력해 주세요");
			int c = sc.nextInt();
			a[i] = c;
		}	
		return a;
	}
	
	public Test01_class실험(String c, int b) {
		this.c = c;
		this.b = b; 
	}

	public static void main(String[] args) {
		//두반의 학생들의 점수를 입력한다.
		//두반의 총점과 평균을 구한다.
		//총점과 평균을 구하는 함수를 외부 class에서 불러온다.
		
		Test01_class실험 자바반 = new Test01_class실험("자바반", 2);
		
		자바반.A();
		

	}

}
