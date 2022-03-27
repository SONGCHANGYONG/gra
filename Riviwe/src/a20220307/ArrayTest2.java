package a20220307;

public class ArrayTest2 {

	public static void main(String[] args) {
		//num이라는 배열 100개의 공간을 만들어준다.
	    //배열안에 값 넣어주기 --> num[0] = 1, num[1] = 2, num[2] =3 ..... num[99] = 100
		
		int num[] = new int[100];
		
		for ( int i = 0 ; i <100 ; i++) {
			num[i]=i+1;
			System.out.println("num[" + i + "]" + "= " + num[i] );
		}

	}

}
