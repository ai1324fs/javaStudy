package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/* Exception(예외처리): 돌발상황, 잘못되었을 때를 대비하여 미리 준비하는 것.
 * - 논리적인 오류: 프로그래머의 사고가 잘못된 경우
 * - 문법적인 오류: 자바 문법상의 오류
 * - 기계적인 오류: 이클립스의 버그, 운영체제상의 버그....
 * - 개발환경 오류: 버전이 안맞음, 버그가 존재...
 * - 예외상황 오류: 
 * 
 * try ~ catch(Excepition) {    } finally {    }
 * try: 이곳에 문제가 발생할 여지가 있는 코드를 기술합니다.
 * catch: (예외처리 클래스와 객체 발생) { ....}
 */
 //* finally{   close()....   }
 ///문제1> 국어점수 98점이고, 수학점수 100점인 경우의 합계를 구하세요.
//1.정수형 데이터
//2.합계 구하라
// 데이터타입 int, 변수 kor, 대입연산자 =, 데이터값 98 
//문제4> 영어점수 98.5점이고, 수학점수 100점인 경우의 합계는 실수형으로 구하세요.	
		//1.실수형 데이터, 정수형 데이터
			//2.합계 구하라
			//3.묵시적 형변환

public class Sample2 {

	private String name;// null == "" == " " => hyun
	private int age;// 0 => 34
	
	//constructor method overloading
	public Sample2(String name) {
		this.name = name;
	}

	public Sample2(int age) {
		this.age = age;
	}

	private void namePrint() {
		System.out.println(name); 		
	}

	private void agePrint() {
		System.out.println(age); 
	}
	
	public static void main(String[] args) {
		/* 1.data input : Scannner sc(name, age)
		 * 2.data output : process(name, age)
		 * 3. object create : constructorSample5 css5 = new constructorSample5();
		 */
		try {
			
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int age = sc.nextInt();
		
		Sample2 css5 = new Sample2(name);		
		css5.namePrint();
		
		Sample2 css6 = new Sample2(age);
		css6.agePrint();	
		}catch(InputMismatchException e) {
			System.out.println("숫자가 아니거나 정수형이 아닙니다.");
		}
			
	}	
}