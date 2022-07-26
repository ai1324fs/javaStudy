package practice;

import java.security.DrbgParameters.NextBytes;
import java.sql.SQLException;
import java.util.Scanner;

public class insert	extends Access implements printProcess{
static Scanner sc = new Scanner(System.in);

private static String ID;
private static String PW;
private static String 이름;
private static String 성별;
private static String 나이;
private static String 재산;
private static String 연봉;
private static Double 키;
private static Double 몸무게;
private static String 운동;
private static String 음주;
private static String 흡연;
public static void main(String[] args) {	}
//회원가입으로 구현
public void insert_accessProcess() {
	DBaccessProcess();
	System.out.println("회원 정보 입력");
	try {
		System.out.println("ID 입력");
		ID = sc.next();
	}catch(Exception e) {
		System.out.println("ID를 잘못 입력하셨습니다");
	}
	try {
		System.out.println("PW 입력");
		PW = sc.next();
	}catch(Exception e) {
		System.out.println("PW를 잘못 입력하셨습니다");
	}
	try {
		System.out.println("이름 입력");
		이름 = sc.next();
	}catch(Exception e) {
		System.out.println("이름를 잘못 입력하셨습니다");
	}
	try {
		System.out.println("성별 입력");
		성별 = sc.next();
	}catch(Exception e) {
		System.out.println("성별를 잘못 입력하셨습니다");
	}
	try {
		System.out.println("나이 입력");
		나이 = sc.next();
	}catch(Exception e) {
		System.out.println("나이를 잘못 입력하셨습니다");
	}
	try {
		System.out.println("재산 입력");
		재산 = sc.next();
	}catch(Exception e) {
		System.out.println("재산를 잘못 입력하셨습니다");
	}
	try {
		System.out.println("연봉 입력");
		연봉 = sc.next();
	}catch(Exception e) {
		System.out.println("연봉를 잘못 입력하셨습니다");
	}
	try {
		System.out.println("키 입력");
		키 = sc.nextDouble();
	}catch(Exception e) {
		System.out.println("키를 잘못 입력하셨습니다");
	}
	try {
		System.out.println("몸무게 입력");
		몸무게 = sc.nextDouble();
	}catch(Exception e) {
		System.out.println("몸무게를 잘못 입력하셨습니다");
	}
	try {
		System.out.println("운동 입력");
		운동 = sc.next();
	}catch(Exception e) {
		System.out.println("운동를 잘못 입력하셨습니다");
	}
	try {
		System.out.println("음주 입력");
		음주 = sc.next();
	}catch(Exception e) {
		System.out.println("음주를 잘못 입력하셨습니다");
	}
	try {
		System.out.println("흡연 입력");
		흡연 = sc.next();
	}catch(Exception e) {
		System.out.println("흡연를 잘못 입력하셨습니다");
	}
	
	String sql = "insert into marry(ID, PW, 이름, 성별, 나이, 재산, 연봉, 키, 몸무게, 운동여부, 음주여부, 흡연여부)"
			+ "values(?,?,?,?,?,?,?,?,?,?,?,?)" ;
	
	try {
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, ID);
		pstmt.setString(2, PW);
		pstmt.setString(3, 이름);
		pstmt.setString(4, 성별);
		pstmt.setString(5, 나이);
		pstmt.setString(6, 재산);
		pstmt.setString(7, 연봉);
		pstmt.setDouble(8, 키);
		pstmt.setDouble(9, 몸무게);
		pstmt.setString(10, 운동);
		pstmt.setString(11, 음주);
		pstmt.setString(12, 흡연);
		
		pstmt.executeUpdate();
		System.out.println("회원 가입 완료");
	} catch(SQLException e) {
		System.out.println("회원 가입 실패");
		e.printStackTrace();
	}
}
@Override
public void update_accessProcess() {	}
@Override
public void delete_accessProcess() {	}
@Override
public void login_accessProcess() {	}
@Override
public void select_accessProcess() {	}
@Override
public void select_M_accessProcess() {	}
@Override
public void select_F_accessProcess() {	}
}
