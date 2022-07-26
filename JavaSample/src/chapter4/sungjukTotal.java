package chapter4; // 이러한 코딩은 통으로 짜서 관련 기능을 구현할때 사용

import java.util.Scanner;

class printsungjuk3 {
	
	static int total;//199
	static int kor;//100
	static int eng;//99
	static int aver;//99
	
	static void sungjukProcess(int kor, int eng) {
		total = kor + eng;// 100+= + 78 = 199
		aver = total / 2;// 199 / 2 = 99
	}

	public void sungjukOutput() {
		System.out.println(total);// 178
		System.out.println(aver);// 
	}
}




public class sungjukTotal {
	//클래스변수 :자동 초기화...
		static int kor;// 0 =>  100
		static int eng;// 0 => 99
		static int total;// 0 => 
		static int aver;// 0 => 

		
		static void sungjukInput() { // 클래스 메소드
			Scanner sc = new Scanner(System.in);
			System.out.println("국어 점수 입력 :");
			kor = sc.nextInt();//100
			System.out.println("영어 점수 입력 :");
			eng = sc.nextInt();//99

		}

		@SuppressWarnings("static-access")
		public static void main(String[] args) {
		//지역변수      new : 메모리 할당 연산자
		/* 
		 * 입력: kor, eng,sungjukInput()
		 * 처리: total, aver, sungjukProcess() => sungjukTotal() class
		 * 출력: sungjukOutput()
		 * 
		 */
			sungjukTotal gs = new sungjukTotal();

			for(int i=0; i<=3; i++) {
				
			
			
			gs.sungjukInput();//데이터 입력 메소드 호출
						
			printsungjuk3 ps3 = new printsungjuk3();
			
			ps3.sungjukProcess(kor, eng);
			
			ps3.sungjukOutput();
			}
		}
}
