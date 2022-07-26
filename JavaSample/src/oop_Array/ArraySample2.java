package oop_Array;

import java.util.Scanner;

public class ArraySample2 {

	public static void main(String[] args) {
		// 1차원 배열
		/*
		 * 임의의 숫자를 입력받아서, 저장하고, 찾고자하는 데이터가 어디있는지를 판별하여 출력하세요
		 * 1.int InputData[] = new int[n] : 7
		 * 2.데이터 갯수: 7개
		 * 3.for, while, do~while 
		 * 4.입력변수: in
		 * 5.검색변수: serarchData
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
		 * 입력했던 것을 지정하여 불러오는 방법 (반복문 응용법)
		 * 저장변수: 입력했던 데이터
		 * 입력변수: 지정된 번호
		 * 검색할변수: 입력됐던 데이터 serarchData
		 */
		//do~while 문으로 입력문 을 do에 두고 출력과 
		
		
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
		
		System.out.println("불러올 데이터를 입력해 주세요."); 
		int serarchData = sc.nextInt(); // 8 => [2]
		
		// 전에 배웠던 과정들 다시 코딩해볼것.
		for(int i=0; i<n; i++) { // i = 0, 1, 2, 
			//		1 == 8   5 == 8, 8 == 8
			if(InputData[i] == serarchData) {
				System.out.println(InputData[i] + "[" + i + "]" + " 는 " + InputData[i] );
			}else {
				System.out.println(InputData[i] + "는 찾는 데이터가 아닙니다.");
			}
		} 

		System.out.println();
	}

}
