package a20220307;

import java.util.Random;
import java.util.Scanner;

public class ArrayTest5 {
	public static void main(String[] args) {
		//�迭 3�� ¥���� 3�� ����ϴ�.
		//3���� �迭 �� ���� �ִ� �ε����� �������� �ϳ��� ��½�ŵ�ϴ�.
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		String[] name = {"ö����","â���̰�","�����̰�"};
		String[] where = {"������", "ȭ��ǿ���", "��������"};
		String what[] = {"�����̸� �մϴ�.","������ �մϴ�.", "���θ� �մϴ�"};
		
		int a = rd.nextInt(3);
		
		System.out.println(name[a] +" "+ where[a]+ " " + what [a]);
		
		
	}

}
