package chapter4;

import java.util.Scanner;

public class whileSample3 {

	public static void main(String[] args) {
		// while(조건식)
		// 변수 선언
		// 조건식
		// 증감식
		
		Scanner sc = new Scanner(System.in);
		int i = 0;// 변수선언
		
		while (i <= 3) { // 0 <=3, 1<=3, 2<=3. 3<=3, 4<=3 (조건식)
			int su = sc.nextInt();
			
			String gender = (su == 1)? "남자": (su == 2)? "여자": 
				(su == 3)? "남자": (su == 4)? "여자": "잘못된 데이터 입니다."; 
			System.out.println(gender);// 남자, 여자	
			i++; // 증감식 
		}

	}

}


