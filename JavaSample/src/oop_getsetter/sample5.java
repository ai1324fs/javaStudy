package oop_getsetter;

import java.util.Scanner;


class sungjuk3 {
	String name;// null
	int bunho;
	int Java;//0
	int Jsp;//0
	int Spring;//0
	int total;
	double aver;
	char grade;
	
	
	
}




public class sample5 {
	//class variavle: auto initial
	

	
	
	
	
	
	
	
	
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
		total = Java + Jsp + Spring;
		aver = total / 3.0;
		

		
		
		
	}
	
	private void sungjukoutput() {
		System.out.println("----------------------------------------------------------------");
		System.out.println("number   name   java     jsp   spring   tptal   average    grade");
		System.out.println("----------------------------------------------------------------");
		System.out.println(bunho + "\t" + name + "\t" + Java +"\t" + Jsp +"\t" + Spring +"\t" + total +"\t" + aver +"\t" + grade + "\t");
		
	}

	public static void main(String[] args) {
		sung
		for(int i=0; i<5; i++) {
		mss.sungjukInput();
		mss.sungjukProcess();
		mss.sungjukoutput();
		}
	}






}
