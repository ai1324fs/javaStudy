package chapter3;

public class shortenSample1 {

	public static void main(String[] args) {
// 단축대입 연산: +, -, *, /, % 적용 가능
// a=10, b=40; c=a+b
// d=20, +25, d=d+25 => d+=25
		int x = 10;
		//x = x+5;
		x+=5; // x=x+5;
		System.out.println(x);// 15
		
		//증가(+1), 감소(-1) 연산자
		/*
		 * 대입후 연산: A++, 변수가 먼저 등장  (다 끝난후 계산한다)
		 * 얀산후 대입: ++A, 연산자가 먼저 등장하면 사용
		 */
		int y = 10, z = 20;
		//			 11  + 20(19)
		int result = ++y + z--;
		System.out.println(result);// 30

		
		// 11 => 12
//		y++;
	//	System.out.println(y);//? |12
		// 자체대입으로 숫자가 즉시 증가
		int c = y++;
		System.out.println(c);// ?, 11
		//다른 변수에 대입하여 아예 끝이 나야 증가, 감소한다.
		
		System.out.println(z);
;
		z--;

		System.out.println(z);
		
		
	}

}
