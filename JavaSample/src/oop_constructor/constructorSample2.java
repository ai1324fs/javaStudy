package oop_constructor;

import java.util.Scanner;

import oop_methodSample.method_dowhileSample2;

/* constructor
 * 1. 생성자 메소드라고 부릅니다.
 * 2. 클래스 변수의 초기화에 이용
 * 3. 클래스의 전달인자값으로 생성자 메소드에 매개변수에 전달하여 클래스 변수에 초기화를 합니다.
 * 4. default 생성자: 클래스명과 동일한 이름을 사용합니다.
 * 5. 셍상자는 절대로 상속이 안됩니다.
 * 6. 반환 타입이 존재하지 않습니다. return문이 필요 없습니다.
 * 7. 생성자는 오버로딩이 가능합니다.
 * 8. default 생성자는 JVM이 알아서 자동으로 삽입하여 줍니다.
 * 
 * 
 */
public class constructorSample2 {

	static Scanner sc = new Scanner(System.in);

	private int value; // 0 -> 100 => 90 => 80 => 70 => 60

	public constructorSample2(int value) { // 0 -> 100 => 90 => 80 => 70 => 60
		this.value = value; // 0 -> 100 => 90 => 80 => 70 => 60
	}

	public void Process() {
		int i = 0; // 변수입력

		String grade = (value >= 90) ? "A" : (value >= 80) ? "B" : (value >= 70) ? "C" : (value >= 60) ? "D" : "F";
		System.out.println(grade); // ?

	}

	public static void main(String[] args) {

		boolean run = true;
		while (run) {
			int value = 0;
			System.out.println("성적을 입력해 주세요: ");
			value = sc.nextInt();// 100

			constructorSample2 css = new constructorSample2(value); // 100
			css.Process();

			System.out.println("데이터를 계속 입력하시겠씁니까?(y/n)");
			String contious = sc.next();

			if (contious.equals("y")) {
				continue;
			} else {
				System.out.println("프로그램 종료 합니다.!!!");
				break;
			}
		}

	}
}
