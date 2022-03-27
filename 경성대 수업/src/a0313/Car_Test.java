package a0313;

class Car_Test {

	public static void main(String[] args) {
		Car car1 = new Car(); //car에있는 class에서 가져옴
		car1.gear = 3;
		car1.speed = 80;
		car1.color = "red";
		car1.printf();
		
		
		// 새로운 car 객체 생성 그리고 그주소를 car2 변수에 대입
		Car car2 = new Car();
		car2.color = "blue";
		car2.gear = 2;
		car2.speed = 40;
		
		car2.print();
	    car1.print();
		
		// car2 변수가 car1변수의 값을 대입 받는다.
	    car2 = car1;
		
	    car2.print();
	    System.out.println("#############");
	    car1.print();
	    
	    //1. car2를 통해서 가르키는 맴버의 값을 바꾸면 원본 car1의 내용도 바뀌는지 확인.
	    car2.speed = 0;
	    System.out.println("car2의 맴버속성");
	    car2.print();
	    System.out.println("#############");
	    System.out.println("car1의 맴버속성");
	    car1.print();
	    
	    
	    //2. car1을 통해서 카르키는 맴버의 값을 바꾸면 car2의 내용도 업데이트 되는가
	    car1.speed = 150;
	    System.out.println("car1의 맴버속성");
	    car1.print();
	    System.out.println("#############");
	    System.out.println("car2의 맴버속성");
	    car2.print();
	    
	    //3. car1에 null을 대입해서 원래 가르키던 객체를 가비지 컬랙터 대상으로 만드려고 시도 하지만 실패 할것임.(car2가 사용중이기 떄문에)
	    //   가비지 컬랙터는 반드시 더 이상 힙의 객체를 사용하지 않아야 한다.
	    
	    car1 = null;
	    //System.out.println("car1의 맴버속성");
	    //car1.print(); // NPE에러 (=null point exception)
	    System.out.println("#############");
	    car2.color ="green";
	    System.out.println("car2의 맴버속성");
	    car2.print();
	    
	    
	    //4. car1이 다시 이전 자시니이 카르키던 주소를 가르킨다. new car를 생성 새로운 정보입력 car1=newcar선언 
	    //   car1과 newcar sms 같이 가르키나.
	    car1 = car2;
	    Car newcar = new Car();
	    newcar.color ="yellow";
	    newcar.gear = 5;
	    newcar.speed = 50;
	   
	    car1 = newcar;
	    System.out.println("car1의 맴버속성");
	    car1.print();
	    System.out.println("car2의 맴버속성");
	    car2.print();
	    System.out.println("newcar의 맴버속성");
	    newcar.print(); 

	}
}