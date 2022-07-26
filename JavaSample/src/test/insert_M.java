package test;

import java.sql.SQLException;
import java.util.Scanner;
 
public class insert_M  extends Access_M implements SpecData_M {
	static Scanner sc = new Scanner(System.in);
	
	private static String mem_no;
	private static String mem_name;
	private static String mem_pw;
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
	public void update_accessProcess() {	}

	@Override
	public void delete_accessProcess() {    }

	@Override
	public void insert_accessProcess_C() {   }
	
	@Override
	public void join_accessProcess() {     }
	
	@Override
	public void insert_accessProcess() {

		DBaccessProcess();
		
		//4.데이터 입력 루틴
		System.out.println("-----------------회원 정보 입력-----------------");
		try {
		System.out.println("회원번호를 입력하시오.");
			mem_no = sc.next();
		} catch(Exception e) {
			System.out.println("데이터가 정수형이 아닙니다. 확인 바랍니다.");
		}
		try {
			System.out.println("비밀번호를 입력하시오.");
			mem_pw = sc.next();
		} catch(Exception e) {
			System.out.println("데이터를 잘못 입력하셨습니다. 확인 바랍니다.");
		}
		try {
			System.out.println("이름을 입력하시오.");
			mem_name = sc.next();
		} catch(Exception e) {
			System.out.println("데이터가 문자열이 아닙니다. 확인 바랍니다.");
		}
		try {
			System.out.println("성별을 입력하시오.");
			mem_gender = sc.next();
		} catch(Exception e) {
			System.out.println("데이터가 문자열이 아닙니다. 확인 바랍니다.");
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
		String sql = "insert into member(mem_no, mem_pw, mem_name, mem_gender, mem_propertym, mem_height, mem_weight, mem_age, mem_paym, mem_exercise, mem_drink, mem_smoking)"
				 + "values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		
		try {
			pstmt = conn.prepareStatement(sql);
			//DB에 저장하는 루틴 / ?하나당 하나씩 순서를 맞춰서 입력할 것
			pstmt.setString(1, mem_no);
			pstmt.setString(2, mem_pw);
			pstmt.setString(3, mem_name);
			pstmt.setString(4, mem_gender);
			pstmt.setInt(5, mem_propertym);	
			pstmt.setDouble(6, mem_height);
			pstmt.setDouble(7, mem_weight);
			pstmt.setInt(8, mem_age);	
			pstmt.setInt(9, mem_paym);
			pstmt.setString(10, mem_exercise);
			pstmt.setString(11, mem_drink);
			pstmt.setString(12, mem_smoking);

			
			
			pstmt.executeUpdate(); 
			System.out.println("데이터 입력을 성공하였습니다.");
		} catch (SQLException e) {
			System.out.println("데이터 입력을 실패하였습니다.");
			e.printStackTrace();
		}		
		
	}
}


