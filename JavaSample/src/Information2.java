
public class Information2 {

	private void infoPrint1() {
		
		//문제1> 국어점수 98점이고, 수학점수 100점인 경우의 합계를 구하세요.
				//1.정수형 데이터
				//2.합계 구하라
				// 데이터타입 int, 변수 kor, 대입연산자 =, 데이터값 98 
				int kor=98;
				
				int mat=100;
				int sum = kor + mat;
				System.out.println("정수형 합계: " + sum);//	
	}
	

	private void infoPrint4() {
		
		//문제4> 영어점수 98.5점이고, 수학점수 100점인 경우의 합계는 실수형으로 구하세요.	
				//1.실수형 데이터, 정수형 데이터
				//2.합계 구하라
				//3.묵시적 형변환
				double eng4=98.5;
				int mat4=100;
				
				double sum4 = eng4 + mat4;// 묵시적 형변환
				System.out.println("실수형 합계: " + sum4);//	
		
	}



	private void infoPrint3() {
		//문제3> 영어점수 98.5점이고, 수학점수 100.0점인 경우의 합계는 정수형으로 구하세요.	
		//1.실수형 데이터
		//2.합계 구하라
		//3.cast:형 변환(묵시적, 강제적 형변환)
		double eng3=98.5;
		double mat3=100.0;
		
		int sum3 = (int)(eng3 + mat3);// 강제적 형변환
		System.out.println("정수형 합계: " + sum3);//
		
	}



	private void infoPrint2() {
		//문제2> 영어점수 98.5점이고, 수학점수 100.0점인 경우의 합계를 구하세요.	
		//1.실수형 데이터
		//2.합계 구하라
		double eng2=98.5;
		double mat2=100.0;
		
		double sum2 = eng2 + mat2;
		System.out.println("실수형 합계: " + sum2);//

		
	}
	
	
	public static void main(String[] args) {
		
		Information2 im1 = new Information2();
		im1.infoPrint1(); 		
		im1.infoPrint2();		
		im1.infoPrint3(); 	
		
		im1.infoPrint4(); 		
		
	}
	
}

