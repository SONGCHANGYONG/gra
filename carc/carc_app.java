package carc;

import java.util.Scanner;

public class carc_app {

	public static void main(String[] args) { // main �Լ� �ڹ� ���� �켱���� 1�� ������� ������ �Ʒ� (������ ���α׷���,������ ���α׷���)
		                                     // �ݹ� : ���� ���� �θ��� ���� �Լ� ex)void main ��: ���� �θ� �Լ� ex)op.equals("-"), x = sc.nextInt();
		//���� ���鶧 �ʿ��Ѱ�--> ����� ���ڸ� ���� ����, �����ڸ� ���� ����, ��� ���� ���� ������ �ʿ�
		Scanner sc = new Scanner(System.in); //(System.in)Ű���带 ����ؼ� ��ڴ�.
		
		int x; // �� �������� ����
		int y; // �ϳ��� ������ ���� ���� 
		int c; // �μ��� ���� ������� ����
		String op = ""; // �����  �����ڸ� ���� ����
		
		System.out.println("ù��° ���ڰ��� �Է� : ");// ;��� �� �� ������ ������ ��� ��
		x = sc.nextInt(); // ������ �Է��Ҷ�
		System.out.println("�ι�° ���ڰ��� �Է� : ");
		y = sc.nextInt();// ������ �Է��Ҷ�
		System.out.println("��Ģ���� ��ȣ �Է�(+ , - , * , /) : ");
		op= sc.next(); //Ű �ϳ� �Է��Ҷ�
		
		//�Է��� ���� ����ηο� �°� ��Ģ���� ����
		if (op.equals("+")) { // ���� �񱳴� ==, ���ں񱳴� .equals("")�� ���
			c=x+y;
			System.out.println( x + "+" + y + "= " + c);
		}else if(op.equals("-")) {
			c= x-y;
			System.out.println( x + "-" + y + "= " + c);
		}else if(op.equals("*")) {
			c=x*y;
			System.out.println( x + "*" + y + "= " + c);
		}else if(op.equals("/")) {
			c=x/y;
			System.out.println( x + "/" + y + "= " + c);
		}else{
			System.out.println("�˸��� �����ڸ� �Է� �� �ּ��� (+, -, *, /)");
	    }
		

	}

}
