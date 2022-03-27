package a0313;

import java.text.MessageFormat;

public class Car {
	String color;
	int gear;
	int speed;
	
	void speedUp(){
		
	}
	
	void speedDown(){
		
	}
	
	void changeGear(){
		
	}

class car1 {
	String color;
	int gear;
	int speed;
	
}
void print() {
	System.out.println("(" + color + " ," + speed + " ," + gear + " )");
}
void printf() {
	String pattern = "color : {0} \n speed : {1} \n gear : {2}";
	Object[] arg = {color, speed, gear};
	String result = MessageFormat.format(pattern, arg);
	System.out.println(result);
}
	public static void main(String[] args) {
	

	}

}
