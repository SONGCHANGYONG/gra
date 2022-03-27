package carc;

public class Hellow_java {
	static String greeting = "안녕 하세요."; // static 선언 후 사용하면 main에서 사용 가능
	                                      // public과 비슷 public은 범위 , static은 단일 선언 (항상 준비 되어있어 바로 선언해 사용가능) static은 고정 되어있다.
	static String name = "Tom";                                     

	public static void main(String[] args) {
		//클래스이름은 대문자, 변수는 소문자, 단어와 단어가 만날떈 구분 해줘야함, 낙타표기법 : 다음단어 대문자, 하이픈 표기법 단어단어 사이에 _
		//실행 명령어엔 public을 붙인다.(누구나 사용 할 수 있다.), private (외부에서 접근 불가능)
		
		//System.out.println(greeting);
		
		//sayHellow( greeting);//static 안에서는 static 이여야한다. 완전한 개인 객체야한다.
		                    //static 누구든 언제든 사용 가능
		
		sayHellow(name, greeting);
		sayHellow("제인", "Hi!" );
		sayHellow("구름", "오랜만이야");
		
		for (int i = 0; i <10 ; i++) {
			p(greeting);
		}
	
	
	}
	//함수를 정의한다.=선언한다.
	public static void sayHellow(String hi){//void 결과 값이 없음 (반환값이 없는 함수)
		System.out.println(hi);      //main에서 호출 되어야(정의하다,선언하다) 사용 가능하다.
	}
	public static void sayHellow(String name, String hi){
		System.out.println(name + "!" + hi);     
	}
	public static void p(String mgs){
		System.out.print(mgs);
	}
		public static void pl(String mgs){
			System.out.println(mgs);     
	}
 }
	
