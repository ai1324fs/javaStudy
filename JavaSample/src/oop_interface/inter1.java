package oop_interface;

import java.util.Scanner;

/* 문제> 원의 면적을 구하는 프로그램을 작성하시오.
 * 1.추상 클래스 이용하여 3가지 방법으로
 * 2.인터페이스 이용 3가지 방법으로
 */
public class inter1 extends inputif {
	static int width;
	static int depth;
	static int heigth;
	static int area;

	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("가로 입력");
		width = sc.nextInt();
		System.out.println("세로 입력");
		depth = sc.nextInt();
		System.out.println("높이 입력");
		heigth = sc.nextInt();
	}

	@Override
	public void process() {
		area = width * depth * heigth;
	}

	@Override
	public void output() {
		System.out.println("부피: " + area);
	}

	/*
	 * 원의 면적을 구하는 프로그램 입력 : input() 원의 크기 높이 넓이입력 기능 : process() 원의 크기 높이 넓이 곱하기 출력
	 * : output() 원의 면적 프린트하기
	 */

	public static void main(String[] agrs) {

		inter1 if1 = new inter1();
		if1.input();
		if1.process();
		if1.output();

	}

}
