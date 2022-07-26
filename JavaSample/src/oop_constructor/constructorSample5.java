package oop_Constructor;

import java.util.Scanner;

import oop_methodSample.method_dowhileSample2;

/* 문제1> 이름과 나이를 입력받아서, 생성자 오버로딩을 적용하고 출력하세요.
   문제2> 두수를 입력받아서,  생성자 오버로딩을 적용하여 가감승제산을 하고 출력하세요.	
 */
public class constructorSample5 {

	private String name;// null == "" == " " => hyun
	private int age;// 0 => 34
	
	//constructor method overloading
	public constructorSample5(String name) {
		this.name = name;
	}

	public constructorSample5(int age) {
		this.age = age;
	}

	private void namePrint() {
		System.out.println(name); 		
	}

	private void agePrint() {
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
		
		constructorSample5 css5 = new constructorSample5(name);		
			css5.namePrint();
		
		constructorSample5 css6 = new constructorSample5(age);
			css6.agePrint();	
			
	}	
}
