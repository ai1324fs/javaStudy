package oop_methodSample;

import java.util.Random;
import java.util.Scanner;

/* 문제> 난수를 발생하여 사용자 입력한 숫자와 비교하여 
 * 가위, 바위, 보 게임을 합니다.
 * 단> method dldyd
 * 랜덤 클래스 : Random ra = new Random()
 * 
 * 
 */



public class method_RandomSample5 {
// public void 


	public static void main(String[] args) {
		
		
		
		method_RandomSample5 mss2 = new method_RandomSample5();
		
		Scanner sc = new Scanner(System.in);
		Random ra = new Random();
		int cpu = ra.nextInt(3);// 0:가위, 1:바위, 2:보, 정수형 난수 발생
		int user = sc.nextInt();// 0:가위, 1:바위, 2:보, 
		
		
		if(user == 0) {
			switch(cpu) {
			case 0: System.out.println("비김"); break;
			case 1: System.out.println("졌다"); break;
			case 2: System.out.println("승리"); break;
			}
		}
		if(user == 1) {
			switch(cpu) {
			case 0: System.out.println("승리"); break;
			case 1: System.out.println("비김"); break;
			case 2: System.out.println("졌다"); break;
			}
		}
		if(user == 2) {
			switch(cpu) {
			case 0: System.out.println("졌다"); break;
			case 1: System.out.println("승리"); break;
			case 2: System.out.println("비김"); break;
			}
	
		}
		
		System.out.println(cpu);		
	}






}
