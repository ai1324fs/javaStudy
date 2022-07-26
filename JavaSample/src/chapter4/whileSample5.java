package chapter4;

import java.util.Scanner;

public class whileSample5 {

	public static void main(String[] args) {
		// while (조건문)
		Scanner sc = new Scanner(System.in);
		
		// 프로그램 중지: ctrl + z
		while(sc.hasNextInt()) { // 무제한 실행 = 무한 루프
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
		}

	}

}
