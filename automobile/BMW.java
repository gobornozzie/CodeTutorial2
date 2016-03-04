package automobile;

public class BMW extends Cars{
	public BMW(int startSpeed){
		super();
	
	}

	@Override
	public void increaseSpeed() {
		protectedSpeed++;
		Cars c1 = new Cars();
		c1.decreaseSpeed();
		System.out.println("Increasing speed of BMW");
	}

	@Override
	public void decreaseSpeed() {
		System.out.println("Decreasing speed of BMW");
	}

	@Override
	public void wheelSize(int startWheelSize) {
		super.wheelSize(startWheelSize);
	}
	
	public void headsUpDisplayNavigation(){
		System.out.println("BMW specific functionality");
	}

	@Override
	public void wheelSizeSmall() {
		System.out.println("BMW small wheel size is 4");
	}

	@Override
	public void wheelSizeLarge() {
		System.out.println("BMW large wheel size is 12");
	}
	
	
	
	
	/*public void increaseSpeed(int speed){
		
	}*/
	
	
	
}
