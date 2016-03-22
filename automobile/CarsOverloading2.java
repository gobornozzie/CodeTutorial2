package automobile;

/***
 * Different in data type of arguments
 * @author Garry
 *
 */


public class CarsOverloading2 {

	public static void main(String[] args) {
		increaseSeatHeight(2);
		increaseSeatHeight("Eight");
	}

	public static void increaseSeatHeight(int heightToIncrease){
		System.out.println("Increased seat height by " + heightToIncrease + " inches.  I am integer one");
		
	}
	
	public static void increaseSeatHeight(String heightToIncrease){
		System.out.println("Increased seat height by " + heightToIncrease + " inches.  I am String one");
		
	}
}
