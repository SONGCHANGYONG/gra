package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class 과제3 {
	

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		PreparedStatement pstmt2 = null;
		
		
		try {
			
			Class.forName("org.mariadb.jdbc.Driver");
		
			String url = "jdbc:mariadb://localhost:3306/Greendb";
			String userID = "root"; //데이터베이스 id
			String userPassword = "mariadb"; //db계정 패스워드

			
		    String jdbcMultiStr =
		    		"""
		    		jdbc:%s://%s:%s/%s
		    		""".formatted(
		    				"dbtype",
		    				"ip",
		    				"3306",
		    				"GreenDB").replaceAll("(\r|\n|\r\n|\n\r)","");
			
			conn = DriverManager.getConnection(url, "root", "mariadb");		
			
			System.out.println("# Green DB연결에 성공 하셨습니다. #");
			
			String sqlInsert = 
					"INSERT INTO GreenBook (boNo,writer,password,email,homepage,content,writeDate)" + 
					"VALUES(?,?,?,?,?,?,?);";
			
			pstmt = conn.prepareStatement(sqlInsert);
			
			 DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			 Date date = new Date();
			 
			int index = 1;
			int i = 0;
			int count = 0;
			
			pstmt.setInt(index++, i++);
			pstmt.setString(index++, "강감찬");
			pstmt.setString(index++, "5555");
			pstmt.setString(index++, "");
			pstmt.setString(index++, "");
			pstmt.setString(index++, "안녕하세요 강감찬 입니다.");
			pstmt.setString(index++, dateFormat.format(date));
			count++;
			System.out.println("[" + i + "] 게시물을 추가하였습니다.");	
			
			int updateCount =pstmt.executeUpdate();
			
			if(updateCount == 0 ) {
				
				System.out.println("데이터값에 문제가 있습니다.");
			}else {
				
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
