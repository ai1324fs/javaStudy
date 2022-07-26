package Collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

/* 이름, 국어, 영어, 수학 점수를 입력 받아서
 * 총점, 평균, 등수를 구하고 
 * 출력하는 프로그램 작성  
 * 
 * List: 순서가 존재한다,1,2,3,4,5 , 중복 데이터 허용
 * Set: 순서가 없음, 1,3,5,2,4,  중복 허용 하지 않음
 * Map: [key, value]의 쌍으로 구성, key는 중복을 허용하지 않으나 value는 중복을 허용합니다. 
 * 
 * ArrayList
 *  - 크기를 지정하지 않습니다. 배열의 개선된 자료구조
 *  - 여러가지 다른 데이터 타입도 저장 가능합니다.
 *  - 중복이 허용되고, 순서가 있습니다.
 */

public class Sample7_ArrayList2 {			
	
	public static void main(String[] args) {			
		List<String> ls = new ArrayList<>();
		//ArrayList<String> ls = new ArrayList<>();
		
		ls.add("JAVA");
		ls.add("JDBC");
		ls.add("Servlet/JSP");
		ls.add("DataBase");
		ls.add("MyBatis");
		
		int size = ls.size();
		System.out.println("객체의 총합은 = " + size);
		
		ls.remove(2);
		ls.remove("MyBatis");
		System.out.println("객체의 총합은 = " + ls.size());
		for (int i=0; i<ls.size(); i++){
			System.out.println(ls.get(i));
		}
		System.out.println();
		
		ls.set(2, "냉 면");//수정
		
		System.out.println("===이더레이터 클래스===");
		Iterator iter = ls.iterator();
		
		while(iter.hasNext()){
			System.out.println(iter.next() + " ");
		}
	
	}

}
