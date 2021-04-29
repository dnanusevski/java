import java.lang.*;

class PrioThreads implements Runnable{
	int count;
	Thread thrd;
	
	public static String currentName;
	public static boolean stop = false;
	
	PrioThreads(String tName){
		thrd = new Thread (this, tName);
		count = 0;
		PrioThreads.currentName = tName;
	}
	
	public void run(){
		System.out.println("Start of - " + thrd.getName());
		do{
			count++;
			if(PrioThreads.currentName.compareTo(thrd.getName()) != 0){
				PrioThreads.currentName = thrd.getName();
				System.out.println("In the lead " + currentName);
			}
			
		} while((stop == false) && count < 10);
		
		stop = true;
		System.out.println("Terminating " + currentName);
	}
	
}



class SumArray{
	private int sum;
	
	synchronized int sumArray(int nums[]){
		sum = 0;
		try{
			
			for(int i = 0; i < nums.length; i ++){
				Thread.sleep(1000);
				sum += nums[i];
				System.out.println(
					"Currrently in the object " 
					+ Thread.currentThread().getName() 
					+ " summed val is " + sum
				);
			}

		} catch (InterruptedException ex){
			System.out.println("Thread interrupted");
		}
		return sum;
	}
}

// we will here demonstrate wait and notify functions

class TickTock{
	String state;
	
	synchronized public void tick(Boolean running){
		try{
			if(!running){
				state = "ticked";
				notify();
				return;
			}
			
			System.out.println("Tick ");
			state = "ticked";
			notify(); // meaning let tock run
			while(!state.equeals("ticked")){
				wait();
			}
		
			
		} catch (InterruptedException ex){
			System.out.println("Thread interrupted");
		}
	}
	synchronized public void tock(Boolean running){
		try{
			if(!running){
				state = "tocked";
				notify();
				return;
			}
			
			System.out.println("Tock");
			state = "tocked";
			notify(); // meaning let tick run
			while(!state.equeals("tocked")){
				wait();
			}
		
			
		} catch (InterruptedException ex){
			System.out.println("Thread interrupted");
		}
	}
	
}

class MyThreadWaiter implements Runnable {
	Thread thrd;
	TickTock ttob;
	
	public void run(String name, TickTock clock){
		thrd = new Thread (this, name);
		ttob = clock;
	}
	
	public static genMyThreadWaiter(String name, TickTock clock){
		MyThreadWaiter mt = new MyThreadWaiter (name, clock);
		mt.thrd.start();
		return mt;
	} 
	
	public void run(){
		if(thrd.getName().compareTo("Tick") == 0){
			for(int i=0; i<5; i++) {
				ttob.tick(true);
			}
			ttob.tick(false);
		} else {
			for(int i=0; i<5; i++) {
				ttob.tock(true);
			}
			ttob.tock(false);
		}
	}
}


class ArraySummer implements Runnable{
	
	static SumArray sa = new SumArray();
	int a[];
	int answer;
	
	Thread thrd;

	ArraySummer(String name, int nums[]){
		thrd = new Thread(this, name);
		a = nums;
	}
	
	public static ArraySummer createAndStart(String name, int nums[]){
		ArraySummer ar = new ArraySummer(name, nums);
		ar.thrd.start();
		return ar;
	}
	
	public void run(){
		System.out.println(thrd.getName()+ " - starting ");
		
		// what we could have also done is use sycnhronized like this
		//This way we can also synchronize all we want without tuching the method definition
		//-synchronized(sa){
		//-	answer = sa.sumArray(a);
		//-}
		
		answer = sa.sumArray(a);
		
	
		
		System.out.println(thrd.getName()+ " - sum is " + answer);
		System.out.println(thrd.getName()+ " - terminating ");
	}
}



class Cls6{
	
	public static void main(String args []){
		System.out.println("Here we will test priority threads");
	
		PrioThreads pt1 = new PrioThreads("1 - High prio");
		PrioThreads pt2 = new PrioThreads("2 - Low prio");
		PrioThreads pt3 = new PrioThreads("3 - Reg prio");
		PrioThreads pt4 = new PrioThreads("4 - Reg prio");
		PrioThreads pt5 = new PrioThreads("5 - Reg prio");
		
		pt1.thrd.setPriority(Thread.NORM_PRIORITY + 2);
		pt2.thrd.setPriority(Thread.NORM_PRIORITY - 2);
		
		pt1.thrd.start();
		pt2.thrd.start();
		pt3.thrd.start();
		pt4.thrd.start();
		pt5.thrd.start();
		
		try{
			pt1.thrd.join();
			pt2.thrd.join();
			pt3.thrd.join();
			pt4.thrd.join();
			pt5.thrd.join();
		} catch (InterruptedException exc){
			System.out.println("Main thread interupted");
		}
		System.out.println("Thread 1 counted to " + pt1.count);
		System.out.println("Thread 2 counted to " + pt2.count);
		System.out.println("Thread 3 counted to " + pt3.count);
		System.out.println("Thread 4 counted to " + pt4.count);
		System.out.println("Thread 5 counted to " + pt5.count);
		
		try{
			Thread.sleep(1000);
		} catch (InterruptedException ex){
			System.out.println("Thread interrupted");
		}
		
		//int[] i = new i[4];
		int i[] =  {1,2,3,4};
		
		
		ArraySummer ar = ArraySummer.createAndStart("THRD SUMMER 1", i);
		ArraySummer ar2 = ArraySummer.createAndStart("THRD SUMMER 2 - ", i);
		
		Thread.sleep(500);
		TickTock tk = new TickTock();
		
		MyThreadWaiter mt = MyThreadWaiter.getMyThreadWaiter("tick",tk);
		MyThreadWaiter mt2 = MyThreadWaiter.getMyThreadWaiter("tock",tk);
	}
}