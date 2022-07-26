package studies;

import java.util.Scanner;

public class m8 {
	static Scanner sc = new Scanner(System.in);
	static int a = sc.nextInt();
	public static void main(String[] args) {
		sc.close();	
		System.out.println("입력점수 = "+a);
		
		if (a < 0 || a> 100) {//== false
			System.out.println("입력오류!!");
		} else {
			System.out.println("점수입력 = "+a);
		}
	}
}
