
public class TestIR {

	public static void main(String[] args) {

		double salary = 5300.0;
		
		if (salary <1900.0) {
        System.out.println("You don´t enter in the ITR");
		}
		
		else if (salary >=1900.0 && salary <=2800.0) {
			System.out.println("The IR is 7.5% and you can may deduct from the ITR the value of R$ 142");
		}
		
		else if (salary >=2800.01 && salary <=3751.0) {
			System.out.println("The IR is 15% and you can may deduct from the ITR the value of R$ 350");
		}
		
		else if (salary >=3751.01 && salary <=4664.0) {
			System.out.println("The IR is 22.5% and you can may deduct from the ITR the value of R$ 636");
		}
		
		else if (salary >=4664.01) {
			System.out.println("The IR is 27.5% and you can may deduct from the ITR the value of R$ 1.282");
		}
	}

}
