package a20220310;

import java.util.Scanner;

public class carc {
	
	static void p(String hi) {
		System.out.println("hi");
	}
	
	static String r = "�ȳ��ϼ���";{
		r="�ȳ��ϼ���";
	}

	public static void main(String[] args) {
		// ��Ģ������ ������ ���⸦ ������
		Scanner sc= new Scanner(System.in);
		p(r);
		
		System.out.println("������ �ϳ� �Է� �� �ּ���");
		int a = sc.nextInt();
		System.out.println("��Ģ���� ��ȣ�� �Է� �� �ּ���");
		String c = sc.next();
		System.out.println("������ �ϳ� �Է� �� �ּ���");
		int b = sc.nextInt();
		int q = 0;
		
		if( c.equals("+")) {
			q = a+b;
			System.out.println(a + c + b + "=" + q);
			}else if( c.equals("-")) {
				q = a-b;
				System.out.println(a + c + b + "=" + q);
			}else if( c.equals("*")) {
				q = a*b;
				System.out.println(a + c + b + "=" + q);
			}else if( c.equals("/")) {
				q = a/b;
				System.out.println(a + c + b + "=" + q);
			}

	}

}
