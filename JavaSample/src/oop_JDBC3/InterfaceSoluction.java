package oop_JDBC3;

import oop_JDBC5.Delete_student;
import oop_JDBC5.Insert_student;
import oop_JDBC5.Select_student;
import oop_JDBC5.Update_student;

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
	boolean run = true;
	int keycode = 0;
	
	while(run) {
		if(keycode!=13 && keycode!=10) {
			System.out.println("----------------------");
			System.out.println("1.검색 | 2.입력 | 3.수정 | 4.삭제 | 5.종료");
			System.out.println("----------------------");
			System.out.println("선택: ");
		}
		keycode = System.in.read();
		
		if(keycode == 49) {// keycode 49 = 1
			Select_student ss = new Select_student();
			ss.select_accessPrcoess();
		}else if (keycode == 50) { //keycode 50 = 2
			Insert_student is = new Insert_student();
			is.insert_accessPrcoess();
		}else if (keycode == 51) { // keycode 51 = 3
			Update_student us = new Update_student();
			us.update_accessProcess();
		}else if (keycode == 52) { // keycode 52 = 4
			Delete_student ds = new Delete_student();
			ds.delete_accessPrcoess();
		}else if (keycode == 53) { // keycode 53 = 5
			run = false;
		}
	}
	System.out.println("------프로그램 종료------");
}
	
	}
}
