package oop_getsetter;

import java.util.Scanner;

/* 문제> 번호, 이름, Java, JSP, Spring 점수를 입력 받아서 총점, 평균, 학점을 구하여 출력하시오.
 * 단, method() 반드시 사용하세요.
 * 입력은 위에 기술한 대로 하시고,
 * 출력은 마음대로
 * 전달인자값과 반환값은 4가지중에서 고르세요.
 * hint> OO, OX, XO, XX
 * ------------------------------------------------------------------
 *  number   name  Java   JSP   Spring   total   average    grade
 * ------------------------------------------------------------------
 *   1      홍길동   100   100    100      300      100.0        A
 *   2      임걱정    99   100    100      299       99.9        A 
 *   3      이순신   100    50     50      200       66.6        D
 * -------------------------------------------------------------------
 * - input : sungjukInput()
 * - process : sungjukProcess() => total, average, grade
 * - output : sungjukOutput()
 * 
 * 1.get(조회)/setter(저장) 설정
 * 2.통/분리 작성: 2개 클래스로 분리, 
 * 3.main: Sample3 => main method 존재하므로
 * 4.sub: Sunkjuk class => getter/setter 설정
 */


class sungjuk {
	//class variable: auto initial

	static int bunho;
	static String name;
	static int java;
	static int jsp;
	static int spring;
//	static int total;
//	static double aver;
//	static char grade;

	

	
	public int getBunho() {
		return bunho;
	}
	public void setBunho(int bunho) {
		this.bunho = bunho;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}

	
	public int getJsp() {
		return jsp;
	}
	public void setJsp(int jsp) {
		this.jsp = jsp;
	}

	
	public int getSpring() {
		return spring;
	}
	public void setSpring(int spring) {
		this.spring = spring;
	}

	
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}

	
	public double getaver() {
		return aver;
	}
	public void setaver(double aver) {
		this.aver = aver;
	}

	
	public char getgGrade() {
		return grade;
	}
	public void setgGrade(char grade) {
		this.grade = grade;
	}
	
	
	void sungjukInput() {
		sungjuk sj = new sungjuk();
		Scanner sc = new Scanner(System.in)
				
	}
	
	
	
	
}

public class Sample3 {

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
		
		
		sungjuk sj = new sungjuk();
		
		
		sj.setName(name);
		sj.setBunho(bunho);
		sj.setJava(java);
		sj.setJsp(jsp);
		sj.setSpring(spring);
		sj.setTotal(total);
		sj.setaver(aver);
		sj.setgGrade(grade);
		
		
		//불러오기
	//	String name2 = sj.setName();
	//	System.out.println("이름: " + name2);
	//	int bunho2 = sj.setBunho();
	//	System.out.println("번호: " + bunho2);
	//	int java2 = sj.setJava();
	//	System.out.println("JAVA: " + java2);
	//	int jsp2 = sj.setJsp();
	//	System.out.println("JSP: " + jsp2);
	//	int spring2 = sj.setSpring();
	//	System.out.println("스프링: " + spring2);
	//	int total2 = sj.setTotal();
	//	System.out.println("총점: " + total2);
	//	double aver2 = sj.setaver();
	//	System.out.println("평균: " + aver2);
	//	char grade2 = sj.setgGrade();
	//	System.out.println("학점: " + grade2);
		
		System.out.println("----------------------------------------------------------------");
		System.out.println("number   name   java     jsp   spring   tptal   average    grade");
		System.out.println("----------------------------------------------------------------");
		//System.out.println(sj.bunho + "\t" + sj.name + "\t" + sj.java+"\t" + sj.jsp +"\t" + sj.spring +"\t" + sj.total +"\t" + sj.aver +"\t" + sj.grade + "\t");
		System.out.println(sj.getBunho() + "\t" + sj.getName() + "\t" + sj.getJava()+"\t" + sj.getJava() +"\t" + sj.getSpring() +"\t" + sj.getTotal() +"\t" + sj.getaver() +"\t" + sj.getgGrade() + "\t");
		
	}

}

