package a0317;

public class CarTest {

	public static void main(String[] args) {
		CarManager cm = new CarManager();
		
		Car car1 = new Car(); //새차출고
		cm.create_car();
		Car car2 = new Car(); //새차출고
		cm.create_car();
		Car car3 = new Car(); //새차출고
		cm.create_car();
		Car car4 = new Car(); //새차출고
		cm.create_car();
		Car car5 = new Car(); //새차출고
		cm.create_car();
		
		car5 = null; //배송 중 차 파손
		cm.screp_car();
		car3 = null; //배송 중 차 파손
		cm.screp_car();
		
		System.out.println(cm.number_of_car_produced);
        newCar car11 = new newCar(); //새차출고
		
		newCar car12 = new newCar(); //새차출고
		
		newCar car13 = new newCar(); //새차출고
		
		newCar car14 = new newCar(); //새차출고
		
		newCar car15 = new newCar(); //새차출고

	}

}
