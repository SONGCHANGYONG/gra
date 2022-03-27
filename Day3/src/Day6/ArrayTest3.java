package Day6;

import java.util.Scanner;

public class ArrayTest3 {

	public static void main(String[] args) {
		// 
		int[] s = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100}; 
		int value, index= -1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("탐색할 값을 입력하세요"); //60
		
		
		
		value = sc.nextInt();

		for (int i =0 ; i< s.length ; i++) {
			if (s[i] == value) {
				index = i;
				System.out.println(value + "값은 " + index + "번 위치에있습니다.");
				break;
			}else {
			}
				
	   }
		if(index == -1) {
			System.out.println(value + " 은 배열값 안에 존재하지 않습니다.");
		}
	}
}
			
	
	
