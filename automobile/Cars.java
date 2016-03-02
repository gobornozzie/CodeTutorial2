package automobile;

public class Cars {
	//No Modifier - accessible in the same package.  Below are accessible within other packages due to 'public'
	public int speed;
	public int wheel;
	//Private variables only allowed within class
	private int privateSpeed;
	
	//Anywhere in Java World with importing the package and class
	public int publicSpeed;
	
	
	public Cars(){
		int startSpeed = 0;
		speed = startSpeed;
	}
	
	public void setPrivateSpeed(int pSpeed){
		privateSpeed = pSpeed;
		
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
