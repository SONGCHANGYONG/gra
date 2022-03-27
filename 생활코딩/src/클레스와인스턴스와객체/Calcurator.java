package 클레스와인스턴스와객체;

public class Calcurator {
	int a;
	int b;
	
	public void twoInt (int a, int b) {
		this.a = a;
		this.b = b;
	}
	public void sum() {
		System.out.println(a+b);
		
	}
	
	public void avg() {
		System.out.println((a+b)/2);
		
	}

	public static void main(String[] args) {
		//두개의수의 덧셈결과와 평균값을 구하는 프로그램.
		//두개의 값을 받는메소드를 만든다.
		//두개의값의 평균과 더하는 메소드를 만든다.
		
		Calcurator type1 = new Calcurator();
		type1.twoInt(10, 20);
		type1.sum();
		type1.avg();
		
		Calcurator type2 = new Calcurator();
		type2.twoInt(20, 40);
		type2.sum();
		type2.avg();
		

	}

}
