
public class functions 
{
	public <T> T add(T x , T arr[] , int index)         // For adding a new value to the array
	{
      if(arr[index] == null)
		{
		arr[index] = x;
		}
		else {
			index = index + 1;
			if(arr[index]==null)
			{
				arr[index] = x;
			}
			else
			{
				add(x,arr,index);			
			}
		}      
		return arr[index];
	}
	
	public <T> void print(T arr[])                    // For Printing the current array
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=null)
			{
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
	}
	
	public <T> T get(int index , T arr[])                          // For Getting a value from a particular index
	{
		return arr[index];
	}
	
	public <T> void remove(int index , T arr[])                    // To Remove a particular element from the array
	{
		if(arr[index+1] == null)
		{
		   arr[index] = null;
		}
		else
		{
			for(int i = index; i < arr.length; i++)
			   {
			   arr[i] = null;
			   arr[i] = arr[(int)index+1];
			   arr[index+1] = null;
			   }
		}
	}
}
