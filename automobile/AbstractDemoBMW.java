package automobile;

public class AbstractDemoBMW extends AbstractCars{
	public void setPrivateSpeed(int speed){
		super.setPrivateSpeed(10);
	}
	public void engineStart(){
		super.engineStart("auto", pSpeed);
		System.out.println("BMW's have keyless engine start");
	}
}
