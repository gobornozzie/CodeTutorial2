
public class Cars {

	int speed;
	int wheel;
	
	public Cars(int startSpeed){
		speed = startSpeed;
	}
	
	public void increaseSpeed(){
		speed++;
		System.out.println("Increasing Speed of Cars");
	}
	
	public void decreaseSpeed(){
		speed--;
		System.out.println("Decreasing Speed of Cars");
	}

	public void wheelSize(int startWheelSize){
		wheel = startWheelSize;
	}
	
	public void wheelSizeSmall(){
		wheel = 2;
		System.out.println("Small Wheel size is: " + wheel);
	}
	
	public void wheelSizeLarge(){
		wheel = 20;
		System.out.println("Large Wheel size is: " + wheel);
	}
}
