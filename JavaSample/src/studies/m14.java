package studies;

import java.util.Random;

public class m14 {
	
	/*
	 * 50개의 난수를 만들어 출력하기
	 * 조건1) 0~100 사이의 수일것
	 * 조건2) 1줄에 6개씩 표시
	 */
	public static void main(String[] args) {
		Random rd = new Random();
		System.out.println("난수 출력");
		
		for(int i = 0; i <6; i++) {
		System.out.print((int)(Math.random() * 100) + " ");
		
		}
		System.out.println();
		for(int i = 0; i <6; i++) {
			System.out.print((int)(Math.random() * 100) + " ");
			
			}
		System.out.println();
		for(int i = 0; i <6; i++) {
			System.out.print((int)(Math.random() * 100) + " ");
			
			}
		System.out.println();
		for(int i = 0; i <6; i++) {
			System.out.print((int)(Math.random() * 100) + " ");
			
			}
		System.out.println();
		for(int i = 0; i <6; i++) {
			System.out.print((int)(Math.random() * 100) + " ");
			
			}
		System.out.println();
		for(int i = 0; i <6; i++) {
			System.out.print((int)(Math.random() * 100) + " ");
			
			}
		System.out.println();
		for(int i = 0; i <6; i++) {
			System.out.print((int)(Math.random() * 100) + " ");
			
			}
		System.out.println();
		for(int i = 0; i <6; i++) {
			System.out.print((int)(Math.random() * 100) + " ");
			
			}
		System.out.println();
	}
}
