package oop_methodSample;

import java.util.Scanner;
/* 문제1> 이름과 나이를 입력받아서, 메소드 오버로딩을 적용하고 출력하세요
 * 문제2> 두수를 입력받아서, 생성자 오버로딩을 적용하여 가감승제산을 하고 출력하세요.
 */


public class overloading3_2 {
	
	//constructor method averloading
	public void inputPrint(String name, int age) {
		System.out.println(name);
		System.out.println(age);
	}
	
	public static void main(String[] args) {
/*
1.data input : scanner sc(name, age)
2.data output : name, age
3.object create : overloading3 ai1 = new overloading3();
*/
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int age = sc.nextInt();
		
		overloading3_2 ai1 = new overloading3_2();
		ai1.inputPrint(name, age);

	}


}
