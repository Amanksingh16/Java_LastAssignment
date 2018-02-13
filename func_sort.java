import java.util.Comparator;

public class func_sort<T> implements Comparator<T> {
   public int compare(T x , T y)
   {
	   if((int)x > (int)y)
	   {
		   return 1;
	   }
	   else
		   if((int)x < (int)y)
			   return -1;
		   else
	   return 0;
   }

}
