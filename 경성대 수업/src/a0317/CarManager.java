package a0317;

public class CarManager {
     int number_of_car_produced;
     
     public CarManager() {
    	 number_of_car_produced = 0;
     }
     
     public void create_car() {
    	 number_of_car_produced++;
     }
     
     public void screp_car() {
    	 number_of_car_produced--;
     }
}
