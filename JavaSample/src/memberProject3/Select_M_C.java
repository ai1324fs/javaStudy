package memberProject3;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select_M_C extends Access_M implements printProcess_C{
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;
	
	@Override
	public void select_C_accessProcess() {
		DBaccessProcess();
		
		//4. 고객등급 명령실행
		String sql = "select mem_no, mem_name, mem_exercise, mem_drink, mem_smoking, "
				+ "    (case "
				+ "    when mem_propertym >= 500 then 's급' "
				+ "    when mem_propertym between 300 and 499 then 'A급' "
				+ "    when mem_propertym between 200 and 299 then 'B급' "
				+ "    when mem_propertym between 100 and 199 then 'C급' "
				+ "    else 'D급' "
				+ "    end )as 재산등급 , "
				+ "    (case "
				+ "    when mem_paym >= 500 then 's급' "
				+ "    when mem_paym between 300 and 499 then 'A급' "
				+ "    when mem_paym between 200 and 299 then 'B급' "
				+ "    when mem_paym between 100 and 199 then 'C급' "
				+ "    else 'D급' "
				+ "    end )as 연봉등급 , "
				+ "        (case "
				+ "    when mem_height >= 183 then 's급' "
				+ "    when mem_height between 180 and 182.99 then 'A급' "
				+ "    when mem_height between 175 and 179.99 then 'B급' "
				+ "    when mem_height between 170 and 174.99 then 'C급' "
				+ "    else 'D급' "
				+ "    end )as 키등급 "
				+ " "
				+ "     "
				+ "from member";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("데이터 조회를 성공하였습니다.");
		} catch (SQLException e) {
			System.out.println("데이터 조회를 실패하였습니다.");
			e.printStackTrace();
		}
		
		//5. 결과출력
		System.out.println("---------------------------결혼 정보 시스템----------------------------------------------------------");
		System.out.println("회원번호 이름\t성별\t재산\t키\t몸무게\t나이\t급여\t운동여부\t음주여부\t흡연여부");
		System.out.println("--------------------------------------------------------------------------------------------------");
		
		try {
			while(rs.next()) {
				int no = rs.getInt(1);
				String name = rs.getString(2);
				String gender = rs.getString(3);
				String exersice = rs.getString(4);
				String smoking = rs.getString(5);
				String 재산등급 = rs.getString(6);
				String 연봉등급 = rs.getString(7);
				String 키등급 = rs.getString(8);
				
				
				System.out.println(no+"\t"+name+"\t"+gender+"\t"+exersice+"\t"+smoking+"\t"+재산등급+"\t"+연봉등급+"\t"+키등급);
				
				
			}
			System.out.println("----------------------------------------------------------------------");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) { rs.close(); }
				if(pstmt != null ) {pstmt.close(); }
				if(conn != null ) {conn.close(); }
				System.out.println("데이터베이스 객체를 닫는데 성공하였습니다.");
			} catch (SQLException e) {
				System.out.println("데이터베이스 객체를 닫는데 실패하였습니다.");
				e.printStackTrace();
			} 
		}

		
		
	}
	
	public static void main(String[] args) {
		
	}
		
		
	
}
