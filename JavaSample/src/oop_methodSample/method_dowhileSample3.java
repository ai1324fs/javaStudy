package oop_methodSample;

import java.util.Scanner;

public class method_dowhileSample3 {

	private void genderProcess() {
	
		Scanner sc = new Scanner(System.in);
		
		int i = 0;// 변수선언
		
		boolean genders = true;
		
		do { // 0 <=3, 1<=3, 2<=3. 3<=3, 4<=3 (조건식)
			int su = sc.nextInt();
			
			String gender = (su == 1)? "남자": (su == 2)? "여자": 
				(su == 3)? "남자": (su == 4)? "여자": "잘못된 데이터 입니다."; 
			System.out.println(gender);// 남자, 여자	
			i++; // 증감식 
		}while (genders);
		
	}

	public static void main(String[] args) {
		// while(조건식)
		

		
		method_dowhileSample3 mds3 = new method_dowhileSample3();
		
		mds3.genderProcess();
	}

}
 
/* 요구사항 파악: 1,3남자로, 2,4여자로 한별ㄹ하여 출력하시오
 * method사용 결정
 * 1) 클래스로 오브젝트를 생성합니다.
 * 2) 참조변수명(객체명).메소드명으로 호출(전달인자 유무 파악)
 * 3) 해당 메소드에서 알고리즘으로 네용을 처리
 * 4) 반환값 유무 처리
 * 5) 결과를 저장
 * 6) 출력
 * 
 */

