package studies;

import java.util.Random;
import java.util.Scanner;

public class m15 {
	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);

		int rmd = (int) (Math.random()*99);
		boolean OK = true;	
		int i = 0;
		
		do {
			int a = sc.nextInt();
			sc.close();
			if (a <= rmd) {
				System.out.println("숫자 입력값 : " + a);
				System.out.println("컴퓨터의 숫자가 더 큽니다");
				} else if(a >= rmd){
				System.out.println("숫자 입력값 : " + a);
				System.out.println("컴퓨터의 숫자가 더 작습니다.");	
				}else if (a == rmd) {
				System.out.println("축하드립니다" + i + "번째 만에 맞추셨습니다");
				}
		
				System.out.println(i+"번 시도하셨습니다.");
				
			i++;
		
		}while (i<=30);		
	}
}


/*	*/