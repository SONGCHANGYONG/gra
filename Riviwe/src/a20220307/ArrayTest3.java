package a20220307;

public class ArrayTest3 {

	public static void main(String[] args) {
		//�迭 10�� ¥���� ����� 0���ε������� 1,2,3.. 10���� �ִ´�.
		//Ȧ���� ����Ʈ ¦���� ����Ʈ
		
		int num[] = new int[10];
		int sum1=0;
		int sum2=0;
		for (int i = 0 ; i < 10 ; i++) {
			num[i] = i+1;
			if(num[i]%2 == 0) {
				sum1 = sum1+num[i];
			}else {
				sum2 = sum2+num[i];
			}
		}
		System.out.println("¦���� �� = " + sum1);
		System.out.println("Ȧ���� �� = " + sum2);
		

	}

}
