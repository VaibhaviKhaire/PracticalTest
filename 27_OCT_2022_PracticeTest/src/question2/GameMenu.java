package question2;
import java.util.*;
public class GameMenu {
	public void startGame() {
		System.out.println("Start the Game");
	}
	public void displayGameInstruction()
	{
		System.out.println("display game instruction");
	}
	public void Exit()
	{
		System.out.println("Exit");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" 1.Start the game \n 2.Display game instruction \n 3.Exit the game");
		GameMenu gameMenuobj=new GameMenu();
		Scanner scannerObj=new Scanner(System.in);
		System.out.println("Enter the Choice 1,2 or 3");
		
		int menuChoice=scannerObj.nextInt();
		switch (menuChoice) {
	      case 1:
	    	  gameMenuobj.startGame();
	        
	        break;
	      case 2:
	    	  gameMenuobj.displayGameInstruction();
	       
	        break;
	      case 3:
	    	  gameMenuobj.Exit();
	        break;
	       default:
	        	System.out.println("Invalid Choice");

	}

}
}

