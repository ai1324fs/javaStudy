package chapter4;

import java.util.Scanner;

public class ifSample {

	public static void main(String[] args) {
		//  if (만일 ~ 라면, 조건식, 수식, 값...)
		//1. 단순 if
		//2. if ~ else
		//3. if ~ else if ~
		//4. if if if ~else else else...
	Scanner sc = new Scanner(System.in);
		//1.단순if 테스트
		int su= sc.nextInt();
			
		if(su % 2 == 0) {
			System.out.println("짝수");	
		}
		
		if(su % 2 != 0) {
			System.out.println("홀수");
		}
		
		/*if(!(su % 2 == 0)) {
			System.out.println("홀수");
		}*/
		
		System.out.println();	//남자, 여자	
	}

}