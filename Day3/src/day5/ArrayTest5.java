package day5;

import java.util.Random;
import java.util.Scanner;

public class ArrayTest5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		//�迭�� ��ǰ 5���� ���ִ�.
		//���͸� ������ ���� ��ǰ�� ���´�.
		
		String dum[] = new String[5];
		   dum[0] = "�縻";
		   dum[1] = "����";
		   dum[2] = "Ŀ��";
		   dum[3] = "��Ʈ��";
		   dum[4] = "����ũž";
	
		   int index = rd.nextInt(5);
		   System.out.println("���͸� �����ּ��� ��ǰ�� ���ɴϴ�.");
		   sc.nextLine();
		   System.out.println(dum[index]);
		   
	}

}
//���ڿ��� ���� �� �ִ� �迭 3�� �迭�� �̸��� 1.who ö����, ����, ������2.where ������, �п�����, ȭ��ǿ��� 2.what ���θ� �ߴ�, ������ ���Ҵ�, �������