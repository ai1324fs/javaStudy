package practice;

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
	
static String mem_ID;
static String mem_pw;
static String mem_name;
static String mem_gender;
static String mem_age;
static String mem_propertym;
static String mem_paym;
static Double mem_height;
static Double mem_weight;
static String mem_exercise;
static String mem_drink;
static String mem_smoking;
	
	
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
