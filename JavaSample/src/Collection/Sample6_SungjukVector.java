package Collection;

import java.util.Enumeration;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

/* 이름, 국어, 영어, 수학 점수를 입력 받아서
 * 총점, 평균, 등수를 구하고
 * 출력하는 프로그램 작성 
 * 
 * List: 순서가 존재한다. 1,2,3,4, .... ,중복 데이터 허용
 * Set: 순서가 없다, 1,3,5,2,4 (순서가 섞여있다) 중복을 허용하지 않음
 * Map: [key],[value] 의 쌍으로 구성, key는 중복을 허용하지 않으나 value는 중복을 허용합니다.
 */

class StudentVector {
	//Vector 를 이용하여 처리
	List<StudentVO> list = new Vector<StudentVO>(); // 리스트 구조의 특성을 벡터가 닯았다
	private int count; // 리스트 자료구조 중복하여 사용가능하다, 
	Vector<StudentVO> vec = (Vector<StudentVO>)list;// down casting
	
	
	public StudentVector() {
		inputData();

		processRank(vec); // 등수 구하기
		printData(vec);//출력하기
		
	}


	private void processRank(Vector<StudentVO> vec) {
		int[] temp_total = new int[count];
		StudentVO stus;
		int i=0, rank;
	
		Enumeration enums = vec.elements();
		while(enums.hasMoreElements()) {
			stus = (StudentVO)enums.nextElement();
		temp_total[i] = stus.getTotal();
		i++;
		stus.setRank(1); // 처번째 데이터 1등으로 설정하기
	}
		
		//등수구하기
		Enumeration enums2 = vec.elements();
		while(enums2.hasMoreElements()) {
			stus = (StudentVO)enums2.nextElement();
			rank = stus.getRank();
			
			for(i=0; i < temp_total.length; i++) {
				if(stus.getTotal() < temp_total[i])
					rank++;
			}
			stus.setRank(rank);
		}		
	}
	
	private void printData(Vector vec) {
	System.out.println("--------------------------------------------------------------------------------");
	System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t석차");
	System.out.println("--------------------------------------------------------------------------------");
	
	Enumeration enums3 = vec.elements();
	
	while(enums3.hasMoreElements()) { //
		StudentVO stus = (StudentVO)enums3.nextElement();
		//System.out.println(stus.getName() + "\t" + stus.getKor() + "\t" + stus.getEng() + "\t" + stus.getMat() + "\t" + stus.getTotal() + "\t" stus.getAver() + "\t" + stus.getRank());
		}
		
	}
	
	public void inputData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("처리할 데이터 갯수를 입력해 주세요.");
	 count = sc.nextInt(); // 7
		int cnt = 0;

		do {
			System.out.println("처리할 데이터를 입력해 주세요");
			String name = sc.next();
			int kor = sc.nextInt();
			int eng = sc.nextInt();
			int mat = sc.nextInt();
			
			cnt++;
			list.add(new StudentVO(name, kor, eng, mat));
		}while(cnt < count);// ? < 7
		
	}
	
	
}


public class Sample6_SungjukVector {
			
	public static void main(String[] args) {
		new StudentVector();
		}
	}