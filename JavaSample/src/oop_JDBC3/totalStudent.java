package oop_JDBC3;

public class totalStudent {

	public static void main(String[] args) {
		Select_student ss = new Select_student();
		ss.main(args);
		
		Insert_student is = new Insert_student();
		is.main(args);
		
		Update_student us = new Update_student();
		us.main(args);
		
		Delete_student ds = new Delete_student();
		ds.main(args);
	}

}
