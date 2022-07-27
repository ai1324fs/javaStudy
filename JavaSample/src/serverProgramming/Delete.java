package serverProgramming;

import java.sql.SQLException;
import java.util.Scanner;

public class Delete extends Access implements printProcess{
	
	static Scanner sc = new Scanner(System.in);
	private static String ID;
	private static String PW;
	private static String 이름;
	private static String 성별;
	private static String 나이;
	private static String 재산;
	private static String 연봉;
	private static Double 키;
	private static Double 몸무게;
	private static String 운동;
	private static String 음주;
	private static String 흡연;

	public static void main(String[] args) {	}
	
	public void delete_accessProcess() {
		DBaccessProcess();
		
		//데이터 삭제 코드
		System.out.println("회원 정보 삭제");
		try {
			System.out.println("삭제할 ID를 입력하세요");
			ID = sc.next();			
		}catch(Exception e) {
			System.out.println("ID가 틀렸습니다.");
		}
	
		String sql = "delete from marry where ID = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ID);
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
