import java.util.Scanner;
public class calculateSum {
private int calulateSum(int num) {
		
        int sum = 0;
 
        for (int i = 1; i <= num; i++) {
        	
            if (i % 3 == 0 || i % 5 == 0)
                sum = sum + i;
        }
    return sum;
	}
 
    public static void main(String[] args) {
    	
    	try (Scanner sc = new Scanner(System.in)){
    		
			System.out.println("Enter a Number: ");
			
			int n=sc.nextInt();
			
			calculateSum obj =new calculateSum ();
			
			int i=obj.calulateSum(n);
			
			System.out.println("Sum of first " + n +
			" natural numbers which are divisible by 3 or 5 is: " + i);
		}
    }
}
