package oop_Array;

import java.util.Scanner;


public class ArraySample2 {

	public static void main(String[] args) {
		// 1차원 배열
		/*
		 * 임의의 숫자를 입력받아서, 저장하고, 찾고자하는
		 * 데이터가 어디있는지를 판별하여 출력하세요. 
		 * 1.int InputData[] = new int[n] : 7
		 * 2.데이터 갯수: 7개, n
		 * 3.for, while, do ~ while
		 * 4.입력변수: inDataSu
		 * 5.검색할 변수: serarchData
		 * 
		 * 자바는 데이터를 입력 할대 기본적으로 문자열로 입력이 됩니다.
		 * 입력받은 숫자인 경우에는 parseInt()를 호출하여 숫자형태의 데이터로 변환하고
		 * 사용해야 합니다.   
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("배열에 저장할 갯수를 입력하세요.");
		String inDataSu = sc.next();// "7"
		int n = Integer.parseInt(inDataSu);// 7
				
		int InputData[] = new int[n];// InputData[0],[1],[2],[3],[4],[5],[6] = 7
		
		System.out.println("저장 할 임의의 데이터를 입력해 주세요.");
		for(int i=0; i<n; i++) {
			InputData[i] = sc.nextInt();
		}
		System.out.println();
		
		int serarchData = sc.nextInt();// 8 => [ 2 ]
		
		for(int i=0; i<n; i++) { // i=0, 1, 2
			//    1 == 8,  5 == 8, 8 == 8
			if(InputData[i] == serarchData) {
				System.out.println(InputData[i] + "[" + i + "]" + "는 " + InputData[i]);
			}else {
				System.out.println(InputData[i] + "는 찾는 데이터가 아닙니다.");
			}				
		}
			
		System.out.println();

	}

}
