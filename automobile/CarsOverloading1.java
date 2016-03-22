package automobile;

/**
 * Different number of paramters in argument list
 * @author Garry
 *
 */

public class CarsOverloading1 {
	
	//1. Number of parameters can be different
	//2. Data type of parameters are different
	//3. Sequence of data type is different
	public static void main(String[] args) {
		increaseSeatHeight(2);
		increaseSeatHeight(8, true);
	}

	public static void increaseSeatHeight(int heightToIncrease){
		System.out.println("Increased seat height by " + heightToIncrease + " inches");
		
	}
	
	public static void increaseSeatHeight(int heightToIncrease, boolean rememberHeight){
		System.out.println("Increased seat height by " + heightToIncrease + " inches");
		if (rememberHeight) {
			System.out.println("Your selection is saved");	
		}else {
				System.out.println("Your selection is not saved");
			}
		}
}
	
