
public class Helloworld3 { // 1000 번지, 서울시
//field area: 공용 영역, 클래스(전역)메소드, 클래스(전역)변수
	
	 void helloPrint() { // 7000 번지, 신림동 
		System.out.println("안녕하세요?????");
		System.out.println("Helloworld~~~");
		
	}
	
	public static void main(String[] args) {   //번지: 3000 가정, 구로구
		Helloworld3 helloworld3 =  new Helloworld3();
		
		helloworld3.helloPrint(); //신림동 호출, 객체명.메소드명 공식에 의하여 
		
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
 * 
 * 
 */







