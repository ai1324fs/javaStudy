package Collection;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

public class Sample5 {
			
	public static void main(String[] args) {
		//Vector 클래스, n개 증가, 기본 10개 제공, 
		Vector vec = new Vector(4, 3);
		
		vec.add(0 * 10);//[1] 0 * 10
		vec.add(1 * 10);//[2] 1 * 10
		vec.add(2 * 10);//[3] 2 * 10
		vec.add(3 * 10);//[4] 3 * 10
		vec.add(4 * 10);//[5] 4 * 10
		
		
		
		//for(int i=0; i < 5; i++) {
		//	vec.add(i * 10);//[1] 0 * 10,[2] 1*10.[3] 2*10,[4] 3*10,[5] 4*10
		//}
		
		for(int i=0; i < vec.size(); i++) {
			System.out.println(" " + vec.get(i));
		}
		
		System.out.println("벡터의 크기는 : " + vec.size());//
		System.out.println("벡터의 용량은 : " + vec.capacity());//
		System.out.println("첫번째 구성요소는 : " + vec.firstElement());//
		System.out.println("중간에 있는 구성요소는 : " + vec.get(2));
		System.out.println("마지막 구성요소는 : " + vec.lastElement());//
		
		
		//문제> 사과, 수박, 한라봉, 수박, 참외 등의 과일을 입력하고, 출력하세요
		
		
		
		
	}

}
