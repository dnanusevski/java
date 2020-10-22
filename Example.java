class Example {
	public static void main(String args[]){
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
		
	}
}