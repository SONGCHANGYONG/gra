package a20220309;

import java.util.Random;
import java.util.Scanner;

public class ArrayTest04 {

	public static void main(String[] args) {
		//배열에 상품 5개가 들어가있다.
	    //엔터를 누르면 랜덤 상품이 나온다.
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		String[] a = {"곰인형", "우산", "항공권","노트북", "상품권"};
		
		
		while(true) {
	    int b = rd.nextInt(5); //b = 램덤수 0~4를 발생시킨다.
		System.out.println("엔터를 입력하면 상품이 나옵니다.");
		sc.nextLine();
		System.out.println(a[b]);
		}
	}

}
