package oop_getsetter;

import java.util.Scanner;

/* 데이터베이스 연동시에 반드시 사용
 * getter: 저장된 데이터를 조회하는 메소드 기능
 * setter: 데이터베이스에 저장하는 메소드 기능
 * 
 * 자동차 객체
 * 속성:제조사, 색상, 트렁크, 핸들, 썬루프, 크기, 가격, ....
 * 기능:출발, 일시정지, 가속, 변속, 감속, 주차
 * 
 * 색상: 흰색, 가격:10억, 제조사: 포르쉐(주), 이름: 포르쉐7
 * 달린다, 일시정지, 주차,...
 */




public class Sample2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("자동차 색상을 입력해주세요");
		String Color = sc.next(); // nextLine()
		System.out.println("자동차 가격을 입력해 주세요");
		int price = sc.nextInt();
		System.out.println("자동차 제조사명을 입력해 주세요");
		String manufacturing_company = sc.next();
		System.out.println("자동차 이름을 입력해 주세요");
		String carname = sc.next();
		
		DriveCar2 dc = new DriveCar2();
		//data stroage
		dc.setColor(Color);
		dc.setPrice(price);
		dc.setManufacturing_company(manufacturing_company);
		dc.setCarName(carname);
		
		//data query
		System.out.println("자동차 색상: " + dc.getColor());
		int prive2 = dc.getPrice();
		System.out.println("자동차 가격: " + prive2);
		System.out.println("자동차 제조사: " + dc.getManufacturing_company());
		System.out.println("자동차 이름: " + dc.getCarName());
		
	}

}
