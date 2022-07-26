package oop_JDBC2;

public class Select_student extends Access_student {

	public static void main(String[] args) {
		/*
		//학생 조회 프로그램 작성
		//1. 드라이버 로딩 - DB연결 정보
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; //oracle
			//String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe"; //loopback test
			//String url = "jdbc:oracle:thin:@210.45.23.96:1521:xe"; //공인 IP -> 집에서 개인 사설 서버 개설시 필요
			//String url = "jdbc:oracle:thin:@192.168.0.85:1521:xe"; //사설망IP
		String id = "kj"; //계정
		String pw = "1234"; //비밀번호
		//DB접속의 기본 정보
		
		//2.데이터 베이스 연결 부분
		Connection conn = null; //DB연결 클래스
		PreparedStatement pstmt = null; //명령 클래스, SQL = insert, delete, select, update... / 더 기능이 많은 statment 명령어도 있지만 보안에 취약
		ResultSet rs = null; //결과 저장, 출력 클래스
		
		try {
			Class.forName(driver);  //반드시 예외처리해야함
			System.out.println("드라이버 연결에 성공하였습니다.");
		} catch (ClassNotFoundException e) {
			//e.printStackTrace();
			System.out.println("드라이버 연결에 실패하였습니다.");
		}
		
		//3. 사용자 인증
		try {
			conn = DriverManager.getConnection(url, id, pw); //반드시 예외처리
			System.out.println("사용자 인증에 성공하였습니다.");
		} catch (SQLException e) {
			//e.printStackTrace();
			System.out.println("사용자 인증에 실패하였습니다.");
		}
		*/
		
		Access_student as = new Access_student();
		PrintTable_student ps = new PrintTable_student();
		
		as.accessProcess();
		ps.printTablePorcess();
		
		/*
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
		*/
	}

}
