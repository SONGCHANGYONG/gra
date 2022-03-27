package a0318;

public class Array01 {
	

	public static void main(String[] args) {
		int[] [] array = {{10,20,30,40}, {50,60,70,80}, {90,100,110,120}};
		
		for(int i = 0; i<array.length; i++ ) {
			for(int c = 0; c<=array.length; c++ ) {
				System.out.println(i+ "행" + c + "열 " + array[i][c]);
			}
		}
		

	}

}
