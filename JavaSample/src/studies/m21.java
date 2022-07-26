package studies;

import java.util.Scanner;

import com.sun.tools.javac.Main;

/*
 * [문제21]값을 입력받아 함수호출하여 처리하시오
        조건1)입력받은 값을  compute(item, qty, price)함수에서 처리
        조건2)계산방법 : 금액 = 수량 * 단가

-입력-
품명 : apple
수량 : 10
단가 : 1200

-출력-
품명 : apple
금액 : 12000원
 */
public class m21 {

	static Scanner sc = new Scanner(System.in);
	static String item;
	static String qty;
	static String price;

public static void main(String[] args) {
	System.out.println("품명을 입력하세요");
	item = sc.next();
	System.out.println("수량을 입력하세요");
	qty = sc.next();
	System.out.println("단가를 입력하세요");
	price = sc.next();
	int a = Integer.parseInt(qty);
	int b = Integer.parseInt(price);
	String[] compute = {item, qty, price};
	
	System.out.println("품명 :" + item);
	System.out.println("금액 :" + (a*b));


}

}
