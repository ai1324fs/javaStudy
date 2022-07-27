package serverProgramming;

import java.util.Scanner;

public class InterfaceSolution {
	
	
	static Scanner sc = new Scanner(System.in);

	@SuppressWarnings("null")
	public static void main(String[] args) {

		Select s = new Select();
		Delete d = new Delete();
		insert i = new insert();
		Update u = new Update();
		Login l= new Login();
		int a = 0;
		String FirstPW = null;
		System.out.println("번호를 입력해 주세요");
		System.out.println("1. 회원가입 | 2. 로그인");
		String FirstID = sc.next();
		
		
		if(FirstID.equals("1")) {
			System.out.println("회원가입");
			i.insert_accessProcess();
		}else if(FirstID.equals("2")) {
			System.out.println("로그인");
			l.login_accessProcess();
		}else if(FirstID.equals("관리자")) {
			System.out.println("관리자 계정 로그인 중입니다.");
			System.out.println("비밀번호를 입력하세요");
			FirstPW = sc.next();
		if(FirstPW.equals("9876")) {
			System.out.println("관리자 계정 로그인");
			do {
				System.out.println("원하는 작업 번호를 누르세요");
				System.out.println("1. 회원 조회 | 2. 정보 입력 | 3. 정보 수정 | 4. 정보 삭제 | 5. 종료");
			try {
				a = sc.nextInt();
				switch(a) {
				case 1 : s.select_accessProcess();
					break;
				case 2 : i.insert_accessProcess();
					break;
				case 3 : u.update_accessProcess();
					break;
				case 4 :  d.delete_accessProcess();
					break;
				case 5 :
					System.out.println("프로그램을 종료합니다.");
					System.exit(0); // 프로그램 즉시종료
					break;
				}
			} catch (Exception e) {
				System.out.println("잘못 입력하였습니다. 처음부터 다시 진행해주십시오.");
			} finally {
				System.out.println();
			}

		} while(a != 5);
			} else {
				System.out.println("로그인 실패");
			}
	
		}
	}
}
