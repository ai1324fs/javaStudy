package chapter4;

import java.util.Scanner;

// fileName = className : 클래스 명은 파일명이다
public class dowhileSample2 {

	public static void main(String[] args) {
		//while : 조건식 = 수식, 많이 사용됩니다.
		Scanner sc = new Scanner(System.in);
	int i = 0; // 변수입력
	
	do { 
		int value = sc.nextInt();
		
		String grade = (value >= 90)? "A": (value >= 80)? "B": 
			(value >= 70)? "C": (value >= 60)? "D": "F";
		System.out.println(grade);	//B
		i++; // 증감식
		}while(i < 5);
		
	}
}
// 메소드 명을 클래스 명과 같게 만들때는 생성자여야 한다.
// 조건식은 위에 두고 증감식은 밑에서 사용