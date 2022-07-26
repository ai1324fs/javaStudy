package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InterfaceSolution {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int choi = 0;
		Select_M sm = new Select_M();
		Select_M_C smc = new Select_M_C();
		insert_M im = new insert_M();
		insert_M_C imc = new insert_M_C();
		Update_M um = new Update_M();
		Delete_M dm = new Delete_M();
		Join_M jm = new Join_M();
		String firstPW = null;
		System.out.println("=====원하는 번호를 입력하세요=====");
		System.out.println("1. 회원가입 ");
		System.out.println("2. 로그인 ");
		System.out.println("===========================");
		System.out.print(">>");
		String firstPage = sc.next();


		if(firstPage.equals("1")) {

			imc.insert_accessProcess_C();
			
		}else if(firstPage.equals("2")) {
			
			jm.join_accessProcess();
			
		}else if(firstPage.equals("member_ID")) {
			System.out.println("관리자 계정 로그인 중입니다.");
			System.out.println("비밀번호를 입력해주세요");
			firstPW = sc.next();
		if(firstPW.equals("9876")) {
			System.out.println("원하시는 작업의 번호를 누르세요.");
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
			}
		
		
		
	}

}
}
