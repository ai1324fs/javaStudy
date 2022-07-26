package oop_inheritance;

import java.util.Scanner;

/* inheritance란? 상속
 *  - 기존에 존재하는 클래스로부터 속성과 기능을 물려 받아 새로운 기능을 구현 하거나, 추가 하는 것을 말한다
 *  - 부모 클래스 / 자식 클래스
 *  - 생성자는 상속이 안됩니다.
 *  - 기능적으로 볼 때, @overring : 추상 클래스 오버라이딩 (부모의 기능을 자식에게 적용할때 사용) => 추상 클래스, 인터페이스
 * 		부모: A기능 자식:B라고 구현 가능
 * 추상 클래스는 객체를 생성하지 못합니다/[단점] 	//	A3 a3 = new A3();// [X]
 * 
 * public class A extends B { ...} } : 클래스들끼리의 상속
 * public class A extends B { ...} } : 추상 클래스가 일반 클래스에게 상속
 * public class A implements B { ...} } : 인터페이스들끼리의 상속
 * public class A extends B implements c, d, e { ...} } : 다중 상속의 효과 (c,d,e의 기능을 B에게 물려주고 B의 기능을 A에게 물려주는 방법)
 * 상속의 4가지

 *추상 클래스는 하나 이상의 추산 메소드와 문자열 상수 값으로 구성이 됩니다.
 *
 *문제> 두수를 입력받아서 상속을 이용하여 가감승제산을 하시오.
 * 변수: su1, su2
 * 덧셈: Add (), 뺄셈: Subt () ,곱셈:Mul ,나눗셈: Div()
 * 기본 클래스: 자식클래스, inheritanceSample4 = is4
 * 상속 클래스: 부모클래스, addParentClass ,subParentClass, mulParentClass, divParentClass
 * 알고리즘 구현 크게 하나의 클래스에서 할거냐?
 * 아니면 여러개의 클래스로 분할하여 코딩 : OK
 * input 변수: su1, su2
 * process: add(+) , sub(-) , mul(*) , div(/) 
 * output 변수: addsum, subsum, mulsum, divsum
 */

public class inheritanceSample4 extends addParentClass {

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
	public void divi(int x, int y) {
		int divsum1 = x / y; // 20 / 5
		System.out.println("나눗셈(/): " + divsum1); // 25
	}
	
	@Override
	public void divi2(int x, int y) {
		int divsum2 = x % y; // 20 % 5
		System.out.println("나눗셈(%): " + divsum2); // 25
	}
	
	public static void main(String[] args) {
		inheritanceSample4 is = new inheritanceSample4();
		Scanner sc = new Scanner(System.in);
		int x, y;
		System.out.println("첫번째 숫자를 입력하세요");
		x = sc.nextInt();
		System.out.println("두번째 숫자를 입력하세요");
		y = sc.nextInt();
		is.add(x,y);
		is.sub(x,y);
		is.mul(x, y);
		is.divi(x, y);
		is.divi2(x, y);
		
	}
	
}
