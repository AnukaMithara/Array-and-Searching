import java.util.*; 

public class Q3b 
{ 
	public static void main(String args[]) 
		{ 
			Scanner sc = new Scanner(System.in);	//create a object in scanner class
			int a;
			System.out.print("Enter the size of the array : \t");	
			a = sc.nextInt();						//get user input for array size
			int[] arr = new int[a];						
			
			for(int i = 0;i<a;i++)					//get user inputs for array elements
			{
			System.out.print("Enter " + (i+1) + " Number :\t");									
			arr[i] = sc.nextInt();		
			}		
			
			System.out.println("\nOriginal Array: "); //display the array that input by user
			for(int j = 0;j<a;j++)
			{
			System.out.print(arr[j] + " ");					
			}
			
			mergeSort(arr, 0, arr.length - 1); 		//call the method for sort the array
			
			System.out.println("\n\nSorted Array: "); //display the sorted array
			for(int k = 0;k<a;k++)
			{
			System.out.print(arr[k] + " ");								
					
			}
		} 
 
	public static void mergeSort(int[] arr, int start, int end) 
	 {		 
		 int mid = (start + end) / 2; 	//initialize break point
		 if (start < end) 				
		 { 
			mergeSort(arr, start, mid); //recursively break values from start to mid
			mergeSort(arr, mid + 1, end);  //recursively break values from mid to end
		 } 
		 
		 int i = 0;				
		 int first = start; 
		 int last = mid + 1; 
		 int[] temp = new int[end - start + 1]; 
		 
		while (first <= mid && last <= end) 
		{ 
			if(arr[first] < arr[last])	//check the values of the part
			{
				temp[i++] = arr[first++]; //initialize minimum values for temp array if first is minimum
			}
			else
			{
				temp[i++] = arr[last++]; //initialize minimum values for temp array if last is minimum
			}			
		} 		
		while (first <= mid) 
		{ 
			temp[i++] = arr[first++];  
		} 		
		while (last <= end) 
		{ 
			temp[i++] = arr[last++];  
		} 		
			i = 0; 
			
		while (start <= end) 
		{ 
			arr[start++] = temp[i++]; //re initialize arr sort values part by part
		} 
	}	
}










