
public class WhileDemo {

	public static void main(String[] args) {
		
		int i = 5;
		
		while (i < 20 ) {
			System.out.println(i);
			i++;
			if(i == 17) {
				continue;
			}
			System.out.println("Value of i" + i);
		}
		System.out.println("Outside Loop");
		
		do{
			System.out.println("Do while loop...");
			System.out.println(i);
			i++;
			
		}while (i < 23);
		
		if (i == 23){
			System.out.println("if statement executed");
		}
		else{
			System.out.println("else statement executed");
		}
			
	}

}
