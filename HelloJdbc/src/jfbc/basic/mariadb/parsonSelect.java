package jfbc.basic.mariadb;

import java.sql.*;

public class parsonSelect {

	public static void main(String[] args) {
		//null Pointer Exception 조심
		Connection conn = null;
	    Statement stmt = null;
	    ResultSet rs = null; // select
		
		try {
			//필요할 때 클레스를 불러오는 메소드
			Class.forName("org.mariadb.jdbc.Driver");
			
			//연결할 주소 : url, db 사용가능한 유저 :userId, dbuser인지 확인 : userPassword
			//jdbc:DBMS이름 : 네트워크 프로토콜
			//예) jdbc:mysql : mysql 데이터베이스를 jdbc방식으로 연결한다.
			//jdbc:mysql://네트워크주소:포트번호/작업할데이터베이스명
			String url = "jdbc:mariadb://localhost:3306/springs";
		
			String userID = "root"; //데이터베이스 id
			String userPassword = "mariadb"; //db계정 패스워드
			
		   
			//DriverManager 클래스는 데이터베이스서버에서 접속하기 위한 기능을 가진 클래스
			//getConnection() :DriverManager에서 db서버에 연결해서 앞으로 작업할 Connection 객체를 반환한다.
			//내부에 복작한 작업은 대신해주므로 우리는 연결 객체만 신경쓰면된다.
			conn = DriverManager.getConnection(url, "root", "mariadb");		
			
			//잘연결 됨
			System.out.println("데이터베이스에 연결 성공");
			
			/////////////////////////////////////////////////////////////////////////////////////////
			//sql select 연습
			String selectSql = "SELECT name, age, birth FROM parson";
			
			// 일반적인 결과셋을 리턴하는 select구문에 많이 사용하는 빈트럭같은 객체
			stmt = conn.createStatement(); // 빈트럭을 준비해라
			
			//트럭에 selectSql이라는 짐을 실어 mariadb로 보냄
			//mariadb는 select구문이라로 결과레코드 집합이 나오는 것을 안다. 그래서 그결과 집합을 다시 자바로 실어보낸다.
			rs = stmt.executeQuery(selectSql); 
			
            //결과값 출력
			//한자료씩 처리하다가 더 이상 자료가 없으면 false(=자료없음)로 리턴
			//다음자료가 있는가 rs.next() : 있으면 true 없으면 false
			while (rs.next()) {
				String name = rs.getString(1); // 가져올 데이터 컬럼이름(sql관점)
				String age = rs.getString(2);
				String birth = rs.getString(3);
				
				System.out.println("이름 : " + name);
				System.out.println("나이 : " + age);
				System.out.println("생년월일 : " + birth);
				System.out.println("");
			}
				
		}
		catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		}
		catch (Exception e) {
		    System.out.println("데이터베이스 연결 에러" + e);
		} 
		finally {
			//네트워크 사용이끝났으면 무조건 네트워크 연결을 회수 해야한다.
			//왜냐하면 네트워크는 한계자원이므로 곧 연결할 수 없게 될수도 있다.
			try {
				if (conn != null ) {
					conn.close(); //데이터베이스 연결자원 회수(종료)
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
