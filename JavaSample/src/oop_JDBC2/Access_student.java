package oop_JDBC2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Access_student {

	static Connection conn = null; //DB연결 클래스
	static PreparedStatement pstmt = null; //명령 클래스, SQL = insert, delete, select, update... / 더 기능이 많은 statment 명령어도 있지만 보안에 취약
	static ResultSet rs = null; //결과 저장, 출력 클래스
	
	void accessProcess() {
		//학생 입력 프로그램 작성
		//1. 드라이버 로딩 - DB연결 정보
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "kj"; //계정
		String pw = "1234"; //비밀번호
		//DB접속의 기본 정보
		
		//2.데이터 베이스 연결 부분
		
		
		try {
			Class.forName(driver);  //반드시 예외처리해야함
			System.out.println("드라이버 연결에 성공하였습니다.");
		} catch (ClassNotFoundException e) {
			//e.printStackTrace();
			System.out.println("드라이버 연결에 실패하였습니다.");
		}
		
		//3. 사용자 인증
		try {
			conn = DriverManager.getConnection(url, id, pw); //반드시 예외처리
			System.out.println("사용자 인증에 성공하였습니다.");
		} catch (SQLException e) {
			//e.printStackTrace();
			System.out.println("사용자 인증에 실패하였습니다.");
		}

	}

}
