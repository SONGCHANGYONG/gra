package Day6;

import java.util.Scanner;

public class ArrayTest3 {

	public static void main(String[] args) {
		// 
		int[] s = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100}; 
		int value, index= -1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ž���� ���� �Է��ϼ���"); //60
		
		
		
		value = sc.nextInt();

		for (int i =0 ; i< s.length ; i++) {
			if (s[i] == value) {
				index = i;
				System.out.println(value + "���� " + index + "�� ��ġ���ֽ��ϴ�.");
				break;
			}else {
			}
				
	   }
		if(index == -1) {
			System.out.println(value + " �� �迭�� �ȿ� �������� �ʽ��ϴ�.");
		}
	}
}
			
	
	
