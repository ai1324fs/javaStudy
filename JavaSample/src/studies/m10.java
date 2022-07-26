package studies;

import java.util.Scanner;

public class m10 {
	static Scanner sc = new Scanner(System.in);
	static String name = sc.next();
	static String gender = sc.next();
	static int age = sc.nextInt();
	static int tall = sc.nextInt();
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	String gender1 = gender.equals("M")?"남자":"여자";
	// 값을 3항연산자로 풀고 싶을땐 객체지정을 통하여 나눈다(equals)
	System.out.println("이름 : " +name);
	System.out.println("성별 : " +gender1);
	System.out.println("나이 : " +age);
	System.out.println("신장 : " +tall);
	
	
	
	}

}
