package oop_JDBC4;

import java.util.Scanner;

/* Interface로 구현한 학생관리 프로그램
 * 
 * 메인 클래스: InterfaceSoluction class
 * 서브 클래스
 * - 입력 클래스: Insert_student class
 * - 수정 클래스: Update_student class
 * - 삭제 클래스: Delete_student class
 * - 조회 클래스: Select_student class
 * - DB연결 클래스: Access_student class, DBaccessProcess()
 * - 인터페이스 클래스: interface studentInterface 
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
public class InterfaceSoluction {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		int choi = 0;
		Select_student ss = new Select_student();
		Insert_student is = new Insert_student();
		Update_student us = new Update_student();
		Delete_student ds = new Delete_student();
		
		do {
			System.out.println("원하시는 작업의 번호를 누르세요.");
			System.out.println("1. 정보 조회 / 2. 정보 입력 / 3. 정보 수정 / 4. 정보 삭제 / 5. 종료");
			
			try {
				Scanner sc = new Scanner(System.in);
				choi = sc.nextInt();
				
				switch(choi) {
					case 1 : ss.select_accessProcess();//select
						break;
					case 2 : is.insert_accessProcess();//insert
						break;
					case 3 : us.update_accessProcess();//update
						break;
					case 4 : ds.delete_accessProcess();//delete
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
	}

}
