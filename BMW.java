
public class BMW extends Cars{
	public BMW (int startSpeed){
		super(startSpeed);
	}

	@Override
	public void increaseSpeed() {
		System.out.println("Increasing Speed of BMW");
	}
	
	public void headupDisplayNavigation() {
		System.out.println("BMW Specific functionality");
	}
	
	
	
	
	
	
}
