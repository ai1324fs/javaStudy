package studies;

import java.util.Scanner;

public class m12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	System.out.print("중간고사 점수를 입력하시오 :");
		int a = sc.nextInt();
		System.out.println();
		System.out.print("기말고사 점수를 입력하시오 :");
		int b = sc.nextInt();
		System.out.println();
		System.out.print("레포트 점수를 입력하시오 :");
		int c = sc.nextInt();
		System.out.println();
		System.out.print("출석 점수를 입력하시오 :");
		int d = sc.nextInt();
		System.out.println();
		
		int sum = (a+b)/2;
		double sum1 = sum*0.6;
		double sum2 = c*0.2;
		double sum3 = d*0.2;
		
		double avg =(sum1+sum2+sum3);
		
		System.out.print("성적 = ");
		System.out.printf("%.2f",avg);
		System.out.println();
		if(avg >= 90) {
			System.out.println("학점 = A");
			System.out.println("평가 = excellent");
		} else if (avg >= 80) {
			System.out.println("학점 = B");
			System.out.println("평가 = excellent");
		} else if (avg >= 70) {
			System.out.println("학점 = C");
			System.out.println("평가 = Good");
		} else if (avg >= 60) {
			System.out.println("학점 = D");
			System.out.println("평가 = Good");
		} else {
			System.out.println("학점 = F");
			System.out.println("평가 = oor");
		}
		
	}
}
