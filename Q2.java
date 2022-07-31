import java.util.*;

public class Q2 
{ 
	public static int binarySearchNormal(int[] arr1,int key1) 		//(a) In normal way
    { 
			int start1 = 0;					//initialize start value of the input array
			int end1 = arr1.length-1;		//initialize last value of the input array
			int midp1 = 0;					//initialize starting mid element index of array
			int midval1 = arr1[midp1];		//initialize starting mid element of array
			
			
			 while(key1 != midval1)			//loop until key value equal into mid element
			{
				if (key1 > midval1)			/*if key value greterthan mid element,
											start value will change to mid element index +1 */
				{
					start1 = midp1 +1 ;						
				}
				else if (key1 < midval1)	/*if key value lowerthan mid element, 
											end value will change to mid element index - 1*/
				{
					end1 = midp1 - 1;	
				}
				
				midp1 = (start1+end1)/2;	//Update mid element index
				midval1 = arr1[midp1];		//initialize mid element of new part
			}	
		return(midp1);						//when closed while loop, return the index of mid element 
	}
	
	public static int binarySearchRecursive(int[] arr,int key,int start,int end) 	//(b) In Recursive method
	{
		int midp = start + (end - start)/2;	//initialize mid element index of the array part
		int midval = arr[midp];				//initialize mid element
		
		   if (end>=start)					//repeat untill end value index greaterthan start value index
		   {              
				
				if (midval == key)			
				{  
				return midp;  				//if mid element value equal into key value, return the index of mid element
				}  
				if (midval > key)			
				{  
			   /*if key value lowerthan mid element, end value will change to mid element index - 1 and 
			   return it as a end value*/
				return binarySearchRecursive(arr,key,start,midp -1);
				}else
				/*if key value greterthan mid element, start value will change to mid element index +1 and 
			   return it as a start value*/	
				{  
			   
				return binarySearchRecursive(arr,key,midp+1,end);
				}  
			}  
		return -1;   // if key value is not in the array, return -1
    }  
	

    public static void main(String[] args) 
    {
		int arr[] = {2, 25, 32, 41,53, 56,61,63,82,102};		//Initialize the array
        Scanner sc = new Scanner(System.in);					//make a object in Scanner class
		
		System.out.print("The Array is : [ ");					//Display to user initialized array
		for(int i = 0;i<arr.length; i++)
			{
			System.out.print(" " + arr[i]);										
			}
			
		System.out.print(" ]");
		
		System.out.print("\nEnter the Key value that want to search : ");	//Get user input for key value								
		int a = sc.nextInt();
		
		int ans1 = binarySearchNormal(arr,a);								//Call the method for binary search using normal method
		int ans2 = binarySearchRecursive(arr,a,0,(arr.length-1)) ;			//Call the method for binary search using recursive method
        System.out.print("\nIndex of the Key value " + a + " in normal method is : "+ ans1);	//print output of normal method
		System.out.println("\nIndex of the Key value " + a + " in recursive method is : "+ ans2); //print output of recursive method	
        
    } 
   
    
}






   
 


