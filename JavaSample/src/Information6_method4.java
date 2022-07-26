import java.util.Scanner;

//import java.util.Scanner;

public class Information6_method4 {
		
	private int infoPrint3() {
		//문제3> 영어점수 98.5점이고, 수학점수 100.0점인 경우의 합계는 정수형으로 구하세요.	
		Scanner sc = new Scanner(System.in);		
		
		System.out.println("영어점수(실수형)를 입력하시오.");
		double eng = sc.nextDouble();
		System.out.println("수학점수(실수형)를 입력하시오.");
		double mat = sc.nextDouble();
		
		int sum = (int)(eng + mat);// 강제적 형변환
		
		return sum;
		
	}

	private double infoPrint4() {
		
		//문제4> 영어점수 98.5점이고, 수학점수 100점인 경우의 합계는 실수형으로 구하세요.	
		Scanner sc = new Scanner(System.in);		
		
		System.out.println("영어점수(실수형)를 입력하시오.");
		double eng = sc.nextDouble();
		System.out.println("수학점수(정수형)를 입력하시오.");
		int mat = sc.nextInt();
		
			double sum = eng + mat;// 묵시적 형변환
		return sum;
		
	}


	public static void main(String[] args) {
		
		Information6_method4 im1 = new Information6_method4();
				
		int sum = im1.infoPrint3(); 		
		System.out.println("정수형 합계: " + sum);//
		
		double sum2 = im1.infoPrint4(); 		
		System.out.println("실수형 합계: " + sum2);//	
		
	}
	
}

/* method의 역할(개념, 정의): 동양 사회 (형용사의 발달)
 * 주어진 문제를 해결하는 방법을 제시합니다. => algorithm
 * 
 * Object(객체): 속성과 기능으로 구분합니다.
 *  - 속성: 클래스(전역) 변수, 지역변수
 *  - 기능: 클래스(전역) 메소드, 생성자 메소드, 일반 메소드
 * 
 * 
 * method의 4가지 종류
 * -----------------------
 * 		반환값	전달인자값
 * -----------------------
 * 1)    X         X  
 * 2)    X         O  
 * 3)    O         X => OK!
 * 4)    O         O
 * -----------------------
 * 
 * 반환값(Return value): String, int, double, float, <Student>, long....
 * 
 * 전달인자값(argument value): String, int, double, float, <Student>, long....
 * 
 */



