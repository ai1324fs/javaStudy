package oop_JDBC;

import java.io.IOException;

public class totalStudent2 {

	public static void main(String[] args) throws Exception {
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
				select_student ss = new select_student();
				ss.main(args);
			}else if (keycode == 50) { //keycode 50 = 2
				Insert_student is = new Insert_student();
				is.main(args);
			}else if (keycode == 51) { // keycode 51 = 3
				Update_student us = new Update_student();
				us.main(args);
			}else if (keycode == 52) { // keycode 52 = 4
				Delete_student ds = new Delete_student();
				ds.main(args);
			}else if (keycode == 53) { // keycode 53 = 5
				run = false;
			}
		}
		System.out.println("------프로그램 종료------");
	}

}
