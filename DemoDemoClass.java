class Car {
	int year;
	private String make;
	private int speed;
	private int gear;
	private String color;
	private String wheel;
	
	
	public Car () {
		this(2,1,"chrome","Black" );
		gear = 1;
		speed = 0;
		
		System.out.println("Executing constructor without arguments...");
	}
	
	public Car (int startGear, int startSpeed, String startWheel, String startColor) {
		gear = startGear;
		speed = startSpeed;
		wheel = startWheel;
		color = startColor;
		
		System.out.println("Executing constructor with arguments...");
	}
	
	int getyear() {
		//System.out.println("the year is: " + year);
		return year;
	}
	
	void setMake(String make) {
		this.make = make;
	}
	
	String getMake() {
		return make;
	}
}


public class DemoDemoClass {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.year = 2010;
		
		String mk = "BMW";
		c1.setMake(mk);
		
		int yearOfCar = c1.getyear();
		String mk1 = c1.getMake();
		
		System.out.println("The make of car is: " + mk1 + " The year is: " + yearOfCar);
		
		Car c2 = new Car ();
		c2.getMake();
		
		//System.out.println("The make of Car2 is: " +  );
		
		//System.out.println("The make of car is: " + c1.make + " and year is: " + c1.year);
	}
}