package marry.copy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.ResultSet;

public class Access{

	public static Connection Connection= null;
	public static PreparedStatement PreparedStatement = null;
	static Scanner scan = new Scanner(System.in);
	static ResultSet ResultSet = null;

	public static void DBaccessProcess() {
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "kim3";
		String pw = "1234";
		
		try {
			Class.forName(driver);
			//System.out.println("driver 연결에 성공하였습니다.");
			//System.out.println("DBaccessProcess에 접근완료");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("driver 연결에 실패하였습니다.");
		}
		
		try {
			Connection = DriverManager.getConnection(url, id, pw);
			//System.out.println("DB사용자 인증에 성공하였습니다.");
		} catch (SQLException e) {
			System.out.println("DB사용자 인증에 실패하였습니다.");
			e.printStackTrace();
		}
	}
	public static void DBaccessClose() {
		try {
			if(ResultSet != null){ResultSet.close();}
			if(PreparedStatement != null) {PreparedStatement.close();}
			if(Connection != null) {Connection.close();}
			System.out.println("데이터베이스를 모두 불러왔습니다. 객체를 닫는데 성공 하였습니다. 종료합니다.");
			
		} catch (SQLException e) {
			System.out.println("데이터베이스를 모두 불러왔습니다. 객체를 닫는데 실패 하였습니다. 종료합니다.");
			e.printStackTrace();
		}
		
	}
	
}
