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


class ScoreClass {

	private double score;
	public ScoreClass(double score) {
		this.score = score;
	}

	public double getScore() {
		return score;
	}
}

public class Sample8_ArrayList3 {			
	
	public static void main(String[] args) {			
		List<ScoreClass> scores = new ArrayList<ScoreClass>();
	
		scores.add(new ScoreClass(100.0));
		scores.add(new ScoreClass(90.56));
		scores.add(new ScoreClass(80.5));
		
		int sum=0, cnt=0;
		for(ScoreClass sc : scores) { // 값 입력
			sum += sc.getScore();
			cnt++; // 과목ㅇ 몇개인지 추가 (3개)
		}
		double aver = sum / cnt;
		
		System.out.println("총점은 = " + sum + " 이고, 평균은 = " + aver + " 입니다.");
	}
}
