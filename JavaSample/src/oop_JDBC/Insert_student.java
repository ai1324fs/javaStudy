package oop_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert_student {

	private static int stu_no;
	private static String stu_name;
	private static String stu_dept;
	private static int stu_grade;
	private static String stu_class;
	private static String stu_gender;
	private static double stu_height;
	private static double stu_weight; 

	public static void main(String[] args) {
		//1. 드라이버 로딩 : DB연결정보 파악
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "hyun";//계정
		String pw = "1234";//비밀번호 
		
		//2.데이터베이스 연결 부분
		Connection conn = null;//DB연결 클래스
		PreparedStatement pstmt = null;//명령 클래스, sql => insert, delete, select, update
		ResultSet rs = null;//결과저장 출력 클래스
		Scanner sc = new Scanner(System.in);
		
			try {
				Class.forName(driver);
				System.out.println("드라이버 연결에 성공하였습니다.");
			} catch (ClassNotFoundException e) {
				//e.printStackTrace();
				System.out.println("드라이버 연결에 실패하였습니다.");
			} 
		//3.사용자 인증
			try {
				conn = DriverManager.getConnection(url, id, pw);
				System.out.println("사용자 인증에 성공하였습니다.");
			} catch (SQLException e) {
				System.out.println("사용자 인증에 실패하였습니다.");
			}
			
		//4.데이터 입력 루틴	
			System.out.println("------- 학생 정보 입력 -------");
			
			try {
			System.out.println("학번을 입력하시오.");
					stu_no = sc.nextInt();  
				}catch(Exception e) {
					System.out.println("데이터가 정수형이 아닙니다. 확인 바랍니다.");
				}
			
			try {
				System.out.println("이름을 입력하시오.");
					stu_name = sc.next();  
				}catch(Exception e) {
					System.out.println("데이터가 문자열이 아닙니다. 확인 바랍니다.");
				}
			
			try {
				System.out.println("학과명을 입력하시오.");
					stu_dept = sc.next(); 
				}catch(Exception e) {
					System.out.println("데이터가 문자열이 아닙니다. 확인 바랍니다.");
				} 
			
			try {
				System.out.println("학년을 입력하시오.");
					stu_grade = sc.nextInt();   
				}catch(Exception e) {
					System.out.println("데이터가 정수형이 아닙니다. 확인 바랍니다.");
				} 
			
			try {
				System.out.println("반을 입력하시오.");
					stu_class = sc.next();  
				}catch(Exception e) {
					System.out.println("데이터가 문자열이 아닙니다. 확인 바랍니다.");
				}
			
			try {
				System.out.println("성별을 입력하시오.");
					stu_gender = sc.next();  
				}catch(Exception e) {
					System.out.println("데이터가 문자열이 아닙니다. 확인 바랍니다.");
				}
			
			try {
				System.out.println("키(실수형)을 입력하시오.");
					stu_height = sc.nextDouble();  
				}catch(Exception e) {
					System.out.println("데이터가 실수형이 아닙니다. 확인 바랍니다.");
				}
			
			try {
				System.out.println("몸무게(실수형)을 입력하시오.");
					stu_weight = sc.nextDouble();   
				}catch(Exception e) {
					System.out.println("데이터가 실수형이 아닙니다. 확인 바랍니다.");
				}
		
			String sql = "insert into student(stu_no, stu_name, stu_dept, stu_grade, stu_class, stu_gender, stu_height, stu_weight)"
						+ "values(?, ?, ?, ?, ?, ?, ?, ?)";
			
			try {
				pstmt = conn.prepareStatement(sql);
				//DB에 저장하는 루틴
				pstmt.setInt(1, stu_no); 
				pstmt.setString(2, stu_name); 
				pstmt.setString(3, stu_dept); 
				pstmt.setInt(4, stu_grade); 
				pstmt.setString(5, stu_class); 
				pstmt.setString(6, stu_gender); 
				pstmt.setDouble(7, stu_height);
				pstmt.setDouble(8, stu_weight); 		
				
				pstmt.executeUpdate();
				System.out.println("데이터 입력을 성공하였습니다.");
			} catch (SQLException e1) {
				e1.printStackTrace();
				System.out.println("데이터 입력을 실패하였습니다.");
			}
			
		//5.명령 실행
			String sql2 = "select * from student";
			//(20131026, '옥성우2', '컴퓨터정보', 2, 'B', 'F', 172.66, 63.55);
			try {
				pstmt = conn.prepareStatement(sql2);
				rs = pstmt.executeQuery();
				System.out.println("데이터 조회를 성공하였습니다.");
			} catch (SQLException e) {
				System.out.println("데이터 조회를 실패하였습니다.");
			}
		
			//6.결과 출력
			System.out.println("-------------------- 학생 정보 시스템 --------------------------------------");
			System.out.println("학번" + "\t" +  "\t" + "이름" + "\t" + "학과" + "\t" + "학년" + "\t" + "반" + "\t" + "성별" + "\t" + "키" + "\t" + "몸무게");
			System.out.println("-------------------------------------------------------------------------");
			 
			try {
				while(rs.next()) {
					int no = rs.getInt(1);// stu_no
				    String name = rs.getString(2);// stu_name
				    String dept = rs.getString(3); // stu_dept
				    int grade = rs.getInt(4); // stu_grade
				    String Class = rs.getString(5); // stu_class
				    String gender = rs.getString(6); // stu_gender
				    int height = rs.getInt(7); // stu_height
				    int weight = rs.getInt(8); // stu_weight				
					
				    System.out.println(no + "\t" + name + "\t" + dept + "\t" + grade + "\t" + Class + "\t" + gender + "\t" + height + "\t" + weight + "\t"); 
				}
				System.out.println("--------------------------------------------------------------------");
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					if(rs != null) { rs.close(); }
					if(pstmt != null) { pstmt.close(); }
					if(conn != null) { conn.close(); }
					System.out.println("데이터베이스 객체를 닫는데 성공 하였습니다.");
				}catch(Exception e) {
					System.out.println("데이터베이스 객체를 닫는데 실패 하였습니다.");
				}
			}
			
	}

}
