package oop_JDBC2;

import java.sql.SQLException;
import java.util.Scanner;

public class Insert_student extends Access_student {

	
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
		
		PrintTable_student ps = new PrintTable_student();
		Access_student as = new Access_student();
		
		as.accessProcess();
		
		//4.데이터 입력 루틴
		System.out.println("-----------------학생 정보 입력-----------------");
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
			System.out.println("학년을 입력하시오.");
			stu_grade = sc.nextInt();
		} catch(Exception e) {
			System.out.println("데이터가 정수형이 아닙니다. 확인 바랍니다.");
		}
		try {
			System.out.println("반을 입력하시오.");
			stu_class = sc.next();
		} catch(Exception e) {
			System.out.println("데이터가 문자열이 아닙니다. 확인 바랍니다.");
		}
		try {
			System.out.println("성별을 입력하시오.");
			stu_gender = sc.next();
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
		String sql = "insert into student(stu_no, stu_name, stu_dept, stu_grade, stu_class, stu_gender, stu_height, stu_weight)"
				 + "values(?, ?, ?, ?, ?, ?, ?, ?)";
		
		
		try {
			pstmt = conn.prepareStatement(sql);
			//DB에 저장하는 루틴 / ?하나당 하나씩 순서를 맞춰서 입력할 것
			pstmt.setInt(1, stu_no);
			pstmt.setString(2, stu_name);
			pstmt.setString(3, stu_dept);
			pstmt.setInt(4, stu_grade);
			pstmt.setString(5, stu_class);
			pstmt.setString(6, stu_gender);
			pstmt.setDouble(7, stu_height);
			pstmt.setDouble(8, stu_weight);
			
			
			pstmt.executeUpdate(); //-> rs는 굳이 필요 없음
			System.out.println("데이터 입력을 성공하였습니다.");
		} catch (SQLException e) {
			System.out.println("데이터 입력을 실패하였습니다.");
			e.printStackTrace();
		}
		
		ps.printTablePorcess();
		
	}

}
