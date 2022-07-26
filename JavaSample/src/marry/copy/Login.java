package marry.copy;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Login extends Access implements SpecData{
	static String id;
	static int pw;
	static int J;
	Select Select = new Select();
	Delete Delete = new Delete();

	public static void main(String[] args) {

	}
	@Override
	public void select_accessProcess() {   }

	@Override
	public void insert_accessProcess() {   }

	@Override
	public void update_accessProcess() {   }

	@Override
	public void delete_accessProcess() {   }

	@Override
	public void login_accessProcess() {
		DBaccessProcess();
		
		System.out.println("===============================================================================================");
		System.out.println("==========================================로그인  페이지===========================================");

		try {
				System.out.println("ID를 입력해주세요.");
				System.out.print(">>>");
				id = scan.next();
			}catch(Exception e) {
				System.out.println("ID입력에 오류가 있습니다.");
				System.out.println("확인해주세요.");
			}
		
			try {
				System.out.println("PW를 입력해주세요.");
				System.out.print(">>>");
				pw = scan.nextInt();
			}catch(Exception e) {
				System.out.println("pw입력에 오류가 있습니다.");
				System.out.println("확인해주세요.");
			}
			
			String sql = "SELECT * FROM MARRY WHERE ID='"+id+"'";     
            try {
                PreparedStatement = Connection.prepareStatement(sql);

                //PreparedStatement.executeUpdate();
                //값 받아올수 있는 객체 만들기
                ResultSet = PreparedStatement.executeQuery();
                //"String".equals("String");
                
                
                //만약 db안에 값이 들어 있을때
                if (ResultSet.next()) {
                   //로그인폼에 입력한 id와 비밀번호가 db안에 있는 id와 비밀번호와 일치할때 메인 페이지로 이동
                   if (id.equals(ResultSet.getString(1)) & pw==ResultSet.getInt(2)){
                	   
                	   do {
							System.out.println("로그인에 성공하였습니다.");
							System.out.println("1. 남자 조회");
							System.out.println("2. 여자 조회");
							System.out.println("3. 회원 탈퇴");
							System.out.println("4. 프로그램 종료");
							
							
							J = scan.nextInt();
							if(J == 1) {
								System.out.println("남자 조회 페이지 이동");
								Select.select_accessProcess_M();
							}else if(J == 2){
								System.out.println("여자 조회 페이지 이동");
								Select.select_accessProcess_W();
							}else if(J == 3){
								System.out.println("회원탈퇴 페이지 이동");
								Delete.delete_accessProcess();
							}else if(J == 4){
								System.exit(0);
							}else {
								System.out.println("잘못입력하셨습니다.");
								System.out.println("프로그램을 종료합니다.");
								System.exit(0);
							}
						} while(J != 4);
		
                   }else if(id.equals(ResultSet.getString(1))& (pw!=ResultSet.getInt(2))){
                	   System.out.println("비밀번호를 틀렸습니다.");
                	   ResultSet.close();

                      
                   }
                } else {//만약 db안에 값이 없을때
                	ResultSet.close();
                   System.out.println("회원정보를 틀렸습니다");
                   System.out.println("회원정보를 다시 확인해주세요");
                   
             
                }

          } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	@Override
	public void select_accessProcess_M() {   }

	@Override
	public void select_accessProcess_W() {   }
	@Override
	public void select_H_accessProcess() {	}

}
