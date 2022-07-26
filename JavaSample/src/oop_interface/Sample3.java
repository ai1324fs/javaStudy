package oop_interface;

import java.util.Scanner;

/* 문제> 번호, 이름, Java, JSP, Spring 점수를 입력 받아서 총점, 평균, 학점을 구하여 출력하시오.
 * 단, method() 반드시 사용하세요.
 * 입력은 위에 기술한 대로 하시고,
 * 출력은 마음대로
 * 전달인자값과 반환값은 4가지중에서 고르세요.
 * hint> OO, OX, XO, XX
 * ------------------------------------------------------------------
 *  number   name  Java   JSP   Spring   total   average    grade
 * ------------------------------------------------------------------
 *   1      홍길동   100   100    100      300      100.0        A
 *   2      임걱정    99   100    100      299       99.9        A 
 *   3      이순신   100    50     50      200       66.6        D
 * -------------------------------------------------------------------
 * - input : sungjukInput()
 * - process : sungjukProcess() => total, average, grade
 * - output : sungjukOutput()
 * 
 * 1.get(조회)/setter(저장) 설정
 * 2.통/분리 작성: 2개 클래스로 분리, 
 * 3.main: Sample3 => main method 존재하므로
 * 4.sub: Sunkjuk class => getter/setter 설정
 */


public class Sample3 {
	Sungjuk sj = new Sungjuk();
	
	//private int Java;
	//private int JSP;
	//private int Spring;
	private int total;
	private double aver;
	private char grade;

	private void sungjukProcess() {
		//  300    100    100   100
	 total = sj.Java + sj.JSP + sj.Spring;
	 aver = total / 3.0; // 100.0 
		
	 switch((int)(aver / 10)) {
	 case 10:
	 case 9:
		 grade = 'A';
		 break; 
	 case 8:
		 grade = 'B';
		 break; 
	 case 7:
		 grade = 'C';
		 break; 
	 case 6:
		 grade = 'D';
		 break; 
	 default:
		 grade = 'F';
		 break;
	 }	 
	}
	
	private void sungjukOutput() {
		System.out.println("----------------------------------------------------------------------");
		System.out.println(" number   name  Java   JSP   Spring   total   average  grade");
		System.out.println("--------------------------------------------------------------");
		//System.out.println(sj.bunho + "\t" + sj.name + "\t"+ sj.Java + "\t" + sj.JSP + "\t" + sj.Spring + "\t" + total + "\t" + aver + "\t" + grade);
		System.out.println(sj.getBunho() + "\t" + sj.getName() + "\t"+ sj.getJava() + "\t" + sj.getJSP() + "\t" + sj.getSpring() + "\t" + total + "\t" + aver + "\t" + grade);
		System.out.println("----------------------------------------------------------------------");
		
	}
	
	public static void main(String[] args) {
		
		Sample3 mss = new Sample3();
		
		int cnt=0;
		
		while(cnt < 5) { //0<5, 1,5...
				
			Sungjuk sj = new Sungjuk();
			sj.sungjukInput();
			
			mss.sungjukProcess();
			mss.sungjukOutput();
			cnt++;// 1
		}
		 
	}

}
