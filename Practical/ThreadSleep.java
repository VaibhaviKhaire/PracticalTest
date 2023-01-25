//Using Thread.Sleep() method for 
//Custom Thread
//with IllegalArgumentException 
package corejava;

public class ThreadSleep extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0; i<6 ; i++) // printing no.'s from 0 to 5
			{
				//it will sleep the main method thread for 1 sec
				//each time the for loop runs
				Thread.sleep(-1000);
				//printing the values of the variable i
				System.out.println(i);
			}
		}
		catch(Exception e)
		{
			// catching the exception
			System.out.println(e);
		}
	}
	public static void main(String[] args)
	{
		//main thread
		ThreadSleep t=new ThreadSleep();
		t.start();

	}

}
