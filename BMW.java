
public class BMW extends Cars{
	public BMW(int startSpeed){
		super(startSpeed);
	
	}

	@Override
	public void increaseSpeed() {
		System.out.println("Increasing speed of BMW");
	}
	
	public void headsUpDisplayNavigation(){
		System.out.println("BMW specific functionality");
	}

	/*public void increaseSpeed(int speed){
		
	}*/
	
	
	
}
