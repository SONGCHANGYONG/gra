package a0316;

public class DateTest {

	public static void main(String[] args) {
		Date date = new Date();
     	date.setDate(2022, "3월", 15);
		date.printDate();
		date.setMonth("8월");
		date.printDate();
		
		Date date2 = new Date();
		date2.setDate(2022, "2월", 22);
		date2.printDate();
		date2.setday(28);
		date2.printDate();
		
		Date date3 = new Date();
		Date date4 = new Date(2021);
		Date date5 = new Date(2023, "5월", 5);
		
		date3.printDate();
		date4.printDate();
		date5.printDate();

	}

}
