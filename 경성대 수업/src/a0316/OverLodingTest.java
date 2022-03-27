package a0316;

public class OverLodingTest {

	public static void main(String[] args) {
		//OverLodinExam타입의 객체생성
		var overInt = new OverLodingExam();
		//OverLodinExam타입의 객체생성
		OverLodingExam overFloat =new OverLodingExam();
		
		
		//overInt객체의 add(int+int)형의 메소드호출
		System.out.println (overInt.add(100,200));
		
		//oveFLoat객체의 add(float+float)형의 메소드호출
		System.out.println (overFloat.add("안녕하세요", 100));

	}

}
