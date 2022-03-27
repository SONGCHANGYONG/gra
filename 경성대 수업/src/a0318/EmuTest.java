package a0318;

public class EmuTest {

	public static void main(String[] args) {
		Animal anim = new Animal();
		Emu emu = new Emu();
		
		System.out.println("anim's fly : " + anim.fly);
		System.out.println("anim's swim : " + anim.swim);
		System.out.println("emu의 능력 : " );
		emu.printEmuInfo();

    }

}
