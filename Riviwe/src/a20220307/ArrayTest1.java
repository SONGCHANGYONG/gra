package a20220307;

import java.util.Scanner;

public class ArrayTest1 {

	public static void main(String[] args) {
		//배열문에 10개의 공간을 만들고 10개의 수를 입력한다.
		//10개의 수중 최대값과 최소값을 출력 시킨다.
		//10개의 총함과 평균을 낸다.
		Scanner sc =new Scanner(System.in);
		
		int num[] = new int[10];
		int i = 0;
		int max = 0;
		int min = 100;
		int sum = 0;
		int nn = 0;
		for( i = 0 ; i < 10 ; i++) {
			System.out.println("숫자를 입력해 주세요.");
			nn= sum/num.length;
			num[i]=sc.nextInt();
		
		if(max < num[i]) {
			max= num[i];
		}else if(min > num[i]) {
		    min= num[i];
		    
		} sum=sum + num[i]; 
		}

		System.out.println("최대값은 " + max);
		System.out.println("최소값은 " + min);
		System.out.println("수의 총합은 "+sum);
		System.out.println("수의 평균은 "+ nn);
	}

}
