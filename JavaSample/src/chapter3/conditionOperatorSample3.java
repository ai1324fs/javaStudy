package chapter3;

import java.util.Scanner;

public class conditionOperatorSample3 {
	
	public static void main(String[] args) {
//문제> 데이터가 입력되는데, 홀수인지 짝수인지 판별하여 출력하세요.
/* 홀수 : 1,3,5,7,9
 * 짝수 : 2,4,6,8,10
 * 구분
 *  --------------
 *  100 / 2 (나누기)
 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		
		int su= sc.nextInt();
			
		String sum2 = (su % 2 == 0)? "홀수": "짝수";
				
		System.out.println(sum2);	//남자, 여자	
	}

}
