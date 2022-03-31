package jdbc;

import java.sql.*;

public class 과제2 {

	public static void main(String[] args) {
	
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String url = "jdbc:mariadb://localhost:3306/greendb";
		String userID = "root";
		String userPassword = "mariadb";

		try {

			Class.forName("org.mariadb.jdbc.Driver");

			conn = DriverManager.getConnection(url, userID, userPassword);
			
			System.out.println("# Green DB연결에 성공 하셨습니다. #");
			
			stmt =conn.createStatement();
			StringBuilder sb = new StringBuilder();
			String sql; 
			
			sql = sb.append("CREATE table if not exists GreenBook(")
					.append("boNo int primary key AUTO_INCREMENT not null,")
					.append("writer varchar(20) not null,")
					.append("password varchar(20) not null,")
					.append("email varchar(80),")
					.append("homepage varchar(80),")
					.append("content varchar(2000) not null,")
					.append("writeDate datetime not null")
					.append(");").toString();
			
			stmt.execute(sql);
			System.out.println(
					"/////////////////////////\r\n"
					+ "GuestBook 테이블 생성 성공!!\r\n"
					+ "/////////////////////////");
		} 
		catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		} 
		catch (Exception e) {
			e.printStackTrace();
		} 
		finally {
			try {
				if ((conn != null) && (conn.isClosed())) {

				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
