package oop_methodSample;

/* method : function = 함수 = 기능(행위,동작)
 * object : 객체, 사물이 곧 객체
 * Object Oriented Programming(OOP)
 * 자동차 객체 
 * - 속성(attribute):(대부분 필드 영역에서 사용) 클래스 변수 = static, 전역, main method 영역에서지역변수
 * 	 색상, 가격, 성능, .....
 * - 기능(method):(대부분 필드 영역에서 사용) 클래스 메소드, 지역메소드는 main mathod에서 사용한다.
 * 	 동작(출발, 정지, 후진)
 *  클래스안에서 객체를 생성합니다.
 *  호출은 객체명.메소드명();
 *  
 *  call by value: int i = 300;
 *  call by reference: car.start();
 */

public class method_dowhileSample {		// 1000
	
	public int hap1(int startNumber, int EndNumber) { // class method
		int sum = 0;// 1 , 3 , 6, 10....
		
		do {
			sum+=startNumber;//sum=6+4, sn=4
			startNumber+=1; // 2, 3, 4, 5
			//		2<= 100 / 3<=100 (100보다 작거나 같으면 반복해라)
		}while (startNumber <= EndNumber); 
		return sum; // 5050 
	}
	//						1				100
	public int hap2(int startNumber, int EndNumber) {
		int sum2 = 0;
		
		do {
			sum2+=startNumber;
			startNumber+=2;
					
		}while(startNumber <= EndNumber);
		return sum2;
	
	}
	//						100
	public int hap3(int EndNumber) {
		int sum3 = 0;
		int startNumber = 0;
		do { 
			sum3+=startNumber; 
			startNumber+=2; 
		}while(startNumber <= EndNumber);
		return sum3;
	}
	
	public static void main(String[] args) {	//1200
		//mds = 1000 address
		method_dowhileSample mds = new method_dowhileSample();
		// 요구사항: 전달인자 2개, 반환하시오.
		int startNumber = 1;//시작
		int EndNumber = 100;//끝
							//		1, 100, 5050
		int sum = mds.hap1(startNumber, EndNumber);//1~100사이의 합을 구하시오.
		System.out.println("1~100: " + sum);
		System.out.println("========1~100사이의 합=========");
		
		//		object = reference variable = pointer = address
		method_dowhileSample mds2 = new method_dowhileSample();
		int i = 0;
		
		// 요구사항: 전달인자 2개, 반환하시오.
		int sum2 = mds2.hap2(startNumber, EndNumber);//1~100사이의 합을 구하시오.
		System.out.println(sum2);
		System.out.println("==========홀수의 합===========");
		
		
		// 요구사항: 전달인자 2개, 반환하시오.
		method_dowhileSample mds3 = new method_dowhileSample();
		
		int sum3 = mds3.hap3(EndNumber);
		System.out.println(sum3);
	}
}