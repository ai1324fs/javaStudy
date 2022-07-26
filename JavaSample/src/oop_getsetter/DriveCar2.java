package oop_getsetter;

class DriveCar2 {
	//클래스 변수 저장
	private String color;
	private int price;
	private String manufacturing_company;
	private String carname;
	
	//setter 	this 생략 가능하지만 실제로는 생략하지 않는다 직관적으로 알아보기 더 쉽기 때문이다
	public void setColor(String color) {
		this.color = color;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setManufacturing_company(String manufacturing_company) {
		this.manufacturing_company = manufacturing_company;
	}

	public void setCarName(String carname) {
		this.carname = carname;
	}

	public String getColor() {
		return color;
	}

	public int getPrice() {
		return price;
	}

	public String getManufacturing_company() {
		return manufacturing_company;
	}

	public String getCarName() {
		return carname;
	}
	
}