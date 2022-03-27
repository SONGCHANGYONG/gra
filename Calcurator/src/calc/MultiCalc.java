package calc;

//자바에서는 부모의 기능을 상속 받는다 라는 뜻이 부모에 확장한다라고 표현.
public class MultiCalc extends Simplecalcurator {
	
	//설정자라는 메소드 setter()함수 중에서 맴버변수를 한꺼번에 초기화 하는 친구.
	//내가 원하는 시점에 내가 항상 불러줘야 함.
	//클래스로부터 객체가 만들어지면 자동으로 불리는 메소드 ( =내가 부르면: 콜, 누군가 다른쪾에서 일정시간이 되면 불러주는것:콜백)
	//setter함수는 삾을 설정 리턴갑싱 필요없다.
	public void setMeltiCalc(){
		//맴버 변수가 없으므로 굳이 초기화할 일 없음.
		//비워두면된다.
	}
	
	public MultiCalc() {
		
	}
	
    //MultiCalc클래스의 맴버메소드 정의
	//곱하기 메소드정의 mul=multiply
	int mul(int a, int b){
		return a*b;
	}

}
