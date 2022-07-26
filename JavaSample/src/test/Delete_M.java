package test;

import java.sql.SQLException;
import java.util.Scanner;

public class Delete_M extends Access_M implements SpecData_M  {

	static Scanner sc = new Scanner(System.in);
	
	private static String mem_no;
	private static String mem_pw;
	private static String mem_name;
	private static String mem_gender;
	private static int mem_propertym;
	private static double mem_height;
	private static double mem_weight;
	private static int mem_age;
	private static int mem_paym;
	private static String mem_exercise;
	private static String mem_drink;
	private static String mem_smoking;

	public static void main(String[] args) {
				
	}

	@Override
	public void delete_accessProcess() {
		DBaccessProcess();
		
		//데이터 삭제 루틴
				System.out.println("-----------------회원 정보 삭제-----------------");
				try {
				System.out.println("회원번호를 입력하시오.");
				mem_no = sc.next();
				} catch(Exception e) {
					System.out.println("데이터가 정수형이 아닙니다. 확인 바랍니다.");
				}
				
				//오라클의 데이터와 순서와 변수(이름)가 같아야함
				String sql = "delete from member where mem_no = ?";				
				
				try {
					pstmt = conn.prepareStatement(sql);
					//DB에 저장하는 루틴
					pstmt.setString(1, mem_no);
					
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
	@Override
	public void insert_accessProcess_C() {    }
	@Override
	public void join_accessProcess() {       }
}
