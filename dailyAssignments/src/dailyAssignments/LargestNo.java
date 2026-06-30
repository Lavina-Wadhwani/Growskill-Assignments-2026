package dailyAssignments;

public class LargestNo {

	public static void main(String[] args) {
		
		int num=59371;
		int largest=0;
		
		for(;num>0;) {
			
			int lastDigit=num%10;
			
			if(lastDigit>largest) {
				largest=lastDigit;
			}
			num=num/10;
			
		}
		System.out.println("Largest didgit ="+largest);
	}
}
