package marry_complete;

import java.sql.SQLException;

public class insert extends Access implements SpecData{
	private static String id;
	private static int pw;
	private static String 이름;
	private static String 성별;
	private static int 나이;
	private static int 재산;
	private static int 연봉;
	private static double 키;
	private static double 몸무게;
	private static String 운동여부;
	private static String 음주여부;
	private static String 흡연여부;
	
	
	@Override
	public void insert_accessProcess(){
		DBaccessProcess();
		System.out.println("===============================================================================================");
		System.out.println("==========================================회원가입  페이지=========================================");
		System.out.println("=========================================정보를  입력하세요=========================================");
		
		try {
			System.out.println("원하는 ID를 입력해주세요. ( 숫자 6자리 )");
			System.out.print(">>>");
			id = scan.next();
		}catch(Exception e){
			System.out.println("확인 후 정확하게 다시 입력해주세요.");
		}
		
		try {
			System.out.println("원하는 PW를 입력해주세요.( 숫자 4자리 )");
			System.out.print(">>>");
			pw = scan.nextInt();
		}catch(Exception e){
			System.out.println("확인 후 정확하게 다시 입력해주세요.");
		}
		
		try {
			System.out.println("이름을 입력해주세요.");
			System.out.print(">>>");
			이름 = scan.next();
		}catch(Exception e){
			System.out.println("확인 후 정확하게 다시 입력해주세요.");
		}
		
		try {
			System.out.println("성별을 입력해주세요. ( 남성 또는 여성 )");
			System.out.print(">>>");
			성별 = scan.next();
		}catch(Exception e){
			System.out.println("확인 후 정확하게 다시 입력해주세요.");
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
			System.out.println("키를 입력해주세요.( 소수점 2자리)");
			System.out.print(">>>");
			키 = scan.nextDouble();
		}catch(Exception e){
			System.out.println("확인 후 정확하게 다시 입력해주세요.");
		}
		try {
			System.out.println("몸무게를 입력해주세요.( 소수점 2자리)");
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
		
		String sql = "insert into marry ( ID, PW, 이름, 성별, 나이, 재산, 연봉, 키, 몸무게, 운동여부, 음주여부, 흡연여부 ) values(?,?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement = Connection.prepareStatement(sql);
			//DB에 저장하는 루틴 ? 하나에 하나씩 순서에 맞춰서 입력
			PreparedStatement.setString(1, id);
			PreparedStatement.setInt(2, pw);
			PreparedStatement.setString(3, 이름);
			PreparedStatement.setString(4, 성별);
			PreparedStatement.setInt(5, 나이);
			PreparedStatement.setInt(6, 재산);
			PreparedStatement.setInt(7, 연봉);
			PreparedStatement.setDouble(8, 키);
			PreparedStatement.setDouble(9, 몸무게);
			PreparedStatement.setString(10, 운동여부);
			PreparedStatement.setString(11, 음주여부);
			PreparedStatement.setString(12, 흡연여부);
			
			PreparedStatement.executeUpdate();
			System.out.println("회원 가입에 성공하였습니다.");
		} catch (SQLException e) {
			System.out.println("오류발생. 회원가입에 실패했습니다.");
			e.printStackTrace();
		}
	}


	@Override
	public void select_accessProcess() {   }


	@Override
	public void update_accessProcess() {   }


	@Override
	public void delete_accessProcess() {   }


	@Override
	public void login_accessProcess() {   }

	
	@Override
	public void select_accessProcess_M() {   }


	@Override
	public void select_accessProcess_W() {   }

	public static void main(String[] args) {


	}

}
