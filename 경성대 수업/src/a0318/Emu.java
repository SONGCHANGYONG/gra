package a0318;

public class Emu extends Animal {
	String name;
	public Emu() {
		name = "에뮤";
	}
	
	public void printEmuInfo() {
		System.out.println("에뮤의 이름 : " + name);
		System.out.println("에뮤는 날수있나 : " + fly);
		System.out.println("에뮤는 수영하나 : " + swim);
		System.out.println("에뮤의 크기는 : " + size);
		System.out.println("에뮤의 색깔는 : " + this.color);
		System.out.println("에뮤의 나이는 : " + age);
		 
	}

}
