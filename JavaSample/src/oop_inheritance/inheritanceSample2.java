package oop_inheritance;

import oop_inheritance2.A;

/* inheritance란? 상속
 *  - 기존에 존재하는 클래스로부터 속성과 기능을 물려 받아 새로운 기능을 구현 하거나, 추가 하는 것을 말한다
 *  - 부모 클래스 / 자식 클래스
 *  - 생성자는 상속이 안됩니다.
 *  - 기능적으로 볼 때, @overring : 추상 클래스 오버라이딩 (부모의 기능을 자식에게 적용할때 사용) => 추상 클래스, 인터페이스
 * 		부모: A기능 자식:B라고 구현 가능
 * 
 */


class A {
	String field2; // null =>
	int number2; // 0 =>
	
}


public class inheritanceSample2 {

	static String field1;//null => 홍길동 저장
	static int number1;
	
	public static void main(String[] args) {
		inheritanceSample2 is = new inheritanceSample2();
		is.field1 = "홍길동";
		is.number1 = 100;
		
		System.out.println(field1);
		System.out.println(number1);
		
		//객체를 이용하여 다른 클래스의 속성이나 기능을 가져올 수 있다.
		A is2 = new A();
		is2.field2 = "홍길동2";
		is2.number2 = 200;
				
		System.out.println(is2.field2);
		System.out.println(is2.number2);
		
	}

}
