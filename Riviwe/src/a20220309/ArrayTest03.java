package a20220309;

public class ArrayTest03 {
	
	public static void main(String[] args) {
		//�迭 10�� ¥���� ����� 0���ε������� 1,2,3.. 10���� �ִ´�.
		//Ȧ�� �� ����Ʈ ¦�� �� ����Ʈ
		
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
		System.out.println("¦���� ����" + sum);
		System.out.println("Ȧ���� ����" +min);
	
}
}
