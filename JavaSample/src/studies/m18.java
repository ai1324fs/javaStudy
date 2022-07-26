package studies;

import java.util.Scanner;

public class m18 {
	public static void main(String[] args) {
		/*
		 * 다중 포문을 이용하여 도형을 만드세요
		 * 첫번째 도형은 ◆(다이아)
		 */
		// size 는 도형의 높이/크기이다 ,
		Scanner sc = new Scanner(System.in);
		int size =3;// sc.nextInt();
		for (int i = 1; i <= 5; i++) {
			for (int J=1; J<=5; J++) {
				System.out.print(i);
			}
			System.out.print(" ");
			for (i = 1; i <=3; i++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		for (int i = 1; i <= size; i++) {
			for (int J=i; J<=size; J++) {
				System.out.print("*");
			}
			System.out.print(" ");
			for (int J = 1; J <= size; J++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= 5; i++) {
			for (int J=1; J<=5; J++) {
				System.out.print(i);
			}
			System.out.print(" ");
			for (i = 1; i <=3; i++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		for (int i = 1; i <= size; i++) {
			for (int J=i; J<=size; J++) {
				System.out.print("*");
			}
			System.out.print(" ");
			for (int J = 1; J <= size; J++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
