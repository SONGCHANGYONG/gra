package Member;

import java.util.Scanner;

public class MemberManager {//고객정보들관리
	//멤버추가, 삭제등의 데이터를 다루는 클레스(=DAO)
	static final int MAMBER_MAX = 100;
	
	Member[] memberList;  //생성자에서 초기화
	private int index = -1; //배열은 인덱스를 사용하여 접근하고 액세스하려는 현재 멤버의 인덱스를 가르킴 배열의 인덱스는 0부터 시작하므로 당장 가르키는 값이 없으므로 초기값은 -1이여야한다.
	private int count = 0; //전체 배열의 크기는 배열의 크기 -1로 구할수있다. 하지만 실제 배열의 크기는 count라는 변수를 하나선언하고 이것을 통해 관리 되어야 합니다. / count=0은 현제 비어있음을 의미 
    static Scanner sc = new Scanner(System.in); //전체 클레스에 입력을 담당할 스케너 변수 선언
    
	public MemberManager() {
		memberList = new Member[MAMBER_MAX];
	}

	public void insertMember() {
		p("이름 : ");
		String name = sc.next();
		p("성별(n/f) : ");
		char gender = sc.next().charAt(0);
		p("이메일 : ");
		String email = sc.next();
		p("생년월일 : ");
		String birthdate = sc.next();
		
		//멤버객체에 저장 //실제데이터에 갯수 하나 추가 count+1
		memberList[count].setName(name);
		memberList[count].setGender(gender);
		memberList[count].setEmail(email);
		memberList[count].setBirthdate(birthdate);
	}
	
	public static void p(String msg) {
		System.out.print(msg);
	}

}
