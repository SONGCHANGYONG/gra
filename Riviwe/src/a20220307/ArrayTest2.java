package a20220307;

public class ArrayTest2 {

	public static void main(String[] args) {
		//num�̶�� �迭 100���� ������ ������ش�.
	    //�迭�ȿ� �� �־��ֱ� --> num[0] = 1, num[1] = 2, num[2] =3 ..... num[99] = 100
		
		int num[] = new int[100];
		
		for ( int i = 0 ; i <100 ; i++) {
			num[i]=i+1;
			System.out.println("num[" + i + "]" + "= " + num[i] );
		}

	}

}
