import java.util.Scanner;

//import java.util.Scanner;

public class Information3 {

	private void infoPrint1() {
		
		//문제1> 국어점수 98점이고, 수학점수 100점인 경우의 합계를 구하세요.
		Scanner sc = new Scanner(System.in);		
			
		System.out.println("국어점수를 입력하시오.");
		int kor = sc.nextInt();
		System.out.println("수학점수를 입력하시오.");
		int mat = sc.nextInt();
		
		int sum = kor + mat;
		System.out.println("정수형 합계: " + sum);//	
	}
	

	private void infoPrint4() {
		
		//문제4> 영어점수 98.5점이고, 수학점수 100점인 경우의 합계는 실수형으로 구하세요.	
		Scanner sc = new Scanner(System.in);		
		
		System.out.println("영어점수를 입력하시오.");
		double eng = sc.nextDouble();
		System.out.println("수학점수를 입력하시오.");
		int mat = sc.nextInt();
		
			double sum = eng + mat;// 묵시적 형변환
			System.out.println("실수형 합계: " + sum);//	
		
	}



	private void infoPrint3() {
		//문제3> 영어점수 98.5점이고, 수학점수 100.0점인 경우의 합계는 정수형으로 구하세요.	
		Scanner sc = new Scanner(System.in);		
		
		System.out.println("영어점수를 입력하시오.");
		double eng = sc.nextDouble();
		System.out.println("수학점수를 입력하시오.");
		double mat = sc.nextDouble();
		
		int sum = (int)(eng + mat);// 강제적 형변환
		System.out.println("정수형 합계: " + sum);//
		
	}



	private void infoPrint2() {
		//문제2> 영어점수 98.5점이고, 수학점수 100.0점인 경우의 합계를 구하세요.	
		//1.실수형 데이터
		//2.합계 구하라
		Scanner sc = new Scanner(System.in);		
		
		System.out.println("영어점수를 입력하시오.");
		double eng = sc.nextDouble();
		System.out.println("수학점수를 입력하시오.");
		double mat = sc.nextDouble();
			
		double sum2 = eng + mat;
		System.out.println("실수형 합계: " + sum2);//

		
	}
	
	
	public static void main(String[] args) {
		
		Information3 im1 = new Information3();
		im1.infoPrint1(); 		
		im1.infoPrint2();		
		im1.infoPrint3(); 			
		im1.infoPrint4(); 		
		
	}
	
}

