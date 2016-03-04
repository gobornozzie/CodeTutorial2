package automobile;

public class AccessModifiersDemo {

	public static void main(String[] args) {
		Cars c1 = new Cars();
		c1.increaseSpeed();
		c1.decreaseSpeed();
		c1.speed = 10;
		c1.setPrivateSpeed(11);
		c1.publicSpeed = 100;
		c1.exhaustSize = 5;
		c1.protectedSpeed = 101;

	}

}
