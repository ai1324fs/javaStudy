package oop_JDBC5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Update_student extends Access_student implements studentInterface {

	private static int stu_no;
	private static String stu_name;
	private static String stu_dept;
	private static int stu_grade;
	private static String stu_class;
	private static String stu_gender;
	private static double stu_height;
	private static double stu_weight;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {	}
	
	@Override
	public void select_accessProcess() {	}
	
	@Override
	public void insert_accessProcess() {	}
	
	@Override
	public void delete_accessPrcoess() {	}


	@Override
	public void update_accessPrcoess()  {
		DBaccessProcess();
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
		
			String sql = "update student set stu_name = ?, stu_dept = ?, stu_height = ?, stu_weight = ?"
					+"where stu_no = ?";
			
			try {
				pstmt = conn.prepareStatement(sql);
				//DB에 저장하는 루틴
 
				pstmt.setString(1, stu_name); 
				pstmt.setString(2, stu_dept); 
				pstmt.setDouble(3, stu_height);
				pstmt.setDouble(4, stu_weight); 		
				pstmt.setInt(5, stu_no);
				
				pstmt.executeUpdate();
				System.out.println("데이터 수정을 성공하였습니다.");
			} catch (SQLException e1) {
				e1.printStackTrace();
				System.out.println("데이터 수정을 실패하였습니다.");
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
		
	}
		
}
