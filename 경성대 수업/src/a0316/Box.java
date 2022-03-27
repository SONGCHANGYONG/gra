package a0316;

public class Box {
	private int width;
	private int length;
	private int heigth;
	
	public int getVelume() {
		return width * length * heigth;
	}
	
	void print() {
		System.out.println(toString());
	}
	
	void setBox(int a, int b, int c) {
		width = a;
		length = b;
		heigth = c;
				
	}

	int getWidth() {
		return width;
	}

	void setWidth(int width) {
		this.width = width;
	}

	int getLength() {
		return length;
	}

	void setLength(int length) {
		this.length = length;
	}

	int getHeigth() {
		return heigth;
	}

	void setHeigth(int heigth) {
		this.heigth = heigth;
	}
	
	public String toString() {
		return "가로 : " + width + "\n" +"세로 : " + length + "\n" +"가로 : " + heigth + "\n";
	}

}
