package a20220309;

import java.util.Arrays;

public class ArrayTest06 {

	public static void main(String[] args) {
		// ������ ������ ���� 10�� �ߺ��� ����
		// ������ �� �ִ밪, �ּҰ� �� ����� ���Ѵ�.
		// ������ �������� ������������ ���� ��Ų��.
		
		int[] a = {10,5,7,49,71,99,42,24,88,72};
		int sum =0;
		int max =0;
		int min =1000;
		int temp =0 ;
		for (int i = 0; i < a.length ; i++) {
			sum = sum+a[i];
			if(a[i] > max) {
				max=a[i];
			}else if(a[i] <min){
				min=a[i];
			}
			for(int b=0; b<a.length-1 ; b++) {
				for(int c= b+1; c<a.length ; c++) {
					if (a[b] > a[c]) {
						temp = a[b];
						a[b] = a[c];
						a[c] = temp;
					}
				}
			}
				}
			
		
		
		System.out.println("������ ������ =" +sum);
		System.out.println("������ ����� =" +sum/a.length);
		System.out.println("������ �ִ밪�� =" +max);
		System.out.println("������ �ּҰ��� =" +min);
		System.out.println(Arrays.toString(a));
	}

}
