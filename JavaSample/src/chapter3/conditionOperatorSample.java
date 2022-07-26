package chapter3;

import java.util.Scanner;

public class conditionOperatorSample {
	
	public static void main(String[] args) {
		// 3항 연산자 = 조건 연산자
		// x = (조건식) ? 참(조건식,수식, 변수(값)): 거짓(조건식, 수식, 변수(값));
		Scanner sc = new Scanner(System.in);
		System.out.println("성적을 등록하세요");
		int value = sc.nextInt();
		
		String grade = (value >= 90)? "A": (value >= 80)? "B": 
			(value >= 70)? "C": (value >= 60)? "D": "F";
		System.out.println(grade);	
		
	
	
			
			
			
	
		
	}

}
