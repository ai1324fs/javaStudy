package oop_Constructor;

import java.util.Scanner;

import oop_methodSample.method_dowhileSample2;

/* 문제1> 이름과 나이를 입력받아서, 메소드을 적용하고 출력하세요.
 */
public class constructorSample5_2_methodoverloading {

	//method overloading
	public void InputPrint(String name, int age) {
		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] args) {
		/* 1.data input : Scannner sc(name, age)
		 * 2.data output : process(name, age)
		 * 3. object create : constructorSample5 css5 = new constructorSample5();
		 */
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int age = sc.nextInt();
		
		constructorSample5_2_methodoverloading css5 = new constructorSample5_2_methodoverloading();		
			css5.InputPrint(name, age);
			
	}	
}
