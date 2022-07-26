package oop_inheritance2;

import java.util.Scanner;


/*상속을 이용한 학점구하기
 * 
 * public A extends B {....} : 일반 클래스
 * public abstract class A extends B {....} :  추상 클래스
 * 
 */

public class sample2 {

	public static void main(String[] args) {
		/* input: value : class A
		 * process: process() , class B
		 * output: grade, class C
		 * 문제1>public A extends B {....} : 일반 클래스
		 * 문제2>public abstract class A extends B {....} :  추상 클래스
		 */
		
		AA a = new AA();
		a.input();
		
		BB b = new BB();
		b.process();
		
		CC c = new CC();
		c.print();

	}

}
