package a20220304;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		//���ڿ� ,���ڸ� �Է��ϸ� ���ڰ� �Է��Ѽ��ڸ�ŭ ��µ�
		Scanner sc = new Scanner(System.in);
		int a = 0;
		String q = null;
		String b = null;
		

		while(true) {
			System.out.println("�ݺ��� ���ڸ� �Է� �� �ּ���.");
			q = sc.nextLine();
			System.out.println("�ݺ� Ƚ���� �Է� �� �ּ���.");
			a = sc.nextInt();
			
		for (int i = 0 ; i < a ; i++) {
			System.out.print(q);
		}
		     System.out.println();	
		     System.out.println("������ �ٽ� ���� �Ͻðڽ��ϱ�?(y/ n)");
			 
		     sc.nextLine();
		     b =sc.nextLine();
			if(b.equals ("y")) {
				
			}else if (b.equals ("n")){
				break;
			}else {
				System.out.println("y/n�� �Է����ּ���");
			}
			
		
		}
		
	}
}
