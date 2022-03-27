package day5;

public class ArrayTest4 {

	public static void main(String[] args) {
		//배열 10개 짜리를 만들어 0번인덱스부터 1,2,3.. 10까지 넣는다.
		//홀수합 프린트 짝수합 프린트
		
		int num[] = new int[10];
		int a =0;
		int b =0;
		int i =0;
		int sum1 = 0;
		int sum2 = 0;
		
		
		for (  i = 0; i < 10; i++) {
			num[i] = i+1;
		
			if ( (i+1)%2 == 0 ) {
				sum1 = sum1+num[i];
					
			}else {
				sum2 = sum2+num[i];	
			}
		}	
		
		System.out.println("배열 짝수의 합 = " + sum1);
		System.out.println("배열 홀수의 합 = " + sum2);

	}

}
