
public class TestWhile {
		public static void main(String[] args) {
			int counter = 0;
			while(counter <= 10) {
				System.out.println(counter);
				// counter = counter + 1; isn´t in use
				// counter += 1; other form of sum a number
				++counter; // equal a counter++;
				
			}
			System.out.println(counter);
		}
}
