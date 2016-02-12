
public class ConditionalStatement {

	public static void main(String[] args) {
		
		int score = 30;
		String grade;
		
		if (score > 90) {
			grade = "A";
		}
		else if (score > 80){
			grade = "B";
		}
		else if (score > 70) {
			grade = "C";
		}
		else if (score > 40) {
			grade = "D-";
			System.out.println("Please give up now because you got an " + grade);
		}
		else {
			grade = "F";
			System.out.println("You suck rocks because you received an " + grade);
		}
		
		System.out.println("Score is: " + score);
		System.out.println("Score is: " + grade);
		
	}

}
