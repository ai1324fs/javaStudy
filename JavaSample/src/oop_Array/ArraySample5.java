package oop_Array;

import java.util.Scanner;

// n개의 성적을 입력받아 총점과 평균을 구하시오
// 누적점수로 나오는것을 클리어 시켜서 다시 구하는 방법을 찾으시오
// 

public class ArraySample5 {

	public static void main(String[] args) {
		
		boolean run = true;	
		while(run) {
		Scanner sc = new Scanner(System.in);
		System.out.println("배열에 저장할 갯수를 입력하세요.");
		int inDataSu = sc.nextInt(); // "7" 문자
		
		//	배열객체			정수형 데이터 n개를 저장할수 있는 데이터
		int Scores[] = new int[inDataSu]; //배열 선언
		

		System.out.println("저장 할 성적 데이터를 입력해 주세요."); 
		for(int i=0; i<inDataSu; i++) { 
			Scores[i] = sc.nextInt();
		}
		System.out.println();
		
		
		
		int sum = 0;
		double aver = 0.0;

		int serarchData = sc.nextInt(); 
		
		
		for(int i=0; i<inDataSu; i++) { 
			sum+=Scores[i];
			aver = sum / inDataSu;
			}
		
		System.out.println("총점 점수: " + sum);
		System.out.println("평균 점수: " + aver);
		System.out.println();
		
		if(run) {
			System.out.println("성적을 계속 찾으시겠습니까?(y/n)");
			
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
