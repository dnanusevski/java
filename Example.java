class Example {
	public static void main(String args[]) throws java.io.IOException{
		System.out.println("Java drives the Web.");
		
		// i have skipped throm some basic stuff, but lets demonstrate long integer type
		
		long ci, im;
		
		im = 5280 * 12;
		
		ci = im * im * im;
		
		System.out.println("THere are " + ci + " cubic inches in cubic mile. This val can not fir in int");
		
		// double is the most used value for floatin point, java math sqrt returns double
		
		double x,y = 5,z;
		x = 4;
		//y = 5;
		
		z = Math.sqrt(x*x + y*y);//square root returns double
		
		System.out.println("Hypotenuse is " + z);
		
		// lets demonstrate char
		
		char ch, dng;
		ch = 'x';
		System.out.println("Character value is " + ch);
		
		ch++;
		
		System.out.println("Character value after ++ is " + ch);
		
		// here we can have a interesting example
		dng = '\t';
		System.out.println("DNG BEFORE " + dng + " DNG AFTER");
		
		// small demonsrtation of boolean
		
		boolean a, b;
		a = true;
		b = false;
		// a will be diplayed as true - meaning conversion to string is done
		if(a){System.out.println("A is " + a);} 
		if(b){System.out.println("B is " + b);}
		
		// String literal
		String str = "Hello \nMrFib \ta \tb \tc"; // \n will push output to new line
		System.out.println("STR IS: " + str);
		
		// Scope examples
		
		int tstX = 10;
		
		if(tstX == 10){
			int tstY = 20;
			System.out.println("tstY is " + tstY + "  tstX is " + tstX);
		}
		// tstY is not visible in here
		// tstX is visible
		
		// Arithmetic operator
		int arXYI = 6 / 5;
		System.out.println("6 / 5 is  " + arXYI);
		
		int arXYM = 6 % 5;
		System.out.println("6 % 5 is  " + arXYM);
		
		double arXYD = 7.0 / 5.0;
		System.out.println("7.0 / 5.0 is  " + arXYD);		
		
		double arXYDM = 7.0 % 5.0;
		System.out.println("7.0 % 5.0 is  " + arXYDM);
		
		// moduo returns integer value and not double
		
		
		//logical operators short circuit ecxample
		
		int tmX = 10;
		int tmY = 0;
		
		if(tmX != 10 && (tmX / tmY) == 0){
			System.out.println("We preventd devision by zero by using shor tircuit &&");
		}
		
		// Lets try to do a cast
		
		double cX = 117.45;
		double cY = 29.13;
		
		int cXcY = (int) (cX / cY);
		
		System.out.println("Result of int cXcY = (int) (cX / cY) " + cXcY);
		
		
		// lets show precedence of operators using some table
		
		boolean p, q;
		
		System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
		
		p = true; q = true;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p) + "\t");
		p = true; q = false;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p) + "\t");
		
		
		// lets demonstrate system in method
		System.out.println("Demonstration of input linke from system in");
		
		char inputCH;
		System.out.println("Type char and press enter");
		inputCH = (char) System.in.read(); // this gets a char
		System.out.println("Your key was: " + inputCH);
		
		if(inputCH == 'a'){
			System.out.println("We know you wanted to type a ");
		}
		
		switch(inputCH){
			case 'a': {
				System.out.println("Switch said a");
				break; 
			}
			case 'b': {
				System.out.println("Switch said b");
				break; 
			}
			case 'c':
			case 'd':{
				System.out.println("Do not care");
				break; 
			}
			
			default:{
				System.out.println("Switch said default");
				break; 
			}
		}
		
		// for loop
		for(int forX = 0, forJ = 3; forX < forJ; forX++, forJ--){ // if not valid do not run
			System.out.println("For loop i and j - " + forX + " - " + forJ);
		}
		// while loop
		int whileX = 8;
		
		while(whileX < 10){ // if not valid do not run
			System.out.println("whileX is  - " + whileX );
			whileX++;
			break; // it is used t oexit of the loop at anytime
		}
		int dowhileX = 0;
		do {
			System.out.println("dowhileX is  - " + dowhileX );
			dowhileX++;
		} while(dowhileX == 4);
		
		// now we make a guessing game using do while
		
		char guessChar, ignoreChar, answerChar = 'a';
		do{
			
			// empty the imput buffer
			do{
				ignoreChar = (char) System.in.read();
			} while(ignoreChar != '\n');
			
			
			System.out.println("Please type a ");
			guessChar = (char) System.in.read();
			
			if(guessChar == 'a') {
				System.out.println("Thank you for pressing a");
			} else{
				System.out.println("Again, i said press a");
			}
			
		} while (guessChar != 'a');
		
		// there is a way to break to the certain block of code if you have given it a label
		
		for(int counters_i = 1; counters_i < 4; counters_i++){
			
			System.out.println("I is " + counters_i);
			
			one:{
				two:{
					tre:{
						if(counters_i == 1) break one;
						if(counters_i == 2) break two;
						if(counters_i == 3) break tre;	
						System.out.println("Wont print");
					}
					System.out.println("Outside tre");
				}
				System.out.println("Outside two");
			}
			System.out.println("Outside one");
			
		}
		System.out.println("Outside fore loop 2");
		
		
		// now we will demonstrate continue statement
		
		for(int counters_i = 1; counters_i <= 6; counters_i++){
			if( (counters_i % 2) != 0){
				continue;
			}
			System.out.println("even is " + counters_i);
		}
		
		// we will once again demonstrate nested loops to search for all the number facors
		
		for(int counters_i = 2; counters_i <= 20; counters_i++){
			System.out.println("Factors of " + counters_i + ": ");
			for(int counters_j = 2; counters_j <= counters_i; counters_j++){
				if( (counters_i%counters_j) == 0 ){
					System.out.print(" " + counters_j);
				}
			}
			System.out.println("");
		}
		
		
	}
}