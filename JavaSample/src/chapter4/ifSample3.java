package chapter4;

import java.util.Scanner;

public class ifSample3 {

	public static void main(String[] args) {
//문제> 임의의 숫자를 입력 받아서 그 숫자가 0인지, 홀수인지, 짝수인지를 판별하여 출력합니다
		Scanner sc = new Scanner(System.in);
	
		System.out.println("숫자를 입력해주세요");
		int su = sc.nextInt();
		
		if (su == 0) {
			System.out.println("0");
		}else if (su % 2 == 1) {
			System.out.println("홀수");
		}else if (su % 2 == 0){
			System.out.println("짝수");
		}
		
		System.out.println("=====================");
		//switch ~ case : if 문을 단순, 간결하게 유지하기 위하여 사용합니다.
		//유지보수가 더욱 용이하다
		System.out.println("성적(학점)을 입력하시오");
		int jumsu = sc.nextInt();

		switch(jumsu / 10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			break;
		}
		
		
	}

}