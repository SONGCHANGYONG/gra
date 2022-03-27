package a0321;

public class Music {
	//변수- 제목, 가수, 재생시간
	
	//필드 변수 정의
	String title, producer;
	int time;
	
	//변수들을 관리하는 기능
	//생성자(운영체제에 의해서불러지는 생성자 = 콜백함수)
	//설정자(내가 불러서 초기화하는 생성자)
	//setter/getter함수
	//그외 필요한 기능들
	
	//맴버 메소드 정의
	//생성자
	//매개변수가 아무것도 없는경우
	public Music() {
		title = "미상";
		producer = "미상";
		time = 0;
	}
	//매개변수가 맴버수만큼 초기화 하는경우
	public Music(String title, String priducer, int Time) {
		this.setMusic(title, priducer, Time);
	}
	
	//설정자함수를 이용해서 필드 또는 맴버변수 초기화 하기
	public void setMusic (String title, String producer, int time){
		this.title = title;
		this.producer = producer;
		this.time = time;
	}
	
	//실제음악 재생 기분만 내는함수
	public void playMusic() {
		//실제음반이 time초 동안 재생됩니다.
		System.out.println(title + "(이)가 " + time + "초 동안 플레이됩니다." );
		
	}

}
