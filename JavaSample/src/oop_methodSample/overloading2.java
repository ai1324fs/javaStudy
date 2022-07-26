package oop_methodSample;

/* 문제2
 * 숫자 두개를 입력받아
 * 생성자 오버로딩을 적용
 * 가감승제(덧셈,뺄셈,곱셈,나눗셈) 적용하여 출력
 */
import java.util.Scanner;

class overloading2 {

	private static String name;
	private static int age;
	private static int sum1;
	private static int sum2;	
	private void inputsum() {
		this.sum1 = sum1;
		this.sum2 = sum2;
	}

	private void Process() {  // 출력단

	}

	private void outputsum() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		
		System.out.println();
		
		System.out.println("덧셈: " + sum1+sum2);
		System.out.println("뺄셈: " + sum1-sum2);
		System.out.println("곱셈: " + sum1*sum2);
		System.out.println("나눗셈: " + sum1/sum2);
	}
	
	
	
	private void age() {
		this.age = age;
	}


	void name() {
		this.name = name;
	}

	Scanner sc = new Scanner(System.in);
	

	public static void main(String[] args) {
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		while (run) {
			
			
			System.out.println("이름을 입력해주세요");
			name = sc.next();
			System.out.println("나이를 입력해주세요");
			age = sc.nextInt();
			
			
			System.out.println("숫자를 입력해주세요");
			sum1 = sc.nextInt();
			System.out.println("숫자를 재입력해주세요");
			sum2 = sc.nextInt();
			
			
			overloading2 overloading = new overloading2();
			overloading.name();
			overloading.age();
			overloading.inputsum();
			overloading.Process();
			overloading.outputsum();
			
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

