package Collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

/* 
 * ArrayList
 *  - 크기를 지정하지 않습니다. 배열의 개선된 자료구조
 *  - 여러가지 다른 데이터 타입도 저장 가능합니다.
 *  - 중복이 허용되고, 순서가 있습니다.
 *  
 *  국어, 영어, 수학을 입력 받아서, 저장하고 총점, 평균을 구하여 출력하세요. (석차, 학점 추가가능)
 *  Arraylist
 *  
 *  - 메인 클래스:Sample8_ArrayList3
 *  - 서브 클래스:ScoreClass
 *  
 */


public class Sample8_ArrayList4 {	
	
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		List<String> subject = new ArrayList<String>();
		List<Integer> score = new ArrayList<Integer>();
		
		System.out.println("국어점수를 입력하세요.");
			subject.add("국어 점수 : ");
			score.add(sc.nextInt());
			
		System.out.println("영어점수를 입력하세요.");
			subject.add("영어 점수 : ");
			score.add(sc.nextInt());
			
		System.out.println("수학점수를 입력하세요.");
			subject.add("수학 점수 : ");
			score.add(sc.nextInt());
		

		int sum=0, cnt=0;
		for(int i=0; i<subject.size(); i++) {
			sum += score.get(i);
			cnt++;
		}
		
		double aver = sum / cnt;
		
		System.out.println("총점은 = " + sum + " 이고, 평균은 = " + aver + " 입니다.");
	}
}
