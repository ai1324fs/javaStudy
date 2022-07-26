package Collection;

import java.util.InputMismatchException;
import java.util.Scanner;

//문제> 입력 받은 데이터가 어떤 자료형인지를 파악하여 출력하는 프로그램 작성
//제네릭 적용하여 
class GenericSample3  {
	
	public static <T> void process(T value) {
		System.out.println(value.getClass() + "는 " + value.toString());
	}
	
}

public class Sample4 {

			
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		//제네릭의 경우
		try {
		Scanner sc = new Scanner(System.in);
		GenericSample3 gsdouble1 = new GenericSample3();		
		System.out.println("정수형 데이터 입력: ");
		int intdata = sc.nextInt();
		
		GenericSample3 gsdouble2 = new GenericSample3();		
		System.out.println("실수형 데이터 입력: ");
		double doubledata = sc.nextDouble();
		
		GenericSample3 gsdouble3 = new GenericSample3();		
		System.out.println("문자열 데이터 입력: ");
		String strdata = sc.next();
		
		gsdouble1.process(intdata);
		gsdouble2.process(doubledata);
		gsdouble3.process(strdata);  
		
		}catch(InputMismatchException e) {
			System.out.println("입력 데이터가 잘못 되었습니다. 확인해 주세요.");
		}
	}

}
