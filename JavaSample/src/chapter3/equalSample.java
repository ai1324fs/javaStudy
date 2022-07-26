package chapter3;

public class equalSample {
	public static void main(String[] args) {
	//equal: ==, equals(), 주소값을 비교, 객체체를 비교 
	// method : x()
	// x == 100 : 내용을 비교 합니다. 반드시 기본 자료형일때 가능합니다.
		int su1 = 100;
		int su2 = 100;
		int su3 = 300;
		
		//                 100 == 100
		System.out.println(su1 == su2);//true
		System.out.println(su1 == su3);//false
		
		su3 = su1;// 100 = 100, copy
		
		System.out.println(su1 == su2);//true
		System.out.println(su1 == su3);//true
		//System.out.println(su1.equals(su3));//
		
		String str1 = new String("문자열");//1000번지 가정
		String str2 = new String("문자열");//1000번지 가정
		String str3 = new String("숫자");// 3000번지 가정
		
		System.out.println(str1.equals(str2));//1000 === 1000, true
		System.out.println(str1.equals(str3));//1000 === 3000, false
		
		str1 = str3;//address value copy
		System.out.println(str1.equals(str3));//true
		
		
	}
}
