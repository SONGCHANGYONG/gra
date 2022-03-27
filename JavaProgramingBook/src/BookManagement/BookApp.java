package BookManagement;

import java.util.Scanner;

public class BookApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);   // 전체 클레스에 입력을 담당할 스케너 변수 선언
		BookManager book = new BookManager();  // BookManager의 변수와 메소드를 사용하기 위해 book 객체 선언

		int select = 0;

		while (true) {
			System.out.println("== [도서관리 VO.1] ==");
			System.out.println("등록된 도서수 : " + book.getBookCount());
			System.out.println("1. 책 등록");
			System.out.println("2. 책 삭제");
			System.out.println("3. 책 리스트");
			System.out.println("4. 책 검색");
			System.out.println("0. 종료");
			System.out.println("===================");

			System.out.println("사용하실 메뉴의 번호를 입력하여 주세요.");  
			select = sc.nextInt();       // 사용 할 메뉴의 번호를 한다.

			String title;
			String author;

			switch (select) {
			case 1:   // 1을 입력 받으면 title 과 author을 입력 해 book.add에 넘겨 결과를 받는다.  
				System.out.println("책 이름을 입력 해 주세요.");
				title = sc.next();
				System.out.println("책의 저자를 입력 해 주세요.");
				author = sc.next();
				book.add(title, author);

				break;

			case 2:   // 2를 입력 받으면 지울 title을 입력해 book.remove에 넘긴다.
				System.out.println("지우실 책 제목을 입력 해 주세요.");
				title = sc.next();
				book.remove(title);

				break;

			case 3:   // 3을 입력하면 등록된 책 정보를 출력하는 book.getList메소드가 실행된다.
				book.getList();
				break;

			case 4:   // 4를 입력받으면 찾을 책의 title을 입력하면 그 값을 book.searchByTitle로 넘겨 결과를 받는다.  
				System.out.println("찾으실 책 이름을 입력 해 주세요.");
				title = sc.next();
				book.searchByTitle(title);

				break;

			case 0:   //0번을 입력받으면 switch 문을 종료한다.
				System.out.println("도서관리 프로그램을 종료합니다.\n감사합니다.");  
				System.exit(0);

			default:  //0~4번 외의 숫자를 입력 받으면 재입력을 요구 하는 문장을 출력시킨다. 
				System.out.println("0 ~ 4 까지 입력해주세요.");

			}

		}

	}

}
