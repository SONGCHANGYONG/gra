//java.sql의 모든 라이브러리를 가져와라
import java.sql.*;

public class helloJdbc {

	public static void main(String[] args) {
		// Connection 객체를 자동완성으로 import 할 때는 com.mysql.connection 이 아닌
		// java 표준인 java.sql.Connection 클래스를 import 해야 한다.
		Connection conn = null;
		try {
			// 1. 드라이버 로딩
			// 드라이버 인터페이스를 구현한 클래스를 로딩
			// mysql, oracle 등 각 벤더사 마다 클래스 이름이 다르다.
			// mysql 은 "com.mysql.jdbc.Driver"이며, 이는 외우는 것이 아니라 구글링하면 된다.
			// 참고로 이전에 연동했던 jar 파일을 보면 com.mysql.jdbc 패키지에 Driver 라는 클래스가 있다.
			Class.forName("org.mariadb.jdbc.Driver");
			
			// 2. 연결하기
			// 드라이버 매니저에게 Connection 객체를 달라고 요청한다.
			// Connection 을 얻기 위해 필요한 url 역시, 벤더사마다 다르다.
			// mysql 은 "jdbc:mysql://localhost/사용할 db 이름" 이다.
			
			String url = "jdbc:mysql://localhost/green";
			// @param getConnection(url, userName, password);
			// @return Connection
			conn = DriverManager.getConnection(url, "root", "mariadb");
			System.out.println("연결 성공");
			
		}
		catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} 
		catch (SQLException e) {
			System.out.println("에러: " + e);
		} 
		finally {
			try {
				if (conn != null && !conn.isClosed()) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}