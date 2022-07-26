package oop_methodSample;

import java.util.Scanner;

/* method overloading
 * 메소드가 같은 이름을 가지고 다른 역할을 하는 기능을 구현하는 것
 * - 자료형이나 갯수가 다르면 오버로딩이 가능합니다.
 */


public class method_overloadingSample2 {

	public void su() { // 메개변수 0개
		int sum = 0;

		for (int i=0; i<=100; i++) {
			sum+=i;
		}
		System.out.println("1~100사이의 합= " + sum);
	}
		
	
	
	public void su(int su) { // 메개변수 1개 
		int sum = 0;
		for(int i=0; i<=su; i++) {
			sum-=i;
		}
		System.out.println("1~100사이의 합= " + sum);
	}	
	
	
	
		public void su(int su1, int su2) { // 메개변수 2개
			int sum = 0;
			
			do {
				sum+=su1;
				su1+=1;
			}while(su1 <= su2);
		System.out.println("100~300사이의 합= " + sum);
		}
		
		
		
		
		public void su(int su1, double su2) { // 메개변수 2개
			double sum = 0;
			sum = su1 + su2;
		System.out.println("100~300사이의 합= " + sum);//400.123
		}
		
		
		
		public void su(double su1, int su2) { // 메개변수 2개
			int sum = 0;
			sum = (int) (su1 + su2);
		System.out.println("123.123~500사이의 합= " + sum);//623.123
		}
		
		
		
		
		private void su(String str) {
			System.out.println(str);
			
		}
		
		
		
		private void su(String str, String str2) {
			System.out.println(str + str2);
			
		}
		
		
		
		
		
		private void su(int number, String strstr) {
			int sum = 0;
			int s = 1;
			for (int i=1; i<=number; i++) {
				s*=i; // sum = sum * i
				sum+=s;
			}
			System.out.println(sum); // 입력된 값에 따라 달라짐
			System.out.println(strstr);// ??
		}
		
		public static void main(String[] args) {	
			Scanner sc = new Scanner(System.in);
			
			method_overloadingSample2 mds = new method_overloadingSample2();
								
			mds.su();
			mds.su(100);
			mds.su(100,300);
			mds.su(100,300.123);
			mds.su(123.123, 500);
			
			mds.su("Hello~");
			mds.su("Hello~", "현대빈");
	
			int number = sc.nextInt();
			String strstr = sc.next();
			
			mds.su(number, strstr);
			
		}


	}
/* 코딩 많이 연습해볼것
 * 개발자들의 결과목표를 보면서 따라해볼것
 * 개발자들의 개발일지나 개발도를 봐볼것
 * 
 * 
 */