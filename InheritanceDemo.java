
public class InheritanceDemo {

	public static void main(String[] args) {
		int speed = 0;
		
		Cars c1 = new Cars(speed);
		c1.increaseSpeed();
				
		
		BMW bmw1 = new BMW(speed);
		bmw1.increaseSpeed();
		bmw1.headupDisplayNavigation();
		
		Audi audi1 = new Audi(speed);
		audi1.increaseSpeed();
		audi1.changeColorAudi();
		
		
	}

}
