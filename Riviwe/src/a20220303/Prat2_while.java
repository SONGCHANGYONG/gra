package a20220303;

import java.util.Scanner;

public class Prat2_while {

	public static void main(String[] args) {
		//comdmf 2�� ������ �������� 0�ϋ� ���ڸ� ���� com 0�̵Ǹ� ����ȴ�.
		Scanner sc = new Scanner(System.in);
		
		int com = sc.nextInt();
		while(com >0) {
			com--;
			if(com % 2 == 0) {
			    System.out.println(com);
			    
			}
			else {
				System.out.println(" ");
				continue; // �ݺ����� continue�� �ݺ����� �ѹ� ������ continue ���� ����� �������� �ʰ� �ٽ� �ݺ����� ����.
				          // 
			}
			System.out.println("�ȳ��ϼ���");
		}


	}

}
