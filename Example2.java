// here we will demonstrate other java data types

class Example2 {
	public static void main(String args[]) throws java.io.IOException{
		System.out.println("Java drives the Web.");
		
		// array
		int sample[] = new int[10];
		// lets fill that example
		for(int indexerCounter = 0; indexerCounter < 10; indexerCounter++){
			sample[indexerCounter] = indexerCounter;
		}
		System.out.println("at position 5 is " + sample[5]);
		
		// we can also initialize array like this 
		int initializedVarArray[] = {5,54,978,454,987,2,1,9};
		System.out.println("at position 2 is " + initializedVarArray[2]);
		// now we will write buuble sort function for initializedVarArray
		// 8 is length of array in this case
		//this is a bubble sort
		// arrays i object, one of its vars is length
		for(int a = 1; a < initializedVarArray.length; a++){
			for(int b = initializedVarArray.length-1; b >= a; b--){
				if(initializedVarArray[b-1] < initializedVarArray[b]){
					int t = initializedVarArray[b-1];
					initializedVarArray[b-1] = initializedVarArray[b];
					initializedVarArray[b] = t;
				}
			}
		}
		
		
		for(int indexerCounter = 0; indexerCounter < 8; indexerCounter++){
			System.out.println("at position "+indexerCounter+" is " + initializedVarArray[indexerCounter]);
		}
		// regular multidimensional array
		
		int table[][] = new int[3][4];
		
		for(int t = 0; t < 3; ++t){
			for(int i = 0; i < 4; ++i){
				table[t][i] = (t*4) + i + 1;
				System.out.print(table[t][i]);
			}
			System.out.println();
		}
		
		//Two dimensional arrays but irelgular
		// meaning the size of second dimension is not initialized at start
		int reiders[][] = new int[7][];
		
		reiders[0] = new int[4];
		reiders[0][0] = 1;
		reiders[0][1] = 2;
		reiders[0][2] = 3;
		System.out.println("Second dimension array length " + reiders[0].length);
		// if you want to get length of second dimension of array call it like this
		
		
		// threee or more dimensions
		int threeDimension[][][] = new int[7][2][1];
		
		// here we will show how we can create 2 dimesnion array the other way
		int sqrs[][] = {
			{1, 1},
			{2, 4}
		};
		
		System.out.println("Sqrt at positoin 0 1 is - " + sqrs[0][1]);
		// there is another way to initialize an array in java
		int countersF[] = new int [3];
		int [] countersD = new int[4];
		// this new way is usefful in situations like there
		int [] numsA, numsB; //and so on it is the same as int numsA[], numsB[];
		// arrays are objeccts and when instatiated they return reference to object
		
		countersD = countersF;
		// if we chage something in counters f or d, it will be the change for both of arrays
		
		// now lets demonstrate queue classs
		
		Queue qDemo = new Queue(3);
		
		qDemo.put('a');
		qDemo.put('b');
		System.out.println("Pullling from the queue class - " + qDemo.get());
		qDemo.put('c');
		System.out.println("Pullling from the queue class - " + qDemo.get());
		System.out.println("Pullling from the queue class - " + qDemo.get());
		
		// now we will demonstrate foreach loop, un upgrdaed for loop
		int foreachnums [] = {1, 2, 3, 4, 5, 6, 7};
		int sumof_foreachnums = 0;
		for(int x : foreachnums){
			sumof_foreachnums += x;
			// we can break here if we want to stop for some reason
			// it is also important to udnerstand is that x is not a pointer to the array
			// changing x will not affect the underlaying array
			
			// we can search for value here like if x == 7
			
		}
		System.out.println("We have calculated the sum of foreachnums nad it is - " + sumof_foreachnums);
		
		//using java we can iterate throw multidimensional array
		// look  a bit up and you will find table array with 2 dimensions filled with ints
		
		for(int [] x: table){
			for(int y: x){
				System.out.println("value of sub array element " + y);
			}	
		}
		
		// STRINGS
		String str1 = "Hello mr. Filip or mr. Georg";
		String str2 = "mr.";
		System.out.println("length of str1 " + str1.length());
		System.out.println("str1 char at position 2 is " + str1.charAt(1));
		System.out.println("str1.equeals(str2) = " + str1.equals(str2));
		System.out.println("str1.compareTo(str2) = " + str1.compareTo(str2));
		System.out.println("str2.compareTo(str1) = " + str2.compareTo(str1));
		System.out.println("str1.indexOf(str2) = " + str1.indexOf(str2));
		System.out.println("str1.lastIndexOf(str2) = " + str1.lastIndexOf(str2));
		System.out.println("str1.substring(0,10) = " + str1.substring(0,10) );
		// string can also be an array
		String [] strArr1 = new String[2];
		strArr1[0] = "First";
		strArr1[1] = "Second";
		String [] strArr2 = {"Other example", "YES"};
		
		// string is also usefull in swithc statement
		
		switch(str2){
			case "hello":{
				System.out.println("Help me obi van canoby");
				break;
			}
			case "mr.":{
				System.out.println("Help me obi van canoby 2");
				break;
			}
		}
		
		// since we have learned about strings and arrays
		// we will now demonsrtate command line arguments
		// run program like this java Example2 one two three
		System.out.println("You have asked for " + args.length + " number of argumentsS");
		for(String cur_arg: args){
			System.out.println("Arg: " + cur_arg);
		}
		
		
		// now here is a simple explanation on what we can do with input args
		String [][] telephones = {
			{"Mark", "+38146871"},
			{"Philip", "+38146872"},
			{"Ana", "+38146873"},
		};
		
		for(String [] outerArr: telephones){
			if(outerArr[0].equals(args[0])){
				System.out.println("The telehpne is " + outerArr[1]);
			}
		}
		// lets play with type inference
		
		var numInt = 10;
		int numInt2 = 10;
		var numInt3 = numInt2;
		System.out.println("numInt, numInt2, numInt3 = "+ numInt+" "+numInt2+" "+numInt3);
		
		// we can use var for arraysl also but specificaly like this
		var mySimpArray = new int[10];
		//not ok is
		
		/*
			var [] mySimpArray = int [10];
			var  mySimpArray [] = int [10];
		*/
		
		// most common way to use var
		var strExampleVar = "Hell VAR worked";
		
		// also
		var Hey = new Queue(4);
		
		//now we move to the ? operator
		int zeroDevider = 0;
		int safeDeviderValue = (zeroDevider != 0) ? (10 / zeroDevider) : 0;
		System.out.println("is safe devider zero ? - " + safeDeviderValue);
		
	}
}

// we will now make a queue class
class Queue{
	char q[];
	int putloc, getloc;
	
	Queue(int size){
		q = new char[size];
		putloc = getloc = 0;
	}
	
	void put(char ch){
		if(putloc == q.length){
			System.out.println("No more space");
		}
		q[putloc++] = ch;
	}
	
	char get(){
		if(getloc == putloc){
			System.out.println("Q is empty");
		}
		return q[getloc++];
	}
}