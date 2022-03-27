package a20220302;

public class Part3 {
         //함수의 형태
	     //반환자료형 함수이름() {기능나열}
	     //반환자료형을 쓰면 return 필요 ex) void 대신 int 면 인트에 소속되는 100, num1, 200, num2 등과 같이써줘야함 return 200;, return sum
	static int add(int n1, int n2) { //add는 두 수를 더하는 함수 ()안은 입력구 return은 출력구
		int num1 = n1;
		int num3 = n2;
	    int sum = num1 + num3;
	    
	    return sum;	//sum이라는 변수값을 돌려준다(반환한다)
	                //sum이 add메소드 결과물을 가지고있다
	                // return이 쓰이면 =이 꼭 쓰임(아래쪽  int result = add();)
	}
	
	
	
	public static void main(String[] args) {
	 int result = add(10,4);//add()함수를 return변수 안에 담는다.
	  
	 System.out.println(result);
		
		
}
}