package a0316;

class Car {
	String color;
	int speed;
	int gear;

	
	public Car(String color, int speed, int gear) {
		
		this.color = color;
		this.speed = speed;
		this.gear = gear;
	}
	
	public Car() {
		this("Pink", 50, 2);
	}
	
	public Car(String color) {
		this(color, 30 ,3);
	}


	public String toString() {
		return "컬러 : " + color + "\n" + "속도 : " + speed + "\n" + "기어 : " + gear;
		
	}

}



public class CarTest {

	public static void main(String[] args) {
		Car mycar = new Car();
		mycar.toString(); //메모리 어딘가에 임시로 만들어졌다 다 사용하면 사라진다.

	
	}

}
