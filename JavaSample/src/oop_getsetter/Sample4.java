package oop_getsetter;

import java.util.Scanner;




public class Sample4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//저장0
		System.out.println("이름을 입력하세요");
		String name = sc.next();
		System.out.println("번호를 입력하세요");
		int bunho = sc.nextInt();
		System.out.println("java 점수를 입력하세요");
		int java = sc.nextInt();
		System.out.println("jsp 점수를 입력하세요");
		int jsp = sc.nextInt();
		System.out.println("spring 점수를 입력하세요");
		int spring = sc.nextInt();

		int total = java + jsp + spring;
		double aver = total / 3.0;
		char grade;
		
		switch((int)aver / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
			
		}
		
		
		sungjuk2 sj = new sungjuk2();
		
		sj.setName(name);
		sj.setBunho(bunho);
		sj.setJava(java);
		sj.setJsp(jsp);
		sj.setSpring(spring);
		sj.setTotal(total);
		sj.setaver(aver);
		sj.setgGrade(grade);
		
		
		//불러오기
		String name2 = sj.setName();
		System.out.println("이름: " + name2);
		int bunho2 = sj.setBunho();
		System.out.println("번호: " + bunho2);
		int java2 = sj.setJava();
		System.out.println("JAVA: " + java2);
		int jsp2 = sj.setJsp();
		System.out.println("JSP: " + jsp2);
		int spring2 = sj.setSpring();
		System.out.println("스프링: " + spring2);
		int total2 = sj.setTotal();
		System.out.println("총점: " + total2);
		double aver2 = sj.setaver();
		System.out.println("평균: " + aver2);
		char grade2 = sj.setgGrade();
		System.out.println("학점: " + grade2);
	}

}

