package oop_constructor;

import java.util.Scanner;

import oop_methodSample.method_dowhileSample2;
import 자습용.constructorSample4;

/* constructor
 * 문제> 국어, 영어, 수학, 점수를 입력받아서
 * 총점과 평균을 구하고 출력합니다.
 * 단, 생성자 메소드를 이용
 * 
 * 1.입력생성자 inputSj
 * 2.계산생성자 processSj => total, aver 
 * 3.출력생성자 outputSj
 * 4.각 점수를 입력받아 총점을 계산생성자에서 계산하여 출력생성자에서 출력할것
 */




public class constructorSample4 {
	
	static Scanner sc = new Scanner(System.in);
	
	int mat;
	int kor;
	int eng;
	int total;
	double aver;
	


	public constructorSample4(int kor, int mat, int eng) { // 
		this.kor = kor; //
		this.mat = mat;
		this.eng = eng;
	}

	public void Process() {
		total = mat + kor + eng;
		aver = total / 3.0;
		System.out.println(total);
		System.out.println(aver);
		
	}

	
	public static void main(String[] args) {
			boolean run = true;
			
			
			while (run) {
				//int kor = 0, eng = 0, mat = 0;
				
				System.out.println("국어점수를 입력해 주세요: ");
				int kor = sc.nextInt();
				System.out.println("영어점수를 입력해 주세요: ");
				int eng = sc.nextInt();
				System.out.println("수학점수를 입력해 주세요: ");
				int mat = sc.nextInt();

				constructorSample4 css = new constructorSample4(kor, eng, mat);
				css.Process();

				System.out.println("데이터를 계속 입력하시겠씁니까?(y/n)");
				String contious = sc.next();

				if (contious.equals("y")) {
					continue;
				} else {
					System.out.println("프로그램 종료 합니다.!!!");
					 run = false;
					break;
				}

			}
	}
}	

	





