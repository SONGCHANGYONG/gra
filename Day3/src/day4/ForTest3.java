package day4;

import java.util.Scanner;

public class ForTest3 {

	public static void main(String[] args) {
		//���� ���ڰ� 10������ ������
	    //� �Լ��� * , ���� ���ڸ�ŭ ����ִ�
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println ("���ڸ� �Է��� �ּ���") ;
	    String j = sc.nextLine();
		System.out.println ("�ݺ�Ƚ���� �Է��� �ּ���") ;
		int h = sc.nextInt();
		for ( int i = 0  ; i < h ; i++ ) {
			System.out.print( j );
		}
		System.out.println();
		sc.nextLine();
		System.out.println("�ٽ� ���� �Ͻðڽ��ϱ�?(y/n)");
		String a = null;
		a = sc.nextLine();
		if(a.equals ("y") || a.equals("Y")) {
		}else if(a.equals ("n") || a.equals("N")) {
			System.out.println("�����մϴ�..");
			break;
		}else {
			System.out.println("y/n �� �Է� �� �ּ���");
		}
		}
		
	}

}
