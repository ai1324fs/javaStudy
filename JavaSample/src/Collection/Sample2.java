package Collection;
import java.util.Scanner;
// 문제> 정수형 데이터 3개를 입력하여 출력하는 프로그램 작성

class GenericSample <T> {
	
	private T[] value; // 0  => 10
	private int index;
	//							10

	@SuppressWarnings("unchecked")
	public GenericSample(int value) {
		this.value = (T[]) new Object[value];
	}
	public void data(T...args) {
		for(T element: args) {
			value[index++] = element;
		}
		
	}
	public void dataPrint() {
		for(T element: value) {
			System.out.println("T type의 값: " + element); //
		}
		
	}
	
}


public class Sample2 {
	
	public static void main(String[] args) {	
		//제네릭의 경우
		Scanner sc =new Scanner(System.in);
		
		GenericSample<Integer> gsint = new GenericSample<Integer>(10);
		
		System.out.println("정수형 데이터 입력: ");
		int x1 = sc.nextInt();
		int x2 = sc.nextInt();
		int x3 = sc.nextInt();

		gsint.data(x1, x2, x3);
		gsint.dataPrint();
		
		
		GenericSample<Double> gsdouble = new GenericSample<Double>(10);
		
		System.out.println("실수형 데이터 입력: ");
		double d1 = sc.nextDouble();
		double d2 = sc.nextDouble();
		double d3 = sc.nextDouble();
		
		gsdouble.data(d1, d2, d3);
		gsdouble.dataPrint();

		
		GenericSample<String> gsstr = new GenericSample<String>(10);
		
		System.out.println("문자열 데이터 입력: ");
		String s1 = sc.next();
		String s2 = sc.next();
		String s3 = sc.next();
		
		gsstr.data(s1, s2, s3);
		gsstr.dataPrint();
		
	}

}
