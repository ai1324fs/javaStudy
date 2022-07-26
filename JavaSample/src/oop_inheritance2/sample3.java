package oop_inheritance2;

import java.util.Scanner;

public class sample3 extends AAA{
	static int value;
	static String grade;
	
	@Override
	public void input() {
		System.out.println("점수 입력");
		Scanner sc = new Scanner(System.in);
		value = sc.nextInt(); // 100
	}

	@Override
	public void process() {
		grade = (value >= 90)? "A": (value >= 80)? "B": 
			(value >= 70)? "C": (value >= 60)? "D": "F";
	}

	@Override
	public void print() {
		System.out.println("학점: " + grade);
	}

	
	public static void main(String[] args) {

	
		 // 문제2>public abstract class A extends B {....} :  추상 클래스
	boolean run = true;
		
		while(run) {
	sample3 sa = new sample3();
	sa.input();
	sa.process();
	sa.print();
	
	String contious = "y";
	System.out.println(계속 하시겠습니까);
	Scanner sc = new Scanner(System.in;)
			
if (contious.equals("y")) {
	continue;
} else {
	System.out.println("프로그램 종료");
		run = false;
		break;
		}
		}
	}
}