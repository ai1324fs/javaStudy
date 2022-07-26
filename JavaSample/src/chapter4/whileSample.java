package chapter4;

public class whileSample {

	public static void main(String[] args) {
		//while : 많이 사용됩니다.
		// 조건식
	int i = 0, sum = 0, sum2 = 0, sum3 = 0;
//1~100사이의 합을 구하시오.
	while(i <= 100) {//0<=100,, 1<=100, 2 <= 100
		sum+=i; // sum = sum + i
		i+=1; // i = i + 1
	}
	System.out.println(sum);// 5050
	
	
	int i2 = 1;
	 
	while(i2 <= 99) { // i2 <= 99, 3 <= 99
		sum2+=i2; // 0+1 , 1+3, 4+5
		i2+=2;// 3, 5
	}
	System.out.println(sum2);// 2500, 홀수의 합

	
	int i3 = 0;
	
	while(i3 <= 100) { // 0<=100, 2<=100
		sum3+=i3; //  0+0, 0+2, 2+4
		i3+=2; // 2, 4 , 6
	}
	System.out.println(sum3);// 2550, 짝수의 합
	}

}
// 3번 돌려보고 이상이 없으면 적용가능 , 운좋게 세번돌렸는데 가능한 경우가 없다.