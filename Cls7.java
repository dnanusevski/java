//Multithread programing almoust all the same as Cls 6 but i have made a big pause working on a diferent system

class MyThread implements Runnable{
	/*
	String thrdName;
	
	MyThread (String name){
		thrdName = name;
	}
	
	public void run(){
		System.out.println(thrdName + " starting ");
		try{
			for(int count = 0; count < 2; count ++){
				Thread.sleep(100);
				System.out.println("Counting in  "+ thrdName + " - " + count);
			}
		}
		catch(InterruptedException exc){
			System.out.println(thrdName + " interrupted");
		}
		System.out.println(thrdName + " terminated ");
	}
	*/
	Thread thrd;
	
	MyThread (String name){
		thrd = new Thread(this, name);
	}
	
	public static MyThread createAndStart(String name){
		MyThread myThrd = new MyThread(name);
		myThrd.thrd.start();
		return myThrd;
	}
	
	public void run(){
		System.out.println(thrd.getName() + " starting ");
		try{
			for(int count = 0; count < 2; count ++){
				Thread.sleep(100);
				System.out.println("Counting in  "+ thrd.getName() + " - " + count);
			}
		}
		catch(InterruptedException exc){
			System.out.println(thrd.getName() + " interrupted");
		}
		System.out.println(thrd.getName() + " terminated ");
	}
}

class SumArrayClass {
	private int sum;
	
	//synchronized int sumArray(int nums[]){
	int sumArray(int nums[]){
		sum = 0;
		
		for(int i = 0; i < nums.length; i++ ){
			sum += nums[i];
			System.out.println(Thread.currentThread().getName() + " current sum " + sum);
		}
		return sum;
	}
}

class SumThread implements Runnable {
	Thread thrd;
	static SumArrayClass sa = new SumArrayClass();
	int a[];
	int answer;
	
	SumThread(String name, int arr[]){
		thrd = new Thread(this, name);
		a = arr;
	}
	
	public static SumThread createAndStart(String name, int arr[]){
		SumThread myThrd = new SumThread(name,arr);
		myThrd.thrd.start();
		return myThrd;
	}
	
	public void run(){
		int sum;
		System.out.println("Starting to sum for " + thrd.getName());
		
		answer = sa.sumArray(a);
		
		System.out.println("Sum for " + thrd.getName() + " is " + answer);
		System.out.println("Terminating " + thrd.getName());
	}
}

/**
*
* now we will demonstrate running 2 concurent threads that wait for one another
*
*/

class TickTock {
	String state;
	
	synchronized void tick(boolean running){
		if(!running){ //stop the clock
			state = "ticked";
			notify();
			return;
		}
		System.out.println("Tick ");
		
		state = "ticked";
		notify();
		
		try{
			while(state.equals("ticked")){
				wait();
			}
		} catch (InterruptedException exc){
			System.out.println("Thread interrupted");
		}
	}
	
	synchronized void tock(boolean running){
		if(!running){
			state = "tocked";
			notify();
			return;
		}
		System.out.println("Tock ");
		
		state = "tocked";
		notify();
		
		try{
			while(state.equals("tocked")){
				wait();
			}
		} catch (InterruptedException exc){
			System.out.println("Thread interrupted");
		}
	}
}



class ClockThread implements Runnable {
	Thread thrd;
	TickTock ttOb;
	
	ClockThread(String name, TickTock tt){
		thrd = new Thread(this, name);
		ttOb = tt;
	}

	public static ClockThread createAndStart(String name, TickTock tt){
		ClockThread myThrd = new ClockThread(name, tt);
		myThrd.thrd.start();
		return myThrd;
	}
	
	public void run(){
		if(thrd.getName().compareTo("Tick") == 0){
			for(int i = 0; i < 5; i ++){
				ttOb.tick(true);
			}
			ttOb.tick(false);
		} else {
			for(int i = 0; i < 5; i ++){
				ttOb.tock(true);
			}
			ttOb.tock(false);
		}
	}
	
}

/**
*
* now we will learn how to suspend a thread or stop it totaly
*
*/

class SuspendableThread implements Runnable {
	Thread thrd;
	boolean suspended;
	boolean stopped;
	
	SuspendableThread(String name) {
		thrd = new Thread (this, name);
		suspended = false;
		stopped = false;
	}
	
	public static SuspendableThread createAndStart(String name){
		SuspendableThread myThrd = new SuspendableThread(name);
		myThrd.thrd.start();
		return myThrd;
	}
	
	public void run(){
		System.out.println(thrd.getName() + " starting. ");
		try{
			
			for(int i = 1; i < 100; i++){
				System.out.println(i + " ");
				if((i%10) == 0){
					System.out.println();
					Thread.sleep(250)
				}
				
				synchronized(this){
					while(suspended){
						wait();
					}
					if(stopped) break;
				}
			}
			
		} catch (InterruptedException exc){
			System.out.println("Thread interrupted");
		}
		System.out.println(thrd.getName() + " terminating. ");
	}
	
	synchronized void mystop(){
		stopped = true;
		suspended = false;
		notify();
	}
	
	synchronized void mysuspend(){
		suspended = true;
	}
	
	synchronized void myresume(){
		suspended = false;
		notify();
	}
}

class Cls7{
	public static void main(String [] args){
		System.out.println("Hello world cls 7 after a long pause");
		/*
		MyThread mt = new MyThread("Thread #1");
		Thread newThrd = new Thread(mt);
		newThrd.start();
		*/
		/*
		MyThread mt1 = MyThread.createAndStart("Thread #1");
		MyThread mt2 = MyThread.createAndStart("Thread #2");
		MyThread mt3 = MyThread.createAndStart("Thread #3");
		try{
			
			do{
				Thread.sleep(100);
				System.out.println("main thread calling - ");
			} while(
				mt1.thrd.isAlive() ||
				mt2.thrd.isAlive()||
				mt3.thrd.isAlive()
			);
		}
		catch(InterruptedException exc){
			System.out.println("Main interrupted");
		}
		
		// now we will demonstate synchronized classes
		
		int a[] = {1, 2, 3};
		SumThread smt1 = SumThread.createAndStart("sThread #1", a);
		SumThread smt2 = SumThread.createAndStart("sThread #2", a);
		
		try{
			smt1.thrd.join();
			smt2.thrd.join();
		} catch(InterruptedException exc) {
			System.out.println("Main interrupted");
		}
		
		
		
		TickTock tt = new TickTock();
		ClockThread mt1 = ClockThread.createAndStart("Tick", tt);
		ClockThread mt2 = ClockThread.createAndStart("Tock", tt);
		
		try{
			mt1.thrd.join();
			mt1.thrd.join();
		} catch(InterruptedException exc) {
			System.out.println("Main interrupted");
		}
		*/
		// create and start mt1
		SuspendableThread mt1 = SuspendableThread.createAndStart("suspendable thread");
		
		try{
			//let mt 1 run for some time
			Thread.sleep(1000);
			mt1.mysuspend();
			System.out.println("Thread suspend");
			
			Thread.sleep(1000);
			mt1.myresume();
			System.out.println("Thread resuming");
			
			Thread.sleep(1000);
			mt1.mysuspend();
			mt1.mystop();
			System.out.println("Thread stopped");
			
			
		} catch(InterruptedException exc) {
			System.out.println("Main interrupted");
		}
		
		try{
			mt1.thrd.join();
		} catch(InterruptedException exc) {
			System.out.println("Main interrupted");
		}
	}	
}