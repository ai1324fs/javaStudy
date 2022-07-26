package practice;

import java.security.DrbgParameters.NextBytes;
import java.sql.SQLException;
import java.util.Scanner;

public class insert	extends Access implements printProcess{
static Scanner sc = new Scanner(System.in);

private static String mem_ID;
private static String mem_pw;
private static String mem_name;
private static String mem_gender;
private static String mem_age;
private static String mem_propertym;
private static String mem_paym;
private static Double mem_height;
private static Double mem_weight;
private static String mem_exercise;
private static String mem_drink;
private static String mem_smoking;

public static void main(String[] args) {	}
//회원가입으로 구현
public void insert_accessProcess() {
	DBaccessProcess();
	System.out.println("회원 정보 입력");
	try {
		System.out.println("ID 입력");
		mem_ID = sc.next();
	}catch(Exception e) {
		System.out.println("ID를 잘못 입력하셨습니다");
	}
	try {
		System.out.println("PW 입력");
		mem_pw = sc.next();
	}catch(Exception e) {
		System.out.println("PW를 잘못 입력하셨습니다");
	}
	try {
		System.out.println("이름 입력");
		mem_name = sc.next();
	}catch(Exception e) {
		System.out.println("이름를 잘못 입력하셨습니다");
	}
	try {
		System.out.println("성별 입력");
		mem_gender = sc.next();
	}catch(Exception e) {
		System.out.println("성별를 잘못 입력하셨습니다");
	}
	try {
		System.out.println("나이 입력");
		mem_age = sc.next();
	}catch(Exception e) {
		System.out.println("나이를 잘못 입력하셨습니다");
	}
	try {
		System.out.println("재산 입력");
		mem_propertym = sc.next();
	}catch(Exception e) {
		System.out.println("재산를 잘못 입력하셨습니다");
	}
	try {
		System.out.println("연봉 입력");
		mem_paym = sc.next();
	}catch(Exception e) {
		System.out.println("연봉를 잘못 입력하셨습니다");
	}
	try {
		System.out.println("키 입력");
		mem_height = sc.nextDouble();
	}catch(Exception e) {
		System.out.println("키를 잘못 입력하셨습니다");
	}
	try {
		System.out.println("몸무게 입력");
		mem_weight = sc.nextDouble();
	}catch(Exception e) {
		System.out.println("몸무게를 잘못 입력하셨습니다");
	}
	try {
		System.out.println("운동 입력");
		mem_exercise = sc.next();
	}catch(Exception e) {
		System.out.println("운동를 잘못 입력하셨습니다");
	}
	try {
		System.out.println("음주 입력");
		mem_drink = sc.next();
	}catch(Exception e) {
		System.out.println("음주를 잘못 입력하셨습니다");
	}
	try {
		System.out.println("흡연 입력");
		mem_smoking = sc.next();
	}catch(Exception e) {
		System.out.println("흡연를 잘못 입력하셨습니다");
	}
	
	String sql = "insert into marry(mem_ID, mem_pw, mem_name, mem_gender, mem_age, mem_propertym, mem_paym, mem_height, mem_weight, mem_exercise, mem_drink, mem_smoking)"
			+ "values(?,?,?,?,?,?,?,?,?,?,?,?)" ;
	
	try {
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, mem_ID);
		pstmt.setString(2, mem_pw);
		pstmt.setString(3, mem_name);
		pstmt.setString(4, mem_gender);
		pstmt.setString(5, mem_age);
		pstmt.setString(6, mem_propertym);
		pstmt.setString(7, mem_paym);
		pstmt.setDouble(8, mem_height);
		pstmt.setDouble(9, mem_weight);
		pstmt.setString(10, mem_exercise);
		pstmt.setString(11, mem_drink);
		pstmt.setString(12, mem_smoking);
		
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
