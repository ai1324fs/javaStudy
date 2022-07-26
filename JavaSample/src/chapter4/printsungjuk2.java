package chapter4;

public class printsungjuk2 {
	

	@SuppressWarnings("static-access") //골뱅이 : 어노테이션 기법 (스프링에서 주로 사용하는 기법)
	public static void main(String[] args) {
		globalvarSample gs3 = new globalvarSample(); // 100 = gs2
	
		gs3.sungjukInput();
		gs3.sungjukProcess();
		gs3.sungjukOutput();
		
	//										클래스명.클래스변수
	//System.out.println("국어점수: " + globalvarSample.kor);
	//System.out.println("평균점수: " + globalvarSample.aver);
	}
}

//static 이란 data share = 클래스 변수 공유, method 공유
/*
 * 공유한다는 의미. 
 * globalvarSample 클래스의 내용을 접근하고자 할 때,
 * 다른 클래스(어느 클래스)에서 접근 하고자 할때 
 * 데이터 처리를 하는 부분에 대하여 공유합니다. (현재 공유한 기능들 : 입력, 처리, 출력)
 * 
 * => 소프트웨어의 재사용성, 모듈의 재사용성, 코드의 재사용성과 일맥상통 합니다.
 */

