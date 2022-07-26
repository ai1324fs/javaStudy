package oop_Array2;

import java.util.Scanner;

public class ArraySample4 {

	public static void main(String[] args) {
		// 1차원 배열
		/*
		 * n개의 성적을 입력 받아서 총점, 평균을 구하여 출력하는 프로그램 작성.
		 * 
		 */
		boolean run = true;

		while (run) {
			Scanner sc = new Scanner(System.in);
			System.out.println("배열에 저장할 갯수를 입력하세요.");
			int inDataSu = sc.nextInt();// 7

			int Scores[] = new int[inDataSu];// 배열 선언

			System.out.println("저장 할 성적 데이터를 입력해 주세요.");
			for (int i = 0; i < inDataSu; i++) {
				Scores[i] = sc.nextInt();
			}
			System.out.println();

			int sum = 0;
			double aver = 0.0;

			for (int i = 0; i < inDataSu; i++) { //
				sum += Scores[i];
				aver = sum / inDataSu;
			}
			System.out.println(sum);
			System.out.println(aver);

			System.out.println();

			System.out.println("데이터를 계속 입력하시겠씁니까?(y/n)");
			String contious = sc.next();

			if (contious.equals("y")) {
				continue;
			} else {
				System.out.println("프로그램 종료 합니다.!!!");
				break;
			}
		}

	}

}
