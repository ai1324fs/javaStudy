package oop_JDBC4;

import java.sql.SQLException;
import java.util.Scanner;

public class Update_student  extends Access_student implements studentInterface {
	
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

	@Override
	public void insert_accessProcess() {   }

	@Override
	public void update_accessProcess() {
		DBaccessProcess();
		
		//데이터 수정 루틴
				System.out.println("-----------------학생 정보 수정-----------------");
				try {
				System.out.println("학번을 입력하시오.");
				stu_no = sc.nextInt();
				} catch(Exception e) {
					System.out.println("데이터가 정수형이 아닙니다. 확인 바랍니다.");
				}
				try {
					System.out.println("이름을 입력하시오.");
					stu_name = sc.next();
				} catch(Exception e) {
					System.out.println("데이터가 문자열이 아닙니다. 확인 바랍니다.");
				}
				try {
					System.out.println("학과를 입력하시오.");
					stu_dept = sc.next();
				} catch(Exception e) {
					System.out.println("데이터가 문자열이 아닙니다. 확인 바랍니다.");
				}
				
				try {
					System.out.println("키를 입력하시오.");
					stu_height = sc.nextDouble();
				} catch(Exception e) {
					System.out.println("데이터가 실수형이 아닙니다. 확인 바랍니다.");
				}
				try {
					System.out.println("몸무게을 입력하시오.");
					stu_weight = sc.nextDouble();
				} catch(Exception e) {
					System.out.println("데이터가 실수형이 아닙니다. 확인 바랍니다.");
				}
					//오라클의 데이터와 순서와 변수(이름)가 같아야함
				String sql = "update student set stu_name = ?, stu_dept = ?, stu_height = ?, stu_weight = ?" 
							+ "where stu_no = ?";
								
				try {
					pstmt = conn.prepareStatement(sql);
					//DB에 저장하는 루틴
					pstmt.setString(1, stu_name);
					pstmt.setString(2, stu_dept);
					pstmt.setDouble(3, stu_height);
					pstmt.setDouble(4, stu_weight);
					pstmt.setInt(5, stu_no);
								
					pstmt.executeUpdate(); 
					System.out.println("데이터 수정에 성공하였습니다.");
				} catch (SQLException e) {
					System.out.println("데이터 수정에 실패하였습니다.");
					e.printStackTrace();
				}
	}

	@Override
	public void delete_accessProcess() {	}

}
