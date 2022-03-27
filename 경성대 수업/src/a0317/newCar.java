package a0317;

public class newCar {
	String color;
	static int numberOfCars = 0;
	public newCar() {
		color ="red";
		id = ++numberOfCars; // id = 1
		//id =numberOfCars++ = id = 0
		//numberOfCars++ = numberOfCars+1 계산순서
		//id = ++numberOfCars = (++numberOfCars) id에 값이 대입되는 순서가 1. numberOfCars = numberOfCars +1 2.id = numberOfCars ==1
		//id = numberOfCars++ = (numberOfCars)++ id에 값이 대입되는 순서가 1. id = numberOfCars 2.numberOfCars = numberOfCars +1 ==0
	}
	private int id = 0;//차의 고유 넘버
	                   //고유넘버 발생방법은 가장최근 정적변수+1
	
	
		
	

}
