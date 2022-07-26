package oop_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class select_student {

	public static void main(String[] args) {
		//학생 정보 조회 프로그램 작성
		//1. 드라이버 로딩 : DB와의 연결 정보 
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";//orcl
		String id = "kim"; // 계정 
		String pw = "1234";//비밀번호
		//2. 데이터 베이스 연결 부분
		Connection conn = null; // DB를 연결해주는 클레스
		PreparedStatement pstmt = null; // 명령 클레스, sql => insert, delete, select, update
		ResultSet rs = null;//결과 저장 출력 클래스
		
		
		
			try {
				Class.forName(driver);
				System.out.println("드라이버 연결에 성공하였습니다.");
			} catch (ClassNotFoundException e) {
				//e.printStackTrace();
				System.out.println("드라이버 연결에 실패하였습니다.");
			} 
		//3. 사용자 인증
			
			try {
				conn = DriverManager.getConnection(url, id, pw);
				System.out.println("사용자 인증에 성공하였습니다.");
			} catch (SQLException e) {
				System.out.println("사용자 인증에 실패하였습니다.");
			} 
			//4. 명령 실행
			String sql = "select * from student";
			
			try {
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				System.out.println("데이터 조회를 성공하였습니다.");
			} catch (SQLException e) {
				System.out.println("데이터 조회를 실패하였습니다.");
			}
			
			System.out.println("------------------------- 학생 정보 시스템 ------------------------------");
			System.out.println("학번" + "\t" + "\t" + "이름" + "\t" + "학과" + "\t" + "학년" + "\t" + "반" + "\t" + "성별" + "\t" + "키" + "\t" + "몸무게" );
			System.out.println("---------------------------------------------------------------------");
			
			
			// 5. 결과 출력
			try {
				while(rs.next()) {
					int no = rs.getInt(1); // stu_no
					String name = rs.getString(2); //stu_name
				    String dept = rs.getString(3); //stu_dept
				    int grade = rs.getInt(4);// stu_grade
				    String Class = rs.getString(5); //stu_class
				    String gender = rs.getString(6); // stu_gender
				    int heiht = rs.getInt(7); // stu_heiht
				    int weight = rs.getInt(8); // stu_weight
					
					System.out.println(no + "\t" + name + "\t" + dept + "\t"  + grade + "\t" + Class + "\t" + gender + "\t" + heiht + "\t" + weight);
				}
				System.out.println("---------------------------------------------------------------------");
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
				if(rs != null) { rs.close(); }
				if(pstmt !=null) { pstmt.close(); }
				if(conn != null) { conn.close(); }
				System.out.println("데아터베이스 객체를 닫는데 성공 하였습니다.");
				}catch(Exception e) {
					System.out.println("데이터베이스 객체를 닫는데 실패 하였습니다.");
				}
				}
			
	}

}
