package chapter4;

import java.util.Scanner;

// fileName = className : 클래스 명은 파일명이다
public class forSample2 {

	public static void main(String[] args) {
		//for : 가장 많이 사용됨
		Scanner sc = new Scanner(System.in);
	int value = sc.nextInt();
	for(int i = 0; i <= 10; i++) {
		String grade = (value >= 90)? "A": (value >= 80)? "B": 
			(value >= 70)? "C": (value >= 60)? "D": "F";
		System.out.println(grade);	
		}
		
	}
}
