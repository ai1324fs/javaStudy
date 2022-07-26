package Exception;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import oop_getsetter.Sample1;

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

@SuppressWarnings("unused")
public class sample1_X {
	static Scanner sc = new Scanner(System.in);
	private void sungjuk(double x, int y) {
	 double sum = x + y;
	 System.out.println("실수형 합계: " + sum);
 }
 
	//@SuppressWarnings( )
	 public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		 double x = 0.0;
		 int y = 0;
		 boolean run = true;
		 sample1 sj = new sample1();
		 
		 while(run) {
			 try {
				 System.out.println("점수를 입력해 주세요 :");
				 x = sc.nextDouble();
				 y = sc.nextInt();
				 sj.sungjuk(x , y); // 트라이 안에는 
				 System.out.println("데이터를 계속 입력하시겠씁니까?(y/n)");
				 String contious = sc.next();	
				 
			 }catch(InputMismatchException e) {
				 System.out.println("숫자가 아닌 문자열이 입력되었습니다. 확인해 주세요.");
			 }
			 	
			 	if(contious.equals("y")) {
			 	continue; 
			 	} else {
		 		System.out.println("프로그램 종료 합니다.!!!");
				 run = false;
				break;
		 	}
		 }catch(InputMismatchException e) {
			 System.out.println("숫자가 아닌 문자열이 입력되었습니다. 확인해 주세요.");
		 }
		 System.out.println("데이터를 계속 입력하시겠씁니까?(y/n)");
		 	Scanner sc2 = new Scanner(System.in);
		 	String contious = sc2.next();	
	 }
}

