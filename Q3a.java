import java.util.*; 
   
class Q3a { 
    
    static int swap(int arr[], int start, int end)   //method for selecting pivot and swap the elements
	{ 
        int pivot = arr[end];  						//initialize pivot 
         
        int i = (start - 1); 
        for (int j = start; j < end; j++) 
		{ 
            
            if (arr[j] <= pivot)  	/*check with current arr[j] element with pivot,
										if lessthan or equal, swap*/
			{							
                i++;                 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 								
        int temp = arr[i + 1]; 			// swap arr[i+1] and  pivot
        arr[i + 1] = arr[end]; 
        arr[end] = temp; 
        return i + 1; 
    }      

    static void quickSort(int arr[])
    { 
        
        int[] st = new int[arr.length]; 	
		int a = -1;    				//initialize top
        int start = 0;
		int end = arr.length-1;
		
        st[++a] = start; 			// add start and end values for st array
        st[++a] = end;    			
        while (a >= 0) 				//loop until top not get <0
		{ 
             
            end = st[a--]; 			
            start = st[a--];    
            
            int pivot = swap(arr, start, end);    //in sorted array set pivot
             
            if (pivot - 1 > start) 				/* If there are elements on left side of pivot, 
												 then push left side to stack */
			{ 
                st[++a] = start; 
                st[++a] = pivot - 1; 
            }    
            
            if (pivot + 1 < end) 				/* If there are elements on right side of pivot, 
												then push right side to stack */
			{ 
                st[++a] = pivot + 1; 
                st[++a] = end; 
            } 
        }		
    } 		
    
 
public static void main(String args[]) 
    { 
		Scanner sc = new Scanner(System.in); 		//create a object in scanner class
		int a;
		System.out.print("Enter the size of the array : \t");		
		a = sc.nextInt();							//get user input for array size
        int[] arr = new int[a];							
		
		for(int i = 0;i<a;i++)						//get user inputs for array elements
		{
        System.out.print("Enter " + (i+1) + " Number :\t");									
        arr[i] = sc.nextInt();		
		}		
		
        System.out.println("\nOriginal Array: "); 	//display the array that input by user 
		for(int j = 0;j<a;j++)
		{
        System.out.print(arr[j] + " ");					
        }
		
        quickSort(arr);								//call the method for sort the array
		
        System.out.println("\n\nSorted Array: "); 	//display the sorted array
		for(int k = 0;k<a;k++)
		{
        System.out.print(arr[k] + " ");	        		
		}		
}
}



