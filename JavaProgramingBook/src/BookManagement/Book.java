package BookManagement;

/*
     3. Book 클래스는 다음의 내용을 가진다. (필수조건)
     인스턴스 필드 : title(책이름), author(책저자)
     인스턴스 메소드 : setter / getter – 속성함수를 가진다.
                   Book(title, author)과  Book() - 생성자를 가진다.
                   Object클래스로부터 상속받은 toString()메소드를 가진다.
                   toString()메소드는 책이름: ○○○, 책저자: □□□ 형식으로 출력하면된다.
 
 */
public class Book {

	private String title;
	private String author;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Book() {

	}

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public String toString() {
		return "책이름 : " + title + ", " + " 책의 저자 : " + author;

	}

}
