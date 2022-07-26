package practice;

import java.sql.SQLException;
import java.util.Scanner;

public class Delete extends Access implements printProcess{
	
	static Scanner sc = new Scanner(System.in);
	private static String mem_ID;
	private static String mem_pw;
	private static String mem_name;
	private static String mem_gender;
	private static String mem_age;
	private static String mem_propertym;
	private static String mem_paym;
	private static Double mem_height;
	private static Double mem_weight;
	private static String mem_exercise;
	private static String mem_drink;
	private static String mem_smoking;

	public static void main(String[] args) {	}
	
	public void delete_accessProcess() {
		DBaccessProcess();
		
		//데이터 삭제 코드
		System.out.println("회원 정보 삭제");
		try {
			System.out.println("삭제할 ID를 입력하세요");
			mem_ID = sc.next();			
		}catch(Exception e) {
			System.out.println("ID가 틀렸습니다.");
		}
	
		String sql = "delete from marry where mem_ID = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mem_ID);
			pstmt.executeUpdate();
			System.out.println("회원 정보 삭제");
		} catch(SQLException e) {
			System.out.println("회원 정보 삭제 실패");
			e.printStackTrace();
		}
		
	}

	@Override
	public void insert_accessProcess() {	}

	@Override
		public void update_accessProcess() {	}

	@Override
	public void login_accessProcess() {	}

	@Override
	public void select_accessProcess() {	}

	@Override
	public void select_M_accessProcess() {	}

	@Override
	public void select_F_accessProcess() {	}
	
}
