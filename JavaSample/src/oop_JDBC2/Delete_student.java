package oop_JDBC2;

import java.sql.SQLException;
import java.util.Scanner;

public class Delete_student extends Access_student {

	
	private static int stu_no;
	private static String stu_name;
	private static String stu_dept;
	private static int stu_grade;
	private static String stu_class;
	private static String stu_gender;
	private static double stu_height;
	private static double stu_weight;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		Access_student as = new Access_student();
		PrintTable_student ps = new PrintTable_student();
		
		as.accessProcess();
		
		//4.데이터 입력 루틴
		System.out.println("-----------------학생 정보 입력-----------------");
		try {
		System.out.println("학번을 입력하시오.");
		stu_no = sc.nextInt();
		} catch(Exception e) {
			System.out.println("데이터가 정수형이 아닙니다. 확인 바랍니다.");
		}
		
										//오라클의 데이터와 순서와 변수(이름)가 같아야함
		String sql = "delete from student where stu_no = ?";
		
		
		try {
			pstmt = conn.prepareStatement(sql);
			//DB에 저장하는 루틴
			pstmt.setInt(1, stu_no);
			
			
			pstmt.executeUpdate(); //-> rs는 굳이 필요 없음
			System.out.println("데이터 삭제를 성공하였습니다.");
		} catch (SQLException e) {
			System.out.println("데이터 삭제를 실패하였습니다.");
			e.printStackTrace();
		}
		
		ps.printTablePorcess();
		
		
	}

}
