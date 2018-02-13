import java.util.*;
public class Comaparator_generics  {

	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(52);                             
        list.add(21);
        list.add(11);
        list.add(44);
        // Sorting for Integer Types
        
        Collections.sort(list);        
        System.out.println(list);
        
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Aman");
        list1.add("Sumit");
        list1.add("Govind");
        list1.add("Ravi");
        // Sorting for String Types
        
        Collections.sort(list1);       
        System.out.println(list1);
        
        ArrayList<Float> list2 = new ArrayList<Float>();
        list2.add(5.7f);
        list2.add(2.4f);
        list2.add(2.5f);
        list2.add(4.2f);
        // Sorting for Float Types
        
        Collections.sort(list2);        
        System.out.println(list2);
        
        ArrayList<Double> list3 = new ArrayList<Double>();
        list3.add(7.7);
        list3.add(2.1);
        list3.add(2.5);
        list3.add(3.2);
        // Sorting for Double Types 
        
        Collections.sort(list3);        
        System.out.println(list3);
	}

}
