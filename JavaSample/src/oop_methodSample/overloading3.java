package oop_methodSample;

import java.util.Scanner;

public class overloading3 {

	private String name; // null == "" == " "
	private int age;
	//constructor method averloading
	public overloading3(String name) {
		this.name = name;
	}
	public overloading3(int age) {
		this.age = age;
	}
	private void namePrint() {
	System.out.println(name);
	
	}
	private void agePrint() {
	System.out.println(age);
	}
	
	public static void main(String[] args) {
/*
1.data input : scanner sc(name, age)
2.data output : name, age
3.object create : overloading3 ai1 = new overloading3();
*/
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int age = sc.nextInt();
		
		overloading3 ai1 = new overloading3(name);
		ai1.namePrint();
		
		overloading3 ai2 = new overloading3(age);
		ai2.agePrint();
	}


}
