
public class Audi extends Cars {
	public Audi(int startSpeed){
		super(startSpeed);
	}

	@Override
	public void increaseSpeed() {
		System.out.println("Increase speed of Audi");
	}

	@Override
	public void decreaseSpeed() {
		System.out.println("Decrease speed of Audi");
	}

	@Override
	public void wheelSize(int startWheelSize) {
		super.wheelSize(startWheelSize);
	}

	@Override
	public void wheelSizeSmall() {
		System.out.println("Small wheel size for Audi is 1");
	}

	@Override
	public void wheelSizeLarge() {
		System.out.println("Large wheel size for Audi is 18");
	}
	
	

}
