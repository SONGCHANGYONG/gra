package carc;

public class 도시락세트 {
    static String[] 숫가락;
    static String[] 젓가락;
    static String[] 음료;
    static String[] 도시락;
    
    static final int MAX_SIZE = 10; // 기호상수 - 변경할 수 없는 값(올 대문자로 기입)
	public static void main(String[] args) {
	    //숫가락 ,젓가락, 음료수, 도시락

		숫가락 = new String[MAX_SIZE];
		젓가락 = new String[MAX_SIZE];
		음료 = new String[MAX_SIZE];
		도시락 = new String[MAX_SIZE];
		
		//도시락 데이터 초기화
		for(int i = 0; i <MAX_SIZE; i++) {
			숫가락[i] = "1";
		    젓가락[i] = "1";
		    음료 [i] = "음료"+ i;
		    도시락[i] = "도시락"+i;
		}
		
		//도시락 정보 출력
		for(int i =0; i < MAX_SIZE; i++) {
			p("["+ i + "]="
					+ "숫가락 : " + 숫가락[i] + "개, "
					+ "젓가락 : " + 젓가락[i] + "게, "
					+ "음료: " + 음료[i] + "개, " 
					+ "도시락 : " + 도시락[i] 
					);
		}
		
	}
	
	public static void p (String msg) {
		System.out.print(msg);//화면 출력후 커서가 마지막 칸에있음
	}
	public static void pl (String msg) {
		p(msg + "\r\n"); //p()함수를 이용해서 커서를 마지막칸에 두고
		                 //\(이스케이스 시퀸스)+r ="\r" - 캐리지 리턴 그 행의 맨앞으로가라
		                 //\(이스케이스 시퀸스)+ㅜ ="\n" - 뉴라인 출력 후 다음줄로 가라
	}

}
