package studies;

import java.lang.reflect.Array;

public class m19 {
	/*
	 * [문제19] main()함수에서 각각 호출하고 계산된 결과를 return 받아서 main()에서 출력하시오
호출함수 :  sum(3,5) 
                sub(7,2) 
                mul(4,5) 
                div(7,3)


더하기 : 8
빼  기 : 5
곱하기 : 20
나누기 : 2.33
	 */
public static void main1(String[] args) {
	sum(3,5);
	sub(7,2);
	mul(4,5);
	div(7,3);
}

private static void div(int i, int j) {
	// TODO Auto-generated method stub
	
}

private static void mul(int i, int j) {
	// TODO Auto-generated method stub
	
}

private static void sub(int i, int j) {
		// TODO Auto-generated method stub
		
	}

private static void sum(int i, int j) {// a = 3 , b = 5
	int sum = 0;
	for (int a = i; a <= j; a++) {
		sum+=a;
	}
	
	
	/*
	 private static void div(int i, int j) {
	// TODO Auto-generated method stub
	
}

private static void mul(int i, int j) {
	// TODO Auto-generated method stub
	
}

private static void sub(int i, int j) {
		// TODO Auto-generated method stub
		
	}

private static void sum1() {
sum(100,100);
	
}
	 */
	
	
}
}
