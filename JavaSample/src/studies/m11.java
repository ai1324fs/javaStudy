package studies;

import java.util.Scanner;

public class m11 {
	/*
	 [문제11]2개의 숫자와 연산자를 입력하여 계산하시오
        조건1) 실수인경우는 소수이하 2째자리까지 출력하시오
        조건2) 연산자가 +,-,*,/ 이외의 문자가 들어오면 
               "연산자error"출력하시오

[실행결과]
A값을 입력하시오: 25
B값을 입력하시오: 36
연산자를 입력(+,-,*,/) : +
25 + 36 = xx

A값을 입력하시오: 25
B값을 입력하시오: 36
연산자를 입력(+,-,*,/) : /
25 / 36 = xx.xxxxx      

A값을 입력하시오: 25
B값을 입력하시오: 36
연산자를 입력(+,-,*,/) : #
연산자 error
출처: https://private.tistory.com/13#google_vignette [오토봇팩토리:티스토리]
	 */
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double A = sc.nextInt();
	double B = sc.nextInt();
	
	String C = sc.next();
	if(C.equals("+")) {
		System.out.println((int)A+B);
	} else if (C.equals("-")) {
		System.out.println((int)A-B);
	} else if (C.equals("*")) {
		System.out.println((int)A*B);
	} else if (C.equals("/")) {
		System.out.println(String.format("%.2f",A/B));
	} else {
		System.out.println("연산자 error");
	}
	}
}
