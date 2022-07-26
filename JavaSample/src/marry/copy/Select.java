package marry.copy;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class Select extends Access implements SpecData{
	static String 키;
	public static ResultSet ResultSet = null;
	public static PreparedStatement PreparedStatement = null;
	public static void main(String[] args) {

	}

	private String i;

	@Override
	public void select_accessProcess() {

		
		DBaccessProcess();
		
		String sql = "SELECT * FROM MARRY order by ID";
		
		try {
			PreparedStatement = Connection.prepareStatement(sql);
			ResultSet = PreparedStatement.executeQuery();
			//System.out.println("conn.prepareStatment(sql)을 성공하셨습니다.");
			System.out.println("데이터 조회를 성공하였습니다.");
		} catch (SQLException e) {
			System.out.println("conn.prepareStatment(sql)을 실패하셨습니다.");
			System.out.println("데이터 조회를 실패하였습니다.");
			e.printStackTrace();
		}
		//System.out.println("데이터를 불러오는 중입니다.");
		System.out.println("===============================================================================================");
		System.out.println("=================================결혼 정보 조회===================================================");
		System.out.println("ID\tPW\t이름\t성별\t나이\t재산\t연봉\t키\t몸무게\t운동여부\t음주여부\t흡연여부");
		System.out.println("-----------------------------------------------------------------------------------------------");
		
		try {
			while(ResultSet.next()) {
				String id = ResultSet.getString(1);
				int pw = ResultSet.getInt(2);
				String 이름 = ResultSet.getString(3);
				String 성별 = ResultSet.getString(4);
				int 나이 = ResultSet.getInt(5);
				int 재산 = ResultSet.getInt(6);
				int 연봉 = ResultSet.getInt(7);
				double 키 = ResultSet.getDouble(8);
				double 몸무게 = ResultSet.getDouble(9);
				String 운동여부 = ResultSet.getString(10);
				String 음주여부 = ResultSet.getString(11);
				String 흡연여부 = ResultSet.getString(12);
				
				
				System.out.println(id +"\t"+ pw +"\t"+ 이름 +"\t"+ 성별 +"\t"+ 나이 +"\t"+ 재산 +"\t"+ 연봉 +"\t"+ 키 +"\t"+ 몸무게 +"\t"+ 운동여부 +"\t"+ 음주여부 +"\t"+ 흡연여부);
			}
			System.out.println("===============================================================================================");
			
		} catch (SQLException e) {
			System.out.println("데이터를 불러오는 것을 실패해습니다.");
			e.printStackTrace();
		} finally {
			DBaccessClose() ;
		}
	}

	@Override
	public void select_accessProcess_M() {

		
		DBaccessProcess();
		
		String sql = "SELECT 이름, 성별, 나이, \r\n"
				+ "    	(CASE\r\n"
				+ "    	WHEN 재산 >= 100000 THEN 'S'\r\n"
				+ "    	WHEN 재산 BETWEEN 50000 AND 99999 THEN 'A'\r\n"
				+ "    	WHEN 재산 BETWEEN 30000 AND 49999 THEN 'B'\r\n"
				+ "    	WHEN 재산 BETWEEN 10000 AND 29999 THEN 'C'\r\n"
				+ "    	WHEN 재산 BETWEEN 5000 AND 9999 THEN 'D'\r\n"
				+ "    	ELSE 'E'\r\n"
				+ "    	END )AS 재산등급,\r\n"
				+ "    	(CASE\r\n"
				+ "    	WHEN 연봉 >= 100000 THEN 'S'\r\n"
				+ "    	WHEN 연봉 BETWEEN 50000 AND 99999 THEN 'A'\r\n"
				+ "    	WHEN 연봉 BETWEEN 30000 AND 49999 THEN 'B'\r\n"
				+ "    	WHEN 연봉 BETWEEN 10000 AND 29999 THEN 'C'\r\n"
				+ "    	WHEN 연봉 BETWEEN 5000 AND 9999 THEN 'D'\r\n"
				+ "    	ELSE 'E'\r\n"
				+ "    	END )AS 연봉등급,\r\n"
				+ "    	(CASE\r\n"
				+ "    	WHEN 키 >= 185 THEN 'S'\r\n"
				+ "    	WHEN 키 BETWEEN 180 AND 184.99 THEN 'A'\r\n"
				+ "    	WHEN 키 BETWEEN 177 AND 179.99 THEN 'B'\r\n"
				+ "    	WHEN 키 BETWEEN 175 AND 176.99 THEN 'C'\r\n"
				+ "    	WHEN 키 BETWEEN 170 AND 174.99 THEN 'D'\r\n"
				+ "    	ELSE 'E'\r\n"
				+ "    	END )AS 키등급, 운동여부, 음주여부, 흡연여부 "
				+ "    	\r\n"
				+ "    FROM MARRY WHERE 성별 LIKE 'M' ORDER BY 나이";
		
		try {
			PreparedStatement = Connection.prepareStatement(sql);
			ResultSet = PreparedStatement.executeQuery();
			//System.out.println("conn.prepareStatment(sql)을 성공하셨습니다.");
			System.out.println("데이터 조회를 성공하였습니다.");
		} catch (SQLException e) {
			System.out.println("conn.prepareStatment(sql)을 실패하셨습니다.");
			System.out.println("데이터 조회를 실패하였습니다.");
			e.printStackTrace();
		}
		//System.out.println("데이터를 불러오는 중입니다.");
		System.out.println("===============================================================================================");
		System.out.println("=================================결혼 정보 조회====================================================");
		System.out.println("이름\t성별\t나이\t재산등급\t연봉등급\t키등급\t운동여부\t음주여부\t흡연여부");
		System.out.println("-----------------------------------------------------------------------------------------------");
		
		try {
			while(ResultSet.next()) {

				String 이름 = ResultSet.getString(1);
				String 성별 = ResultSet.getString(2);
				int 나이 = ResultSet.getInt(3);
				String 재산등급 = ResultSet.getString(4);
				String 연봉등급 = ResultSet.getString(5);
				String 키등급 = ResultSet.getString(6);
				String 운동여부 = ResultSet.getString(7);
				String 음주여부 = ResultSet.getString(8);
				String 흡연여부 = ResultSet.getString(9);
				
				
				System.out.println(이름 +"\t"+ 성별 +"\t"+ 나이 +"\t"+ 재산등급 +"\t"+ 연봉등급 +"\t"+ 키등급 +"\t"+ 운동여부 +"\t"+ 음주여부 +"\t"+ 흡연여부);
			}
			System.out.println("===============================================================================================");
			
		} catch (SQLException e) {
			System.out.println("데이터를 불러오는 것을 실패해습니다.");
			e.printStackTrace();
		} finally {
			DBaccessClose() ;
		}
	}

	@Override
	public void select_accessProcess_W() {

		
		DBaccessProcess();
		
		String sql = "SELECT 이름, 성별, 나이,"
				+ "    	(CASE\r\n"
				+ "    	WHEN 재산 >= 100000 THEN 'S'\r\n"
				+ "    	WHEN 재산 BETWEEN 50000 AND 99999 THEN 'A'\r\n"
				+ "    	WHEN 재산 BETWEEN 30000 AND 49999 THEN 'B'\r\n"
				+ "    	WHEN 재산 BETWEEN 10000 AND 29999 THEN 'C'\r\n"
				+ "    	WHEN 재산 BETWEEN 5000 AND 9999 THEN 'D'\r\n"
				+ "    	ELSE 'E'\r\n"
				+ "    	END)AS 재산등급,\r\n"
				+ "    	(CASE\r\n"
				+ "    	WHEN 연봉 >= 100000 THEN 'S'\r\n"
				+ "    	WHEN 연봉 BETWEEN 50000 AND 99999 THEN 'A'\r\n"
				+ "    	WHEN 연봉 BETWEEN 30000 AND 49999 THEN 'B'\r\n"
				+ "    	WHEN 연봉 BETWEEN 10000 AND 29999 THEN 'C'\r\n"
				+ "    	WHEN 연봉 BETWEEN 5000 AND 9999 THEN 'D'\r\n"
				+ "    	ELSE 'E'\r\n"
				+ "    	END)AS 연봉등급,\r\n"
				+ "    	(CASE\r\n"
				+ "    	WHEN 키 >= 175 THEN 'S'\r\n"
				+ "    	WHEN 키 BETWEEN 170 AND 174.99 THEN 'A'\r\n"
				+ "    	WHEN 키 BETWEEN 165 AND 169.99 THEN 'B'\r\n"
				+ "    	WHEN 키 BETWEEN 160 AND 164.99 THEN 'C'\r\n"
				+ "    	WHEN 키 BETWEEN 157 AND 159.99 THEN 'D'\r\n"
				+ "    	ELSE 'E'\r\n"
				+ "    	END)AS 키등급, 운동여부, 음주여부, 흡연여부 "
				+ "    	\r\n"
				+ "    FROM MARRY WHERE 성별 LIKE 'F' ORDER BY 나이";
		
		try {
			PreparedStatement = Connection.prepareStatement(sql);
			ResultSet = PreparedStatement.executeQuery();
			//System.out.println("conn.prepareStatment(sql)을 성공하셨습니다.");
			System.out.println("데이터 조회를 성공하였습니다.");
		} catch (SQLException e) {
			System.out.println("conn.prepareStatment(sql)을 실패하셨습니다.");
			System.out.println("데이터 조회를 실패하였습니다.");
			e.printStackTrace();
		}
		//System.out.println("데이터를 불러오는 중입니다.");
		System.out.println("===============================================================================================");
		System.out.println("=================================결혼 정보 조회====================================================");
		System.out.println("이름\t성별\t나이\t재산등급\t연봉등급\t키등급\t운동여부\t음주여부\t흡연여부");
		System.out.println("-----------------------------------------------------------------------------------------------");
		
		try {
			while(ResultSet.next()) {

				String 이름 = ResultSet.getString(1);
				String 성별 = ResultSet.getString(2);
				int 나이 = ResultSet.getInt(3);
				String 재산등급 = ResultSet.getString(4);
				String 연봉등급 = ResultSet.getString(5);
				String 키등급 = ResultSet.getString(6);
				String 운동여부 = ResultSet.getString(7);
				String 음주여부 = ResultSet.getString(8);
				String 흡연여부 = ResultSet.getString(9);
				
				
				System.out.println(이름 +"\t"+ 성별 +"\t"+ 나이 +"\t"+ 재산등급 +"\t"+ 연봉등급 +"\t"+ 키등급 +"\t"+ 운동여부 +"\t"+ 음주여부 +"\t"+ 흡연여부);
			}
			System.out.println("===============================================================================================");
			
		} catch (SQLException e) {
			System.out.println("데이터를 불러오는 것을 실패해습니다.");
			e.printStackTrace();
		} finally {
			DBaccessClose() ;
		}
	}
	
	public void select_H_accessProcess() {
		DBaccessProcess();
		Scanner sc = new Scanner(System.in);
		String sql = "SELECT * FROM MARRY where 키 >= '"+i+"'"
					+ "AS 키조회"; 
		
		System.out.println("입력한 값 이상의 키를 가진 회원만 조회합니다.");
		i = sc.next();
		try {
			PreparedStatement = Connection.prepareStatement(sql);
			ResultSet = PreparedStatement.executeQuery();
			while(ResultSet.next()) {
				String id = ResultSet.getString(1);
				int pw = ResultSet.getInt(2);
				String 이름 = ResultSet.getString(3);
				String 성별 = ResultSet.getString(4);
				int 나이 = ResultSet.getInt(5);
				int 재산 = ResultSet.getInt(6);
				int 연봉 = ResultSet.getInt(7);
				double 키 = ResultSet.getDouble(8);
				double 몸무게 = ResultSet.getDouble(9);
				String 운동여부 = ResultSet.getString(10);
				String 음주여부 = ResultSet.getString(11);
				String 흡연여부 = ResultSet.getString(12);
				
				
				System.out.println(id +"\t"+ pw +"\t"+ 이름 +"\t"+ 성별 +"\t"+ 나이 +"\t"+ 재산 +"\t"+ 연봉 +"\t"+ 키 +"\t"+ 몸무게 +"\t"+ 운동여부 +"\t"+ 음주여부 +"\t"+ 흡연여부);
			}
			System.out.println("===============================================================================================");
			
		} catch (SQLException e) {
			System.out.println("데이터를 불러오는 것을 실패해습니다.");
			e.printStackTrace();
		} finally {
			DBaccessClose() ;
		}
	}

	@Override
	public void insert_accessProcess() {   }

	@Override
	public void update_accessProcess() {   }

	@Override
	public void delete_accessProcess() {   }

	@Override
	public void login_accessProcess() {   }



}
