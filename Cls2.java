class ModifierDemonstrator{
	private int a[];		// reference to an array waiting to receive array object
	private int errval;		// valute to be returned if something went wrong
	public 	int length;		// public value.
	
	// constriuctor can acces private members
	public ModifierDemonstrator(int size, int errv){
		a = new int[size];
		errval = errv;
		length = size;
	}
	
	public int get(int index){
		if(indexOK(index)) return a[index];
		return errval;
	}
	
	public boolean set(int index, int val){
		if(indexOK(index)) {
			a[index] = val;
			return true;
		};
		return false;
	}
	
	private boolean indexOK(int index){
		if((index >= 0) && (index < length)) return true;
		return false;
	}
	// pretty common is that methods can use objects as parameters
	public boolean checkIfSameLengthArray(ModifierDemonstrator asker){
		if(asker.length == length) return true;
		return false;
	}
	// method overlaod example
	void overlDemp(){
		System.out.println("Called overload demo \"void overlDemp()\" ");
	}
	
	void overlDemp(int a){
		System.out.println("Called overload demo \"void overlDemp(int a)\" ");
	}
	
	int overlDemp(int a, int b){
		System.out.println("Called overload demo \"int overlDemp(int a, int b)\" ");
		return 1;
	}
	
	double overlDemp(double a, double b){
		System.out.println("Called overload demo \"double overlDemp(int a, int b)\" ");
		return 2.5;
	}
	
}

// here we will show constructor overload

class Summation{
	int sum;
	
	Summation(int num){
		sum = 0;
		for(int i = 1; i <= num; i++){
			sum += i;
		}
	}
	
	Summation(Summation ob){
		sum = ob.sum;
	}
}

class QueueUpdated{
	public char q[];
	public int putloc, getloc;
	
	// regular constructor to initialize empty q
	QueueUpdated(int size){
		q = new char [size];
		putloc = getloc = 0;
	}
	
	QueueUpdated(QueueUpdated ob){
		putloc = ob.putloc;
		getloc = ob.getloc;
		q = new char[ob.q.length];
		for(int i = getloc; i < putloc; i++){
			q[i] = ob.q[i];
		}
	}
	
	QueueUpdated(char a[]){
		putloc = 0;
		getloc = 0;
		q = new char[a.length];
		
		for(int i = 0; i < a.length; i++){
			put(a[i]);
		}
	}
	
	void put(char ch){
		if(putloc == q.length){
			System.out.println("Array is filled");
			return;
		}
		q[putloc++] = ch;
	}
	
	char get(){
		if(putloc == getloc){
			System.out.println("Queue is empty");
			return (char) 0;
		}
		return q[getloc++];
	}
}


class StaticDemo {
	int x;
	static int y;
	
	// static bloc to fire before anything else
	
	static{
		System.out.println("Fired static block before StaticDemo object initialization");
	}
	
	
	int sum(){
		return x + y;
	}
	
	static void mutateStaticVar(int to){
		y = to;
		//x = 33; // this is not acceptable
	}
}

class QuickSort{
	static void qsort(char items[]){
		qs(items, 0, items.length - 1);
	}
	
	static private void qs(char items[], int left, int right){
		int i, j;
		char x, y;
		
		i = left; j = right;
		x = items[(i+j) / 2];
		
		do{
			while( (items[i] < x) && (i < right) ) i++;
			while( (x < items[j]) && (j > left) ) j--;
			
			
			if(i <= j){
				y = items[i];
				items[i] = items[j];
				items[j] = y;
				i++; j--;
			}
			
			
		} while(i <= j);
		
		if(left < j) qs(items, left, j);
		if(i < right) qs(items, i, right);
	}
}



class Cls2{
	public static void main(String [] args){
		System.out.println("Lets demonstrate classes a bit more");
		var mdTestMe = new ModifierDemonstrator(4, -1);
		if(mdTestMe.set(0, 4)){
			System.out.println("We have set 4 at positin 0");
		}
		
		if(mdTestMe.set(54, 4)){
			System.out.println("We have set 4 at positin 54");
		} else{
			System.out.println("It wasn possible to set 4 at position 54");
		}
		
		var mdTestMe2 = new ModifierDemonstrator(3, -1);
		if(mdTestMe.checkIfSameLengthArray(mdTestMe2)){
			System.out.println("Same length arrays");
		} else{
			System.out.println("Not same length arrays");
		}
		
		mdTestMe.overlDemp();
		mdTestMe.overlDemp(1);
		mdTestMe.overlDemp(1,2);
		double cch = mdTestMe.overlDemp(1.3,2.2);
		
		var sum1 = new Summation (5);
		var sum2 = new Summation(sum1);
		
		System.out.println("Sum of sum1 is " + sum1.sum);
		System.out.println("Sum of sum2 is " + sum2.sum);
		
		// now we will once again demonstrate overloading of constructor
		// with our queue class
		char [] preFilled = {'a', 'b', 'c', 'd'};
		QueueUpdated que1 = new QueueUpdated(4);
		que1.put('C');
		que1.put('D');
		QueueUpdated que2 = new QueueUpdated(que1);
		QueueUpdated que3 = new QueueUpdated(preFilled);
		
		// now we will list queues
		for(int i = 0; i < que1.putloc; i++){
			System.out.println("q1 element is  " + que1.get());
		}
		for(int i = 0; i < que2.putloc; i++){
			System.out.println("q2 element is  " + que2.get());
		}
		
		System.out.println("CURRENT LEVEL of recursion is  " + factR(5));
		
		
		// now we shall demonstrate static variable, shared among objects StaticDemo
		
		StaticDemo obj1 = new StaticDemo();
		
		StaticDemo obj2 = new StaticDemo();
		
		obj1.x = 10;
		obj2.x = 20;
		
		System.out.println("regular non static x values of obj 1 and 2 are  " + obj1.x + " " + obj2.x);
		StaticDemo.y = 20;
		
		System.out.println("obj1.sum  " + obj1.sum());
		System.out.println("obj2.sum  " + obj2.sum());
		
		
		StaticDemo.mutateStaticVar(100);
		obj1.mutateStaticVar(200);
		
		System.out.println("Changed static t o100");
		
		System.out.println("obj1.sum  " + obj1.sum());
		System.out.println("obj2.sum  " + obj2.sum());
		
		// lets test out the quick sort class
		char toSortCharacters [] = {'d','b','a','c'} ;
		
		System.out.println("Characters array before sorting");
		for(char ch : toSortCharacters){
			System.out.println(ch);
		}
		QuickSort.qsort(toSortCharacters);
		System.out.println("Characters array before sorting");
		for(char ch : toSortCharacters){
			System.out.println(ch);
		}
		
		class innerClassExample{
			int i;
		}
		
		vaTest(1,5,7);
		
	}
	
	static void vaTest(int ... v){
		System.out.println("Numer of arguments suplied is follwing " + v.length);
		System.out.println("Contents is following");
		
		for(int i:v){
			System.out.println(i);
		}
	}
	// varargs must be last
	static void vaTestWithOtherPar(String world, int ... v){
		System.out.println("Numer of arguments suplied is follwing " + v.length);
		System.out.println("Contents is following");
		
		for(int i:v){
			System.out.println(i);
		}
	}
	
	static int factR(int n){
		System.out.println("CURRENT LEVEL of recursion is  " + n);
		int result;
		if(n==1) {
			System.out.println("RETURNING  1");
			return 1;
		}
		result = factR(n-1) *n;
		System.out.println("RETURNING  " + result);
		return result;
	}
}