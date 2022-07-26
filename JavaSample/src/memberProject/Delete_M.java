package memberProject;

import java.sql.SQLException;
import java.util.Scanner;

public class Delete_M extends Access_M implements SpecData_M  {

	static Scanner sc = new Scanner(System.in);
	
	private static int memm_no;
	private static String memm_name;
	private static String memm_gender;
	private static int memm_propertym;
	private static double memm_height;
	private static double memm_weight;
	private static int memm_age;
	private static int memm_paym;
	private static String memm_exercise;
	private static String memm_drink;
	private static String memm_smoking;

	public static void main(String[] args) {
		//깃허브 테스트 		
	}

	@Override
	public void delete_accessProcess() {
		DBaccessProcess();
		
		//데이터 삭제 루틴
				System.out.println("-----------------회원 정보 삭제-----------------");
				try {
				System.out.println("회원번호를 입력하시오.");
				memm_no = sc.nextInt();
				} catch(Exception e) {
					System.out.println("데이터가 정수형이 아닙니다. 확인 바랍니다.");
				}
				
				//오라클의 데이터와 순서와 변수(이름)가 같아야함
				String sql = "delete from member where mem_no = ?";				
				
				try {
					pstmt = conn.prepareStatement(sql);
					//DB에 저장하는 루틴
					pstmt.setInt(1, memm_no);					
					
					pstmt.executeUpdate(); 
					System.out.println("데이터 삭제를 성공하였습니다.");
				} catch (SQLException e) {
					System.out.println("데이터 삭제를 실패하였습니다.");
					e.printStackTrace();
				}
		
	}

	@Override
	public void insert_accessProcess() {    }
	@Override
	public void update_accessProcess() {    }
}
