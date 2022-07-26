package test;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


public class Join_M extends Access_M implements SpecData_M{
	static Scanner sc = new Scanner(System.in);
	
	Select_M sm = new Select_M();
	Select_M_C smc = new Select_M_C();
	insert_M im = new insert_M();
	Update_M um = new Update_M();
	Delete_M dm = new Delete_M();
	static int choi = 0;
	static int J = 0;
	String id = null;
	String pw = null;
	


	public static void main(String[] args) {
	
		}
	
	@Override
	public void update_accessProcess() {	}

	@Override
	public void delete_accessProcess() {    }

	@Override
	public void insert_accessProcess() {    }
		
	@Override
	public void insert_accessProcess_C() {     }
	
	@Override
	public void join_accessProcess() {

		
		DBaccessProcess();
        
        //데이터 삭제 루틴
              System.out.println("-----------------로그인-----------------");
              try {
              System.out.println("ID를 입력하시오.(6자리숫자)");
              id = sc.next();
              } catch(Exception e) {
                 System.out.println("데이터가 정수형이 아닙니다. 확인 바랍니다.");
              }
              try {
                 System.out.println("비밀번호를 입력하시오.");
                 pw = sc.next();
                 System.out.println("입력완료");
      
              } catch(Exception e) {
                 System.out.println("데이터를 잘못입력하셨습니다..");
              }
        
                String sql2 = "SELECT * FROM member WHERE mem_no= '" + id + "'";     
                 try {
                    pstmt = conn.prepareStatement(sql2);

                    pstmt.executeUpdate();
                    //값 받아올수 있는 객체 만들기
                    ResultSet rs = pstmt.executeQuery();
                    //"String".equals("String");
                    
                    
                    //만약 db안에 값이 들어 있을때
                    if (rs.next()) {
                       //로그인폼에 입력한 id와 비밀번호가 db안에 있는 id와 비밀번호와 일치할때 메인 페이지로 이동
                       if (id.equals(rs.getString("mem_no") ) == true  & pw.equals(rs.getString("mem_pw")) ==true ) {
                    	   
                    	   do {
   							System.out.println("로그인에 성공하였습니다.");
   							System.out.println("남자 조회는 1번 여자조회는 2번을 입력하세요.");
   							
   							
   							
   							J = sc.nextInt();
   							if(J == 1) {
   								smc.select_C_M_accessProcess();
   							}else if(J == 2){
   								smc.select_C_F_accessProcess();
   							}else if(J == 3){
   								System.exit(0);
   							}else {
   								System.out.println("잘못입력하셨습니다.");
   								System.out.println("프로그램을 종료합니다.");
   								System.exit(0);
   							}
   						} while(J != 3);
   						

                       //   response.sendRedirect("main.jsp");
                       }else if(id.equals(rs.getString("mem_no")) == true & pw.equals(rs.getString("mem_pw")) == false){
                    	   System.out.println("비밀번호를 틀렸습니다.");
                          rs.close();

                          
                       }
                    } else {//만약 db안에 값이 없을때
                       rs.close();
                       System.out.println("회원정보를 틀렸습니다");
                       System.out.println("회원정보를 다시 확인해주세요");
                       
                 
                    }

              } catch (SQLException e) {
                 System.out.println("로그인에 실패하였습니다.");
                 e.printStackTrace();
              }

		
		
		
		
	}
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		
		DBaccessProcess();
	

		// 로그인

			//sql을 실행하는 명령문
					String sql = "select * from member where mem_no=? and mem_pw =?";
			try {
				
				pstmt = conn.prepareStatement(sql);
				
				pstmt.setString(1, mem_no);
				rs = pstmt.executeQuery(); 
				//pstmt.setString(2, mem_pw);
				rs.next();
				
				 
					if(mem_no.equals(rs.getString(1))){
						
					}
						return;

				
		
				
				
			} catch (SQLException e) {
				System.out.println("로그인에 실패하였습니다.");
				e.printStackTrace();
			}
			return;
	}

		
	}
*/