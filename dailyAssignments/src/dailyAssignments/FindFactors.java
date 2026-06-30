package dailyAssignments;

public class FindFactors {

	public static void main(String[] args) {
		int num=24;
		
		System.out.println("Factors of "+num+" are");
		for (int i = 1; i <= num; i++) {

            if (num % i == 0) {
                System.out.println(i);
            }
		}
		
	}
}
