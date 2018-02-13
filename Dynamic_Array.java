
public class Dynamic_Array 
{		
	public static void main(String[] args)
	  {
		functions n = new functions();
		Integer a[] = new Integer[10];
		int i=0;
		n.add(1,a,i);
		n.add(2,a,i);
		n.add(3,a,i);
		n.add(4,a,i);
		n.add(5,a,i);
		n.add(6,a,i);
		System.out.println(n.get(3, a));
		n.print(a);
		n.remove(4,a);
		n.print(a);
		}

}
