import java.util.Scanner;

public class CalculateDifference {
	
	
		
		static int number;
		int sum;
		
		private int calculateDifference(int number){
			
			int sumSquare=0;
			int naturalNumber=0;
			int wholeSquare=0;
			for(int i=1;i<=number;i++) {
				
				naturalNumber=naturalNumber+i;
				sumSquare+=i*i;
				wholeSquare=naturalNumber*naturalNumber;
			}
			
			sum=sumSquare-wholeSquare;
			
		return sum;		
		}

		public static void main(String[] args) {
			
			CalculateDifference obj=new CalculateDifference();
			
			try (Scanner sc = new Scanner(System.in)) {
				System.out.println("Enter a Number: ");
				int n=sc.nextInt();
				int i=obj.calculateDifference(n);
				System.out.println("Sum of diffrence of square and "
						+ "the square of their sum is: " + i);
			}
		}
	}
