package oop_inheritance2;

import java.util.Scanner;


/*상속을 이용한 학점구하기
 * 
 * public A extends B {....} : 일반 클래스
 * public abstract class A extends B {....} :  추상 클래스
 * 
 */

class A {
	static int value;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		value = sc.nextInt(); // 100
	}
}

class B extends A {
	static String grade;
	public void process() {
		grade = (value >= 90)? "A": (value >= 80)? "B": 
			(value >= 70)? "C": (value >= 60)? "D": "F";

		
	}
	
}


class C extends B {

	public void print() {
		System.out.println("학점: " + grade);
		
	}
	
}


public class sample {

	public static void main(String[] args) {
		/* input: value : class A
		 * process: process() , class B
		 * output: grade, class C
		 * 문제1>public A extends B {....} : 일반 클래스
		 * 문제2>public abstract class A extends B {....} :  추상 클래스
		 */
		
		A a = new A();
		a.input();
		B b = new B();
		b.process();
		C c = new C();
		c.print();

	}

}
