package a20220304;

public class For {

	public static void main(String[] args) {
		//for문을 사용해 구구단을 만들어
		for( int i = 2 ; i < 10 ; i++) {
			System.out.println( i +" 단 ");
			
			for( int q = 1 ; q < 10 ; q++) {
				System.out.println(i + " * " + q + " = " + i*q );
			}
		}
	
		

	}

}
