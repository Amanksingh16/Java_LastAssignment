
public class Generic_func {

	public static <T> void print(T arr[])
	{
		for(int i=0; i < arr.length ; i++)
		{
		    System.out.print(arr[i]+" ");	
		}
	}
	public static void main(String[] args) 
	{
		 Integer a[] = {1,2,3,4,5};
		 print(a);             // For Printing the array of Integer types
		 
		 System.out.println();
		 
		 String b[] = {"This","is","for","String","Generics"};
		 print(b);             // For Printing the array of String types
		 
		 System.out.println();
		 
		 Float c[] = {2.4f , 6.3f , 5.5f , 7.2f};
		 print(c);             // For Printing the array of Float types
		 
		 System.out.println();
		 
		 Double d[] = {4.4 , 6.5, 9.778 , 34.56 };
		 print(d);             // For Printing the array of Double types
	}

}
