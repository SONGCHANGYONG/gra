package jdbc.extend.mariadb;

import java.sql.*;

/**
 CREATE TABLE Sales(
 number varchar(10),
 sales int,
 month ing
 );
  
 */

public class TableCreating {
	public static void main(String[] args) {
		// 0. db서버 관련 연결정보 변수들 준비
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		// 실제 데이터 정보
		//JDBC url
		//localhost(도메인) = 127.0.0.1(ip)
		//SSL (=비밀보안접속) = useSSL=false = 보통 일반접속
		String url ="jdbc:mariadb://localhost:3306/springs";
	    String userID = "root";
	    String userPassword = "mariadb";
	    
	    try {
		// 1. 연결할 db서버에 드라이버 연걸
	    	Class.forName("org.mariadb.jdbc.Driver");
		// 2. 컨텍션스트링( =서버에 접속할 정보 : jdbc프로토콜 서버주소, 포트 사용자 id, 비밀번호)
	    	// 위에 있음
		// 3. 드라이버 매니저를 이용하여 컨텍션 얻어오기 (getConnection)
	    	conn = DriverManager.getConnection(url, userID, userPassword);
	    	// 연결성공
	    	System.out.println("연결 되었습니다.");
		// 4. 프리페어그테이먼트 이용해서 쿼리생성
	    	stmt =conn.createStatement();
	    	// 큰문자열은 스트링빌더사용해서 스트링으로 전환
	    	// 비어있는 문자열을 만듬
	    	StringBuilder sb = new StringBuilder();
	    	String sql; //만들어진 sb의 내용을 문자열로 만들어 저장할 변수
	    	//sales 테이블이 없으면 (=if not exsrs sales) 테이블은 말듫어라(=CREATE table)
	    	sql = sb.append("CREATE table if not exists sales(")
	    			.append("number varchar(10),")
	    			.append("slaes int,")
	    			.append("month int")
	    			.append(");")
	    			.toString();
	    	// stmt오 db서버로 보낼 쿼리만들기
	    	
		// 5. 준비된 커뤼를 서버로 보내어 실행
		// 6. 실행결과 받아오기
	    	stmt.execute(sql);
		// 7. 관련처리
		// 8. 다 사용했으면 연결끊기 (= try ~ catch ~finally구문 이용)
	    }catch (ClassNotFoundException e) {
	    	// 에러가 발생하면 모든 에러관련 내용을 출력해라
	    	e.printStackTrace();
	    }catch (SQLException e) {
	    	e.printStackTrace();
	    }catch (Exception e) {
	    	e.printStackTrace();
	    }finally {
	    	try {
	    		if ((conn != null) && (conn.isClosed())) {
	    			
	    		}
	    	}catch (SQLException e) {
	    		e.printStackTrace();
	    	}
	    	
	    }
	}

}
