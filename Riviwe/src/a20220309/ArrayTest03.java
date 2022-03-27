package a20220309;

public class ArrayTest03 {
	
	public static void main(String[] args) {
		//배열 10개 짜리를 만들어 0번인덱스부터 1,2,3.. 10까지 넣는다.
		//홀수 합 프린트 짝수 합 프린트
		
		int a[] = new int[10];
		int sum = 0;
		int min = 0;
		for ( int o = 0 ; o <a.length; o++) {
			a[o] = o+1;
		}
		for ( int b = 0 ; b <a.length; b++) {
		if (a[b]%2 == 0) {
			sum = sum + a[b];
		}else {
			min = min+ a[b];
		}
		}
		System.out.println("짝수의 합은" + sum);
		System.out.println("홀수의 합은" +min);
	
}
}
