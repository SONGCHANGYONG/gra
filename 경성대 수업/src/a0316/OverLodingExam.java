package a0316;

public class OverLodingExam {
	int addInt;
	Float addFloat;
	double addDouble;
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public float add(float a, float b) {
		return a + b;
	}
	
	public double add(double a, double b) {
		return a + b;		
	}
	
	public String add(String a , String b) {
		return a + b;
	}
	
	public String add(String a , int b) {
		return a + b;
	}

}
