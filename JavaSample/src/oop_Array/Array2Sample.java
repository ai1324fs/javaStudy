package oop_Array;

import java.util.Scanner;

public class Array2Sample {

	public static void main(String[] args) {
		// 1차원 배열
		// n개의 성적을 입력받아 총점과 평균을 구하시오
/* kosmo hotel을 중측합니다.
 * 5층이고, 각 층은 7개 호실로 구성됩니다. [5][7]
 * 이때, 투수객의 데이터가 다음과 같이 주어진디면,
 * 전체 인원수와 각 층의 평균 이원수를 계산하여 출력하세요.
 * <데이터>
 * 1층: 1,2,3,4,5,6,7,
 * 2층: 11, 22, 33, 44, 55,  66, 77
 * 3층: 3, 6, 5, 2, 1, 3, 6
 * 4층: 10,9, 8, 7, 6, 5, 0
 * 5층: 10, 15, 20, 25, 30, 35, 40
 * 
 * 프로젝트에서는 사용을 잘 안함
*/ 
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("kosmo hotel 배열에 저장할 갯수를 입력하세요.");
		int inRum = sc.nextInt(); // 5
		int incolumn = sc.nextInt(); // 7
		
		int komos[][] = new int[inRum][incolumn]; // InputData[0],[1],[2],[3],[4],[5],[6] = 7
		
		
		System.out.println("각층과 호수의 인원수를 입력해 주세요."); 
		//다중 for문
		for(int i=0; i<komos.length; i++) { // 저장
			for(int j=0; j < komos[i].length; j++) {
				komos[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		
		int sum = 0;
		double aver = 0;
		
		// 전에 배웠던 과정들 다시 코딩해볼것.
		for(int i=0; i<komos.length; i++) { // i = 0, 1, 2, 
			
			for(int j=0; j<komos.length; j++) {
				sum+=komos[i][j];
			}
			aver = sum / komos[i].length;	
		}
		System.out.println(sum);
		System.out.println(aver);
		System.out.println();
	}

}
