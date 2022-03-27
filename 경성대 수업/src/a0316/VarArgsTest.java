package a0316;

class VarExam{
	void sub(int... v) {
		System.out.print("인수의 갯수 : " +v.length + "\n" );
		
		for(var x : v) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
}

public class VarArgsTest {

	public static void main(String[] args) {
		VarExam varTest = new VarExam();
		
		varTest.sub(1);
		varTest.sub(2, 3, 4, 5, 6);
		varTest.sub();

	}

}
