package day5;


public class ArrayTest2 {

	public static void main(String[] args) {

		//num이라는 배열 100개의 공간을 만들어준다.
		//배열안에 값 넣어주기 --> num[0] = 1, num[1] = 2, num[2] =3 ..... num[99] = 100
		
		int[] num = new int[151];
		
		System.out.println("배열의 길이는 "+ num.length); 
		
		for (int i = 0 ; i < num.length ; i++) {
			num[i] = i+1;
			System.out.println( i  + "번 index = " + num[i] );
		}
		
			
	}

}

	


