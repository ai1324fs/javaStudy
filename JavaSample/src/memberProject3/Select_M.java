package memberProject3;

import java.sql.SQLException;

public class Select_M extends Access_M implements printProcess {

	public static void main(String[] args) {
		
	}

	@Override
	public void select_accessProcess() {
		
		DBaccessProcess();

		//4.명령 실행
		String sql = "select * from member order by mem_no";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("데이터 조회를 성공하였습니다.");
		} catch (SQLException e) {
			System.out.println("데이터 조회를 실패하였습니다.");
			//e.printStackTrace();
		}
		
		//5.결과 출력
		System.out.println("---------------------------결혼 정보 시스템----------------------------------------------------------");
		System.out.println("회원번호 이름\t성별\t재산\t키\t몸무게\t나이\t급여\t운동여부\t음주여부\t흡연여부");
		System.out.println("--------------------------------------------------------------------------------------------------");
		
		try {
			while(rs.next()) {
				int no = rs.getInt(1);
			    String name = rs.getString(2);
			    String gender = rs.getString(3);
				int propertym = rs.getInt(4);
			    double height = rs.getDouble(5);
			    double weight = rs.getDouble(6); 
			    int age = rs.getInt(7);
			    int paym = rs.getInt(8); 
			    String exercise = rs.getString(9);
			    String drink = rs.getString(10);
			    String smoking = rs.getString(11);
			  
				
			    
			   System.out.println(no+"\t"+name+"\t"+gender+"\t"+propertym+"\t"+height+"\t"+weight+"\t"+age+"\t"+paym+"\t"+exercise+"\t"+drink+"\t"+smoking);
			}
			System.out.println("----------------------------------------------------------------------");
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

	
}
