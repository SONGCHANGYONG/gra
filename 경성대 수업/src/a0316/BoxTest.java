package a0316;

public class BoxTest {

	public static void main(String[] args) {
		Box box1 = new Box();
		box1.setBox(100, 100, 100);
		box1.print();
		System.out.println("box 1의 부피는 " + box1.getVelume());
		
		Box box2 = new Box();
		box2.setBox(200, 400, 200);
		box2.print();
		System.out.print("box 2의 부피는 " + box2.getVelume());
		
		box1 = box2;
		box1.print();
	}

}
