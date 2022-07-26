package oop_Array;

import java.util.Scanner;

public class ArraySample3 {

	public static void main(String[] args) {
		// 1차원 배열
		/*
		 * 임의의 숫자를 입력받아서, 저장하고, 찾고자하는 데이터가 어디있는지를 판별하여 출력하세요. 1.int InputData[] = new
		 * int[n] : 7 InputData[i] => i 는 배열에 사용할 인덱스 2.데이터 갯수: 7개, n 3.for, while, do ~
		 * while 4.입력변수: inDataSu 5.검색할 변수: serarchData
		 * 
		 * 자바는 데이터를 입력 할대 기본적으로 문자열로 입력이 됩니다. 입력받은 숫자인 경우에는 parseInt()를 호출하여 숫자형태의 데이터로
		 * 변환하고 사용해야 합니다.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("배열에 저장할 갯수를 입력하세요.");
		String inDataSu = sc.next();// "7"
		int n = Integer.parseInt(inDataSu);// 7, char a = 'V';

		int InputData[] = new int[n];// 배열 선언

		System.out.println("저장 할 임의의 데이터를 입력해 주세요.");
		for (int i = 0; i < n; i++) {
			InputData[i] = sc.nextInt();
		}
		System.out.println();

		boolean run = true;
		
		while (run) {
			int serarchData = sc.nextInt();// 저장된 데이터중에서 찾을 값을 입력

			for (int i = 0; i < n; i++) { //
				
				if (InputData[i] == serarchData) {
					System.out.println(InputData[i] + "[" + i + "]" + "는 " + InputData[i]);
				} else {
					System.out.println(InputData[i] + "는 찾는 데이터가 아닙니다.");
				}
			}
			System.out.println();
			
			if(run) {
				System.out.println("데이터를 계속 찾으시겠씁니까?(y/n)");
				String contious = sc.next();
				
				if(contious.equals("y")) {
					continue;
				}else {
					System.out.println("프로그램 종료 합니다.!!!");
					break;
				}
			}
		}
		
	}

}
