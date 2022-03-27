package a0314;

public class CarExemTest {

	public static void main(String[] args) {
		CarExam car = new CarExam();
		var car2 = new CarExam();
		System.out.println("car의 현재 속도 : " + car.getSpeed());
		
		car.speedUp(50);
		System.out.println("car의 speedUp한 속도 : " + car.getSpeed());
		
		car.speedDown(50);
		System.out.println("car의 speedDown한 속도 : " + car.getSpeed());

		car2.speedUp(60);
		System.out.println("car2의 속도는 : " + car2.getSpeed());
		
		
		if (car.speedequals(car2)) {
			System.out.println("car의 속도(" + car.getSpeed() + ")와 car1의 속도(" + car2.getSpeed() + ")는 같습니다.");
		}else {
			System.out.println("car의 속도(" + car.getSpeed() + ")와 car1의 속도(" + car2.getSpeed() + ")는 다릅니다.");
		}
	}

}
