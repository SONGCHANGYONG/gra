package day3;

import java.util.Scanner;

public class RepeatTest {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int i= 0;
		int chk = 0;
		//���ǽ�()���� ���ε��� ��Ͼ��� ��ɹ��� �ݺ� �����Ѵ�.
		while( true ) {
			System.out.println("���ڸ� �Է����ּ���: ");
            chk = sc.nextInt();
            System.out.print(chk);
               
            if(chk ==9 ) {
            	break;
            }
            else {}
            
            System.out.print("�ٸ����� �Է��ϼ���. ");
			i = i + 1; //�ڱ���� �������� ��� ������ ���������� =i++;
			
			
		}

	}
}


