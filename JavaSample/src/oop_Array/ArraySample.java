package oop_Array;

import java.util.Scanner;

/* Array(배열): 데이타ㅓ가 많은 경우에 사용합니다. => 자료구조(LinkedList, Vector, ArrayList...)
 * RAM(memory) = address(pointer) = Array = index
 * - 데이터 50개 
 * index(address) : 숫자를 0부터 시작 , 대략 5개가 있다 치면 0부터 세어 4까지 5개가 있다 / 주어진 숫자에서 1씩 뺀다 생각하면 된다
 * 아파트로 따지면 호는 1차원 동은 2차원 단지는 3차원/ 행은 밑으로 열은 옆으로 면은 행열을 복사하는 갯수
 * 1차원 배열: 점, s[5] = s[0],s[1],s[2],s[3],s[4] .... s[49] 표현
 * 2차원 배열: 선, 행(x좌표), 열(y좌표) : 
 * 	s[3][2] = [2][1] :
 *  s[0][0], s[0][1], 
 *  s[1][0], s[1][1],
 *  s[2][0], s[2][1]....
 * 3차원 배열: 면(공간), s[3][3][4] : s[2][2][3]
 *   s[0][0][0], s[0][0][1], s[0][0][2], s[0][0][3]
 *   s[0][1][0], s[0][1][1], s[0][1][2], s[0][1][3]
 *   s[0][2][0], s[0][2][1], s[0][2][2], s[0][2][3],
 *   
 *   s[1][0][0], s[1][0][1], s[1][0][2], s[1][0][3]
 *   s[1][1][0], s[1][1][1], s[1][1][2], s[1][1][3]
 *   s[0][2][0], s[0][2][1], s[0][2][2], s[0][2][3],
 *   
 *   s[2][0][0], s[2][0][1], s[2][0][2], s[2][0][3]
 *   s[2][1][0], s[2][1][1], s[2][1][2], s[2][1][3]
 *   s[0][2][0], s[0][2][1], s[0][2][2], s[0][2][3],
 *    
 * N차원 배열: 시.공간
 * 대부분의 프로그래밍 언어는 행 우선이 기준: 왼쪽에서 오른쪽으로 데이터 저장
 */
public class ArraySample {

	public static void main(String[] args) {
		// 1차원 배열
		/*
		 * 임의의 숫자를 입력받아서, 저장하고, 찾고자하는 데이터가 어디있는지를 판별하여 출력하세요
		 * 1.int InputData[] = new int[n] : 7
		 * 2.데이터 갯수: 7개
		 * 3.for, while, do~while 
		 * 4.입력변수: in
		 * 5.출력변수: out
		 * 
		 * 자바는 데이터를 입력할 때 기본적으로 문자열로 입력이 됩니다.
		 * 입력받은 숫자인 경우에는 parse Int()를 호출하여 숫자형태의 데이터로 변환하고
		 * 사용해야 합니다. 
		 */ //여기까지 설계도를 짜놓고 나서 코딩을 할것
		
		// for 출력과정에서 인풋의 과정을 반복하여 
		// 1부터 n보다 작을때까지 7개니깐 7번 반복
		// 괄호를 써서 인덱스를 알아보기 위하여 사용 내가 넣어준것을 몇번째에 들어가는지 숫자를 적어준것
		// 정해진 횟수만큼 반복하는것
		// 거기서 정해진 숫자를 지정해서 출력하는 방법을 적용하는것 (알고리즘)
		
		/*
		 * 입력했던 순서를 지정하여 불러오는 방법
		 * 저장변수: 입력했던 데이터
		 * 입력변수: 지정된 번호
		 * 출력변수: 입력됐던 데이터
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("배열에 저장할 갯수를 입력하세요.");
		String inDataSu = sc.next(); // "7"
		int n = Integer.parseInt(inDataSu); // 7
		
		int InputData[] = new int[n]; // InputData[0],[1],[2],[3],[4],[5],[6] = 7
		
		System.out.println("저장 할 임의의 데이터를 입력해 주세요."); 
		for(int i=0; i<n; i++) { // 저장
			InputData[i] = sc.nextInt();
		}
		System.out.println();
		
		System.out.println("불러올 데이터의 숫자를 입력해 주세요."); 
		
		for(int i=0; i<n; i++) {
			System.out.println();
		}
		
		
		for(int i=0; i<n; i++) { // 출력
			System.out.println(InputData[i] + "[" + i + "]" + " 는 " + InputData[i] );
		} 
		
		int i2 = sc.nextInt();
		
		
		
		System.out.println();
		

	}

}
