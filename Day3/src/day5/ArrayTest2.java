package day5;


public class ArrayTest2 {

	public static void main(String[] args) {

		//num�̶�� �迭 100���� ������ ������ش�.
		//�迭�ȿ� �� �־��ֱ� --> num[0] = 1, num[1] = 2, num[2] =3 ..... num[99] = 100
		
		int[] num = new int[151];
		
		System.out.println("�迭�� ���̴� "+ num.length); 
		
		for (int i = 0 ; i < num.length ; i++) {
			num[i] = i+1;
			System.out.println( i  + "�� index = " + num[i] );
		}
		
			
	}

}

	


