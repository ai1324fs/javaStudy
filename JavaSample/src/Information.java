
public class Information {

	public static void main(String[] args) {
		
//문제1> 국어점수 98점이고, 수학점수 100점인 경우의 합계를 구하세요.
		//1.정수형 데이터
		//2.합계 구하라
		int kor=98;
		int mat=100;
		int sum = kor + mat;
		System.out.println("정수형 합계: " + sum);//
		
		
		
		
//문제2> 영어점수 98.5점이고, 수학점수 100.0점인 경우의 합계를 구하세요.	
		//1.실수형 데이터
		//2.합계 구하라
		double eng2=98.5;
		double mat2=100.0;
		
		double sum2 = eng2 + mat2;
		System.out.println("실수형 합계: " + sum2);//

//문제3> 영어점수 98.5점이고, 수학점수 100.0점인 경우의 합계는 정수형으로 구하세요.	
		//1.실수형 데이터
		//2.합계 구하라
		//3.cast:형 변환(묵시적, 강제적 형변환)
		double eng3=98.5;
		double mat3=100.0;
		
		int sum3 = (int)(eng3 + mat3);// 강제적 형변환
		System.out.println("정수형 합계: " + sum3);//
		
//문제4> 영어점수 98.5점이고, 수학점수 100점인 경우의 합계는 실수형으로 구하세요.	
		//1.실수형 데이터, 정수형 데이터
		//2.합계 구하라
		//3.묵시적 형변환
		double eng4=98.5;
		int mat4=100;
		
		double sum4 = eng4 + mat4;// 묵시적 형변환
		System.out.println("실수형 합계: " + sum4);//		
	}
}

/*
	정보처리 단위
	--------------
	bit: 0 또는 1, 
	  0: False, 거짓, off, 가중치가 존재하지 않음....
	  1: True, 참, on, 가중치가 있음....
	  - and, or, not, exor, nor, nand, nor....
	
	byte: bit가 8개 모이면 바이트 = char(영문자 한바이트), unicode(한글3바이트)
	word: 의미 있는 단어, 현대빈, 새, 공기, 겨울.....
	field: 속성값
	record: field의 모임, 현대빈 100 100 100 100.0 300(6개의 속성)
	block: ibg, irg갭
	file: record의 모임, 빅데이터 A반 24명의 성적 처리 
	database: file의 모임 = oracle, mssql, sybase, informix, db2,......
	databank: 무정부 은행

	데이터: 문자(char), 문자열(String), 
		숫자(정수형(byte, short, int, long), 실수형(float, double)), 특수문자(!@#$%^&*())
		           1     2      4    8            4       8
	일반적으로 4바이트 단위로 처리: int(32bit), 실수형: 8바이트(64bit)
	
	크기: byte < short < int < long < float < double  : 묵시적 형변환의 경우 
	      1       2      4      8      4       8
	     8bit    16bit  32bit  64bit   32bit   64bit
	
	* 정수형은 실수형에 비해서 정밀도가 떨어지나 처리속도는 빠르다.
	
*/