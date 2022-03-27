package employee;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee[] employeeList = new Employee[3];

		// Employee에 정보를 입력하기 위해 초기화
		for (var i = 0; i < employeeList.length; i++) {// for (var employee : employeeList) {
			employeeList[i] = new Employee();
		}
		// 직원입력 분리해나감.
		initEmployee();

		// 화면출력이 분리해 나감.
		printEmployeeListInfo(employeeList);
	}

	// p함수 추가
	public static void p(String msg) {
		System.out.print(msg);
	}

	// 전체 직원의 정보출력
	public static void printEmployeeListInfo(Employee[] employeeList) {
		// 직원전체를 나타내기위해 직원수만큼 반복
		for (int i = 0; i < employeeList.length; i++) {
			printEmployeeInfo(employeeList[i]);
		}
	}

	// 직원 한 사람의 정보출력
	public static void printEmployeeInfo(Employee employee) {
		p("\n");
		p("이름 : " + employee.getName() + "\n");
		p("주소 : " + employee.getAddress() + "\n");
		p("연봉 : " + employee.getSalary() + "\n");
		p("전화번호 : " + employee.getPhone() + "\n");
		p("#########################################");

	}

	public static Employee inputEmployeeInfo() {

		Employee employee = new Employee();
		Scanner sc = new Scanner(System.in); // Employee정보 입력을 위한

		p("이름을 입력해 주세요");
		String name = sc.nextLine();
		employee.setName(name); // == employeeList[i].setName(sc.nextLine());
		p("주소를 입력해 주세요.");
		String address = sc.nextLine();
		employee.setAddress(address);
		p("연봉를 입력해 주세요.");
		int salary = sc.nextInt();
		employee.setSalary(salary);
		p("전화번호를 입력해 주세요.");
		String phone = sc.nextLine();
		employee.setPhone(sc.nextLine());

		return employee;
	}

	public static Employee[] initEmployee() {
		Employee[] employeeList = new Employee[3];
		for (var i = 0; i < employeeList.length; i++) {
			employeeList[1] = inputEmployeeInfo();
		}
		return employeeList;
	}

}
