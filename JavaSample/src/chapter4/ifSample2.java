package chapter4;

import java.util.Scanner;

public class ifSample2 {

	public static void main(String[] args) {
		//  if (만일 ~ 라면, 조건식, 수식, 값...)
		//1. 단순 if < 몇번 써본다
		//2. if ~ else < 두번째로 많이 쓴다
		//3. if ~ else if ~ < 제일 많이 쓴다
		//4. if if if ~else else else... < 쓸일이 거의 없다
	Scanner sc = new Scanner(System.in);
	System.out.println("숫자(홀/짝)를 입력하시오");
	
		//2. if ~ else 테스트
		int su= sc.nextInt();
			
		if(su % 2 == 0) {
			System.out.println("짝수");	
		} else {
			System.out.println("홀수");
		}
		
	 System.out.println();//줄바꿈
		
		
		//3. if ~ else if~
		System.out.println("숫자(성별구분)를 입력하시오");
		int su2= sc.nextInt();
		
		if(su2 == 1) {
			System.out.println("남자");	
		} else if(su2 == 3) {
			System.out.println("남자");
		} else if(su2 == 2) {
			System.out.println("여자");
		} else if(su2 == 4) {
			System.out.println("여자");
		}
		
		// 1. 단문: 실행문장이 한개인 경우, 중/복문: 실행문장이 여러개인 경우 (....)
		System.out.println("성적(학점)을 입력하시오");
		int jumsu = sc.nextInt();
		
		if(jumsu >= 90) {
			System.out.println("A학점");	
		}else if(jumsu >= 80) {
			System.out.println("B학점");
		}else if(jumsu >= 70) {
			System.out.println("C학점");
		}else if(jumsu >= 60) {
			System.out.println("D학점");
		}else if(jumsu <= 59) {
			System.out.println("F학점");
		}
	}

}