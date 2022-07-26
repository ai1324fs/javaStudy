package studies;

import java.util.Scanner;

public class m17 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
System.out.println("A승을 입력하세요");
	int a = sc.nextInt();
	System.out.println("B승을 입력하세요");
	int b = sc.nextInt();
	int result = 1;
	for(int i=0; i<b; i++) {
		result *= a;	}
	System.out.println(a+" 승의 "+b+" 승은 " + result);
	}
}
