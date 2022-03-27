package a20220309;

import java.util.Arrays;

public class ArrayTest06 {

	public static void main(String[] args) {
		// 변수에 임의의 숫자 10개 중복은 없음
		// 변수들 중 최대값, 최소값 합 평균을 구한다.
		// 변수를 오름차순 내림차순으로 정렬 시킨다.
		
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
			
		
		
		System.out.println("변수의 총합은 =" +sum);
		System.out.println("변수의 평균은 =" +sum/a.length);
		System.out.println("변수의 최대값은 =" +max);
		System.out.println("변수의 최소값은 =" +min);
		System.out.println(Arrays.toString(a));
	}

}
