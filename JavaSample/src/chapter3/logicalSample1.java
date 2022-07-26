package chapter3;

public class logicalSample1 {

	public static void main(String[] args) {
	// 논리 연산자 end, or(\|), not, exor, nor, nand
	//이항연산자: a, b
	//단항연산자: not <<( *2), >>( /2), >>>, ~(부호변환)
	/* A	B and or   not   exor nor, nand 
	 * -------------------------------------
	 * 0	0  0  0   0->1     0   1    1   
	 * 0	1  0  1   1->0     1   0    1
	 * 1	0  0  1            1   0    1
	 * -------------------------------------
	 * bitwise 연산 : and, or, not, ....
	 */
	int x = 20, y = 30;
	int result = x & y;
	System.out.println(result);
/*
 *  x= 20 : 00000101
 *  y= 30:  00011110*
 *  -------------------------
 *          00010100
 * 
 */
	

	
	
	//int x3 = 100;
	//System.out.println(~(x3); //-101
	

	int x3 = 100;
	System.out.println(~(x3)); //-101
	System.out.println(~(-101));// + 100
	
	int x4 = x ^ y;
	System.out.println(x4);
	/*
	 * x = 20 : 000101010 * 
	 * 
	 * 
	 */
	
	int x5 = y << 3; //3번 이동하면서 값을 증가시킵니다. *2
	//3 * 2 =6 *6*2 12*4=24
	System.out.println(x5);
	
	
	int x6 = y >> 3;// 
	// 30/2=15,15/2 = 7 7.2/2
	System.out.println(x6);
	
	
	boolean b1 = true;
	boolean b2 = false;
	boolean b3;
	
	//b3 = b1 + b2; // 불가능한 연산, 산술 연산은 불가능
	b3 = 100 < 200; // 관계연산은 가능
	System.out.println(b3);
	
	
	boolean b4 = b1 && b2; // true && false => false 
	boolean b5 = b3 && b4;
	System.out.println(b5); // false
	boolean stop = true;
	if(stop) {
		System.out.println("자동차를 정지합니다.");
	}else {
		System.out.println("자동차를 출발 시킵니다.");
	}
	
	//!(부정 연산자)
	boolean result3 = !(x > y); // false => true
	System.out.println(result3); // true
	
// 문제> x가 값이 -1이하이거나 20이상이고, 3과 20사이에 존재하는 값인데, 8이 아닌값은?
	x = 18;
	boolean result4 = ( x <= -1 || x >= 18 ) && ( x > 3 && x < 20) && ( x != 8);
		System.out.println(result4);
			
		
		
		
//문제> 10과 20의 데이터를 가지고, 논리 연산을 수행해 봅니다.
	System.out.println(10.0 < 20);// true
	System.out.println(10.0 <= 20L);// true
	System.out.println(10.0f == 20L);// false
	System.out.println(10.0f != 20L);// true
	System.out.println(10L >= 20.0);// false
	
	}

}
