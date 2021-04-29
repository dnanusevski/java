//inheritance
class TwoDShape{
	double width;
	double height;
	private int only2dShape = 4;
	int hideMe = 22;
	
	
	TwoDShape(){
		width 	=	height = 0;
	}
	
	// overload the class
	TwoDShape(double w, double h){
		width 	=	w;
		height 	=	h;
	}
	
	void showDim(){
		System.out.println("Width and height are " + width + " and " + height);
	}
}
// extending a class, means take all tha super class has and add it to sublass
class Triangle extends TwoDShape{
	
	String style;
	
	int hideMe = 22;
	
	Triangle(double w, double h, String s){
		// super() // we will call overloaded constructor
		// called overloaded
		super(w, h); // this has to be the first line of code in the constructor block
		style = s;
		
		super.hideMe = 22; // hideMe that belongs to the superclass
		hideMe = 44; // hideMe from Triangle class initialized
		
		
	}
	
	double area(){
		return width * height / 2;
		// cant access only2dShape
		
	}
	
	void showStyle(){
		System.out.println("Trinagle type is " + style);
		System.out.println("Let me tell you superHide me of super classs " + super.hideMe);
		System.out.println("Let me tell you superHide me of original class " + hideMe);
	}
}

/*

we will now demonstrate the order of constructors

*/
class A{
	int aInt = 0;
	
	A(){
		System.out.println("CONSTRUCTOR A CALLED");
	}
	
	A(A obj){ // passing B to reference C, meaning superclass can referrence subclass (A can ref B OR C)
		
		System.out.println("Asigning aINt to the value of " + obj.aInt);
		aInt = obj.aInt;
	}
}
class B extends A{
	
	int bInt = 0;
	
	B(){
		System.out.println("CONSTRUCTOR B CALLED");
	}
	
	B(B obj){ // passing C to reference B, meaning superclass can referrence subclass (B can ref C)
		
		super(obj);
		bInt = obj.bInt;
		System.out.println("Asigning bINt to the value of " + obj.bInt);
	}
	
}

class C extends B{
	
	int cInt = 0;
	
	C(){
		System.out.println("CONSTRUCTOR C CALLED");
	}
	
	C(C obj){
		
		super(obj);
		cInt = obj.cInt;
		System.out.println("Asigning cINt to the value of " + obj.cInt);
	}
}

// here we will tell expose abstract class

interface Oblig{
	int counter = 5; // this is probably new in java, since it is permisiable to have this and use it in implementing class
	void ObligMethod(int i);
}

abstract class Cfirst{
	int i = 10;
	Cfirst(int t){
		i = t;
	}
	
	abstract void tellMe();
	
	void tellMeYourNumber(){
		System.out.println("Called method defined in abstract class");
	}
}

class Csecond extends Cfirst implements Oblig{
	
	Csecond(int i){
		super(i);
	}
	
	void tellMe(){
		System.out.println("I am telling you tellMe");
	}
	
	// when implementing method from 
	// interface it has to be public and it has to have same return type and parameters
	public void ObligMethod(int i){
		System.out.println("Called oblig method" + counter);
	}
}

/*
this is new we are going to add our exception handler to the queue class
// mentioned in str 404 in the begienes guide

// we will create to exception classes for the queues
// one for maximum size and the second for the queue is empty
*/
class QueueFullExcpetion extends Exception{
	int size;
	QueueFullExcpetion(int s) {size = s;}
	
	public String toString(){
		return "\n Queue is full. Maximum size is : " + size;
	}
}

class QueueEmptyException extends Exception{
	public String toString(){
		return "\n Queue is empty";
	}
}



/*
 following is a demonstraation of interfaces power in everyday life
*/

interface ICharQ{
	// oblige the implementing class to have put method
	void put(char ch);
	// one more obligment
	char get();
}

class FixedQueue {
	private char q[]; //holds the queue
	private int putloc, getloc; // put and get indices
	
	public FixedQueue(int size){
		q = new char[size];
		putloc = getloc = 0;
	}
	
	public void put(char ch) throws QueueFullExcpetion
	{
		if(putloc == q.length){
			throw new QueueFullExcpetion(q.length);
			//System.out.println("Full");
			//return;
		}
		q[putloc++] = ch;
	}
	
	public char get() throws QueueEmptyException{
		
		if(putloc == getloc){
			throw new QueueEmptyException();
			//System.out.println("EMpty");
			//return (char) 0;
		}
		return q[getloc++];
	}
}

// this classs allwos inserting elements as long as putlock and getlock are not close
// one to another that is all
class CircularQueue implements ICharQ{
	private char q[]; //holds the queue
	private int putloc, getloc; // put and get indices
	
	public CircularQueue(int size){
		q = new char[size+1];
		putloc = getloc = 0;
	}
	
	// if they are close one to antoher stop entering elements
	public void put(char ch){
		if(putloc + 1 == getloc | ((putloc == q.length - 1) & (getloc == 0))){
			System.out.println("Full");
			return;
		}
		q[putloc++] = ch;
		if(putloc == q.length) putloc = 0;
	}
	
	// if get lock is will become putlock stop
	public char get(){
		if(putloc == getloc){
			System.out.println("EMpty");
			return (char) 0;
		}
		
		char ch = q[getloc++];
		if(getloc == q.length) getloc = 0; // loop bACK
		return ch;
	}
}

// class dinamic queue
class DynQueue implements ICharQ{
	private char q[]; //holds the queue
	private int  putloc, getloc; // put and get indices
	
	public DynQueue(int size){
		q = new char[size+1];
		putloc = getloc = 0;
	}
	
	public void put(char ch){
		if(putloc == q.length){
			// it is time to double thi size of an array
			
			char t[] = new char[q.length * 2];
			for(int i = 0; i < q.length; i++){
				t[i] = q[i];
			}
			
			q = t;
		}
		q[putloc++] = ch;
	}
	
	public char get(){
		if(putloc == getloc){
			System.out.println("EMpty");
			return (char) 0;
		}
		return q[getloc++];
	}
}

/*
 constants are usualy kept in interfaces
 
*/

interface IConst {
	int MIN = 0;
	int MAX = 0;
	String ERRORMSG = "BOundry error";
	// to be used by classes that implement interfaces
	// similar to abstract class
	default int getSomeInt(){
		return 1;
	}
	
	// static method same as static for regular class
	static int getSomeUniversalInt(){
		return 2;
	}
}

class MyPersonalException extends Exception{
	String myMessage;
	
	MyPersonalException(String lokosi){
		myMessage = lokosi;
	}
	
	public String toString(){
		return " Myu Message Was " + myMessage;
	}
}


class Cls3 implements IConst {
	public static void main(String [] args){
		System.out.println("Starting the inheritance");
		
		Triangle t1 = new Triangle(1,2,"Bala J joint");
		
		
		t1.width = 5; //accessed his superclass instance variables
		t1.height = 10;
		
		C lc = new C();
		
		// lets also test what can be referenced
		
		A refA = new A();
		
		B refB = new B();
		
		C refC = new C();
		
		refA = refC;
		
		A testRef = new C();
		
		refC.aInt = 1;
		refC.bInt = 2;
		refC.cInt = 3;
		
		C refC2 = new C(refC);
		
		Csecond cs = new Csecond(5);
		
		cs.tellMeYourNumber(); // this method is defined in abstract class and still can be used like anyother
		cs.tellMe();// this method had to be defined inside subclass or else error would occure
		cs.ObligMethod(4);
		// we should say also that intefeca can be used as a reference to an object similar to superclass for subclass
		Oblig obTst = new Csecond(3);
		
		//MAX = MAX + 5; // unduable it is final static and public
		System.out.println("CONSTANT MAX IS " + MAX);
		System.out.println("CONSTANT MIN IS " + MIN);
		System.out.println("CONSTANT ERROR - MSG IS " + ERRORMSG);
		
		// hwere we will demonstrate try catch block using index out of bounds 
		// array that will try to alocate valute to index that does not exists
		
		int nums [] = new int [4];
		try{
			nums[5] = 22;
		} catch(ArrayIndexOutOfBoundsException exc){
			// catch this funnie exception
			System.out.println("INdex IS out of bounds");
		} catch (Exception e){
			System.out.println("Classic exception");
		} catch (Throwable e){
			System.out.println("Classic Throwable");
		}
		
		// following is an example of throwing an excption
		try{
			try{
				System.out.println("Throwing exception");
				throw new ArithmeticException();
			} catch (ArithmeticException exc){
				System.out.println("I have cought aritmetic exception");
				throw new Exception("Lord dime is default exception string");
			}
		} catch (Exception e){
			System.out.println("Outher exception - " + e.getMessage());
		} finally{
			System.out.println("I am inside finally block");
		}
		
		// and now lets shoe persoonal exception in actition
		try{
			throw new MyPersonalException("custom mssage is this");
		} catch (MyPersonalException exc){
			System.out.println("Personal exception sad: "+exc.toString());
		}
		
		
		// now we are testing fixed queue 
		
		var fixedQ = new FixedQueue(3);
	}
}