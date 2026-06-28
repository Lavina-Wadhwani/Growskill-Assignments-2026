package loopsAssignment;

public class CountNoofDigits {

	public static void main(String[] args) {
		
		 int num = 987654;
	        int count = 0;

	        for (int i = num; i > 0; i = i / 10) {
	            count++;
	        }

	        System.out.println("Number of digits = " + count);

	    }
	
}
