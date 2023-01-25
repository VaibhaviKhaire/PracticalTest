package corejava;

//Creating a Thread by extending the Thread Class
//and overriding its run() method.



public class ThreadExample extends Thread 
{
	public static void main(String[] args)
	{
		ThreadExample t= new ThreadExample(); // creating an object of thread
		t.start(); //calling start() method
		System.out.println("This code is running outside the Thread");
	}
	public void run()
	{
		System.out.println("This code is running inside the Thread");
	}
}
