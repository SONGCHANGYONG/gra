package a0314;

public class CarExam {
	
	// private 변수를 먼저선언
	// public 함수들 선언
	// 속성함수들 정의함
	// 기능함수들 정의함
	
	//1.private선언
	private int speed;
	
	//3.속성함수들 정의
	public int getSpeed() {
		//속도값을 알고싶다.
					
		return speed;// 내 speed를 가져오기 떄문에 private speed와 상관없다.
 	}
	
	public int setSpeed(int speed) {
		//속도값을 설정하고싶다.
		//속도는 음수값을 설정 할수없음으로 조건문을사용해 설정
		if(speed >=0) {
			this.speed = speed;
		}else {
			this.speed = 0;
		}
		return this.speed; //가장가까운 speed를 찾아감
	}
	
	//4.기능함수들 선언
	//메소드선언 
	void speedUp(int increment) {
		speed += increment;
		setSpeed(speed);
	}
	
	void speedDown(int decrement) {
		speed -= decrement;
		setSpeed(speed);
	}
	
	boolean speedequals(CarExam car) {
		if(this.speed == car.speed){
		    return true;
		}else {
			return false;
		}
	}

}
