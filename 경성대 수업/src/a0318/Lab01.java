package a0318;

import java.util.Scanner;

public class Lab01 {
	private String name;
	private String adress;
	private int pay;
	private String phone;
	
	
	Scanner sc = new Scanner(System.in);
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public Lab01() {
		System.out.println("이름을 입력 해 주세요");
		name = sc.nextLine();
		System.out.println("주소를 입력 해 주세요");
		adress =sc.nextLine();
		System.out.println("연봉을 입력 해 주세요");
		pay = sc.nextInt();
		System.out.println("전화번호를 입력 해 주세요");
		phone = sc.nextLine();
	}

		
		
	
	private  void employeeprint() {
		
		System.out.println();
		
	}

}
