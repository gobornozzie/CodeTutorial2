
public class Audi extends Cars{
	public Audi (int startSpeed){
		super(startSpeed);
	}

	@Override
	public void increaseSpeed() {
		System.out.println("Increasing speed of Audi...");
	}
	
	public void changeColorAudi() {
		System.out.println("Specific Audi Functionality");
		
	}

	
	
	
}
