package marry_complete;

import java.util.Scanner;

public class InterfaceSoultion {
static Scanner scan = new Scanner(System.in);
static int choice = 0;
static int admin_pw = 0;
static String main_choice = null;
	public static void main(String[] args) {
		Select Select =  new Select();
		Update Update =  new Update();
		insert insert =  new insert();
		Delete Delete =  new Delete();
		Login Login = new Login();
		
		System.out.println("===============================================================================================");
		System.out.println("======================================환영합니다!!!===============================================");
		System.out.println("원하는 번호를 입력하세요.");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		main_choice = scan.next();
		if ( main_choice.equals("1")) {
			insert.insert_accessProcess();
			System.out.println("로그인페이지로 이동합니다.");
			Login.login_accessProcess();
		}else if(main_choice.equals("2")) {
			Login.login_accessProcess();
		}else if(main_choice.equals("admin")) {
			System.out.println("관리자 페이지로 접속 하셨습니다.");
			System.out.print("비밀번호를 입력하세요. >>");
			admin_pw = scan.nextInt();
			if(admin_pw == 9876) {
				do {
					System.out.println("관리자 계정입니다.");
					System.out.println("1. 전체 정보 조회");
					System.out.println("2. 남자 정보 조회");
					System.out.println("3. 여자 정보 조회");
					System.out.println("4. 새로운 정보 입력");
					System.out.println("5. 기존 정보 수정");
					System.out.println("6. 기존 정보 삭제");
					System.out.println("7. 관리자 계정 종료");
					System.out.print(">>");
					try {
						choice = scan.nextInt();
						switch(choice) {
						case 1 : Select.select_accessProcess();
						break;
						case 2 : Select.select_accessProcess_M();
						break;
						case 3 : Select.select_accessProcess_W();
						break;
						case 4 : insert.insert_accessProcess();
						break;
						case 5 : Update.update_accessProcess();
						break;
						case 6 : Delete.delete_accessProcess();
						break;
						case 7 : System.out.println("관리자 프로그램을 종료합니다.");
						System.exit(0);
						break;
						}
					}catch(Exception e) {
						System.out.println("잘못 입력하셨습니다.");
					}
					
				}while(choice <= 7);
				System.out.println("잘못누르셨습니다. 종료합니다.");
				
			}else {
				System.out.println("관리자만 접근 가능합니다.");
			}
			
		}

	}

}
