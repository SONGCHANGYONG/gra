package 클레스와인스턴스와객체;

class calc {
	int a, b;
	static int addInt = 0;
	
	public void inputInt(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void sum() {
		System.out.println(a+b+addInt);
		
	}
	
	public void avg() {
		System.out.println((a+b)/2+addInt);
	}
}
public class Calcurator2 {

	public static void main(String[] args) {
		//클래스 변수를 사용하는 법을 익혀보자
		
	 calc c1 = new calc();
	 c1.inputInt(10, 20);
	 c1.sum();
	 c1.avg();
	 
	 calc c2 = new calc();
	 c2.inputInt(20, 40);
	 c2.sum();
	 c2.avg();
	 
	 calc.addInt = 20;
	 
	 c1.sum();
	 c2.avg();

	}

}
