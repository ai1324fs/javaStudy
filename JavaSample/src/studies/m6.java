package studies;

public class m6 {
	/*
	   (삼각형넓이 = (밑변 * 높이)/2)  

--입력--
**** 삼각형의 넓이 구하기  ****
밑변 :  10  
높이 :   3
   

--출력--
넓이 :   XX.XX  <--- 소수 2자리까지출력하시오
*/
	public static void main(String[] args) {
		int a = 10; //밑변
		int b = 3; //높이
		double c = 0.5*a*b;
		double d = a*b*c;
		//System.out.println(c);
		System.out.println(String.format("%.2f", d));
		//삼각형 넓이 구하기
		
	}
}
