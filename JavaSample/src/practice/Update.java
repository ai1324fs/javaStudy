package practice;

import java.sql.SQLException;
import java.util.Scanner;

public class Update extends Access implements printProcess{
static Scanner sc = new Scanner(System.in);
	




private static String mem_ID;
private static String mem_age;
private static String mem_propertym;
private static String mem_paym;
private static Double mem_height;
private static Double mem_weight;
private static String mem_exercise;
private static String mem_drink;
private static String mem_smoking;


	
	public static void main(String[] args) {	}
	
	public void update_accessProcess() {
		DBaccessProcess();
		System.out.println("회원 정보 수정");
		try {
			System.out.println("회원 ID 입력");
			mem_ID = sc.next();
		} catch(Exception e) {
			System.out.println("ID를 잘못 입력하셨습니다.");
		}
		try {
			System.out.println("나이 입력");
			mem_age = sc.next();
		} catch(Exception e) {
			System.out.println("나이를 잘못 입력하셨습니다.");
		}
		try {
			System.out.println("재산 입력");
			mem_propertym = sc.next();
		} catch(Exception e) {
			System.out.println("재산을 잘못 입력하셨습니다.");
		}
		try {
			System.out.println("연봉 입력");
			mem_paym = sc.next();
		} catch(Exception e) {
			System.out.println("연봉을 잘못 입력하셨습니다.");
		}
		try {
			System.out.println("키 입력");
			mem_height = sc.nextDouble();
		} catch(Exception e) {
			System.out.println("키를 잘못 입력하셨습니다.");
		}
		try {
			System.out.println("몸무게 입력");
			mem_weight = sc.nextDouble();
		} catch(Exception e) {
			System.out.println("ID를 잘못 입력하셨습니다.");
		}
		try {
			System.out.println("운동여부 입력");
			mem_exercise = sc.next();
		} catch(Exception e) {
			System.out.println("운동여부를 잘못 입력하셨습니다.");
		}
		try {
			System.out.println("음주여부 입력");
			mem_drink = sc.next();
		} catch(Exception e) {
			System.out.println("음주여부를 잘못 입력하셨습니다.");
		}
		try {
			System.out.println("흡연여부 입력");
			mem_smoking = sc.next();
		} catch(Exception e) {
			System.out.println("흡연여부를 잘못 입력하셨습니다.");
		}
		
			String sql = "update marry set mem_age = ?, mem_propertym = ?, mem_paym = ?, mem_height = ?, mem_weight = ?, mem_exercise = ?, mem_drink = ?, mem_smoking = ?"
					+ "where mem_ID = ?";
			try {
				pstmt = conn.prepareStatement(sql);
				//DB에 저장하는 루틴
				pstmt.setString(1, mem_age);	
				pstmt.setString(2, mem_propertym);
				pstmt.setString(3, mem_paym);
				pstmt.setDouble(4, mem_height);	
				pstmt.setDouble(5, mem_weight);
				pstmt.setString(6, mem_exercise);
				pstmt.setString(7, mem_drink);
				pstmt.setString(8, mem_smoking);
				pstmt.setString(9, mem_ID);	

				
				pstmt.executeUpdate(); 
				System.out.println("데이터 수정에 성공하였습니다.");
			} catch (SQLException e) {
				System.out.println("데이터 수정에 실패하였습니다.");
				e.printStackTrace();
			}
			
	}

	@Override
	public void insert_accessProcess() {	}

	@Override
	public void delete_accessProcess() {	}

	@Override
	public void login_accessProcess() {		}

	@Override
	public void select_accessProcess() {	}

	@Override
	public void select_M_accessProcess() {	}

	@Override
	public void select_F_accessProcess() {	}
	
}
