package day5;

import java.util.Random;
import java.util.Scanner;

public class ArrayText6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		String who[] = new String[3];
		   who[0] = "ö���� ";
		   who[1] = "���� ";
		   who[2] = "������ ";
		   String where[] = new String[3];
		   where[0] = "������ ";
		   where[1] = "ȭ��ǿ��� ";
		   where[2] = "�������� ";
		   String what[] = new String[3];
		   what[0] = "���θ� �߽��ϴ�.";
		   what[1] = "��ҽ��ϴ�.";
		   what[2] = "����ϴ�.";
		   
		   int index = rd.nextInt(3);
		   
		   System.out.println("����Ű�� ��������");
		   sc.nextLine();
		   System.out.println( who[index] + where[index] +what[index]);
		   
		   

	}

}
