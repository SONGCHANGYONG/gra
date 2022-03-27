package a0317;

import java.util.Scanner;

public class NameCardTest {
	// 최대 명함의 갯수
	static int NAMECARD_MAX = 20;
	// 명함이름
	static String[] nameList = new String[NAMECARD_MAX];
	// 명함에 등록된 회사명
	static String[] officeNameList = new String[NAMECARD_MAX];
	// 명함에 등록된 직업
	static String[] jobList = new String[NAMECARD_MAX];
	// 명함에 등록된 휴대폰 번호
	static String[] phoneList = new String[NAMECARD_MAX];
	// 명함에 등록된 회사번호
	static String[] officePhoneList = new String[NAMECARD_MAX];
	// 명함에 등록된 이메일
	static String[] emailList = new String[NAMECARD_MAX];

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		setNameCard();

		// 명함관리 메뉴
		while (true) {
			p("메뉴를 선택해주세요.  \n");
			p("(I)nsert, \n");
			p("(S)elect, \n");
			p("(F)ind, \n");
			p("(U)pdate, \n");
			p("(D)elet, \n");
			p("(Q)uit, \n");

			var menu = sc.nextLine();
			// Quit -> Q를 입력한다 -> 소문자로 바꾸어 비교
			menu = menu.toLowerCase();
			switch (menu.charAt(0)) {
			case 'i': // 명함입력 insertMainCard
				insertNameCard();

			case 's': // 명함검색 seachNameCard
				//인덱스 넘버로 찾기
				searchNameCard();
				break;
			
			case 'f': // 명함찾기 findNameCard
				index =findNameCardByName();
				printNameCardInfo(index);
				break;

			case 'u': // 명함수정 updateNameCard
				updateNameCard();
				break;

			case 'd': // 명함삭제 deleteNameCard
				deleteNameCard();
				break;

			case 'q': // q를 입력받으면 종료

				// 실제 프로그램에서 종료하는 상황을 명령해야함.
				// System.exit(0)를 사용해줘야함 : 진짜 정상적으로 종료
				p("시스템을 종료합니다.");
				System.exit(0);
			default:// 메뉴가없는경우
				p("없는 메뉴입니다.");

			}

		}
	}

	private static int findNameCardByName() {
		//키보드로 검색할 이름입력
		//검색어 공백제거
		//명함에 검색어와 일치하는 데이터가 있는가
		p("이름을 입력해 주세요.");
		String name =sc.nextLine().trim();
		for(var i = 0; i < count; i++) {
			//nameList의 값과 name의 값을 비교 해야하기 때문에 . equals이용
			if (nameList[i].equals(name)) {
				return i;
			}
		}
		return -1;
	}

	private static void setNameCard() {
		String[] nameTemp = {"홍길동","아이유","전우치","이병헌","송혜교"};
		String[] officeNameTemp = {"서울","대전","대구","부산","울산"};
	    String[] jobTemp = {"웹계발자","자바계발자","스프링","디자이너","기획자"};
		String[] phoneTemp = {"010-1111-1111","010-2222-2222","010-3333-4444","010-4444-4444","010-5555-5555"};
		String[] officePhoneTemp = {"055-1111-1111","051-2222-2222","02-3333-4444","031-4444-4444","032-5555-5555"};
		String[] emailTemp = {"a1@naver.com","a2@naver.com","a3@naver.com","a4@naver.com","a5@naver.com"};
		
		int dataSize = nameTemp.length;
		
		for (var i = 0; i <dataSize; i++) {
		nameList[i] = nameTemp[i];
		officeNameList[i] = officeNameTemp[i];
		jobList[i] = jobTemp[i];
    	phoneList[i] = phoneTemp[i];
	    officePhoneList[i] = officePhoneTemp[i];
		emailList[i] = emailTemp[i];
		}
		count = dataSize;
		
	}

	static int count = 0; // 인덱스 넘버가 아닌 명함의 현재 갯수
	static int index = -1; // 배열의 인덱스 넘버

	public static void insertNameCard() {
		// 안내글 나오고 문자열을 입력받음
		// 문자열에 빈 공백 제거 (=trim())
		// count는 현재 데이터 갯수
		// 데이터를 추가하면 전체데이처 갯수가 새 인덱스가 되므로
		p("이름:");
		nameList[count] = sc.nextLine().trim();
		p("회사이름 :");
		officeNameList[count] = sc.nextLine().trim();
		p("직책:");
		jobList[count] = sc.nextLine().trim();
		p("핸드폰번호:");
		phoneList[count] = sc.nextLine().trim();
		p("회사전화번로:");
		officePhoneList[count] = sc.nextLine().trim();
		p("이메일주소:");
		emailList[count] = sc.nextLine().trim();
		//명함 데어터 입력 끝
		printNameCardInfo(count);
	}

	public static void searchNameCard() {
		p("검색할 번호를 입력해 주세요.");
	     int index = sc.nextInt(); //배열 인덱스를 이용한 검색
	     if((0 <= index ) && (index < count)) {
	     printNameCardInfo(index);
	     }else {
	    	 p("찾으시는 명함이 없습니다.");
	     }
	
	}

	public static void updateNameCard() {
		//수정할 이름으로 검색
		//검색한 인덱스 >0 이면 항목수정 아니라면 수정할정보없음 출력 
		index = findNameCardByName();
		if(0 <= index && index < count) {
			updateNameCardInfo(index);
		
		}else {
			p("수정할 명함 없습니다.");
		}

	}

	private static void updateNameCardInfo(int index) {
		//업데이트할 nameList[index]를 가져온다.
		//이 nameList[index]의 수정할 이름을 키보드로부터 입력받는다.
		//수정할 이름값이 
		p("이름("+ nameList[index] +"):");
		String name = sc.nextLine().trim();
		
		if ((name ==null) || name.length() == 0) {
			
		}else {
			nameList[index] = name;
		}
	updateNameCardDate1("이름", nameList, index);	
	updateNameCardDate1("회사명", officeNameList, index);	
	updateNameCardDate1("직책", jobList, index);	
	updateNameCardDate1("핸드폰", phoneList, index);	
	updateNameCardDate1("회사전화번호", officePhoneList, index);	
	updateNameCardDate1("이메일", emailList, index);	
	}

	private static void updateNameCardDate1(String msg, String[] list, int index) {
		p(msg+ "("+ list[index] + ")");
		String str =sc.nextLine().trim();
		if((str == null) || str.length() == 0 ) {
			
		}else {
			list[index] = str;
		}
		
	}

	public static void deleteNameCard() {
		deleteNameCardInfo();

	}
	
	private static void deleteNameCardInfo() {
		p("명함 정보를 삭제합니다.");
		var idx = findNameCardByName();
		if(0 <= idx && idx <count) {
			deleteNameCardInfo();
		}else {
			p("삭제할 정보가 없습니다.");		
			}
		
	}

	private static void deleteNameCardInfo(int idx) {
		//현재 nameList의 실제 총 데이터 수(=count)만큼 루프를 돈다.
		//지워야할 위치의 값은 바로 한칸뒤의 값으로 덮는다.
		//나머지도 같은 방식으로 덮어준다.
	for (var i = idx; i < count-1 ; i++) { //i = count -1 : 실제 배열의 마지막 인덱스번호 -지울데이터의 갯수 원래배열의 갯수에서 제거할갯수
		 nameList[i] = nameList[i+1];
		 officeNameList[i] = officeNameList[i+1];
		 jobList[i] = jobList[i+1];
		 phoneList[i] = phoneList[i+1];
	     officePhoneList[i] =officePhoneList[i+1];
		 emailList[i] =emailList[i+1];
				 
	}
	//최종배열수는 지우는 갯수만큼 뺀다.
		count--;
	}

	//명함정보 출력
    public static void printNameCardInfo(int index) {
    	p       ("이름 : " + nameList[index] +"\n" +
    		    "회사명 : " + officeNameList[index]+"\n" +
    		    "직책 : " + jobList[index]	+"\n" +
    		    "전화 : " + phoneList[index]+"\n" +
    		    "회사전화번호 : " + officePhoneList[index]+"\n" + 
    		    "이메일 주소 : " + emailList[index]+"\n"); 		
    }
	

	public static void p(String msg) {
		System.out.print(msg);
	}
}
