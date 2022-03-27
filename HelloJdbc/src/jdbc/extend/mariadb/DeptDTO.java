package jdbc.extend.mariadb;

public class DeptDTO {

	// 1. 부서 테이블을 만들겠습니다.
	//   테이블명 Dept라고
	
	// 2. 부서 테이블을 만듦
	//   deptNo( = 부서코드) 정수, deptName( = 부서명) 문자열, deptLoc( = 위치) 문자열
	
	private int deptNo;
	private String deptName;
	private String deptLoc;
	// 3. 기능 데이처 값 변경(=속성합수)
	//   getter/setter
	//   getDeptNo / setDeptNo
	//   getDeptName / setDeptName
	//   getDeptLoc / setDeptLoc
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptLoc() {
		return deptLoc;
	}
	public void setDeptLoc(String deptLoc) {
		this.deptLoc = deptLoc;
	}
	
	
	// 4. 전체값을 초기화 하는 생성자
	//   public DeptDTO(DeptNo, DeptName, DeptLoc){
	//	 this.DeptNo = DeptNo
    //   }
	public DeptDTO(int deptNo, String deptName, String deptLoc) {
		this.deptNo = deptNo;
	    this.deptLoc  = deptName;
		this.deptLoc = deptLoc;
	}
	
	// 5. 자기자신을 설정하는 메소드
	//   toString() 상속받은 내용들을 개선하는 방법 오버라이딩
	//   @Overrride
	//   public String toString() {
	//   return ...;
	//   }
	@Override
	public String toString() {
		return "DeptDTO [deptNo=" + deptNo + ", deptName=" + deptName + ", deptLoc=" + deptLoc + "]";
	}
}  
