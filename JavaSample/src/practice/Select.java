package practice;

import java.sql.SQLException;

public class Select extends Access implements printProcess{
	public static void main(String[] args) {		}
	// 관리자 권한 조회
	@Override
	public void select_accessProcess() {
		DBaccessProcess();
		
		String sql = "select * from marry order by mem_ID";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("데이터 조회를 성공하였습니다.");
		} catch (SQLException e) {
			System.out.println("데이터 조회를 실패하였습니다.");
			e.printStackTrace(); // 오류 수집
		}
		//결과값 출력
		System.out.println("---------------------------결혼 정보 시스템-----------------------------------------------------------");
		System.out.println("ID\tPW\t이름\t성별\t나이\t재산\t연봉\t키\t몸무게\t운동\t음주\t흡연");
		System.out.println("--------------------------------------------------------------------------------------------------");
		
		try {
			while(rs.next()) {
				String mem_ID = rs.getString(1);
				String mem_pw = rs.getString(2);
			    String mem_name = rs.getString(3);
			    String mem_gender = rs.getString(4);
			    String mem_age = rs.getString(5);
			    String mem_propertym = rs.getString(6);
			    String mem_paym = rs.getString(7); 
			    Double mem_height = rs.getDouble(8);
			    Double mem_weight = rs.getDouble(9); 
			    String mem_exercise = rs.getString(10);
			    String mem_drink = rs.getString(11);
			    String mem_smoking = rs.getString(12);

			   System.out.println(mem_ID+"\t"+mem_pw+"\t"+mem_name+"\t"+mem_gender+"\t"+mem_age+"\t"+mem_propertym+"\t"+mem_paym+"\t"+mem_height+"\t"+mem_weight+"\t"+mem_exercise+"\t"+mem_drink+"\t"+mem_smoking);
			}
			System.out.println("-------------------------------------------------------------------------------------------------");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) { rs.close(); }
				if(pstmt != null) { pstmt.close(); }
				if(conn != null) { conn.close(); }
				System.out.println("데이터베이스 객체를 닫는데 성공하였습니다.");
				
			}catch(Exception e) {
				System.out.println("데이터베이스 객체를 닫는데 실패하였습니다.");
			}
		}
			}
	
	
	
	//남자 등급 조회
	@Override
	public void select_M_accessProcess() {
		DBaccessProcess();
	
		String sql = 
				"select mem_name, mem_gender, mem_age, mem_exercise, mem_drink, mem_smoking, "
				+ "    (case "
				+ "    when mem_propertym >= 500 then 'S급' "
				+ "    when mem_propertym between 300 and 499 then 'A급' "
				+ "    when mem_propertym between 200 and 299 then 'B급' "
				+ "    when mem_propertym between 100 and 199 then 'C급' "
				+ "    else 'D급' "
				+ "    end )as 재산등급 ,"
				+ "    (case "
				+ "    when mem_paym >= 500 then 'S급' "
				+ "    when mem_paym between 300 and 499 then 'A급' "
				+ "    when mem_paym between 200 and 299 then 'B급' "
				+ "    when mem_paym between 100 and 199 then 'C급' "
				+ "    else 'D급' "
				+ "    end )as 연봉등급 ,"
				+ "    (case "
				+ "    when mem_height >= 183 then 'S급' "
				+ "    when mem_height between 180 and 182.99 then 'A급' "
				+ "    when mem_height between 175 and 179.99 then 'B급' "
				+ "    when mem_height between 170 and 174.99 then 'C급' "
				+ "    else 'D급' "
				+ "    end )as 키등급 "
				+ "     "
				+ "from marry where mem_gender like 'M' order by mem_ID";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("데이터 조회를 성공하였습니다.");
		} catch (SQLException e) {
			System.out.println("데이터 조회를 실패하였습니다.");
			e.printStackTrace();
		}
		System.out.println("이름\t성별\t나이\t운동여부\t음주여부\t흡연여부\t재산 등급\t연봉 등급\t키의 등급");
		
		
		try {
			while(rs.next()) {

			    String mem_name = rs.getString(1);
			    String mem_gender = rs.getString(2);
			    String mem_age = rs.getString(3);
			    String mem_exercise = rs.getString(4);
			    String mem_drink = rs.getString(5);
			    String mem_smoking = rs.getString(6);
				String 재산등급 = rs.getString(7);
				String 연봉등급 = rs.getString(8);
				String 키등급 = rs.getString(9);
				
				System.out.println(mem_name+"\t"+mem_gender+"\t"+mem_age+"\t"+mem_exercise+"\t"+재산등급+"\t"+mem_smoking+"\t"+재산등급+"\t"+연봉등급+"\t"+키등급);
			}
			System.out.println("----------------------------------------------------------------------");
		}catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) { rs.close(); }
				if(pstmt != null ) {pstmt.close(); }
				if(conn != null ) {conn.close(); }
				System.out.println("데이터베이스 객체를 닫았습니다.");
			}catch(SQLException e){
				System.out.println("데이터베이스 객체를 닫지 못했습니다.");
				e.printStackTrace();
			}
		}
		
	}
	
	
	//여자 등급 조회
	@Override
	public void select_F_accessProcess() {
		DBaccessProcess();
	
		String sql = 
				"select mem_name, mem_gender, mem_age, mem_exercise, mem_drink, mem_smoking, "
				+ "    (case "
				+ "    when mem_propertym >= 500 then 'S급' "
				+ "    when mem_propertym between 300 and 499 then 'A급' "
				+ "    when mem_propertym between 200 and 299 then 'B급' "
				+ "    when mem_propertym between 100 and 199 then 'C급' "
				+ "    else 'D급' "
				+ "    end )as 재산등급, "
				+ "    (case "
				+ "    when mem_paym >= 500 then 'S급' "
				+ "    when mem_paym between 300 and 499 then 'A급' "
				+ "    when mem_paym between 200 and 299 then 'B급' "
				+ "    when mem_paym between 100 and 199 then 'C급' "
				+ "    else 'D급' "
				+ "    end )as 연봉등급, "
				+ "        (case "
				+ "    when mem_height >= 165 then 'S급' "
				+ "    when mem_height between 160 and 164.99 then 'A급' "
				+ "    when mem_height between 155 and 159.99 then 'B급' "
				+ "    when mem_height between 150 and 154.99 then 'C급' "
				+ "    else 'D급' "
				+ "    end )as 키등급  "
				+ "     "
				+ "from marry where mem_gender like 'F' order by mem_ID";
		

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("데이터 조회를 성공하였습니다.");
		} catch (SQLException e) {
			System.out.println("데이터 조회를 실패하였습니다.");
			e.printStackTrace();
		}
		System.out.println("이름\t성별\t나이\t운동여부\t음주여부\t흡연여부\t재산 등급\t연봉 등급\t키의 등급");
		
		
		try {
			while(rs.next()) {
				String mem_name = rs.getString(1);
				String mem_gender = rs.getString(2);
				String mem_age = rs.getString(3);
				String mem_exercise = rs.getString(4);
				String mem_drink = rs.getString(5);
				String mem_smoking = rs.getString(6);
				String 재산등급 = rs.getString(7);
				String 연봉등급 = rs.getString(8);
				String 키등급 = rs.getString(9);
				
				System.out.println(mem_name+"\t"+mem_gender+"\t"+mem_age+"\t"+mem_exercise+"\t"+mem_drink+"\t"+mem_smoking+"\t"+재산등급+"\t"+연봉등급+"\t"+키등급);
			}
			System.out.println("----------------------------------------------------------------------");
		}catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) { rs.close(); }
				if(pstmt != null ) {pstmt.close(); }
				if(conn != null ) {conn.close(); }
				System.out.println("데이터베이스 객체를 닫았습니다.");
			}catch(SQLException e){
				System.out.println("데이터베이스 객체를 닫지 못했습니다.");
				e.printStackTrace();
			}
		}

	}
	@Override
	public void insert_accessProcess() {	}
	@Override
	public void update_accessProcess() {	}
	@Override
	public void delete_accessProcess() {	}
	@Override
	public void login_accessProcess() {	}
	
	}

