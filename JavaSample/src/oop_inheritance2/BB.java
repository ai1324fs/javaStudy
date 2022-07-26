package oop_inheritance2;

public class BB extends AA {
	static String grade;
	public void process() {
		grade = (value >= 90)? "A": (value >= 80)? "B": 
			(value >= 70)? "C": (value >= 60)? "D": "F";
	}
	
}