package a20220307;

import java.util.Scanner;

public class ArrayTest1 {

	public static void main(String[] args) {
		//�迭���� 10���� ������ ����� 10���� ���� �Է��Ѵ�.
		//10���� ���� �ִ밪�� �ּҰ��� ��� ��Ų��.
		//10���� ���԰� ����� ����.
		Scanner sc =new Scanner(System.in);
		
		int num[] = new int[10];
		int i = 0;
		int max = 0;
		int min = 100;
		int sum = 0;
		int nn = 0;
		for( i = 0 ; i < 10 ; i++) {
			System.out.println("���ڸ� �Է��� �ּ���.");
			nn= sum/num.length;
			num[i]=sc.nextInt();
		
		if(max < num[i]) {
			max= num[i];
		}else if(min > num[i]) {
		    min= num[i];
		    
		} sum=sum + num[i]; 
		}

		System.out.println("�ִ밪�� " + max);
		System.out.println("�ּҰ��� " + min);
		System.out.println("���� ������ "+sum);
		System.out.println("���� ����� "+ nn);
	}

}
