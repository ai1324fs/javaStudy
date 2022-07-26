package studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class m7 {
	/*
BufferedReader를 이용하여 입력받아 두수중 큰수를 출력하시오
 (단, 비교연산은 삼항연산자를 이용하시오)
Input a : 5
Input b : 13

큰수 : 13

	*/
	public static void main(String[] args) throws IOException {
	
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String a = br.readLine();
	String b = br.readLine();

	int c = Integer.parseInt(a);
	int d = Integer.parseInt(b);
System.out.println("Input a : " +a);
System.out.println("Input b : " +b);
	
	int r = (c > d)?c:d;
	
	System.out.println((c>d)?c:d);

	
	}
}
