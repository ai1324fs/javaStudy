package oop_interface;

interface Ainter {

	public static String field2 = "이순신 장군";
	public static int number2 = 200; 
	public static int number3 = 300; 
	
	 void cal();// 추상 메소드 : body가 없습니다. {		}
	//public abstract 생략가능
}

//				자식 클래스 역할
	public class sample1 implements Ainter {

		@Override
		public void cal() {
			int sum = number2 * number3;
			System.out.println(sum);
			System.out.println(field2);
		}
	
	public static void main(String[] args) {
		sample1 is = new sample1();
		is.cal();
		
	}

	public void sungjuk(double x, int y) {
		// TODO Auto-generated method stub
		
	}
}
	



