package chapter4;

import java.util.Scanner;

public class globalvarSample {
	//클래스변수 :자동 초기화...
	static int kor;// 0 =>  100
	private static int eng;// 0 => 78
	private static int total;// 0 => 178
	static int aver;// 0 => 89

	
	static void sungjukInput() { // 클래스 메소드
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수 입력 :");
		kor = sc.nextInt();//100
		System.out.println("영어 점수 입력");
		eng = sc.nextInt();//78
		// kor = 100;
		// eng = 78;

	}

	static void sungjukProcess() {
		total = kor + eng;// 100+= + 78 = 178
		aver = total / 2;// 178 / 2 = 89
	}
	
	static void sungjukOutput() {
		System.out.println(total);// 178
		System.out.println(aver);// 89
	}

	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
	//지역변수      new : 메모리 할당 연산자
	/* 
	 * 입력: kor, eng,sungjukInput()
	 * 처리: total, aver, sungjukProcess()
	 * 	
	 * 출력: sungjukOutput()
	 * 
	 */
		globalvarSample gs = new globalvarSample();

		gs.sungjukInput();//데이타ㅓ 입력 메소드 호출
		
		gs.sungjukProcess();// 데이터 처리 메소드 호출
		
		gs.sungjukOutput();

	}


}
