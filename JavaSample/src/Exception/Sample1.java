package Exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

/* Exception(예외처리): 돌발상황, 잘못되었을 때를 대비하여 미리 준비하는 것.
 *  - 논리적인 오류: 프로그래머의 사고가 잘못된 경우
 *  - 문법 오류: 자바 문법상의 오류
 *  - 기계적인 오류: 이클립스의 버그, 운영체제상의 버그....
 *  - 개발 환경 오류: 버전이 안맞음, 버그가 존재...
 *  - 예외 상황 오류 
 * 
 * try ~ catch(Exception e){     } finally {     }
 * try : 이곳에 문제가 발생할 여지가 있는 코드를 기술
 * catch(예외처리 클래스와 객체발생) {      }
 * finally {   close()...   }
 */
//문제> 영어점수 98.5점이고, 수학점수 100점인 경우의 합계는 실수형으로 구하세요.	
//1.실수형 데이터, 정수형 데이터
//2.합계 구하라
//3.묵시적 형변환

public class Sample1 {
		
	private static void sungjuk(double x, int y) {		
		double sum = x + y;// 묵시적 형변환
		System.out.println("실수형 합계: " + sum);//	
	}
	
	@SuppressWarnings("static-access")
	public static void main(String[] args)  { 
		
		double x = 0.0;
		int y = 0;
		boolean run = true;
		Sample1 sj = new Sample1();
		
		while (run) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.print("점수를 입력해 주세요 : ");
				 x = sc.nextDouble();  //98.5
				 y = sc.nextInt();//100
				 sj.sungjuk(x, y);		
						
					System.out.println("데이터를 계속 입력하시겠씁니까?(y/n)");
					String contious = sc.next();
					
					if (contious.equals("y")) {
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
			
			if (contious.equals("y")) {
				continue;
			} else {
				System.out.println("프로그램 종료 합니다.!!!");
				 run = false;
				break;
			}	
					
		}
		
	}

	
}
