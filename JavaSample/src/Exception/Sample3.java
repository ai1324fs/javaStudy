package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * NullPointerException => 데이터 값이 null 
 */
public class Sample3 {

	private String name;
	private int age;
	
	private void data(String name, int age) {
		this.name = name;
		this.age = age;
		
	}	
	private void dataPrint() {
		System.out.println("이름은 " + name + "이고, 나이는 " + age + "입니다.");
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name = null;
		int age = sc.nextInt();
		
		try {
			Sample3 s3 = new Sample3();
			s3.data(name, age);
			s3.dataPrint();
			
		
		}catch(NullPointerException e) {
			System.out.println("data의 값이 null 입니다.");
			System.out.println("데이터를 입력해 주세요.");
		}catch(InputMismatchException e) {
			System.out.println("데이터 타입이 맞지 않습니다.");
			System.out.println("데이터를 확인하시고 입력해 주세요.");
		}
	}


}