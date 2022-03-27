package Member;


public class Member {//고객정보입력
	//고객 이름, 성별, 이메일, 생년월일
	//고객max 100
	//추가 삭제 수정 검색 
	//키보드로 입력
	private String name;
	private char gender;
	private String email;
	private String birthdate;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	

}
