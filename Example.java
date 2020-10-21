class Example {
	public static void main(String args[]){
		System.out.println("Java drives the Web.");
		
		// i have skipped throm some basic stuff, but lets demonstrate long integer type
		
		long ci, im;
		
		im = 5280 * 12;
		
		ci = im * im * im;
		
		System.out.println("THere are " + ci + " cubic inches in cubic mile. This val can not fir in int");
		
		// double is the most used value for floatin point, java math sqrt returns double
		
		double x,y,z;
		x = 4;
		y = 5;
		
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
	}
}