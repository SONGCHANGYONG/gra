package a0318;

import java.util.Scanner;

public class Array02 {
	String name;
	int a;
	int b;
	int c;
	int sum;
	Scanner sc = new Scanner(System.in);
	
	public Array02() {
		System.out.println("이름을 입력해 주세요.");
		this.name = sc.nextLine();
		System.out.println("국어성적을 입력해 주세요.");
		a = sc.nextInt();
		System.out.println("수학성적을 입력해 주세요.");
		b = sc.nextInt();
		System.out.println("영어성적을 입력해 주세요.");
		c = sc.nextInt();
	}
	public String toString() {
		return "이름 : " + name + "국어성적 : " + a + "수학성적 : " + b + "영어성적 : " + c;
	}

	public static void main(String[] args) {
		
		Array02[] student = new Array02[3];
		
		for(int i =0; i<student.length; i++) {
			student[i] = new Array02();
		}
		for(int i = 0; i<student.length; i++) {
			System.out.println(student[i]);
		}
		


	}

}
