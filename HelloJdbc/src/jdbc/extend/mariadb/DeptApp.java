package jdbc.extend.mariadb;

import java.sql.*;


//Dept테이블과 상호작용하는 예제
//DeptDao를 이용 Dept테이블에 데이터추가 / 변경 / 삭제 / 검색기능 수행함
//DeptDto를 이용 Dept테이블에 데어터 보내고 / 받음
//DeptDao는 DeptDto와 Dept테이블 사이에 중계역할을 함.

public class DeptApp {

	public static void main(String[] args) {
		DeptDao deptDao = new DeptDao();
		
		deptDao.createConnection();
		
		Connection conn = deptDao.getConnection();


	}


}
