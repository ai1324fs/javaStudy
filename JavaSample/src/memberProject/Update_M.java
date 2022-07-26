package memberProject;

import java.sql.SQLException;
import java.util.Scanner;

public class Update_M  extends Access_M implements SpecData_M {
	
	static Scanner sc = new Scanner(System.in);
	
	private static int mem_no;
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
	public void insert_accessProcess() {   }

	@Override
	public void update_accessProcess() {
		DBaccessProcess();
		
		//데이터 수정 루틴
		System.out.println("-----------------회원 정보 입력-----------------");
		try {
			System.out.println("회원번호를 입력하시오.");
			mem_no = sc.nextInt();
			} catch(Exception e) {
				System.out.println("데이터가 정수형이 아닙니다. 확인 바랍니다.");
			}
		try {
			System.out.println("재산(10만단위)을 입력하시오.");
			mem_propertym = sc.nextInt();
		} catch(Exception e) {
			System.out.println("데이터가 정수형이 아닙니다. 확인 바랍니다.");
		}
		try {
			System.out.println("키를 입력하시오.");
			mem_height = sc.nextDouble();
		} catch(Exception e) {
			System.out.println("데이터가 실수형이 아닙니다. 확인 바랍니다.");
		}
		try {
			System.out.println("몸무게을 입력하시오.");
			mem_weight = sc.nextDouble();
		} catch(Exception e) {
			System.out.println("데이터가 실수형이 아닙니다. 확인 바랍니다.");
		}
		try {
			System.out.println("나이를 입력하시오.");
			mem_age = sc.nextInt();
		} catch(Exception e) {
			System.out.println("데이터가 정수형이 아닙니다. 확인 바랍니다.");
		}
		try {
			System.out.println("급여(10만단위)를 입력하시오.");
			mem_paym = sc.nextInt();
		} catch(Exception e) {
			System.out.println("데이터가 정수형이 아닙니다. 확인 바랍니다.");
		}
		try {
			System.out.println("운동여부(O/X)을 입력하시오.");
			mem_exercise = sc.next();
		} catch(Exception e) {
			System.out.println("데이터가 문자열이 아닙니다. 확인 바랍니다.");
		}
		try {
			System.out.println("음주여부(O/X)을 입력하시오.");
			mem_drink  = sc.next();
		} catch(Exception e) {
			System.out.println("데이터가 문자열이 아닙니다. 확인 바랍니다.");
		}
		try {
			System.out.println("흡연여부(O/X)을 입력하시오.");
			mem_smoking  = sc.next();
		} catch(Exception e) {
			System.out.println("데이터가 문자열이 아닙니다. 확인 바랍니다.");
		}
					//오라클의 데이터와 순서와 변수(이름)가 같아야함
				String sql = "update member set mem_propertym = ?, mem_height = ?, mem_weight = ?, mem_age = ?, mem_paym = ?, mem_exercise = ?, mem_drink = ?, mem_smoking = ?" 
							+ "where mem_no = ?";
								
				try {
					pstmt = conn.prepareStatement(sql);
					//DB에 저장하는 루틴
					pstmt.setInt(1, mem_propertym);	
					pstmt.setDouble(2, mem_height);
					pstmt.setDouble(3, mem_weight);
					pstmt.setInt(4, mem_age);	
					pstmt.setInt(5, mem_paym);
					pstmt.setString(6, mem_exercise);
					pstmt.setString(7, mem_drink);
					pstmt.setString(8, mem_smoking);
					pstmt.setInt(9, mem_no);	
					
					
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
