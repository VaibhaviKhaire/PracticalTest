package HandsOn;

public class MultiplicationTable extends Thread{
public void run() {
	System.out.println("Multiplication Table of 4");
	try {
		int num=4;
		for(int i=1;i<=10;i++) {
						Thread.sleep(1200);//it will sleep the main method thread for one second i.e 1000 millisecond each time the loop runs
			System.out.println(num*i);//printing multiplication table of 4
		}
	}
	catch(Exception e){
		//catching the exception
		System.out.println(e);
	}
	
}
	public static void main(String[] args) {
		MultiplicationTable M=new MultiplicationTable();
		M.start();

	}

}