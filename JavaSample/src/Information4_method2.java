import java.util.Scanner;

//import java.util.Scanner;

public class Information4_method2 {
	
	private void infoPrint3(double eng, double mat) {
				
		int sum = (int)(eng + mat);// 강제적 형변환
		System.out.println("정수형 합계: " + sum);//		
	}
	
	private void infoPrint4(double eng, int mat2) {
				
		double sum = eng + mat2;// 묵시적 형변환
			System.out.println("실수형 합계: " + sum);//		
	}
	
	public static void main(String[] args) {
		
		Information4_method2 im1 = new Information4_method2();
		
		int mat2;
		double eng, mat;
		
		Scanner sc = new Scanner(System.in);		
		
	//문제3> 영어점수 98.5점이고, 수학점수 100.0점인 경우의 합계는 정수형으로 구하세요.
		 System.out.println("영어점수(실수형)를 입력하시오.");
		 eng = sc.nextDouble();
		System.out.println("수학점수(실수형)를 입력하시오.");
		 mat = sc.nextDouble();
		 
		im1.infoPrint3(eng, mat); 			
		
	//문제4> 영어점수 98.5점이고, 수학점수 100점인 경우의 합계는 실수형으로 구하세요.
		System.out.println("영어점수(실수형)를 입력하시오.");
		 eng = sc.nextDouble();//100
		System.out.println("수학점수(정수형)를 입력하시오.");
		 mat2 = sc.nextInt();//100	
		
		im1.infoPrint4(eng, mat2); 		
		
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
 * 2)    X         O  => OK!
 * 3)    O         X
 * 4)    O         O
 * -----------------------
 * 
 */



