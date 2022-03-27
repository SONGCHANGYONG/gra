package Member;

import java.util.Scanner;

public class MemberTest {//실행
	static MemberManager mm;

	public static void main(String[] args) {
		//메뉴함수 실행 = 메뉴가 나타남 
	    mm = new MemberManager();
		choiceMenu();

	}
	static void showMenu() {
		p("1.추가(i)\n");
		p("2.이전(p)\n");
		p("3.다음(n)\n");
		p("4.현재(c)\n");
		p("5.업데이트(u)\n");
		p("6.삭제(d)\n");
		p("7.마침(q)\n");
		p("메뉴를 선택해주세요.");
	}
	
	
	//무한루프, menu내용 출력, 메뉴를 선택하는 입력기능
		static void choiceMenu() {
		Scanner sc= new Scanner(System.in);
		//무한루프
		while (true) {
			showMenu();
			String menu =sc.next();
			menu = menu.toLowerCase();//원래데이터를 소문자로바꿈
			char choice = menu.charAt(0);//제일 첫번쨰 문자를 가져와라
			switch(choice) {
				
		    case 'i' :
		    	p("여기는 고객정보를 입력하는 곳입니다.\n");
		    	inserMM();
		    	break;
		    	
		    case 'p' :
		    	p("여기는 이전데이터로 이동하는 곳입니다.\n");
		    	break;
		    	
		    case 'n' :
		    	p("여기는 다음데이터로 넘어가는 곳입니다.\n");
		    	break;
		    	
		    case 'c' :
		    	p("여기는 현재데이터로 이동하는 곳입니다.\n");
		    	break;
		    	
		    //CRUD(데이터 추가, 데이터읽기, 데이터 수정, 데이터 삭제	
		    case 'u' :
		    	p("여기는 현재데이터를 수정하는 곳입니다.\n");
		    	break;
		    	
		    case 'd' :
		    	p("여기는 현재데이터를 삭제하는 기능입니다.\n");
		    	break;
		    	
			case 'q' :
				p("프로그램을 종료합니다.");
				quit();
				break; //다음 메뉴실행 중지
				
			 	
			}
		}
			
		
	}


	private static void inserMM() {
		mm.insertMember();
			
		}
	private static void quit() {
	    System.exit(0); //프로그램 정식종료
	}
	
	public static void p(String msg) {
		System.out.print(msg);
	}

}
