package chapter4;

import java.util.Scanner;

public class whileSample4 {
	static Scanner sc = new Scanner(System.in);
static int i = 0;
	public static void main(String[] args) {
		// for : 가장 많이 사용됩니다.
		// 초기값, 조건식, 증감식
				while(i <= 6) { //조건문 입력
			System.out.println("성적(학점)를 입력하세요.");
			int jumsu = sc.nextInt();
			
			if(jumsu >= 90) {
				System.out.println("A학점");
			}else if(jumsu >= 80) {
				System.out.println("B학점");
			}else if(jumsu >= 70) {
				System.out.println("C학점");
			}else if(jumsu >= 60) {
				System.out.println("D학점");
			}else if(jumsu <= 59)
				System.out.println("F학점");
			i++; // 증감식Scanner sc = new Scanner(System.in);
		 i = 0; // 변수 입력
		
		

		}

	}

}
