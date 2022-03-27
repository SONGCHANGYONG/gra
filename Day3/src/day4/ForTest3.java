package day4;

import java.util.Scanner;

public class ForTest3 {

	public static void main(String[] args) {
		//넣은 문자가 10개찍혀 나오게
	    //어떤 함수에 * , 넣은 숫자만큼 찍어주는
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println ("문자를 입력해 주세요") ;
	    String j = sc.nextLine();
		System.out.println ("반복횟수를 입력해 주세요") ;
		int h = sc.nextInt();
		for ( int i = 0  ; i < h ; i++ ) {
			System.out.print( j );
		}
		System.out.println();
		sc.nextLine();
		System.out.println("다시 진행 하시겠습니까?(y/n)");
		String a = null;
		a = sc.nextLine();
		if(a.equals ("y") || a.equals("Y")) {
		}else if(a.equals ("n") || a.equals("N")) {
			System.out.println("종료합니다..");
			break;
		}else {
			System.out.println("y/n 을 입력 해 주세요");
		}
		}
		
	}

}
