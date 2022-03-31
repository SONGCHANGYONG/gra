package jdbc.basic.mariadb;

import java.sql.*;

public class ParsonUpdate {

	public static void main(String[] args) {
		// null Pointer Exception 조심
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			//필요할때 클레스를 불러오는 메소드
			Class.forName("org.mariadb.jdbc.Driver");
			
			//연결할 주소 : uurll, db 사용사능한 유저 :userId, dbuser인지 확인 : userPassword
			//jdbc:DBMS이름 : 네트워크 프로토콜
			//예) jdbc:mysql : mysql 데이터베이스를 jdbc방식으로 연결한다.
			//jdbc:mysql://네트워크주소:포트번호/작업할 데이터베이스명
			String url = "jdbc:mariadb://localhost:3306/javastudy";
			String userID = "root"; //데이터베이스 id
			String userPassword = "mariadb"; //db계정 패스워드
			String dbtype = "mariadb";
			String ip = "localhost";
			
		    String jdbcMultiStr =
		    		"""
		    		jdbc:%s://%s:%s/%s
		    		""".formatted(
		    				"dbtype",
		    				"ip",
		    				"3306",
		    				"javastudy").replaceAll("(\r|\n|\r\n|\n\r)","");
		    
			
			//DriverManager 클래스는 데이터베이스서버에서 접속하기 위한 기능을 가진 클래스
			//getConnection() :DriverManager에서 db서버에 연결해서 앞으로 작업할 Connection 객체를 반환한다.
			//내부에 복작한 작업은 대신해주므로 우리는 연결 객체만 신경쓰면된다.
			conn = DriverManager.getConnection(url, "root", "mariadb");		
			
			//잘연결 됨
			System.out.println("데이터베이스에 연결 성공");

			
			//////////////////////////////////////////////////////////////////////////////////////////
			// sql데이터 수정 (=update)
			//PreparedStatement형태의 명령문
			String SqlUpdate =
					"UPDATE user SET " +
					"   dept_cd = ?, phone = ?, address = ? " +
			        "WHERE name = ? AND Dept_cd =?; ";
			pstmt = conn.prepareStatement(SqlUpdate);
			
			int index = 1;// sqlUpdate 질의 문자열의 컬럼의 위치를 나타냄
			
		    ////////////////////////////데이터 업데이트 파라미터 설정
			// 첫번째 칼럼인 dept_cd에 값대입
			pstmt.setString(index++, "A");
			
			// 두번쨰 칼럼인 phone에 값대입
			pstmt.setString(index++, "02187654321");
			
			// 세번쨰 칼럼인 address에 값대입
			pstmt.setString(index++, "울릉도");
			
			
			//////////////////////검색할 파라미터
			// 조건 컬럼인 name컬럼에 값 입력
			pstmt.setString(index++, "홍길동");
			
            // 조건컬럼 dept_cd컬럼에 값입력
			pstmt.setString(index++, "B");
			
			// mysql에 sqlInsert SQL 명령을 실행
			// updatecount = 쿼리수행결과 변경된 수
			// 실패시 catch에 에러전송
			int updateCount =pstmt.executeUpdate();
			
			if(updateCount == 0 ) {
				// insert쿼리 문제있음
				System.out.println("데이터값에 문제가 있습니다.");
			}else {
				// insert 쿼리 성공
				System.out.println("데이터 Update 성공" +
				", 변경한 갯수 = " + updateCount );
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
					conn.close(); //데이터베이스 연결자원 회수(종료)
				}
			 }
			 catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
