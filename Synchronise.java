public class Synchronise {

	public static void main(String[] args) throws InterruptedException 
	{
		Tasks task = new Tasks();
		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();

	}

}
