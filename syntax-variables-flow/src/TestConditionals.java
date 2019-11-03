
public class TestConditionals {

	public static void main(String[] args) {
		
		System.out.println("Testing Conditionals");
		
		int age = 16;
		int amountOfPeople = 3;
		if (age >= 18)	{
		
			System.out.println("You have more than 18 years");
			System.out.println("welcome");			
			}
		else {
			
			if (amountOfPeople >= 2) {
			
				System.out.println("You don´t have 18, but you can go in because you are accompanied");
			} 
			else {
			
				System.out.println("unfortunately you can't come in");  
			}
		}
	}

}
