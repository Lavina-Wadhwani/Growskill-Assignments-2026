package loopsAssignment;

public class SumOfDigits {

	public static void main(String[] args) {
		
		int num = 4567;
        int sum = 0;

        for (int i = num; i > 0; i = i / 10) {
            sum = sum + (i % 10);
        }

        System.out.println("Sum of digits = " + sum);

	}
}
