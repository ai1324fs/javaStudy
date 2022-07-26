package practice;

import java.sql.SQLException;
import java.util.Scanner;

public class Update extends Access implements printProcess{
static Scanner sc = new Scanner(System.in);
	
private static String ID;
private static String 나이;
private static String 재산;
private static String 연봉;
private static Double 키;
private static Double 몸무게;
private static String 운동;
private static String 음주;
private static String 흡연;
	
	public static void main(String[] args) {	}
	
	public void update_accessProcess() {
		DBaccessProcess();
		System.out.println("회원 정보 수정");
		try {
			System.out.println("회원 ID 입력");
			ID = sc.next();
		} catch(Exception e) {
			System.out.println("ID를 잘못 입력하셨습니다.");
		}
		try {
			System.out.println("나이 입력");
			나이 = sc.next();
		} catch(Exception e) {
			System.out.println("나이를 잘못 입력하셨습니다.");
		}
		try {
			System.out.println("재산 입력");
			재산 = sc.next();
		} catch(Exception e) {
			System.out.println("재산을 잘못 입력하셨습니다.");
		}
		try {
			System.out.println("연봉 입력");
			연봉 = sc.next();
		} catch(Exception e) {
			System.out.println("연봉을 잘못 입력하셨습니다.");
		}
		try {
			System.out.println("키 입력");
			키 = sc.nextDouble();
		} catch(Exception e) {
			System.out.println("키를 잘못 입력하셨습니다.");
		}
		try {
			System.out.println("몸무게 입력");
			몸무게 = sc.nextDouble();
		} catch(Exception e) {
			System.out.println("ID를 잘못 입력하셨습니다.");
		}
		try {
			System.out.println("운동여부 입력");
			운동 = sc.next();
		} catch(Exception e) {
			System.out.println("운동여부를 잘못 입력하셨습니다.");
		}
		try {
			System.out.println("음주여부 입력");
			음주 = sc.next();
		} catch(Exception e) {
			System.out.println("음주여부를 잘못 입력하셨습니다.");
		}
		try {
			System.out.println("흡연여부 입력");
			흡연 = sc.next();
		} catch(Exception e) {
			System.out.println("흡연여부를 잘못 입력하셨습니다.");
		}
		
			String sql = "update marry set 나이 = ?, 재산 = ?, 연봉 = ?, 키 = ?, 몸무게 = ?, 운동여부 = ?, 음주여부 = ?, 흡연여부 = ?"
					+ "where ID = ?";
			try {
				pstmt = conn.prepareStatement(sql);
				//DB에 저장하는 루틴
				pstmt.setString(1, 나이);	
				pstmt.setString(2, 재산);
				pstmt.setString(3, 연봉);
				pstmt.setDouble(4, 키);	
				pstmt.setDouble(5, 몸무게);
				pstmt.setString(6, 운동);
				pstmt.setString(7, 음주);
				pstmt.setString(8, 흡연);
				pstmt.setString(9, ID);	
				
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
