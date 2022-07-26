package marry.copy;

import java.sql.SQLException;

public class Update extends Access implements SpecData{

	public static String id;
	public static int pw;
	public static int 나이;
	public static int 재산;
	public static int 연봉;
	public static double 키;
	public static double 몸무게;
	public static String 운동여부;
	public static String 음주여부;
	public static String 흡연여부;
	
	public static void main(String[] args) {

	}

	@Override
	public void select_accessProcess() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert_accessProcess() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update_accessProcess() {
		
		
		
		DBaccessProcess();
		/*//=========================================================================
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "kang2";
		String pw = "1234";
		
		try {
			Class.forName(driver);
			System.out.println("드라이버연결");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Connection = DriverManager.getConnection(url,id,pw);
			System.out.println("사용자 계정 로그인");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//=========================================================================*/
		
		
		System.out.println("===============================================================================================");
		System.out.println("==========================================정보수정 페이지===========================================");
		System.out.println("=========================================정보를 입력하세요.==========================================");

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
			try {
				System.out.println("나이를 입력해주세요. ( 숫자 2자리 )");
				System.out.print(">>>");
				나이 = scan.nextInt();
			}catch(Exception e){
				System.out.println("확인 후 정확하게 다시 입력해주세요.");
			}
			
			try {
				System.out.println("보유한 재산을 입력해주세요.( 1만 단위 )");
				System.out.print(">>>");
				재산 = scan.nextInt();
			}catch(Exception e){
				System.out.println("확인 후 정확하게 다시 입력해주세요.");
			}
			
			try {
				System.out.println("현재 연봉을 입력해주세요.( 1만 단위 )");
				System.out.print(">>>");
				연봉 = scan.nextInt();
			}catch(Exception e){
				System.out.println("확인 후 정확하게 다시 입력해주세요.");
			}
			
			try {
				System.out.println("키를 입력해주세요.( 소수점 2자리 )");
				System.out.print(">>>");
				키 = scan.nextDouble();
			}catch(Exception e){
				System.out.println("확인 후 정확하게 다시 입력해주세요.");
			}
			try {
				System.out.println("몸무게를 입력해주세요.( 소수점 2자리 )");
				System.out.print(">>>");
				몸무게 = scan.nextDouble();
			}catch(Exception e){
				System.out.println("확인 후 정확하게 다시 입력해주세요.");
			}
			
			try {
				System.out.println("운동여부를 입력해주세요.( O 또는 X )");
				System.out.print(">>>");
				운동여부 = scan.next();
			}catch(Exception e){
				System.out.println("확인 후 정확하게 다시 입력해주세요.");
			}
			
			try {
				System.out.println("음주여부를 입력해주세요.( O 또는 X )");
				System.out.print(">>>");
				음주여부 = scan.next();
			}catch(Exception e){
				System.out.println("확인 후 정확하게 다시 입력해주세요.");
			}
			
			try {
				System.out.println("흡연여부를 입력해주세요.( O 또는 X )");
				System.out.print(">>>");
				흡연여부 = scan.next();
			}catch(Exception e){
				System.out.println("확인 후 정확하게 다시 입력해주세요.");
			}
			
			String sql = "UPDATE MARRY SET 나이=?, 재산=?, 연봉=?, 키=?, 몸무게=?, 운동여부=?, 음주여부=?, 흡연여부=? WHERE ID=? AND PW=?";
			
			try {
				PreparedStatement = Connection.prepareStatement(sql);
				
				PreparedStatement.setInt(1, 나이);
				PreparedStatement.setInt(2, 재산);
				PreparedStatement.setInt(3, 연봉);
				PreparedStatement.setDouble(4, 키);
				PreparedStatement.setDouble(5, 몸무게);
				PreparedStatement.setString(6, 운동여부);
				PreparedStatement.setString(7, 음주여부);
				PreparedStatement.setString(8, 흡연여부);
				//맨뒤에 where에 ID와 PW 값이 들어갔기 때문에 뒤에 넣어줘야함
				PreparedStatement.setString(9, id);
				PreparedStatement.setInt(10, pw);
				
				
				PreparedStatement.executeUpdate();
				System.out.println("정보 수정에 성공하였습니다.");
			} catch (SQLException e) {
				System.out.println("정보 수정에 실패하였습니다. 다시 확인해주세요.");
				e.printStackTrace();
			}
		
	}

	@Override
	public void delete_accessProcess() {   }


	@Override
	public void login_accessProcess() {   }


	@Override
	public void select_accessProcess_M() {   }


	@Override
	public void select_accessProcess_W() {   }

	@Override
	public void select_H_accessProcess() {	}


}
