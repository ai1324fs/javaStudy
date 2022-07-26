package practice;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Login extends Access implements printProcess{
	static Scanner sc = new Scanner(System.in);
	Select s = new Select();
	String id = null;
	String pw = null;
	int J = 0;

//public static void main(String[] args) {	}

public void login_accessProcess() {
	DBaccessProcess();
	try {
		System.out.println("ID 입력");
		id = sc.next();
		
	}catch(Exception e) {
		System.out.println("ID를 잘못 입력하셨습니다.");
	}
	try {
		System.out.println("PW 입력");
		pw = sc.next();
	}catch(Exception e) {
		System.out.println("PW를 잘못 입력하셨습니다.");
	}
	String sql = "select * from marry where ID = '"+id+"'";// 받는값은 스캐너값으로
	
	try {
		pstmt = conn.prepareStatement(sql);
		pstmt.executeUpdate();
		ResultSet rs = pstmt.executeQuery();
		
		if(rs.next()) {
			if(id.equals(rs.getString("ID")) == true & pw.equals(rs.getString("PW")) == true ) {
				do {
					System.out.println("로그인 성공");
					System.out.println("남자 조회:1 | 여자 조회:2");
					
					J = sc.nextInt();
					if(J == 1) {
						s.select_M_accessProcess();
					}else if (J == 2) {
						s.select_F_accessProcess();
					}else if(J == 3) {
						System.exit(0);
					}else {
						System.out.println("잘못입력하셨습니다.");
						System.out.println("프로그램을 종료합니다.");
						System.exit(0);
					}
				} while(J != 3);
			} else if(id.equals(rs.getString("ID")) ==  true & pw.equals(rs.getString("PW")) == false) {
				 System.out.println("비밀번호를 틀렸습니다.");
                 rs.close();
			}
		} else {
			rs.close();
            System.out.println("회원정보를 틀렸습니다");
            System.out.println("회원정보를 다시 확인해주세요");
		}
	} catch(SQLException e) {
		System.out.println("로그인에 실패하였습니다.");
		e.printStackTrace();
	}
	
}

@Override
public void insert_accessProcess() {	}

@Override
public void update_accessProcess() {	}

@Override
public void delete_accessProcess() {	}

@Override
public void select_accessProcess() {	}

@Override
public void select_M_accessProcess() {	}

@Override
public void select_F_accessProcess() {	}


}
