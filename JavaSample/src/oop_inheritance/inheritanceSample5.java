package oop_inheritance;

import java.util.Scanner;

/*문제> 두수를 입력받아서 상속을 이용하여 가감승제산을 하시오.
 * 상속을 서로 연결하여 프로그램 작성 => 단 결과는 성능이 떨어집니다. 감안하여 
 * 
 * 
 * 
 */

public class inheritanceSample5 extends addParentClass2 {

	@Override
	public void add(int x, int y) {
		
		int addsum = x + y; // 20 + 5
		System.out.println("덧셈: " + addsum); // 25
	}
	
	@Override
	public void sub(int x, int y) {
		int subsum = x - y; // 20 - 5
		System.out.println("뻴셈: " + subsum); // 25
	}
	
	@Override
	public void mul(int x, int y) {
		int mulsum = x * y; // 20 * 5
		System.out.println("곱셈: " + mulsum); // 25
	}
	
	@Override
	public void div(int x, int y) {
		int divsum1 = x / y; // 20 / 5
		System.out.println("나눗셈(/): " + divsum1); // 25
	}
	
	@Override
	public void div2(int x, int y) {
		int divsum2 = x % y; // 20 % 5
		System.out.println("나눗셈(%): " + divsum2); // 25
	} 
	
	public static void main(String[] args) {
		inheritanceSample5 is = new inheritanceSample5();
		Scanner sc = new Scanner(System.in);
		int x, y;
		System.out.println("첫번째 숫자를 입력하세요");
		x = sc.nextInt();
		System.out.println("두번째 숫자를 입력하세요");
		y = sc.nextInt();
		is.add(x,y);
		is.sub(x,y);
		is.mul(x, y);
		is.div(x, y);
		is.div2(x, y);
		
	}
	
}
