package a20220309;

import java.util.Random;
import java.util.Scanner;

public class ArrayTest04 {

	public static void main(String[] args) {
		//�迭�� ��ǰ 5���� ���ִ�.
	    //���͸� ������ ���� ��ǰ�� ���´�.
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		String[] a = {"������", "���", "�װ���","��Ʈ��", "��ǰ��"};
		
		
		while(true) {
	    int b = rd.nextInt(5); //b = ������ 0~4�� �߻���Ų��.
		System.out.println("���͸� �Է��ϸ� ��ǰ�� ���ɴϴ�.");
		sc.nextLine();
		System.out.println(a[b]);
		}
	}

}
