package studies;

import java.util.Scanner;

public class m13 {
	/* 두조건을 만족하면 윤년
	 * 년도 입력받기
	 * 년도를 4로 나눠 떨어져야함
	 * 년도를 100으로 나누면 떨이지지 않거나 400으로 나누면 떨어져야함
	 * 4(윤녕) 100(평년) 400(윤년)
	 */
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println();
	int Y = sc.nextInt();
	int Y1 = Y % 4;
	int Y2 = Y % 400;
	if(Y1 == 0) {
		//System.out.println("윤년");
		if(Y2 == 0) {
			System.out.println("윤년");
		
		} else { 
			System.out.println("평년");
		}
	//	System.out.println("윤년");
	} else  {
		System.out.println("평년");
	} 
	}
}
