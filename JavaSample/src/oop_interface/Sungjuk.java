package oop_getsetter;

import java.util.Scanner;

class Sungjuk {
	 //class variable: auto initial
	static int bunho;
	static String name;
	static int Java;
	static int JSP;
	static int Spring;
	//int total;
	//double aver;
	//char grade;
	int getBunho() {
		return bunho;		
	}
		
	private void setBunho(int bunho) {
		this.bunho = bunho;		
	}
	
	 int getSpring() {		
		return Spring;
	}
	
   private void setSpring(int spring) {		
		this.Spring = spring;
	}

   int getJSP() {		
		return JSP;
	}
   
	private void setJSP(int jSP) {		
		this.JSP = jSP;
	}

	 int getJava() {		
		return Java;
	}
	
	private void setJava(int java) {		
		this.Java = java;
	}

	 String getName() {		
		return name;
	}
	
	private void setName(String name) {		
		this.name = name;
	}
		
	void sungjukInput() {	
		Sungjuk sj = new Sungjuk();
		Scanner sc = new Scanner(System.in);
		bunho = sc.nextInt();//001
		name = sc.next();//홍길동
		Java = sc.nextInt();//100
		JSP = sc.nextInt();//100
		Spring = sc.nextInt();//1000
		 
		setBunho(bunho); 
		setName(name);
		setJava(Java);
		setJSP(JSP);
		setSpring(Spring); 
	}

}
