package jdbc.basic.mariadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.MessageFormat;

public class ParsonInsert {

		// DB에 연결
		// table에 추가
	public static void main(String[] args) {
		// null Pointer Exception 조심
		Connection conn = null;
		// 현재 psmt가 사용중이지않다.
		PreparedStatement pstmt = null;
		
		try {
			//필요할때 클레스를 불러오는 메소드
			Class.forName("org.mariadb.jdbc.Driver");
			
			//연결할 주소 : uurll, db 사용사능한 유저 :userId, dbuser인지 확인 : userPassword
			//jdbc:DBMS이름 : 네트워크 프로토콜
			//예) jdbc:mysql : mysql 데이터베이스를 jdbc방식으로 연결한다.
			//jdbc:mysql://네트워크주소:포트번호/작업할데이터베이스명
			String url = "jdbc:mariadb://localhost:3306/javastudy";
			String userID = "root"; //데이터베이스 id
			String userPassword = "mariadb"; //db계정 패스워드
			
			String dbtype = "mariadb";
			String ip = "localhost";
			String dbName = "javastudy";
			String port = "3306";
			
		    String jdbcMultiStr =
		    		"""
		    		jdbc:%s://%s:%s/%s
		    		""".formatted(
		    				"dbtype",
		    				"ip",
		    				"port",
		    				"dbName").replaceAll("(\r|\n|\r\n|\n\r)","");
		    
			
			
			//DriverManager 클래스는 데이터베이스서버에서 접속하기 위한 기능을 가진 클래스
			//getConnection() :DriverManager에서 db서버에 연결해서 앞으로 작업할 Connection 객체를 반환한다.
			//내부에 복잡한 작업은 대신해주므로 우리는 연결 객체만 신경쓰면된다.
			conn = DriverManager.getConnection(url, "root", "mariadb");		
			
			//잘연결 됨
			System.out.println("데이터베이스에 연결 성공");
	
			//////////////////////////////////////////////////////////////////////////////////////////
			// sql데이터 추가 (=insert)
			String sqlInsert = 
					"INSERT INTO user (name,dept_cd,phone,address)" + 
					"VALUES(홍길동,A,01024558920,대한민국);";
			pstmt = conn.prepareStatement(sqlInsert);
			
			int index = 1;// sqlInsert 질의 문자열의 컬럼의 위치를 나타냄
			// 첫번쨰 컬럼인 name컬럼

			
			// mysql에 sqlInsert SQL 명령을 실행
			// updatecount = 쿼리수행결과 변경된 수
			// 실패시 catch에 에러전송
			int updateCount =pstmt.executeUpdate();
			
			if(updateCount == 0 ) {
				// insert쿼리 문제있음
				System.out.println("데이터값에 문제가 있습니다.");
			}else {
				// insert 쿼리 성공
				System.out.println("데이터 Insert 성공");
			}
		}
		catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		}
		catch (Exception e) {
		    System.out.println("데이터베이스 연결 에러" + e);
		} 
		finally {
			//네트워크 사용이 끝났으면 무조건 네트워크 연결을 회수 해야한다.
			//왜냐하면 네트워크는 한계자원이므로 곧 연결할 수 없게 될수도 있다.
			try {
				if (conn != null ) {
					conn.close(); 
				}
			 }
			 catch (SQLException e) {
				e.printStackTrace();
			 //데이터베이스 연결자원 회수(종료)
			}
		}
	}
}
