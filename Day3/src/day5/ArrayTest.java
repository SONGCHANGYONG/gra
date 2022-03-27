package day5;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		//배열 : 물리적으로 연속된 공간에 동일한 자료들이 나열 되어 있는 것;
		//배열 선언방법 int[] score = {1, 2, 3, 4, 5}; -->int라는 공간에 score 값이 1,2,3,4,5가 나열되어있음
		//          String[] name = {철수, 영희, Ann}; --> String 안에 변수 철수 영희 Ann이 나열되어있음
		//1. 배열 공간을 만든다.(배열선언) 
		//2. 배열 이름을 붙인다.(만들 공간과 연관지어)
		//   int[] socre = {1, 2, 3, 4, 5};
		//   int[] socre = new int[5]; 5개의 정수 값을 담을수있는 스코어 변수를 만들다
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[10];
		num[0] = 23;
		num[1] = 72;
		num[2] = 52;
		num[3] = 25;
		num[4] = 26;
		num[5] = 13;
		num[6] = 74;
		num[7] = 12;
		num[8] = 25;
		num[9] = 20;
		System.out.println("배열의 길이는 "+ num.length); 
		int max = 0;
		int min = 100;
		for (int i = 0; i < 10 ; i++) {
			System.out.println("숫자를 입력해 주세요");
			num [i]=sc.nextInt();
			
			if (max < num[i]) {
				max = num[i];
				}
			else if (min > num[i]) {
				min = num[i];
				}
		}
		System.out.println(max); 
		System.out.println(min);
	}

}
