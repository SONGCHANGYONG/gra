package a20220307;

import java.util.Random;
import java.util.Scanner;

public class ArrayTest4 {

	public static void main(String[] args) {
		//배열에 상품 5개가 들어가있다.
		//엔터를 누르면 랜덤 상품이 나온다.
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		String name[] = {"곰인형","노트북","청소기","책상","의자"};
		
		int index = rd.nextInt(5); 
		System.out.println("엔터를 입력해주세요");
		System.out.println("선물이 나옵니다.");
		sc.nextLine();
		System.out.println( name[index] + " 입니다.");
		

	}

}
