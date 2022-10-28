package question3;

public class ArraySortDemo {
	public void sortArray() {
		int[] arr = { 13, 7, 6, 45, 21, 9, 2, 100 };

		for (int i = 0; i < arr.length; i++)   
		{  
		for (int j = i + 1; j < arr.length; j++)   
		{  
		if (arr[i] < arr[j])   
		{  
			int temp = arr[i];  
			arr[i] = arr[j];  
			arr[j] = temp;  
		}  
		}  
		}  
		
		System.out.println("Array elements in descending order:");  
		//accessing element of the array  
		for (int i = 0; i <=arr.length - 1; i++)   
		{  
		System.out.println(arr[i]);  
		}  
	    
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraySortDemo obj=new ArraySortDemo();
		obj.sortArray();
	}

}
