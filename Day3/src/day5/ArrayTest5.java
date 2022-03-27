package day5;

import java.util.Random;
import java.util.Scanner;

public class ArrayTest5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		//배열에 상품 5개가 들어가있다.
		//엔터를 누르면 랜덤 상품이 나온다.
		
		String dum[] = new String[5];
		   dum[0] = "양말";
		   dum[1] = "케익";
		   dum[2] = "커피";
		   dum[3] = "노트북";
		   dum[4] = "데스크탑";
	
		   int index = rd.nextInt(5);
		   System.out.println("엔터를 눌러주세요 상품이 나옵니다.");
		   sc.nextLine();
		   System.out.println(dum[index]);
		   
	}

}
//문자열을 담을 수 있는 배열 3개 배열의 이름은 1.who 철수가, 영희가, 만수가2.where 집에서, 학원에서, 화장실에서 2.what 공부를 했다, 볼일을 보았다, 잠을잤다