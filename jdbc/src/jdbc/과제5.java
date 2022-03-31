package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class 과제5 {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
		
			Class.forName("org.mariadb.jdbc.Driver");
			
	
			String url = "jdbc:mariadb://localhost:3306/GreenDB";
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
		    
			
	
			conn = DriverManager.getConnection(url, "root", "mariadb");		
			
		
			System.out.println("데이터베이스에 연결 성공");

			
		
			String sqlDelete = 
					 "DELETE FROM GreenBook";
			pstmt = conn.prepareStatement(sqlDelete);
			
		
			int updateCount =pstmt.executeUpdate();
			
			if(updateCount == 0 ) {
				
				System.out.println("데이터값에 문제가 있습니다.");
			}else {
				
				System.out.println("전체데이터 Delete 성공"  );
			}
		}
		catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		}
		catch (Exception e) {
		    System.out.println("데이터베이스 연결 에러" + e);
		} 
		finally {
		
			try {
				if (conn != null ) {
					conn.close(); 
				}
			 }
			 catch (SQLException e) {
				e.printStackTrace();
				
			}
		}
	}
}
