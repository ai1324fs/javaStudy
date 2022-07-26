package LoginPractice;

import java.lang.reflect.Member;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;


	public interface DAO {

			static final String oracleDriver="oracle.jdbc.OracleDriver"; //oracle.jdbc.driver.OracleDriver
			static final String oracleURL="jdbc:oracle:thin:@localhost:1521:xe";
			static final String oracleId="kim2";
			static final String oraclePw="1234";
			
			// JDBC 연결 메소드(method)
			public Connection getConnection() throws ClassNotFoundException, Exception;
			// 인원현황을 얻어오는 메소드 : select * from member2
			public ArrayList<LoginPractice.Member> getMembers() throws SQLException, Exception;
	}