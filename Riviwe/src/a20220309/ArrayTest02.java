package a20220309;

import java.util.Arrays;

public class ArrayTest02 {
	
	public static void main(String[] args) {
		//100�� ¥�� �迭�� �����.
		//�迭 �ȿ� ���ڸ� �־��ش� index[0] =1 , index[1]=2 ..... index[99]=100
		//�迭�� �ּҰ��� ���밪�� ���Ѵ�.
		
		int[] a = new int[100];
		int max = 0;
		int min = 10000;
		for (int i = 0; i < a.length ; i++) {
			a[i] = i+1;
			if (a[i] > max) {
				max= a[i];
			}
			if (a[i] < min) {
				min= a[i];
			}
		}
		
		
		System.out.print(Arrays.toString(a));
		System.out.println("\n"+max);
		System.out.println("\n"+min);
	}

}
