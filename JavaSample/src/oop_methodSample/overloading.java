package oop_methodSample;

/* 이름과 나이를 입력
 * 생성자 오버로딩을 적용
 * 출력
 * 
 * 
 * 숫자 두개를 입력받아
 * 생성자 오버로딩을 적용
 * 가감승제(덧셈,뺄셈,곱셈,나눗셈) 적용하여 출력
 */
import java.util.Scanner;



	
class overloading {

	private static String name;
	private static int age;
	
	private void Process() {  // 출력단
		System.out.println(name);
		System.out.println(age);
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
			
			
			overloading aver1 = new overloading();
			aver1.name();
			aver1.age();
			aver1.Process();
			
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

/*
1.data input : scanner sc(name, age)
2.data output : name, age
3.object create : 오브젝트 생성
5.

*/