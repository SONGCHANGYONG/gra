package a20220304;

import java.util.Random;
import java.util.Scanner;

public class Part1 {
	
	static int blackbox(int aa){
		Random rd = new Random();
		int rd_num = rd.nextInt(10);	
		int c = 0;
		if( rd_num == aa) {
			c = 0;
			}else if ( rd_num > aa) {
				c = 1;
			}else {
			 c = -1;
			}
		return c;
	}

	public static void main(String[] args) {
		//�Լ��̸� blackbox�� ���� �� �߻��� ���� ��ĳ�ʷ� �Է��� �� �� �� �� �������� ��ũ�� 1 ������ -1 ������ 0 blackbox�� ���� 1 Ů�ϴ� 2 �۽��ϴ� 3 �����ϴ�. 
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���.");
		int input = sc.nextInt();
		
		int main_result = blackbox(input);
		if (main_result == 0){
			System.out.println("�� ���� �����ϴ�.");
		}else if (main_result == 1) {
			System.out.println("blackbox ���� �� Ů�ϴ�.");
		}else {
			System.out.println("blackbox ���� �� �۽��ϴ�.");
		}
	
	}

}
