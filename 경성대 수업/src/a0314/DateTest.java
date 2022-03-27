package a0314;

import java.text.MessageFormat;

public class DateTest {

	public static void main(String[] args) {
		//Date하는 객체를 생성합니다.
		//var 여기에 데이터형이 온다.
		//대입연산자 뒤에 초기값을 알려주면 내가 추론해서 데이터형을 올바르게 설정한다.
		//Date myDate = new Date(); ==> var myDate = new Date(실행 중 추론해서 맞는 데이터 형을 준다)
		p("Date객체를 만듭니다.\n");
		var myDate = new Date();
		myDate.init(2022, 03 ,15);
		myDate.printDate();
		p("Date객체를 생성했습니다.\n");
		
		var myDate2 = new Date();
		myDate2.init(2022, 03 ,14);
		myDate2.printDate();
		
		// 사용자 커스텀 마이징 출력 만들기
		// 출력 예:
		// ###############################
		// ### 날짜 출력 : 2022년 3월 13일 ###
		// ###############################
		var myYear = myDate.getYear();
		var myMonth = myDate.getMonth();
		var myDay = myDate.getDay();
		
		var header = "###############################\n";
		var content = "### 날짜 출력 {0}년 {1}월 {2}일 ###\n";
		var footer = "###############################\n";
		Object[] contentArrey = {myYear, myMonth, myDay};
		
		var msg = MessageFormat.format(content, contentArrey); 
		p(header+ content+ footer);
 
		// 절대로 날짜를 외부에서 고칠수없다
		// 하지만 가능하다.
		// public 사용시
		//아래와 같이 외부에서 수정이 가능하다.
		//System.out.println("데이터를 고쳤어요");
		//myDate.year = 1900; //private로 변경해서 year의 정보를 변경할 수 없다.
		//myDate.printDate();
		
		
		//문자열 안에 "\"로 시작을 하면 이스케이프시퀸스라는 특별한 기능이 들어있다.
		//예) \n : 다음줄로 커서를 이동하라.
		//   \r : 줄의 끝으로 커서를옮겨라
		//   \b : 삑소리를 내어라
		//   \t : 4칸의 공백을 주어라
		//   \" : "문자를 출려해라
		//   \' : '문자를 출력하여라
		p("\\ 는 역슬래시 문자를 화면에출력 \n");
		p("\t 안녕하세요\t반가워요는 안녕하세요    반가워요를 화면에출력 \n");
		p("\"는 \"큰따옴표\"를 화면에출력 \n");
		p("\'는 \'작은따옴표\'를 화면에출력 \n");
		p("\b는 내장스피커가 있다면 삑소리 출력 \n");

	}
	
	public static void p(String msg) {
		System.out.println(msg);
	}

}
