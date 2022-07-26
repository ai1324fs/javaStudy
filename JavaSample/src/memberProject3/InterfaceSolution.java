package memberProject3;

import java.util.Scanner;

/* Interface로 구현한 결혼정보회사 프로그램
 * 
 * 메인 클래스: InterfaceSoluction class
 * 서브 클래스
 * - 입력 클래스: Insert_member class
 * - 수정 클래스: Update_member class
 * - 삭제 클래스: Delete_member class
 * - 조회 클래스: Select_member class
 * - DB연결 클래스: Access_member class, DBaccessProcess()
 * - 인터페이스 클래스: interface memberInterface 
 * - Override method
 *   1) public abstract void insert_accessProcess()
 *   2) public abstract void update_accessProcess()
 *   3) public abstract void delete_accessProcess()
 *  
 * - 출력용 : printProcess, public abstract void select_accessProcess();
 * 
 *   
 * 
 */
public class InterfaceSolution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choi = 0;
		Select_M sm = new Select_M();
		Select_M_C smc = new Select_M_C();
		insert_M im = new insert_M();
		Update_M um = new Update_M();
		Delete_M dm = new Delete_M();
		System.out.println("고객번호를 입력하세요.");
		String admin = sc.next();
		if(admin.equals("member_ID")) {

			do {
				System.out.println("원하시는 작업의 번호를 누르세요.");
				System.out.println("1. 회원 조회 / 2. 정보 입력 / 3. 정보 수정 / 4. 정보 삭제 / 5. 종료");
				
				try {
					choi = sc.nextInt();
					
					switch(choi) {
						case 1 : sm.select_accessProcess();//select
							break;
						case 2 : im.insert_accessProcess();//insert
							break;
						case 3 : um.update_accessProcess();//update
							break;
						case 4 : dm.delete_accessProcess();//delete
							break;
						case 5 :
							System.out.println("프로그램을 종료합니다.");
							//System.exit(0); = 프로그램 즉시종료
							break;
					}
				
				} catch (Exception e) {
					System.out.println("잘못 입력하였습니다. 처음부터 다시 진행해주십시오.");
				} finally {
					System.out.println();
				}

			} while(choi != 5);
		}else {
			smc.select_C_accessProcess();
		}
	}

}
