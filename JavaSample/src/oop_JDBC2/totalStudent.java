package oop_JDBC2;

import java.util.Scanner;

public class totalStudent {

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
					case 1 : ss.main(args);
						break;
					case 2 : is.main(args);
						break;
					case 3 : us.main(args);
						break;
					case 4 : ds.main(args);
						break;
					case 5 :
						System.out.println("프로그램을 종료합니다.");
						//System.exit(); = 프로그램 즉시종료
						break;
					default :
						System.out.println("잘못 입력하였습니다. 처음부터 다시 진행해주십시오.");
				}
			
			} catch (Exception e) {
				System.out.println("잘못 입력하였습니다. 처음부터 다시 진행해주십시오.");
			} finally {
				System.out.println();
			}
			
		} while(choi != 5);

		
		//(ascending) order by stu_no - stu_by를 기준으로 정렬 (ascending sort)
		//descending order by stu_no - stu_by를 기준으로 역순정렬
		
	}

}
