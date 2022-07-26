package oop_JDBC5;

import java.util.Scanner;

/* InterfaceSoluction
 * 
 * 메인 클래스: InterfaceSoluction class
 * 서브클래스
 * - 입력 클래스: Insert_student class
 * - 수정 클래스: Update_student class
 * - 삭제 클래스: Delete_student class
 * - 조회 클래스: Select_student class
 * - DB연결 클래스: Access_student class
 * - 인터페이스 클래스: interface_studentInterface
 * - Override method
 * 1) puvlic abstract void insert_accessProcess()
 * 2) puvlic abstract void update_accessProcess()
 * 3) puvlic abstract void delete_accessprocess()
 * 4) puvlic abstract void select__accessprocess()
 * 5) 
 */
public class InterfaceSoluction {
	// 각 클래스 불러오기
	
	public static void main(String[] args) {
	Select_student ss = new Select_student();
	Insert_student is = new Insert_student();
	Update_student us = new Update_student();
	Delete_student ds = new Delete_student();
	
	int choi = 0;
	
	do {
		System.out.println("원하시는 작업의 번호를 누르세요.");
		System.out.println("1.검색 | 2.입력 | 3.수정 | 4.삭제 | 5.종료");
		
		try {
			Scanner sc = new Scanner(System.in);
			choi = sc.nextInt();
			
			switch(choi) {
				case 1 : ss.select_accessProcess();//select
					break;
				case 2 : is.insert_accessProcess();//insert
					break;
				case 3 : us.update_accessPrcoess();//update
					break;
				case 4 : ds.delete_accessPrcoess();//delete
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
