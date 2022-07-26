package oop_constructor;

import java.util.Scanner;

import oop_methodSample.method_dowhileSample2;

/* 문제2> 두 수를 입력받아서,  생성자 오버로딩을 적용하여 가감승제산(+, -, *, /, %)을 하고 출력하세요.	
 */
public class constructorSample6 {

	static Scanner sc = new Scanner(System.in);
	
	private static int su1;// 0 => 30
	private static int su2;// 0 => 40
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
	
	//constructor method overloading
	public constructorSample6(int su1, int su2) {
		this.su1 = su1;
		this.su2 = su2;
	}

	public constructorSample6(double su3, int su4) {
		this.su3 = su3;
		this.su4 = su4;
	}
	
	public constructorSample6(int su5, double su6) {
		this.su5 = su5;
		this.su6 = su6;
	}

	public constructorSample6(float su7, double su8) {
		this.su7 = su7;
		this.su8 = su8;
	}

	public constructorSample6() {  //default Constructor
		System.out.println("2개 모두 정수형 데이터를 입력해 주세요.");
		 su9 = sc.nextInt();
		 su10 = sc.nextInt();
		 
		 this.su9 = su9;
		 this.su10 = su10;		 
	}

	private void process1() {
		 sum1 = su1 + su2;
		System.out.println("Adder: " + sum1); 		
	}

	private void process2() {
		sum2 = su3 - su4;
		System.out.println("Suber: " + sum2); 		
	}
	
	private void process3() {
		sum3 = su5 * su6;
		System.out.println("Multier: " + sum3);		
	}

	private void process4() {
		sum4 = su7 / su8;
		System.out.println("Divide: " + sum4);		
	}
	
	private void process5() {
		sum5 = su9 / su10; 
		System.out.println("Divide: " + sum5);				
	}

	public static void main(String[] args) {
		/* 1.data input : Scannner sc(su1, su2)
		 * 2.data process : private constructorSample6(int su1, int su2)
		 *    => process()
		 * 3.data output: sum1, sum2, sum3, sum4, sum5
		 * 4. object create : constructorSample6 css6 = new constructorSample6();
		 */
		
		//adder
			System.out.println("두 개의 정수형 데이터를 입력해 주세요.");
		 su1 = sc.nextInt();
		 su2 = sc.nextInt();
		
		constructorSample6 css6 = new constructorSample6(su1, su2);	// 30, 40	
			css6.process1();
			
		//subtract	
			System.out.println("1개는 실수형, 1개는 정수형 데이터를 입력해 주세요.");
		 su3 = sc.nextDouble();
		 su4 = sc.nextInt();		
		constructorSample6 css7 = new constructorSample6(su3, su4);	// 30, 40	
			css7.process2();
			
		//multiply
			System.out.println("1개는 정수형, 1개는 실수형 데이터를 입력해 주세요.");
		 su5 = sc.nextInt();
		 su6 = sc.nextDouble();
		constructorSample6 css8 = new constructorSample6(su5, su6);	// 30, 40	
		css8.process3();

		//divide(몫)
			System.out.println("1개는 실수형, 1개는 실수형 데이터를 입력해 주세요.");
		 su7 = sc.nextFloat();
		 su8 = sc.nextDouble();
		constructorSample6 css9 = new constructorSample6(su7, su8);	// 30, 40	
		css9.process4();
		
		//divide(나머지)		
		constructorSample6 css10 = new constructorSample6();	// 30, 40	
		css10.process5();
	}

			
}
