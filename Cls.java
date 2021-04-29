class Vehicle{
	int passengers;
	int fuelcap;
	int mpg;
	
	// constructor does not have return value 
	// and is named the same as the class is named
	Vehicle (int passengersPar,int fuelcapPar,int  mpgPar){
		passengers = passengers;
		fuelcap = fuelcapPar;
		mpg = mpgPar;
	}
	
	void range(){
		// there is no need to use word this, as java searches first within the class
		// this book explained diferently
		
		System.out.println("Range is " + fuelcap * mpg);
		// better aproach it to have range return a value
	}
	
	int rRange(){
		return fuelcap * mpg;
	}
	
	double fuelneeded(int miles){ // miles is parameter, and it will receive argument value
		return (double)miles / mpg;
	}
}

class HelpClass{
	
	void helpOn(int what){
		
		System.out.println("Showing help for " + what);
		
		switch (what){
			case '1':
				System.out.println("IF contition statement is cool");
				break;
			case '2':
				System.out.println("Switch statement is cool");
				break;
			case '3':
				System.out.println("For statement is cool");
				break;
			case '4':
				System.out.println("While statement is cool");
				break;	
			case '5':
				System.out.println("Do-while statement is cool");
				break;	
			case '6':
				System.out.println("Break statement is cool");
				break;
			case '7':
				System.out.println("Continue statement is cool");
				break;				
		}	
		System.out.println();
	}
	
	void showMenu(){
		System.out.println("Help On: ");
		System.out.println("1. If ");
		System.out.println("2. switch ");
		System.out.println("3. for ");
		System.out.println("4. while ");
		System.out.println("5. do while ");
		System.out.println("6. break ");
		System.out.println("7. continue ");
		System.out.println("Choose one (q to quit): ");
	}
	
	boolean isValid(char ch){
		System.out.println("Checking " + ch);
		if(ch < '1' | ch > '7' & ch != 'q') {
			System.out.println("Returning false");
			return true;
		}
		else {
			System.out.println("Returning true");
			return false;
		}
	}
	
	void run() throws java.io.IOException{
		char choice, ignore;
		
		for(;;){
			
			do{
				showMenu();
				
				choice = (char) System.in.read();
				
				do{
					ignore = (char) System.in.read();
				} while (ignore != '\n');
			
			} while (isValid(choice));
			
			if(choice == 'q') break;
			
			System.out.println("\n");
			
			helpOn(choice);
		}
	}
}


class Cls{
	public static void main(String [] args){
		System.out.println("Lets demonstrate classes");
		
		Vehicle minivan = new Vehicle(3, 5, 7);
		minivan.passengers = 5;
		
		Vehicle refMinivan2 = minivan; // reference to same object
		/*
		HelpClass hc = new HelpClass();
		
		try{
			hc.run();
		} catch (Exception e){}
		*/
	}
}