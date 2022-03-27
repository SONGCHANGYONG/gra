package day5;


public class ReStudy {

	
	public static void main(String[] args) {
		//1.변수 선언 
		//자료형 + 변수이름(가급적 의미있는 단어로)
		/* : 클론
		// ; 세미클론
		// 블록,블레이스 {   } 영역표시
		// 브라킷 [  ]
		범위 주석 */
		
		int score; //정수형 변수
		boolean tf = 10 <8; //참, 거짓을 나타내는 연산자
		double xx = 10.2; //실수 연산자 float 보다 정확도가 높다
	    char xxx = 'a'; //문자하나 입력 ''사용 해 줘야함 문자
	    
		
		//2. 대입연산자
		
		score = 10;
		
		//3. 출력문
		System.out.println("score = " + score++);
		System.out.println("score = " + score); // 첫번째에 score 증가연산자가 사용되어서 두번째 값 부턴 score +1 값이 출력된다
	
		System.out.println("score = " + score); //ctrl+spacebar. 시스템안 아웃이라는 곳에 프린트한다. 
		
		//4.if문
		int c = 7; 
		if( c%2 == 0 ) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다");
		}
	    //5.else if
	    int num =1;
	    if (num ==1) {System.out.println("가위"); //만약에 num이 1이면 가위
	    }else if (num ==2) {System.out.println("바위"); //만약에 num이 2이면 바위
	    }else if (num == 3) {System.out.println("보"); //만약에 num이 3이면 보
	    }else {System.out.println("잘못 입력 됐어요"); //모두 아니면 잘못 입력 됐어요
	    }
	     //6.switch case문
	    int num1 = 1;   
	    switch (num1){ //조건식안 함수가 해당하는 케이스와 맞으면 그 케이스를 실행시킨다.
	    	   case 1 : System.out.println("가위"); //num1이 case 1에 해당 case 1 값을 출력한다. break; 를 써줘야 맞는 조건 실행 후 아래 케이스문을 실행 시키지 않는다.
	    	   break;
	    	   case 2 : System.out.println("바위");
	    	   break;
	    	   case 3 : System.out.println("보");
	    	   break;
	    	   default : System.out.println("잘못 입력 하셨습니다.");
	       }
	    //switch case문 탄생석 나타내기
	    int num2 = 9;
	    
	    switch (num2) {
	    case 1 : System.out.println(num2 + "의 탄생석 = " + "석류석");
 	       break;
	    case 2: System.out.println(num2 + "의 탄생석 = " + "자수정");
 	       break;
	    case 3: System.out.println(num2 + "의 탄생석 = " + "남옥");
 	       break;
	    case 4: System.out.println(num2 + "의 탄생석 = " + "금강석");
 	       break;
	    case 5: System.out.println(num2 + "의 탄생석 = " + "취옥");
 	       break;
	    case 6: System.out.println(num2 + "의 탄생석 = " + "진주");
 	       break;
	    case 7: System.out.println(num2 + "의 탄생석 = " + "홍옥");
 	       break;
	    case 8: System.out.println(num2 + "의 탄생석 = " + "감람석");
 	       break;
	    case 9: System.out.println(num2 + "의 탄생석 = " + "청옥");
 	       break;
	    case 10: System.out.println(num2 + "의 탄생석 = " + "단백석");
 	       break;
	    case 11: System.out.println(num2 + "의 탄생석 = " + "황옥");
 	       break;
	    case 12: System.out.println(num2 + "의 탄생석 = " + "터키석");
 	       break;
 	    default : System.out.println("1 ~ 12 중에 입력해 주세요");
        }
	    
	    //6.while문
	    //System.out.println("hello~~");를 반복 하고싶은 10번 경우 
	    int n = 0;
	    while (n < 10) {  //while 조건 n이 10보다 작으면 이라는 조건이 충족 될떼까지 반복한다. 
	    	System.out.println("hello~~");
	    	n++; //n은 1씩증가한다.
	    }
	    //7.for문
	    for (int m = 0 ; m <10 ; m++) { //반복문 시작의 조건값을 써준다.; 반복실행 조건 입력한다.; 변수값을 준다
	    	System.out.println("hello~~"); // 두번째 조건이 충족되면 false일때 까지 반복한다.
	    }
	    
	}
}

