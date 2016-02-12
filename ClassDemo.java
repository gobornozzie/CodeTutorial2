import org.omg.Messaging.SyncScopeHelper;

public class ClassDemo {

	String str2 = "Hi There !!!";

	
	public static void main(String[] args) {
		String str1 = "Hello Java!";
		String str2 = "This is a second string in Java!";
		
		System.out.println(str1);
		System.out.println(str2);

//		for (int i=0; i < args.length; i++) {
//			System.out.println(args[i]);
//				
//		}
		
		
		System.out.println("********************************************");
		
		CarClass c1 = new CarClass();
		CarClass c2 = new CarClass();
		CarClass c3 = new CarClass();
		
		c1.model = "BMW";
		//c1.year = 2015;
		c1.bodyType = "Hatchback";
		c1.wheelType = "Chrome";
		c1.year = 1999;
		c2.model = "Audi";
		c2.year = 2001;
		c3.model = "Porche";
		c3.year = 2010;
				
		
		System.out.println(c1.year + " " + c1.model + " " + c1.bodyType);
		System.out.println(c1.wheelType);
		System.out.println(c1.getYear());
		System.out.println(c2.model + " " + c2.year);
		
	}
}


class CarClass {

	int year = 2016;
	String model;
	String bodyType;
	String wheelType;
	
	
	public int getYear(){
		return this.year;
	}
	
}
