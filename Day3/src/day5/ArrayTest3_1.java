package day5;

public class ArrayTest3_1 {

	public static void main(String[] args) {
		//�迭 10�� ¥���� ����� 0���ε������� 1,2,3.. 10���� �ִ´�.
		//Ȧ���� ����Ʈ ¦���� ����Ʈ
		
		int num[] = new int[10];
		int a =0;
		int b =0;
		int i =0;
		int sum1 = 0;
		int sum2 = 0;
		
		
		for (  i = 0; i < 10; i++) {
			num[i] = i+1;
		}
		for (  i = 0; i < 10; i++) {
			if ( num[i]%2 == 0 ) {
				sum1 = sum1+num[i];
					
			}else {
				sum2 = sum2+num[i];	
			}
		}	
		
		System.out.println("�迭 ¦���� �� = " + sum1);
		System.out.println("�迭 Ȧ���� �� = " + sum2);

	}

}