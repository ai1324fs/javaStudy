package oop_JDBC3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Access_student {
	static Connection conn = null; // DB를 연결해주는 클레스
	static PreparedStatement pstmt = null; // 명령 클레스, sql => insert, delete, select, update
	static ResultSet rs = null;//결과 저장 출력 클래스

	public static void DBaccessProcess() {
	String driver = "oracle.jdbc.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String id = "kim"; // 계정 
	String pw = "1234";//비밀번호
	
		try {
			Class.forName(driver);
			System.out.println("드라이버 연결에 성공하였습니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 연결에 실패하였습니다.");
		} 
		
		try {
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("사용자 인증에 성공하였습니다.");
		} catch (SQLException e) {
			System.out.println("사용자 인증에 실패하였습니다.");
		} 
	
	}
}
