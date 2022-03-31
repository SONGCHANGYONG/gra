package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class 과제4 {

	public static void main(String[] args) {
		
		Connection conn = null;
	    Statement stmt = null;
	    ResultSet rs = null;
		
		try {
			
			Class.forName("org.mariadb.jdbc.Driver");
			
			String url = "jdbc:mariadb://localhost:3306/GreenDB";
		
			String userID = "root";
			String userPassword = "mariadb";
	
			conn = DriverManager.getConnection(url, "root", "mariadb");		
		
			System.out.println("데이터베이스에 연결 성공");
			
			String selectSql = "SELECT * FROM Greenbook WHERE boNo<4 ";
			
			stmt = conn.createStatement(); 
			rs = stmt.executeQuery(selectSql); 
		
			while (rs.next()) {
				int boNo = rs.getInt(1); 
				String writer = rs.getString(2);
				String password = rs.getString(3);
				String email = rs.getString(4);
				String homepage = rs.getString(5);
				String content = rs.getString(6);
				String writeDate = rs.getString(7);
				
				System.out.println("[" + boNo + "] " + writer +": " + content + " " + writeDate );	
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
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
