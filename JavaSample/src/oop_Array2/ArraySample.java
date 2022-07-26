package oop_Array;

import java.util.Scanner;

/* Array(배열): 데이터가 많은 경우에 사용합니다. => 자료구조(LinkedList, Vector, ArrayList...)
 * RAM(memory) = address(pointer) = Array = index
 *  - 데이터 50개 
 * index(address) :  
 * 1차원 배열: 점, s[5] = s[0], s[1], s[2], s[3], s[4]....s[49] 표현
 * 2차원 배열: 선, 행(x좌표), 열(y좌표) : 
 *   s[3][2] = [2][1] : 
 *   s[0][0], s[0][1], 
 *   s[1][0], s[1][1], 
 *   s[2][0], s[2][1]......
 *    
 * 3차원 배열: 면(공간), s[3][3][4] : s[2][2][3]
 *  s[0][0][0], s[0][0][1], s[0][0][2], s[0][0][3]
 *  s[0][1][0], s[0][1][1], s[0][1][2], s[0][1][3]
 *  s[0][2][0], s[0][2][1], s[0][2][2], s[0][2][3]
 * 
 *  s[1][0][0], s[1][0][1], s[1][0][2], s[1][0][3]
 *  s[1][1][0], s[1][1][1], s[1][1][2], s[1][1][3]
 *  s[1][2][0], s[1][2][1], s[1][2][2], s[1][2][3]
 *  
 *  s[2][0][0], s[2][0][1], s[2][0][2], s[2][0][3]
 *  s[2][1][0], s[2][1][1], s[2][1][2], s[2][1][3]
 *  s[2][2][0], s[2][2][1], s[2][2][2], s[2][2][3]
 *  
 * N차원 배열: 시.공간 
 * 대부분의 언어는 행 우선이 기준: 왼쪽에서 오른쪽으로 데이터 저장 
 */
public class ArraySample {

	public static void main(String[] args) {
		// 1차원 배열
		/*
		 * 임의의 숫자를 입력받아서, 저장하고, 찾고자하는
		 * 데이터가 어디있는지를 판별하여 출력하세요. 
		 * 1.int InputData[] = new int[n] : 7
		 * 2.데이터 갯수: 7개, n
		 * 3.for, while, do ~ while
		 * 4.입력변수: inDataSu
		 * 5.출력변수: outData
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
		
		for(int i=0; i<n; i++) {
			System.out.println(InputData[i] + "[" + i + "]" + "는 " + InputData[i]);
		}
		System.out.println();
		

	}

}
