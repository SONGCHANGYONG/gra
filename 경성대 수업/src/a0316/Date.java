package a0316;

public class Date {
	private int year;
	private String month;
	private int day;
	
	public void setDate(int y , String m , int d) {
		year = y;
	    month = m;
		day = d;
	}
	
	public Date() {
		year =2022;
		month = "3월";
		day = 1;
			
	}
	
	public Date(int year, String month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public Date(int year) {
		setDate(year, "삼월", 1);
	}
	
	public void printDate() {
		 System.out.println ("입력한 날은 " + year + "년 " + month + " " + day + "일");
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int y) {
		year = y; 
	}
	
	public String getMonth() {
		return month;
	}
	
	public void setMonth(String m) {
		month = m; 
	}
	
	public int getday() {
		return year;
	}
	
	public void setday(int d) {
		day = d; 
	}
	
	

}
