package a0316;

class DeskLemp{
	private boolean isOn;
	
	public void turnOn() {//isOn으로 반환가능하므로 반환값 불필요
		isOn = true;
	}
	
	public void turnOff() {
		isOn = false;
	}
	
	public String toString() {//문자열 반환
		return "현재 상태는 " + (isOn== true ? "켜짐" : "꺼짐"); //isOn이 true면 켜짐 출력 아니면 꺼짐 출력 == if문의 축약형
		                                                    //isOn==true가 조건--> 조건이 참이면 ?다음 실행 / 거짓이면 :다음 실행
	}
}

class DeskLempTest {

	public static void main(String[] args) {
		DeskLemp deskLemp = new DeskLemp();
		
		//객체메소드는 .(도트연산자) 사용 후 호출하여 사용
		deskLemp.turnOn();//불 켜진상태
		System.out.println(deskLemp);//= System.out.println(deskLemp.toString());과 같음 toString()은 특별
		deskLemp.turnOff();
		System.out.println(deskLemp);

	}
	
	

}
