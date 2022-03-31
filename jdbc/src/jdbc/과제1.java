package jdbc;

import java.sql.*;


public class 과제1 {

	public static void main(String[] args) {
		
		Connection conn = null;
		
		try {
			
			Class.forName("org.mariadb.jdbc.Driver");
			
	
			String url = "jdbc:mariadb://localhost:3306/GreenDB";
			String userID = "root"; //데이터베이스 id
			String userPassword = "mariadb"; //db계정 패스워드
			String dbtype = "mariadb";
			String ip = "localhost";
			String port = "3306";
			String dbName = "GreenDB";
			
		    String jdbcMultiStr =
		    		"""
		    		jdbc:%s://%s:%s/%s
		    		""".formatted(
		    				dbtype,
		    				ip,
		    				port,
		    				dbName).replaceAll("(\r|\n|\r\n|\n\r)","");
		    
		
			conn = DriverManager.getConnection(url, "root", "mariadb");		
	
			System.out.println("# Green DB연결에 성공 하셨습니다. # ");
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
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
