package a0317;

import java.util.Scanner;

public class NameCardExam {
	//명함관리 프로그램 만들기
	//기능은 키보드로 입력받음
	//메뉴화면, 명함추가create, 명함삭제delete, 명함수정edit, 명함검색search, 명함내용출력 
	Scanner sc = new Scanner(System.in);
	
	String[] name = new String[20];
	String[] office = new String[20];
	String[] Email = new String[20];
	int[] phone = new int[20];
	int[] officePhone = new int[20];
	String[] job = new String[20];
	
	public void menu() {
		
	}
	
	public void create() {
		System.out.println("이름을 입력해 주세요.");
		sc.next();
		System.out.println("회사명을 입력해 주세요.");
		sc.next();
		System.out.println("E-mail을 입력해 주세요.");
		sc.next();
		System.out.println("전화번호를 입력해 주세요.");
		sc.nextInt();
		System.out.println("회사 전화번호를 입력해 주세요");
		sc.nextInt();
		System.out.println("직업을 입력해 주세요.");
		sc.next();
	}
	
	public void create(String[] name, String office[], String Email[], int phone[], int officePhone[], String job[]) {
		this.name = name;
		this.office = office;
		this.Email =Email;
		this.phone = phone;
		this.officePhone = officePhone;
		this.job = job;
	}
	
	public void delete() {
		
	}
	
	public void edit() {
		
	}
	
	public void search() {
		int a = sc.nextInt();
	}
	
	public void print() {
		System.out.println("이름 :" + name + "회사명 :" + office + "E-mail :" +Email);
	}


}
