
public class Tasks implements Runnable
{ 
	int i= 1;
        public synchronized void run()
        {
        	while(i <=1000)
        	{
        		System.out.println(Thread.currentThread().getName());
        		System.out.println(i);
        		i++;
        		try {
        			Thread.sleep(10);
        		}
        		catch(InterruptedException e)
        		{
        			e.printStackTrace();
        		}
        	}
        	System.out.println(Thread.currentThread().getName()+" - work is done");
        }
}
