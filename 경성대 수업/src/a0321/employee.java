package a0321;

public class employee {
	public String name; // 이름 : 공용맴버
	String address; //주소 : 패키지맴버
	protected int salary; //월급 : 보호맴버 employee패밀리는 사용가능 = employee를 상속받은 클래스들은 모두 사용가능
	private int RRN; //주민번호 : 전용 맴버
	
	public String toString() {
		return name + ", " + address + ", " + RRN + ", " + salary; 
	}
	
	//속성 RRN을 같은패밀리에게 공개하기위해 만든함수
	protected int getRRN() {
		return RRN;
	}
	

}
