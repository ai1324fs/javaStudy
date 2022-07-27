package serverProgramming;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Access {
//DB 접속
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;
	
	static String ID;
	static String PW;
	static String 이름;
	static String 성별;
	static String 나이;
	static String 재산;
	static String 연봉;
	static Double 키;
	static Double 몸무게;
	static String 운동;
	static String 음주;
	static String 흡연;
	
	
	public static void DBaccessProcess() {
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "kim3";
		String pw = "1234"; 
		
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
