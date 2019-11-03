
public class TestConditionalsV2 {

	public static void main(String[] args) {
		
		System.out.println("Testing Conditionals");
		
		int age = 20;
		int amountOfPeople = 3;
		boolean accompanied = amountOfPeople >=2;
		
		System.out.println("value of accompanied = " + accompanied);
		
		if (age >= 18 && accompanied) {
		
			System.out.println("welcome");
		} 
		else {
		
			System.out.println("unfortunately you can't come in");
		}
	}

}