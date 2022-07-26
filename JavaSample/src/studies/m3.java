package studies;

public class m3 {
public static void main(String[] args) {
	//급여명세서 기본급 150만원 수당 55000 세금 기본급의 10%
	int a = 1500000;
	int b = 55000;
	int c = 1500000 / 10;
	
	int sum = (a+b-c);
	
	
	System.out.println("실수령액 = " + sum);
	}
}
