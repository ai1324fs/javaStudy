package chapter4;

public class printsungjuk {
	
	static int kor;
	static int aver;
	
	public static void main(String[] args) {
		globalvarSample gs2 = new globalvarSample(); // 100 = gs2
	
		gs2.sungjukInput();
		gs2.sungjukProcess();
	
	//										클래스명.클래스변수
	System.out.println("국어점수: " + globalvarSample.kor);
	System.out.println("평균점수: " + globalvarSample.aver);
	}
}