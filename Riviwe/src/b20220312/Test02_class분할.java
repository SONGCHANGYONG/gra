package b20220312;

import java.util.Scanner;

public class Test02_class분할 {
	public String a; //반이름
	public int[] b; //성적
	public int c; // 학생수
	public int sum; //총합
	public int div; //평균
	
	public int[] A() { //성적입력
		Scanner sc = new Scanner(System.in);
		b =new int[c];
		System.out.println(a + "의 학생 성적을 입력해 주세요.");
		
		for(int i = 0; i < b.length; i++ ) {
			System.out.println((i+1) + "번 학생의 성적을 입력해 주세요.");
			int c = sc.nextInt();
			b[i] = c;
		}
		return b;  
	}
	
	
	public void B() {
		int sum =0;
		for(int i = 0; i<b.length; ) {
			sum = sum + this.b[i];
		}
		System.out.println("자바반의 총합은" + sum);
		
	}
	
	public int C() {
		div = sum/c;
		return div;
		
	}
	
	public Test02_class분할 (String a , int c) {  
		this.a = a;
		this.c = c;
		this.sum = sum;
	}

	public static void main(String[] args) {
		// 해반 3명, 달반 4명의 개인성적을 입력받는다.
		// 두개의 반 성적의 총합, 평균, 최고점을 출력한다. 
		
		Test02_class분할 자바반 = new Test02_class분할("자바반",3);
		
		자바반.A();
		자바반.B();
		
		

	}

}
