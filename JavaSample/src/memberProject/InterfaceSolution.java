package memberProject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
	
		System.out.println("=====원하는 번호를 입력하세요=====");
		System.out.println("1. 회원가입 ");
		System.out.println("2. 로그인 ");
		System.out.println("===========================");
		System.out.print(">>");
		int firstPage = sc.nextInt();
		
		if(firstPage == 1) {
			  File file = new File("C:\\Users\\김태민\\Desktop\\MemberDB.txt");
		      try {
				FileWriter filewriter = new FileWriter(file, true);
		         if(file.isFile() && file.canWrite()) {
		        	 System.out.println();
		            System.out.println("회원가입을 위해 ID와 PW를 입력하세요.");
		            System.out.println("ID 입력 : ");
		            filewriter.append(sc.next());
		            filewriter.append("\t");
		            System.out.println("비밀번호 입력 : ");
		            filewriter.append(sc.next());
		            filewriter.append("\r");
		            System.out.println("회원가입이 완료되었습니다.");
		         }
		         filewriter.close();
		      } catch (IOException e) {
		         e.printStackTrace();
		      }
		}else if(firstPage == 2) {
			
			int pass = 0;
		      System.out.println("LogIn을 위해 ID와 PW를 입력하세요.");
		      System.out.println();
		      System.out.println("ID를 입력 : ");
		      String id = sc.next();
		      System.out.println("비밀번호를 입력 : ");
		      String pw = sc.next();
		      
		      File file = new File("C:\\Users\\김태민\\Desktop\\MemberDB.txt");
		      try {
		         FileReader filereader = new FileReader(file);
		         BufferedReader bufReader = new BufferedReader(filereader); 
		         String line = "";
		         try {
		            while((line = bufReader.readLine()) != null) {
		               //System.out.println(line.indexOf(id) + "\t" + line.indexOf(pw));
		               int passID = line.indexOf(id);
		               int passPW = line.indexOf(pw);
		               if(passID != -1 && passPW != -1) {
		                  System.out.println("로그인 성공");
		                   pass = 1; }
		            }
		            if(pass ==0) {System.out.println("로그인 실패");}
		            bufReader.close();
		         } catch (IOException e) {
		            e.printStackTrace();
		         }
		      } catch (FileNotFoundException e) {
		         e.printStackTrace();
		      }
			
			if(id.equals("member_ID")) {

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
			}else if(pass ==0){
				System.out.println("존재하지 않는 회원정보입니다.");
				}else {
				System.out.println("남자 조회는 1번 여자조회는 2번을 입력하세요.");
				int J = sc.nextInt();
				if(J == 1) {
					smc.select_C_M_accessProcess();
				}else if(J == 2){
					smc.select_C_F_accessProcess();
				}else {
					System.out.println("숫자를 잘못 입력하셨씁니다.");
				}
				
			}
		}else {
			System.out.println("잘못누르셨습니다.");
		}
		
		
	}

}
