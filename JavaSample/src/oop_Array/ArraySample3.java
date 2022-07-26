package oop_Array;

import java.util.Scanner;

public class ArraySample3 {

	public static void main(String[] args) {
		// 1차원 배열
		/*
		 * 임의의 숫자를 입력받아서, 저장하고, 찾고자하는 데이터가 어디있는지를 판별하여 출력하세요
		 * 1.int InputData[] = new int[n] : 7
		 * InputData[i] => i 는 배열에 사용할 인덱스
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
		String inDataSu = sc.next(); // "7" 문자
		int n = Integer.parseInt(inDataSu); // 7 숫자 , char a = 'V'; 싱글
		
		//	배열객체			정수형 데이터 n개를 저장할수 있는 데이터
		int InputData[] = new int[n]; //배열 선언
				
		System.out.println("저장 할 임의의 데이터를 입력해 주세요."); 
		for(int i=0; i<n; i++) { // i가 0인데, i가 5보다 작으면 처음으로 돌아가서 다시 질문, 1<5, 2<5, 3<5, 4<5, 5<5[X]
			InputData[i] = sc.nextInt();
			/* InputData[i] = 50 으로 넣었다 치면
			 * InputData[1] = 75
			 * InputData[2] = 750
			 * InputData[3] = 7500
			 * InputData[4] = 75000
			 * i<n이 끝나서 다음 내용으로 이동
			 */
		}
		System.out.println();
		
		System.out.println("불러올 데이터를 입력해 주세요."); 
		int serarchData = sc.nextInt(); // 저장된 데이터 중에서 찾을 값을 입력
		
		// 전에 배웠던 과정들 다시 코딩해볼것.
		for(int i=0; i<n; i++) { 
			// 
			//		50 == 7500
			if(InputData[i] == serarchData) {
				System.out.println(InputData[i] + "[" + i + "]" + " 는 " + InputData[i] );
			}else {
				System.out.println(InputData[i] + "는 찾는 데이터가 아닙니다.");
			}
		} 

		System.out.println();
	}

}
