package chapter3;

import java.util.Scanner;

public class relationSample1 {
	
	
	public static void main(String[] args) {
		//관계 연산자 (<, <=, >, >=, ==, !=)
		Scanner sc = new Scanner(System.in);			
		
		System.out.println("두수를 입력해주세요");
		float firstScore = sc.nextFloat();
		float secondScore = sc.nextFloat();
			
		
		System.out.println("less then: " + (firstScore < secondScore));
		System.out.println("less then equal: " + (firstScore <= secondScore));
		System.out.println("great then: " + (firstScore > secondScore));
		System.out.println("great then equal: " + (firstScore >= secondScore));
		System.out.println("equal: " + (firstScore == secondScore));
		System.out.println("not equal: " + (firstScore != secondScore));


				
		
	}

}
