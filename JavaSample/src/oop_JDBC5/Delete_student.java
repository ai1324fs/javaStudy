package oop_JDBC5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete_student extends Access_student implements studentInterface {
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

	public void select_accessProcess() {	}
	
	public void insert_accessProcess() {	}
	
	public void update_accessPrcoess() {	}
	
	public void delete_accessPrcoess() {
		DBaccessProcess();
		//4.데이터 입력 루틴	
			System.out.println("------- 학생 정보 입력 -------");
			
			try {
			System.out.println("학번을 입력하시오.");
					stu_no = sc.nextInt();  
				}catch(Exception e) {
					System.out.println("데이터가 정수형이 아닙니다. 확인 바랍니다.");
				}
			
			//delete from student where stu_no = 20153075
			String sql = "delete from student where stu_no = ?";
			
			try {
				pstmt = conn.prepareStatement(sql);
				//DB에 저장하는 루틴
  				pstmt.setInt(1, stu_no);
				
				pstmt.executeUpdate();
				System.out.println("데이터 삭제를 성공하였습니다.");
			} catch (SQLException e1) {
				e1.printStackTrace();
				System.out.println("데이터 삭제를 실패하였습니다.");
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
