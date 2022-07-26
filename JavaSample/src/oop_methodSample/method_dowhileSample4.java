package oop_methodSample;

import java.util.Scanner;

public class method_dowhileSample4 {
	private Scanner sc;

	private void ifgradeProcess() {
		do { //조건문 입력
			int i = 0; // 변수 입력
			System.out.println("성적(학점)를 입력하세요.");
			int jumsu = sc.nextInt();
			Scanner sc = new Scanner(System.in);
			if(jumsu >= 90) {
				System.out.println("A학점");
			}else if(jumsu >= 80) {
				System.out.println("B학점");
			}else if(jumsu >= 70) {
				System.out.println("C학점");
			}else if(jumsu >= 60) {
				System.out.println("D학점");
			}else if(jumsu <= 59)
				System.out.println("F학점");
			i++; // 증감식
		}while(i <= 6);
		
	}
	
	public static void main(String[] args) {
		// for : 가장 많이 사용됩니다.
		// 초기값, 조건식, 증감식
		
		
		method_dowhileSample4 mds4 = new method_dowhileSample4();
		mds4.ifgradeProcess();
		
		


		
		
	

	}



}
