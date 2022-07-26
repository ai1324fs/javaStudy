package oop_JDBC2;

import java.sql.SQLException;

public class PrintTable_student extends Access_student {

	void printTablePorcess () {
		//4.명령 실행
		String sql = "select * from student";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("데이터 조회를 성공하였습니다.");
		} catch (SQLException e) {
			System.out.println("데이터 조회를 실패하였습니다.");
			//e.printStackTrace();
		}
		
		//5.결과 출력
		System.out.println("---------------------------학생 정보 시스템-------------------------------");
		System.out.println("   학번\t\t 이름\t학과\t학년\t반\t성별\t키\t몸무게");
		System.out.println("----------------------------------------------------------------------");
		
		try {
			while(rs.next()) {
				int no = rs.getInt(1); //stu_no 
			    String name = rs.getString(2); //stu_name
			    String dept = rs.getString(3); //stu_dept
			    int grade = rs.getInt(4); //stu_grade
			    String stu_class = rs.getString(5); //stu_class
			    String gender = rs.getString(6); //stu_gender
			    double height = rs.getDouble(7); //stu_height
			    double weight = rs.getDouble(8); //stu_weight
				
			    
			    System.out.println(no+"\t"+name+"\t"+dept+"\t"+grade+"\t"+stu_class+"\t"+gender+"\t"+height+"\t"+weight);
			}
			System.out.println("----------------------------------------------------------------------");
		} catch (SQLException e) {
			//e.printStackTrace();
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
