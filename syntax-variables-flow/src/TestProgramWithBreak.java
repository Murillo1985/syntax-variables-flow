
public class TestProgramWithBreak {
	  public static void main(String args[]) {
	        for(int line = 0; line < 5; line++) {
	            for (int colunn = 0; colunn < 5; colunn++) {
	                if ( colunn > line ) {
	                    break;
	                }
	                System.out.print( colunn+1 );
	            }
	            System.out.println();
	        }
     }
}

