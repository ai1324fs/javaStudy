package oop_methodSample;

import java.util.Scanner;

/* 문제> 번호, 이름, Java, jsp, spring 점수를 입력 받아서 총점, 평균, 합점을 구하여 출력하시오
 * 단,  method() 반드시 사용하세요.
 * 입력은 위에 기술한 대로 하시고,
 * 출력은 마음대로
 * 전달인자값과 반환값은 4가지 중에서 고르세요
 * hint : OO, OX, XO, XX
 * 
 */


/* --------------------------------------------------------------------
 * number   name   java     jsp   spring   tptal   average    grade    
 * 	1		홍길동	100		100		100		300		100.0		A
 *  2		임걱정	99		100		100		299		99.9		A
 *  3		이순신	100		50		50		200		66.6		D
 * --------------------------------------------------------------------
 * - input : sungjukInput()
 * - process : sungjukProcess() => total, average, grade
 * - output : sungjukoutput()
 * 
 * 
 */



public class method_sungjukSample {
	//class variavle: auto initial
	String name;// null
	int bunho;
	int Java;//0
	int Jsp;//0
	int Spring;//0
	int total;
	double aver;
	char grade;
	
	
	private void sungjukInput() {
		
		Scanner sc = new Scanner(System.in);
		bunho = sc.nextInt();
		name = sc.next();
		Java = sc.nextInt();
		Jsp = sc.nextInt();
		Spring = sc.nextInt();
		
		
	}
	
	private void sungjukProcess() {
		//	300 = 100 + 100 + 100 

		

		
		
		
	}
	
	private void sungjukoutput() {
		System.out.println("----------------------------------------------------------------");
		System.out.println("number   name   java     jsp   spring   tptal   average    grade");
		System.out.println("----------------------------------------------------------------");
		System.out.println(bunho + "\t" + name + "\t" + Java +"\t" + Jsp +"\t" + Spring +"\t" + total +"\t" + aver +"\t" + grade + "\t");
		
	}

	public static void main(String[] args) {
		method_sungjukSample mss = new method_sungjukSample();
		for(int i=0; i<5; i++) {
		mss.sungjukInput();
		mss.sungjukProcess();
		mss.sungjukoutput();
		}
	}






}
