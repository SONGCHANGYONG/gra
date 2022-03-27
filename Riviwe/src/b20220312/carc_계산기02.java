package b20220312;

import java.util.Scanner;

import a20220310.carc;

public class carc_계산기02 {
	
	
	public int a = 0; //public class carc_계산기02안에서 누구나 쓸수있는 변수선언
	public int b = 0;
	public String c = null;
	
	
	
	public double d() { // double d return d의 값을 받는다 --> double d = return d 
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력 해 주세요");
		a = sc.nextInt();
		System.out.println("숫자를 입력 해 주세요");
		b = sc.nextInt();
		System.out.println("연산기호 입력 해 주세요");
		c = sc.next(); 
		int d = 0; //public class carc_계산기02 안 public double d() { } 에서만 의미를 가지는 지역변수 
                   //그러므로 double d()가 존재해도 d를 중복해 사용 할수있다. double d와 int d는 다른값을 가지는 다른변수
       if(c.equals("+")) { 
    	   d = a+b;
    	   System.out.println(d);
       }else if(c.equals("-")) {
    	   d = a-b;
    	   System.out.println(d);
       }else if(c.equals("/")) {
    	   d = a-b;
    	   System.out.println(d);
       }else if(c.equals("*")) {
    	   d = a-b;
    	   System.out.println(d);
       }
		
		return  d;
	}
	
	public carc_계산기02() {
		
	}

	public static void main(String[] args) {
		// 계산 함수들을 메인에서 뺀 후 메인으로 불러오는 계산기를 만든다.
		
		
		carc_계산기02 계산기 = new carc_계산기02(); 
		계산기.d();
		System.out.println();

	}

}
