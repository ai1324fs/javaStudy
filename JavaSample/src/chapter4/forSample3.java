package chapter4;

import java.util.Scanner;

public class forSample3 {

	public static void main(String[] args) {
		// for : 가장 많이 사용됩니다.
		// 초기값, 조건식, 증감식
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i <= 6; i++) {
			int su = sc.nextInt();
			
			String gender = (su == 1)? "남자": (su == 2)? "여자": 
				(su == 3)? "남자": (su == 4)? "여자": "잘못된 데이터 입니다."; 
			System.out.println(gender);// 남자, 여자	
			
		}

	}

}
