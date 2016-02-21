
public class InheritanceDemo {

	public static void main(String[] args) {
		int speed = 0;
		int wheel = 10;
		
		Cars c1 = new Cars(speed);
		c1.increaseSpeed();
		c1.decreaseSpeed();
		
		Cars c2 = new Cars(wheel);
		c2.wheelSizeSmall();
		c2.wheelSizeLarge();
		
		
		BMW bmw1 = new BMW(speed);
		bmw1.increaseSpeed();
		bmw1.decreaseSpeed();
		bmw1.headsUpDisplayNavigation();

		BMW bmw2 = new BMW(wheel);
		bmw2.wheelSizeSmall();
		bmw2.wheelSizeLarge();
		
		Audi audi1 = new Audi(speed);
		audi1.speed = 100;
		audi1.increaseSpeed();
		audi1.decreaseSpeed();
		
		Audi audi2 = new Audi(wheel);
		audi2.wheel = 7;
		audi2.wheelSizeSmall();
		audi2.wheelSizeLarge();
		
	}

}
