package day5;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		//�迭 : ���������� ���ӵ� ������ ������ �ڷ���� ���� �Ǿ� �ִ� ��;
		//�迭 ������ int[] score = {1, 2, 3, 4, 5}; -->int��� ������ score ���� 1,2,3,4,5�� �����Ǿ�����
		//          String[] name = {ö��, ����, Ann}; --> String �ȿ� ���� ö�� ���� Ann�� �����Ǿ�����
		//1. �迭 ������ �����.(�迭����) 
		//2. �迭 �̸��� ���δ�.(���� ������ ��������)
		//   int[] socre = {1, 2, 3, 4, 5};
		//   int[] socre = new int[5]; 5���� ���� ���� �������ִ� ���ھ� ������ �����
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
		System.out.println("�迭�� ���̴� "+ num.length); 
		int max = 0;
		int min = 100;
		for (int i = 0; i < 10 ; i++) {
			System.out.println("���ڸ� �Է��� �ּ���");
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
