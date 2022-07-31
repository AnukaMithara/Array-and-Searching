import java.util.*;

public class Q1 {
	/////////////////////////(a)/////////////////////////////
	private int triangularNumber(int i) 								//Method for get triangular number
	{
		if (i == 1)														//If input value = 1, return the first triangular number(1)
		{ 
			return 1;
		}
		
		else 															//if not
		{
			return i + triangularNumber(i-1);							//loop from user input to less numbers and return the sum of it
		}		
	}	
	
	/////////////////////////(b)/////////////////////////////
	private int factorialNumber(int j) 									//Method for get factorial number
	{
		if (j == 0 || j == 1)											//if input value = 1 or 0, return the value of first two verses
		{ 
			return 1;
		}		
		
		
		else 
		{
			return j*factorialNumber(j-1);								/*loop from user input to less numbers of verses and return 
																		the multiplication of it*/
		}	
		
	}
	
	/////////////////////////(c)//////////////////////////////
	public static void anagram(String txt, int start, int end) 			//Method for get inputs for find anagrams of a word				
    { 
        if (start == end) 												/*when repeating, if the values for start and end are the same
																		print the word at that time */
		{
            System.out.println("\t"+txt); 
		}
        else 						
		{ 
            for (int i = start; i <= end; i++) 							//for loop for change the anagrams				

			{ 
                txt = swap(txt, start, i); 								/*swap the elements of the text 
																		relative to the start value and i value at that time */
                anagram(txt, start + 1, end); 							//recursively call the method to swap the characters of text
                txt = swap(txt, start, i); 							
            } 
        } 
    } 
    public static String swap(String txt2, int a, int b)  				//Method for swap letters in given text
    {  
        char[] arr = txt2.toCharArray(); 								//string input convert to char array
        char temp = arr[a]; 											/*the element of the char array 
																		relative to the input 'a' value assign as temp */
        arr[a] = arr[b]; 												//array a value element replaced by array b value element
        arr[b] = temp; 
		
        return String.valueOf(arr); 									/*After swapped the two letters 
																		char array converted to string and return*/
    } 
	
	/////////////////////////(d)//////////////////////////////
	public static void towersOfHanoi(int n, String start, String mid, String end)	//Method for get instructions for towers of hanoi	
    {
        if (n != 0)																	
        {            
			towersOfHanoi(n - 1, start, end, mid);										//Move n-1 disk from rod 1 to rod 2										
			System.out.println("Move disk \"" + n + "\" from " + start + " to " + end); //Move the bottom disk to the 3
			towersOfHanoi(n - 1, mid, start, end);										//Move n-1 disk from rod 2 to rod 3	
		}
		
    }
	
	
	
    public static void main(String[] args) 
	{
	
		Scanner sc = new Scanner(System.in);															//create a object in scanner class 
		
		System.out.print("Enter the Triangular number you want : ");									//(a)
		int a = sc.nextInt();																			//get user input for triangular number
		Q1 tri = new Q1 ();																				//create a object for triangular number in Q1 class 
		System.out.println("\nThe Triangular number of " + a + " is : " + tri.triangularNumber(a) );	//call the method and output the triangular numer for the user input
		
		
		System.out.print("\nEnter the Factorial number you want : ");									//(b)
		int b = sc.nextInt();																			//get user input for Factorial number
		Q1 fac = new Q1 ();																				//create a object for Factorial number in Q1 class 
		System.out.println("\nThe Factorial number of " + b + " is : " + fac.factorialNumber(b) );		//call the method and output the Factorial number for the user input
		
		System.out.print("\nEnter the text that you want get Anagrams : ");								//(c)		
		String str = sc.next();																			//get string user input for Anagrams
		System.out.println("\nAnagrams of the given string are:-");     								
		anagram(str, 0, (str.length()) - 1); 															//call the method for get Anagrams of user input
		
		System.out.print("\nEnter number of discs: ");        										 	//(d)
		int c = sc.nextInt();																			//get user input for number of discs:
		System.out.println(); 
		towersOfHanoi(c, "Rod 1", "Rod 2", "Rod 3");													//call the method to get instructions acording to the user input
			
    }
}



	