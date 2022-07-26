package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Access_M {

	static Connection conn = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null; 
	
	public static void DBaccessProcess() {	
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "kim2";
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
			//e.printStackTrace();
			System.out.println("사용자 인증에 실패하였습니다.");
		}

	}

		
	}	

