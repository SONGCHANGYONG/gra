package a20220307;

import java.util.Random;
import java.util.Scanner;

public class ArrayTest4 {

	public static void main(String[] args) {
		//�迭�� ��ǰ 5���� ���ִ�.
		//���͸� ������ ���� ��ǰ�� ���´�.
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		String name[] = {"������","��Ʈ��","û�ұ�","å��","����"};
		
		int index = rd.nextInt(5); 
		System.out.println("���͸� �Է����ּ���");
		System.out.println("������ ���ɴϴ�.");
		sc.nextLine();
		System.out.println( name[index] + " �Դϴ�.");
		

	}

}
