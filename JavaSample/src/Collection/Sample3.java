package Collection;
import java.util.Scanner;

// 문제> 자바, 제이에스피, 스프링의 점수를 입력받아서 총점과 평균을 구하여 출력하는 프로그램 작성
//제네릭 적용하여

class GenericSample2 <T>{
	
	private T data; // 0  => 10
	private double aver;
	private double total; 

	public void setData(T value) { // java jsp string
		this.data = value;
	}

	public T getData() {
		return data;
	}
	
	public void process(double java2, double jsp2, double string2) {
		total = java2 + jsp2 + string2;
		aver = total / 3.0;
	}

	public void dataPrint() {
		System.out.println("총점은: " + total);
		System.out.println("평균은: " + aver);
	}


}


public class Sample3 {
	

	
	public static void main(String[] args) {	
		//제네릭의 경우
		Scanner sc =new Scanner(System.in);
		GenericSample2<Double> gsdouble1 = new GenericSample2<Double>();
		System.out.println("자바 점수 입력: ");
		double java = sc.nextDouble();
		
		GenericSample2<Double> gsdouble2 = new GenericSample2<Double>();
		System.out.println("JSP 점수 입력: ");
		double jsp = sc.nextDouble();
		
		GenericSample2<Double> gsdouble3 = new GenericSample2<Double>();
		System.out.println("스트링 점수 입력: ");
		double string = sc.nextDouble();
		
		gsdouble1.setData(java);
		gsdouble2.setData(jsp);
		gsdouble3.setData(string);
		
		
		double java2 = gsdouble1.getData();
		double jsp2 = gsdouble2.getData();
		double string2 =  gsdouble3.getData();
		
		
		gsdouble1.process(java2, jsp2, string2);
		
		
		gsdouble1.dataPrint();
		
	}

}
