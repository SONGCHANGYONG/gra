package Day6;
//클레스는 멤버변수와 메서드로 구성된다.
//클레스는 자료형이다. (용도)
//*** 배열 :물리적으로 연속된 공간에 동일한 자료현늬 자료들이 모여있는것.

//편의상 클래스 A 생성

class Student {
   int num;
   String name;
   String phone;
   String gender;// "여" "남"
   int grade;
   float socre;
   public String toString() {
	   
	   return num + "/" + name + "/";	   
   }
   
   //멤버 변수만존재 멤버 메서드는 비어있음
   //기본 생산자는 개발자가 생략해도 자동으로 만들어진다.	
}
public class Restudy {

	public static void main(String[] args) {
		//1프로그래밍 제 1순서... 변수선언--> 자료형+변수명 
		Student stu =new Student(); //()비어있으면 기본생성자.
		        //stu 참조변수 new가붙어서 만들어지는 변수 실제 데이터가 없음 주소만들고있다
		
		
		stu.num =1;
		stu.name = "홍길동";
		stu.phone = "010-1111-1111";
		stu.gender = "남";
		stu.grade =3;
		//System.out.println( stu.num + stu.gender);
		System.out.println( stu.toString());

	}

}
