package oop_Array;

import java.util.Scanner;

public class ArraySample4 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("배열에 저장할 갯수를 입력하세요.");
		String inDataSu = sc.next(); // "7" 문자
		int n = Integer.parseInt(inDataSu); // 7 숫자 , char a = 'V'; 싱글
		
		//	배열객체			정수형 데이터 n개를 저장할수 있는 데이터
		int InputData[] = new int[n]; //배열 선언
				
		System.out.println("저장 할 임의의 데이터를 입력해 주세요."); 
		for(int i=0; i<n; i++) { 
			InputData[i] = sc.nextInt();

		}
		System.out.println();
		
		System.out.println("불러올 데이터를 입력해 주세요."); 
		
		boolean run = true;
		
		while(run) {
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
		if(run) {
			System.out.println("데이타를 계속 찾으시겠습니까?(y/n)");
			String contoious = sc.next();
			
			if(contoious.equals("y")) {
				continue;
			}else {
				System.out.println("프로그램 종료 합니다.");
				break;
				}
			}
		}
	}

}
