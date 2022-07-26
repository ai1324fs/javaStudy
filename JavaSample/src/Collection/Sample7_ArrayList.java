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

class MyStudent {

	String str;
	static int value;
	static double d;
	
	public MyStudent(String string) {
		this.str = string;
	}

	public MyStudent(int i) {
		this.value = i;
	}

	public MyStudent(double d) {
		this.d = d;
	}

}

public class Sample7_ArrayList {			
	
	
	public static void main(String[] args) {			
	List<MyStudent> list = new ArrayList<MyStudent>();
	
	list.add(new MyStudent("홍길동"));
	list.add(new MyStudent("차범근"));
	list.add(new MyStudent("차두리"));
	list.add(new MyStudent(2500));
	list.add(new MyStudent(123.456)); 
	
	System.out.println(list);
	
	for (int i=0; i<list.size(); i++){
		System.out.println(list.get(i));
	}
			
	for(int i=0; i < list.size(); i++) {
		System.out.println(list.get(i));  
	
	}
	
	Iterator elements = list.iterator();
	while( elements.hasNext() ){
		System.out.println(elements.next() );
	}
		
	for(MyStudent st : list) {
		System.out.println(st.str);	
	}	
			
		System.out.println(MyStudent.value); 	
		System.out.println(MyStudent.d); 
	}

}
