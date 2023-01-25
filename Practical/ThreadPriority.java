//Example to check the 
//MAX_PRIORITY
//MIN_PRIORITY
//Norm_PRIORITY
package corejava;

public class ThreadPriority extends Thread
{
 public void run()
 {
	 System.out.println("The Running Thread priority is:" +
	 Thread.currentThread().getPriority());
 }
	public static void main(String[] args)
	{
		ThreadPriority t1= new ThreadPriority();
		ThreadPriority t2= new ThreadPriority();
		ThreadPriority t3= new ThreadPriority();
		t1.setPriority(MIN_PRIORITY);
		t2.setPriority(NORM_PRIORITY);
		t3.setPriority(MAX_PRIORITY);
		t1.start();
		t2.start();
		t3.start();

	}

}