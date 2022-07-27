package serverProgramming;

import java.sql.SQLException;

public class Select extends Access implements printProcess{
	public static void main(String[] args) {		}
	// 관리자 권한 조회
	@Override
	public void select_accessProcess() {
		DBaccessProcess();
		
		String sql = "select * from marry order by ID";
		
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
				String ID = rs.getString(1);
				String PW = rs.getString(2);
			    String 이름 = rs.getString(3);
			    String 성별 = rs.getString(4);
			    String 나이 = rs.getString(5);
			    String 재산 = rs.getString(6);
			    String 연봉 = rs.getString(7); 
			    Double 키 = rs.getDouble(8);
			    Double 몸무게 = rs.getDouble(9); 
			    String 운동 = rs.getString(10);
			    String 음주 = rs.getString(11);
			    String 흡연 = rs.getString(12);

			   System.out.println(ID+"\t"+PW+"\t"+이름+"\t"+성별+"\t"+나이+"\t"+재산+"\t"+연봉+"\t"+키+"\t"+몸무게+"\t"+운동+"\t"+음주+"\t"+흡연);
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
				"select 이름, 성별, 나이, 운동여부, 음주여부, 흡연여부, "
				+ "    (case "
				+ "    when 재산 >= 500 then 'S급' "
				+ "    when 재산 between 300 and 499 then 'A급' "
				+ "    when 재산 between 200 and 299 then 'B급' "
				+ "    when 재산 between 100 and 199 then 'C급' "
				+ "    else 'D급' "
				+ "    end )as 재산등급 ,"
				+ "    (case "
				+ "    when 연봉 >= 500 then 'S급' "
				+ "    when 연봉 between 300 and 499 then 'A급' "
				+ "    when 연봉 between 200 and 299 then 'B급' "
				+ "    when 연봉 between 100 and 199 then 'C급' "
				+ "    else 'D급' "
				+ "    end )as 연봉등급 ,"
				+ "    (case "
				+ "    when 키 >= 183 then 'S급' "
				+ "    when 키 between 180 and 182.99 then 'A급' "
				+ "    when 키 between 175 and 179.99 then 'B급' "
				+ "    when 키 between 170 and 174.99 then 'C급' "
				+ "    else 'D급' "
				+ "    end )as 키등급 "
				+ "     "
				+ "from marry where 성별 like 'M'";
		
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
				String 이름 = rs.getString(1);
				String 성별 = rs.getString(2);
				int 나이 = rs.getInt(3);
				String 운동 = rs.getString(4);
				String 음주 = rs.getString(5);
				String 흡연 = rs.getString(6);
				String 재산등급 = rs.getString(7);
				String 연봉등급 = rs.getString(8);
				String 키등급 = rs.getString(9);
				
				System.out.println(이름+"\t"+성별+"\t"+나이+"\t"+운동+"\t"+음주+"\t"+흡연+"\t"+재산등급+"\t"+연봉등급+"\t"+키등급);
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
				"select 이름, 성별, 나이, 운동여부, 음주여부, 흡연여부, "
				+ "    (case "
				+ "    when 재산 >= 500 then 'S급' "
				+ "    when 재산 between 300 and 499 then 'A급' "
				+ "    when 재산 between 200 and 299 then 'B급' "
				+ "    when 재산 between 100 and 199 then 'C급' "
				+ "    else 'D급' "
				+ "    end )as 재산등급, "
				+ "    (case "
				+ "    when 연봉 >= 500 then 'S급' "
				+ "    when 연봉 between 300 and 499 then 'A급' "
				+ "    when 연봉 between 200 and 299 then 'B급' "
				+ "    when 연봉 between 100 and 199 then 'C급' "
				+ "    else 'D급' "
				+ "    end )as 연봉등급, "
				+ "        (case "
				+ "    when 키 >= 165 then 'S급' "
				+ "    when 키 between 160 and 164.99 then 'A급' "
				+ "    when 키 between 155 and 159.99 then 'B급' "
				+ "    when 키 between 150 and 154.99 then 'C급' "
				+ "    else 'D급' "
				+ "    end )as 키등급  "
				+ "     "
				+ "from marry where 성별 like 'F' order by ID";
		

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
				String 이름 = rs.getString(1);
				String 성별 = rs.getString(2);
				int 나이 = rs.getInt(3);
				String 운동 = rs.getString(4);
				String 음주 = rs.getString(5);
				String 흡연 = rs.getString(6);
				String 재산등급 = rs.getString(7);
				String 연봉등급 = rs.getString(8);
				String 키등급 = rs.getString(9);
				
				System.out.println(이름+"\t"+성별+"\t"+나이+"\t"+운동+"\t"+음주+"\t"+흡연+"\t"+재산등급+"\t"+연봉등급+"\t"+키등급);
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

