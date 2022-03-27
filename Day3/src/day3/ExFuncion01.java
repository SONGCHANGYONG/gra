package day3;

public class ExFuncion01 { //day3페키지안에 있는 class ExFucion01
	
	static int f1() {    //메인 (실행메소드)에서 쓸수있게 함수앞에 static을 붙여준다
	
		return  10;      //f1에 10값을 돌려준다	
	}
	
	static int f2() {    
		
		return 50 + f1(); //f2에 50+f1값을 돌려준다.
	}
	
	static int f3() { 
		
		return 100 + f2();//f3에 100+f2 값을 값으로 돌려준다
	}
	
	static void f4() {
		System.out.println("나는 f4");
	}
	

	public static void main(String[] args) {
	
		int result = f3();  //메인 메소드 에 result라는 정수담는통을 만들어 f3값을 저장한다.
		                    //result에 변수선언을 헤 줘야함 그래서 int(정수형 변수)를 줌
		
		System.out.println(result);
		
		f4();  //실행코드
	}

}
/*1클레스란 무엇인가?
 * -속성과 기능으로 구성되어있따.
 * -속성은 멤버변수라 했고, (
 * -기능은 멤버 메서드라 했다. (public class ExFuncion01의public static void main(String[] args) 맴버메소드, 하지만 메인메소드)
 * 2.메서드란 무엇인가?
 * -반환자료형 + 메서드이름 + () + {}
 * -main메서드가 f3메서드를 호출한다는 것을 코드로 표현할 수 있나?
 * -f4값을 실행시킨다.
 */
