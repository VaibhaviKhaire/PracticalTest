package question1;



public class ArrayDemo {
	public int[]  manipulateIntegerArray(int arr[]){
		int newArr[]= new int[5];
		for(int i=0;i<arr.length;i++)
		{
			newArr[i]=arr[i]+5;
			
		}
		
		return newArr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		ArrayDemo obj= new ArrayDemo();
		int newArr[]=obj.manipulateIntegerArray(arr);
		for(int i=0;i<newArr.length;i++)
		{
			
			System.out.println(newArr[i]);
		}
		
		

	}

}
