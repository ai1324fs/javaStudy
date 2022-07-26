package chapter3;

import java.util.Scanner;// ctrl + shift + o : n개의 임포트 가능

public class airthmeticSample2 {
//field: global variable = class variable = static classs variable
//문제 > 국어, 영어, 수학 점수를 입력하여 총점과 평균을 구하여 출력하세요
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			
		//산술 연산자(+, -, *, /, %)
	
				
				
				
			System.out.println("X값을 입력해주세요");
			int x = sc.nextInt();
			System.out.println("Y값을 입력해주세요");
			int y = sc.nextInt();
		
	
				
				int sum = x + y;
				int sum2 = x - y;
				int sum3 = x * y;
				int sum4 = x / y;
				int sum5 = x % y;
		
		
		
		
		
		System.out.println("덧셈: " + sum); // 50
		System.out.println("뺄셈: " + sum2); // -10
		System.out.println("곱셈: " + sum3); //  600
		System.out.println("나눗셈(몫): " + sum4); 
		System.out.println("나눗셈(나머지" + sum5);
		
	}

}
