import java.util.Scanner;
public class CheckNumberExample {
	

		private static boolean checkNumber(int number) {
			
			int prevDigit = number % 10;
		    number = number / 10;
		    while (number != 0) {
		        int curDigit = number % 10;
		        if (curDigit > prevDigit) {
		            return false;
		        } 
		        else {
		            prevDigit = curDigit;
		            number = number / 10;
		            }
		    }
		 return true;
		 }
		public static void main(String[] args) {
			
			try (Scanner sc = new Scanner(System.in)) {
				System.out.println("Enter a Number: ");
							
				int number=sc.nextInt();
						
				boolean status=CheckNumberExample.checkNumber(number);	
							
				if(status==true){
					
					System.out.println(number+ " is an increasing number ");
				}
				
				else {
					
					System.out.println(number+ " is not an increasing number");
				}
			}
		}
	}
	


