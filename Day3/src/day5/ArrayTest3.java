package day5;

import java.util.Scanner;

public class ArrayTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[10];
		int max = 0;
		int min = 100;
		for (int a = 0; a<10 ; a++) {
			System.out.println("���ڸ� �Է��ϼ���");
			num[a] = sc.nextInt();
			
			if(num[a]>max) {
				max=num[a];
			}
			if(num[a]<min) {
				min = num[a];
			}
		}
		System.out.println("���� ū �� = "+ max);
		System.out.println("���� ���� �� = "+ min);
	}

}
