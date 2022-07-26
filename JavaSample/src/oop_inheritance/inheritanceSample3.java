package oop_inheritance;

/* inheritance란? 상속
 *  - 기존에 존재하는 클래스로부터 속성과 기능을 물려 받아 새로운 기능을 구현 하거나, 추가 하는 것을 말한다
 *  - 부모 클래스 / 자식 클래스
 *  - 생성자는 상속이 안됩니다.
 *  - 기능적으로 볼 때, @overring : 추상 클래스 오버라이딩 (부모의 기능을 자식에게 적용할때 사용) => 추상 클래스, 인터페이스
 * 		부모: A기능 자식:B라고 구현 가능
 * 
 * public class A extends B { ...} } : 클래스들끼리의 상속
 * public class A extends B { ...} } : 추상 클래스가 일반 클래스에게 상속
 * public class A implements B { ...} } : 인터페이스들끼리의 상속
 * public class A extends B implements c, d, e { ...} } : 다중 상속의 효과 (c,d,e의 기능을 B에게 물려주고 B의 기능을 A에게 물려주는 방법)
 * 상속의 4가지

 *추상 클래스는 하나 이상의 추상 메소드와 문자열 상수 값으로 구성이 됩니다.
 */


abstract class A2 { // 부모 클래스
	public static String field2 = "이순신 장군";
	public static int number2 = 200; 
	public static int number3 = 300; 
	
	public abstract void cal();// 추상 메소드 : body가 없습니다. {		}
	
}

//				자식 클래스 역할
public class inheritanceSample3 extends A2 {

	static String field1;//null => 홍길동 저장
	static int number1;
	
	@Override	//추상 메소드 오버라이딩 
	public void cal() {
		int sum = number2 + number3;
		System.out.println("200 + 300 = " + sum);	
	}
	
	public static void main(String[] args) {
		inheritanceSample3 is = new inheritanceSample3();
		is.field1 = "홍길동";
		is.number1 = 100;
		
		System.out.println(field1);
		System.out.println(number1);
		
		//객체를 이용하여 다른 클래스의 속성이나 기능을 가져올 수 있다.
	//	A2 is2 = new A2();
	//	is2.field2 = "홍길동2";
	//	is2.number2 = 200;
	//	is2.number3 = 300;	
	//	is2.cal();
		
		is.cal();
		// 					클래스명.클래스변수
		System.out.println(A2.field2);
		System.out.println(A2.number2);
		System.out.println(A2.number3);
	}

}
