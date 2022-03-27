package a0314;

public class Date {
	
	
	public void init (int year, int month , int day) {
		this.year = year;
		this.month = month;
		this.day = day;
		this.right = 2;// set속성함수에서 조건문으로 권한에따른 쓰기가능 동작하게 설정
	}
	//set/get함수 private가 걸려도 변경하는 방법
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		if(this.right == 2);{
		this.year =year;
		}
	}
	
    public int getMonth() {
    	return month;
    }
    
    public void setMonth(int month) {
    	if(this.right == 2);{
    	this.month = month;
    	}
    }
    
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		if(this.right == 2);{
		this.day = day;
		}
	}
	
	/** 기능 : 날짜를 출력합니다.
	 ** 매개변수없음
	 ** 작성자 : 나
	 ** 작성월일 2022.03.16
	 **/ //도큐멘트주석 작성프로그램 설명
	public void printDate() {
		System.out.print("날짜 출력 : " + year + "년 " + month + "월 " + day + "일" + "\n");
	}
	
	private int year;
	private int month;
	private int day;
	
	private int right;//클레스의 설정을 변경할 수 있는 권한
	                  // right =0 ; 설정변경 불가(읽기만 가능)
	                  // right =1 ; 쓰기만 가능
	                  // right =2 ; 읽기 쓰기 가능
	

	public static void p(String msg) {
		System.out.print(msg);
	}
	
	

}



//snippet(스니핏) : 이미만들어진 코드 일부를 가져다 쓰는기능
//window - showview -other -general -snippets
//자바일반 추가 - 우클릭 paste as snippet -추가