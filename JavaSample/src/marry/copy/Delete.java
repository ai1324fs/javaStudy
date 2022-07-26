package marry.copy;

import java.sql.SQLException;

public class Delete extends Access implements SpecData{
	private static String id;
	private static int pw;
	
	public static void main(String[] args) {    }
	
	@Override
	public void delete_accessProcess(){
		DBaccessProcess();
		
		System.out.println("===============================================================================================");
		System.out.println("==========================================회원탈퇴 페이지==========================================");
		System.out.println("=========================================정보를 입력하세요.=========================================");
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
		
		String sql = " DELETE FROM MARRY WHERE ID=? AND PW=?";
		
			try {
				PreparedStatement  = Connection.prepareStatement(sql);
				PreparedStatement.setString(1, id);
				PreparedStatement.setInt(2, pw);
				
				PreparedStatement.executeUpdate();
				
				System.out.println("회원탈퇴에 성공했습니다.");
			} catch (SQLException e) {
				System.out.println("회원탈퇴에 실패했습니다. 확인 바랍니다.");
				e.printStackTrace();
			}
		
	}

	@Override
	public void select_accessProcess() {   }

	@Override
	public void insert_accessProcess() {   }

	@Override
	public void update_accessProcess() {   }

	@Override
	public void login_accessProcess() {   }

	@Override
	public void select_accessProcess_M() {   }

	@Override
	public void select_accessProcess_W() {   }

	@Override
	public void select_H_accessProcess() {	}

}
