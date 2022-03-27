package a20220309;

import java.util.Arrays;

public class ArrayTest02 {
	
	public static void main(String[] args) {
		//100개 짜리 배열을 만든다.
		//배열 안에 숫자를 넣어준다 index[0] =1 , index[1]=2 ..... index[99]=100
		//배열내 최소값과 쵀대값을 구한다.
		
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
