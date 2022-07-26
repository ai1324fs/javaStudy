// static 키워드는 전역적 개념으로 main메소드 안에서 사용할 변수의 값을 초기화 하거나
// 외부의 다른 클래스에서 사용하도록 허용할 때 쓰입니다.

public class Helloworld4  { // 1000 번지, 서울시
//field area: 공용 영역, 클래스(전역)메소드, 클래스(전역)변수
	
	// static int kkoror = 300;//class variable
	
	 void helloPrint() { // 7000 번지, 신림동 
		System.out.println("안녕하세요?????");
		System.out.println("Helloworld~~~");		
	}
	
	public static void main(String[] args) {   //번지: 3000 가정, 구로구
		Helloworld4 helloworld3 =  new Helloworld4();
		
		int kor = 89;//local variable		
		
		helloworld3.helloPrint(); //신림동 호출, 객체명.메소드명 공식에 의하여 
		
		System.out.println(kor);		
		 
	}

	
}

 //memory: RAM => 16GB
// 접근제한자
/*
 * 생략: 
 * private: 같은 패키지의 같은 클래스내에 존재하는 경우에, 정보은닉(캡슐화)
 * protected: 상속관계 있는 같은 패키지와 클래스의 경우에 
 * public: 
 * 
 * method 형식
 * 
 * public static void Hello() {
 * 
 * 
 *  }
 * 
 */







