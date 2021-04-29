// multithread programing
import java.lang.*;

class MyThread implements Runnable{
	
	String thrdName;
	
	MyThread(String name){
		thrdName = name;
	}
	
	public void run(){
		System.out.println(thrdName + " - START");
		try{
			for(int count = 0; count < 10; count++){
				Thread.sleep(500);
				System.out.println(thrdName + " - counting - " + count);
			}
			
		} catch (InterruptedException exc){
			System.out.println(thrdName + " - INTRRUPTED");
		}
		
		System.out.println(thrdName + " - TERMINATED");
	}
}

class myThredAuto implements Runnable{
	Thread thrd;
	
	myThredAuto (String name){
		thrd = new Thread (this, name) ;
	}
	
	public void run(){
		System.out.println(thrd.getName() + " - START");
		try{
			for(int count = 0; count < 10; count++){
				Thread.sleep(500);
				System.out.println(thrd.getName() + " - counting on auto - " + count);
			}
			
		} catch (InterruptedException exc){
			System.out.println(thrd.getName() + " - INTRRUPTED on auto");
		}
		
		System.out.println(thrd.getName() + " - TERMINATED on auto");
	}
	// there is one more thing we can do and it is to create a fabric method that will 
	// create a runnable class instantiate a thread object with its name start it and return 
	// instance to the runnable objact that started it all
	public static myThredAuto createAndStart(String name){
		myThredAuto mta = new myThredAuto(name);
		mta.thrd.start();
		return mta;
	}
}

class MyThreadThread extends Thread {
	
	MyThreadThread (String name){
		super (name);
	}
	
	public void run(){
		System.out.println("STARTING THREAD CLASS THAT EXTENDED THREAD");
		try{
			for(int count = 0; count < 10; count++){
				Thread.sleep(100);
				System.out.println(this.getName() + " - counting on auto - " + count);
			}
			
		} catch (InterruptedException exc){
			System.out.println(this.getName() + " - INTRRUPTED on auto");
		}
		
		System.out.println(this.getName() + " - TERMINATED on auto");
	}
	
	
	
}


class Cls5{
	public static void main(String args []){
		System.out.println("Multithread programing");
		System.out.println("Lets demonstrate multithread class MyThread");	
		
		// - Most common way of creating thread
		// - Create a class that extends runnable, call constructor and add the name to instance var
		// - Creat a thred from runnable class and call start that will call run on runnable object
		MyThread mt = new MyThread("Child #1");
		Thread newThrd = new Thread(mt);
		newThrd.start();
		
		
		
		// - This example demonstrates hoe runnable class can pass string in constructor 
		// - That will then be automaticaly given to Thread object that is instance var inside the clacc
		// - It is created like this so that you can 
		myThredAuto mta = new myThredAuto("1# Auto ");
		mta.thrd.start();
	
		
		// - Here we use fabric method that imidiatly construct THread using runnable object static method
		myThredAuto.createAndStart("#2 - Fabric starter ");
		
		// - Last exaplme extends THread object to start the thread unlike the previous exaplmes where we 
		// - Implemented runnable interface		
		MyThreadThread mthrd = new MyThreadThread("Thread extender  #3");
		mthrd.start();
		
		// - we need to be sure that main thread is the last to finish
		// - so we are going to do a do while loop and test each time if threads are alive
		do{
			System.out.println(" - Main thread asking for new loop");
			try{
				Thread.sleep(100);
			} catch (InterruptedException exc){
				System.out.println("Main - INTRRUPTED");
			}
		} while (	newThrd.isAlive()  ||
					mta.thrd.isAlive() ||
					mthrd.isAlive()
		);
		// - we will use tis line to check if main 
		System.out.println("Main thread stop");
		
	}
}