package Threads;

class Hi extends Thread{
	public void run() //start command in the main code automatically invokes run method
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hi");
			try { Thread.sleep(1000);} catch(Exception e){};
		}
		
	}
}

class User extends Thread{
	public void run() //start command in the main code automatically invokes run method
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("User");
			try { Thread.sleep(1000);} catch(Exception e){};
		}
		
	}
}


//Dealing with case of multiple inheritance
class A{
	public void show()
	{
		System.out.println("Show A");
	}
}
class Hello extends A implements Runnable{ //Runnable is an interface for creating Thread
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello");
			try { Thread.sleep(1000);} catch(Exception e){};
		}
		
	}
}

class Guy extends A implements Runnable{
	public void run() 
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Guy");
			try { Thread.sleep(1000);} catch(Exception e){};
		}
	}
}

class Counter
{
	int count;
	public synchronized void increment()
	{
		count++;
	}
}

public class ThreadDemo {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
//		//Implmenting basic threads
//		Hi obj1=new Hi();
//		User obj2=new User();
//		obj1.start();
//		try { Thread.sleep(10);} catch(Exception e){};
//		obj2.start();
		
//		//Dealing with multiple inheritance in threads
//		Runnable obj1=new Hello();
//		Runnable obj2=new Guy();
//		Thread t1=new Thread(obj1);
//		Thread t2=new Thread(obj2);
//		t1.start();
//		try { Thread.sleep(10);} catch(Exception e){};
//		t2.start();
		
//		//Using Lambda Expressions
//		Thread t1=new Thread(() ->
//				{
//					for(int i=0;i<5;i++)
//					{
//						System.out.println("Hello");
//						try { Thread.sleep(1000);} catch(Exception e){};
//					}
//				}
//				);
//		Thread t2=new Thread(() ->
//		{
//			for(int i=0;i<5;i++)
//			{
//				System.out.println("Guy");
//				try { Thread.sleep(1000);} catch(Exception e){};
//			}
//		}
//		);
//		
//		
//		//Getting Thread Priority
//		System.out.println(t1.getPriority());
//		System.out.println(t2.getPriority());
//		//5 By default. Thread Priority Range = [0,10] // currently. Might change
//		
//		//Setting Priority
//		t1.setPriority(Thread.MAX_PRIORITY);
//		t2.setPriority(Thread.MIN_PRIORITY);
//		System.out.println(t1.getPriority());
//		System.out.println(t2.getPriority());
//		
//		t1.start();
//		try { Thread.sleep(10);} catch(Exception e){};
//		t2.start();
//		//isAlive :- Checks whether thread is running. Return boolean.
//		System.out.println(t1.isAlive());
//		//Join method :- Makes the program to wait for the threads to join to main thread after execution
//		//Remaining code is executed after that
//		//System.out.println("End"); //Prints "End" in between thread execution
//		t1.join();
//		t2.join();
//		System.out.println("End"); //Prints after joining
//		System.out.println(t1.isAlive());
		
		
		//Synchronization - Problem occurs when multistep threads share same resource
		Counter c=new Counter();
		Thread t1=new Thread(() ->
				{
						for(int i=0;i<100;i++)
						{
							c.increment();
						}
				});
		Thread t2=new Thread(() ->
			{
						for(int i=0;i<100000;i++)
						{
							c.increment();
						}
				});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(c.count);
	}

}
