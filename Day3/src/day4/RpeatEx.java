package day4;

import java.util.Scanner;

public class RpeatEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		while(num > 0) {
			num--; //�ϳ��� ����
			if(num % 2 == 0) { // % ������ �Լ�
				 System.out.println(num);
			}
			else {
				continue; // �ݺ����� continue�� �ݺ����� �ѹ� ������ continue ���� ����� �������� �ʰ� �ٽ� �ݺ��� ����.
			}
			System.out.println("�߰� ��ɹ����� �� �� �־��..."); 
		}

	}

}
