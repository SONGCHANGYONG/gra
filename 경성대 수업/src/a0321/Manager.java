package a0321;

public class Manager extends employee {
	private int bonus;
	
	public void printsalay() {
		System.out.println(name + "(" + address + ")" + (salary+bonus));
	}
	public void printRRN() {
		System.out.print(getRRN());
	}

}
