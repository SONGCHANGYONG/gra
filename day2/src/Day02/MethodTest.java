package Day02;

public class MethodTest {

	//함수의 형태
	// 반환자료형 함수이름(){ 기능을 나열한다} void 반환자료
		static void add() {
		int num1 = 5;
 		int num2 = 3;  //add 라는 함수안에 변수 num1, num2가 존재한다.
 		
 		 System.out.println( num1 + num2);
 		 
 		//static int add() { 두수를 더하는 함수
 			//int num1 = 5;
 	 		//int num2 = 3;  //add 라는 함수안에 변수 num1, num2가 존재한다.
 	 		
 	 		 //System.out.println( num1 + num2);
 	 		 
 	 		 //retrun num1;
 	 		 
 	 		 //void 외엔 무조건 return 존재
		}
	
	public static void main(String[] args) {

		add(); // 함수를 호출하다(실행시키다)
		
		
		
		

	}

}
