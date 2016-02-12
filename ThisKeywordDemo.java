
public class ThisKeywordDemo {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		Car c2 = new Car();
		
		c1.setMake("BMW111");
		System.out.println(c1.getMake());
		
		c2.setMake("Mercedes");
		System.out.println(c2.getMake());
	}
	
}
