
public class TestScope {
	
	public static void main(String[] args) {
	
		System.out.println("Testing Conditionals");
		
		int age = 20;
		int amountOfPeople = 3;
		boolean accompanied;
		
		if (amountOfPeople >= 2) {
			accompanied = true;
		}
		else {
			accompanied = false;
		}
		
		if (age >= 18 && accompanied) {
		
			System.out.println("welcome");
		
		} else {
			
			System.out.println("unfortunately you can't come in");
		}

	}

}

