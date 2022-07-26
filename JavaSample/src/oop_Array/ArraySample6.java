package oop_Array;

import java.util.Scanner;

// n개의 성적을 입력받아 총점과 평균을 구하시오
/* kosmo hotel을 중측합니다.
 * 5층이고, 각 층은 7개 호실로 구성됩니다. [5][7]
 * 이때, 투수객의 데이터가 다음과 같이 주어진디면,
 * 전체 인원스와 각 층의 평균 이원수를 계산하여 출력하세요.
 * <데이터>
 * 1층: 1,2,3,4,5,6,7,
 * 2층: 11, 22, 33, 44, 55,  66, 77
 * 3층: 3, 6, 5, 2, 1, 3, 6
 * 4층: 10,9, 8, 7, 6, 5, 0
 * 5층: 10, 15, 20, 25, 30, 35, 40
*/ 

public class ArraySample6 {

	public static void main(String[] args) {
		
		boolean run = true;	
		while(run) {
		Scanner sc = new Scanner(System.in);
		System.out.println("호텔의 총 층수를 적어주세요.");
		int inDataSu = sc.nextInt(); // "7" 문자
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
