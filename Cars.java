
public class Cars {

	public Cars (int startSpeed){
		speed = startSpeed;
	}
	
	int speed;
	
	public void increaseSpeed() {
		speed++;
		System.out.println("Increasing Speed of Cars");
	}
	
	public void decreaseSpeed() {
		speed--;
		System.out.println("Decreasing Speed of Cars");
	}
	
		
}
