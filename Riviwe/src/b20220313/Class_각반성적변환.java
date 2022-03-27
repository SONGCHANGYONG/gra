package b20220313;

import java.util.Scanner;

public class Class_각반성적변환 {
	String a;//반이름
	int[] b; //성적
	int c; //총합
	int d; //평균
	
	public int[] a() {
		Scanner sc = new Scanner(System.in);
		System.out.println(a + " 학생수를 입력해 주세요");
		int c= sc.nextInt();
		
		int a; 
		b = new int[c];
		for (int i=0 ; i <b.length ; i++ ) {
		 	System.out.println((i+1) + "번 학생의 성적을 입력해 주세요.");
			a = sc.nextInt(); 
			b[i] = a;
		}
		return b;
	}
	
	public int c() {
		c = 0;
		for ( int i = 0 ; i < b.length ; i++) {
		     c = c + b[i];
		}
		System.out.println(a + " 반의 총점은 " + c + "입니다." );
		return c;
	}
	
	public int d() {
		d = c/b.length;
		System.out.println(a+ " 반의 평균은 " + d +"입니다.");
		return d;
	}
	
	public void e() {
		int a = 0;
		int c = 1000;
		for (int i = 0; i < b.length; i++ ) {
			if (a < b[i]) {
				a = b[i];
		}
			for (int e = 0; e < b.length; e++ ) {
				if (c > b[e]) {
					c = b[e];
				}
			}
		}
		System.out.println(this.a + "반의 최고점은 " + a + "입니다." + "\n 최저점은 " + c + "입니다.");
		
	}
	
	

	public static void main(String[] args) {
		// 1반, 2반의 학생들 성적과 총합, 평균을 구하여라
		 Class_각반성적변환 자바반 = new  Class_각반성적변환();
		 자바반.a = "자바반";
		 자바반.a();
		 자바반.c();
		 자바반.d();
		 자바반.e();

	}

}
