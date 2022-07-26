package oop_getsetter;

class DriveCar2 {

	private String color;
	private int price;
	private String manufacturing_company;
	private String carname;
	
	//setter	
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
