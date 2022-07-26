package oop_methodSample;

import java.util.Scanner;
/* 문제1> 두수를 입력받아서, 생성자 오버로딩을 적용하여 가감승제산(+,-,*,/,%)을 하고 출력하세요
 * 
 */
public class overloading4 {

	static Scanner sc = new Scanner(System.in);
	
	private static int su1; // 0 => 30
	private static int su2; // 0 => 40
	private static int sum1;
	
	private static double su3;
	private static int su4;
	private static double sum2;
	
	private static int su5;
	private static double su6;
	private static double sum3;
	
	private static float su7;
	private static double su8;
	private static double sum4;

	private static int su9;
	private static int su10;
	private static int sum5;
	
	public overloading4(int su1, int su2) {
			this.su1 = su1;
			this.su2 = su2;
	}
	
	public overloading4(double su3, int su4) {
		this.su3 = su3;
		this.su4 = su4;
}

	public overloading4(int su5, double su6) {
		this.su5 = su5;
		this.su6 = su6;
	}

	public overloading4(float su7, double su8) {
		this.su7 = su7;
		this.su8 = su8;
	}

	public overloading4() {
		System.out.println("두개의 정수형 데이터를 입력해 주세요");
		su9 = sc.nextInt();
		su10 = sc.nextInt();
		
		this.su9 = su9;
		this.su10 = su10;
	}

	private void process() {
		sum1 = su1 + su2;
		System.out.println("Adder: " + sum1);
		
	}
	
	private void process2() {
		sum2 = su3 - su4;
		System.out.println("Suber: " + sum2);
		
	}
	
	private void process3() {
		sum3 = su5 * su6;
		System.out.println("multier" + sum3);
		
	}
	
	private void process4() {
		sum4 = su7 / su8;
		System.out.println("Divide(몫)" + sum4);
		
	}
	
	private void process5() {
		sum5 = su9 % su10;
		System.out.println("Divide(나머지)" + sum5);
		
	}
	
	public static void main(String[] args) {
/*
1.data input : scanner sc(su1, su2)
2.data process : private overloading4(int su1, int su2)
	=> process()
3.data output: sum1, sum2, sum3, sum4, sum5
4.object create : overloading4 ai1 = new overloading4();
*/

		//Adder 덧셈
		System.out.println("두개의 정수형 데이터를 입력해 주세요");
		su1 = sc.nextInt();
		su2 = sc.nextInt();
		overloading4 ai1 = new overloading4(su1, su2); // 30 , 40
		ai1.process();
		
		System.out.println("1개의 실수형과 정수형 데이터를 입력해 주세요");
		//Suber
		 su3 = sc.nextDouble();
		 su4 = sc.nextInt();
		overloading4 ai2 = new overloading4(su3, su4); // 30 , 40
		ai2.process2();
		
		//multiply
		System.out.println("1개의 정수형과 실수형 데이터를 입력해 주세요");
		su5 = sc.nextInt();
		su6 = sc.nextDouble();
		overloading4 ai3 = new overloading4(su5, su6); // 30 , 40
		ai3.process3();
		
		//Divide(몫)
		System.out.println("두개의 실수형 데이터를 입력해 주세요");
		su7 = sc.nextFloat();
		su8 = sc.nextDouble();
		overloading4 ai4 = new overloading4(su7, su8); // 30 , 40
		ai4.process4();
		
		//Divide(나머지)
		overloading4 ai5 = new overloading4(); // 30 , 40
		ai5.process5();
	}











}
