package oop_methodSample;

import java.util.Scanner;

// fileName = className : 클래스 명은 파일명이다
public class method_dowhileSample2 {
	
	public void gradeProcess() {
		int i = 0; // 변수입력
		
		do { 
			Scanner sc = new Scanner(System.in);
			int value = sc.nextInt();
			
			String grade = (value >= 90)? "A": (value >= 80)? "B": 
				(value >= 70)? "C": (value >= 60)? "D": "F";
			System.out.println(grade);	//B
			i++; // 증감식
			}while(i < 5); //0<0,1<5,2<5,3<5,4<5,5<5[X]
	}

	public static void main(String[] args) {
		//while : 조건식 = 수식, 많이 사용됩니다.
		method_dowhileSample2 mds2 = new method_dowhileSample2();
		// 전달인자값 X, 반환값 X
		mds2.gradeProcess();
	}

}
// 메소드 명을 클래스 명과 같게 만들때는 생성자여야 한다.
// 조건식은 위에 두고 증감식은 밑에서 사용