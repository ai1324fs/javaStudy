package oop_JDBC3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert_student extends Access_student {
	static Scanner sc = new Scanner(System.in);
	private static int stu_no;
	private static String stu_name;
	private static String stu_dept;
	private static int stu_grade;
	private static String stu_class;
	private static String stu_gender;
	private static double stu_height;
	private static double stu_weight; 

	public static void main(String[] args) {	}
	
		public void insert_accessPrcoess() {
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
			
			
	}

}
