package chapter3;

import java.util.Scanner;// ctrl + shift + o : n개의 임포트 가능

public class airthmeticSample3 {
//field: global variable = class variable = static classs variable
//문제 > 국어, 영어, 수학 점수를 입력하여 총점과 평균을 구하여 출력하세요
/* 1. 국어, 영어, 수학 점수를 입력받는다.
 * 2. 총점 구하기
 * 3. 평균 구하기
 * 4. 결과 출력
 * 
 *  요구사항 분석
 *  요구사항 설계
 *  - 입력 변수 : 실수형(float, double)
 *   국어:  korScore, 영어 engScore, 수학 matScore
 *   - 총점 totalSum
 *   - 평균: aver
 *   
 *  애플리케이션 구현
 *  
 */
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			
		//산술 연산자(+, -, *, /, %)
		

		
		
		System.out.println("--성적처리--");
		System.out.println("국어점수를 입력해주세요");
		float korScore = sc.nextFloat();
		System.out.println("영어점수를 입력해주세요");
		float engScore = sc.nextFloat();
		System.out.println("수학점수를 입력해주세요");
		float matScore = sc.nextFloat();
	
		//총점 구하기 루틴
		float totalSum = korScore + engScore + matScore;
		//평균 구하기 루틴
		float aver = (float) (totalSum / 3.0);
	
		System.out.printf("총점: %6.3f \n", totalSum);
		System.out.println("평균점수: " + aver);

				
				

			//	int sum2 = x - y;
				//int sum3 = x * y;
				//int sum4 = x / y;
				//int sum5 = x % y;
		
		
		
		
		
	/*	System.out.println("덧셈: " + sum); // 50
		System.out.println("뺄셈: " + sum2); // -10
		System.out.println("곱셈: " + sum3); //  600
		System.out.println("나눗셈(몫): " + sum4); 
		System.out.println("나눗셈(나머지" + sum5); */
		
	}

}
