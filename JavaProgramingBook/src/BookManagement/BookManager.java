package BookManagement;

import java.util.Scanner;

/*BookManager 클래스는 다음의 내용을 가진다. (필수조건)
     인스턴스 필드 : MAX_SIZE = 10(=최대 저장 책의 권수)라는 정적 기호상수를 정의하시오.
                    크기가 MAX_SIZE인 Book클래스가 들어가는 BookList배열을 선언하시오.
                    현재 책의 권수를 저장하는 size라는 변수를 가진다.
     인스턴스 메소드 : add(title, author) - 책정보 추가하기.
                      remove(title) - 책이름으로 찾아서 삭제하기.
                      getList() - 모든책의 리스트 출력하기
                      searchByTitle(title) - 책 이름으로 책을 찾아서 책 정보 출력하기.
                      getBookCount() - 현재 등록된 책수 가져오기기 
 */
public class BookManager {
	Scanner sc = new Scanner(System.in);
	final int MAX_SIZE = 10; // 책 최대저장 갯수 기호상수 선언 
	Book[] bookList = new Book[MAX_SIZE]; // 책 정보 저장할 배열

	int size; //배열의 인덱스 넘버로 사용되는 변수 

	public void add(String title, String author) { // 책 등록 메소드
		Book book = new Book();                    // 메뉴 1번에서 인수 title과 author을 받아 bookList배열에 저장한다.
		book.setTitle(title);                      // 입력 받을때마다 배열 인덱스번호를 1씩 증가시켜 다음 데이터를 저장한다. 
		book.setAuthor(author);
		bookList[size++] = book;

	}

	public void remove(String title) {                     // 책 목록 삭제 메소드
		for (int i = 0; i < size; i++) {                   // 메뉴 2번에서 인수 title을 넘겨받는다.
			if ((bookList[i].getTitle()).equals(title)) {  // 배열의 크기만큼 반복시키는 for문을 만든다. 
				for (int j = i; j < size; j++) {           // 그 속에 입력 받은 title값과 bookList속 타이틀 값이 같을때 실행되는 if을 넣는다. 
					bookList[j] = bookList[j + 1];         // if문의 조건이 맞아 실행되면 배열 속 그 title이 속한 인덱스 번호의 정보를 지우고 
				}                                          // 다음 인덱스 넘버가 가진 정보를 한칸씩 당겨 받는 반복문 for문을 배열의 남은 크기만큼 반복시킨다.   
				size--;                                    // 삭제를 마친후 배열의 크기를 하나 줄인다.
			}
		}
		System.out.println("~~~ 삭제완료! ~~~");
	}
	
	public void getList() {                                               // 모든 책 출력 메소드
		for (int i = 0; i < size; i++) {                                  // 배열의 크기만큼 실행되는 for문을 만든다.
			System.out.println("[" + (i + 1) + "]번 " + bookList[i]);      // bookList[0]번부터 차례로 for문이 끝날때 까지 출력시킨다.
		}

	}

	public void searchByTitle(String title) {                   // 책 목록 검색 메소드
		for (int i = 0; i < size; i++) {                        // 배열의 크기만큼 반복하는 for문을 만든다.
			if ((bookList[i].getTitle()).equals(title)) {       // 입력 받은 인수 title과 같은 bookList.title을 만나면
				System.out.println(bookList[i]);                // 그 title이 속한 BookList 인덱스넘버에 속한 데이터값을 출력 시킨다.
			}
		}
		System.out.println("~~~ 검색완료! ~~~");
	}

	public int getBookCount() {       // 메뉴 위 현재 등록되어 있는 책의 권수를 집계해주는 메소드 
		int BookCount = this.size;    // 입력 받은 배열의 갯수와 동일하다. 
		return BookCount;

	}

}
