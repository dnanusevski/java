Odgovori na strnicama od 711
Clasa
ENKAPSULACIJA, POLIMOFRIZAM, NASLEDJIVANJE - Osnovni prinicpi objekto orjentisanog porgramiranja - 
MEMBERS OF THE CLASS - sve izmedju viticastih zagrada nakon definicije klase {}


public static vodi main (String arg[])

PUBLIC - access modifier
STATIC - allow class method invocation before class object is instantiated
VOID - no return value

String args - parameters of the method (vars that are passed to paramteres are arguments)

In java variables can bi declared like following
int a,b,cl

int
float (single precisioan)
double (double precision) most used

When int is used in artimetic operations the point after dot is lost (fractional component): 10 / 4 = 2
WHen float is used instead we get 2.5

code block - blocks of code are inside {} brackets
statement  - one line with semicolon at the "end"
identifier -  is, essentially, a name given to a method, a variable, or any other userdefined item
variable - is named memory location


JAVA simple / primitive data types

	boolean - 	true false
	
	
	(float point) float		-	32 bit Single precision floating point
	(float point) double	-	64 bit Double precision floating point (most used)
	
	
	(integer) char  	- 	character (but also belongs in (integer) family 16 bit unsigned)
	
	(integer) byte	- 	8bit integer	- 8
	(integer) short	-	Short integer	- 16bit
	(integer) int 	-	Integer			- 32bit	(2147 Milions +- from negatie to positive)
	(integer) long 	-	Ilong integer	- 64bit
	
	
	
CHAR

	it is initialized by ''
	it can be incremented
	
BOOLEAN

	if outputed in println will convert to true or false string
	+ is more important then < > so use it like println( "so the result of 10 < 2 is " + (10 < 2))
    
LITERALS
    Now that we have explained above we can say that java literals are values that are human readable and 
    are assigned to java primitives. 
    For example: 
        45      -   (integer literal), 
        77.554  -   (double literal) 
        'a'     -   character literal 
        10.6F   -   float literal
        10.6L  -   Long literal
    One of the literals is string literal, a combination of characters
    
STRING LITERALS

    An example of string literal is value enclosed in ""
    
Variables
   
    Can be initialized with CONSTANT like type var = value (where value is a constant)
    Can bi DINAMICALY INITIALIZED - type var = value1 * value2 (result of 2 constants );
    
Scopes
    In java every curly bracked starts the block of code. Vars inside are not visible to the outside world
    But vars from outside can be
    
Operators
    We have 4 basic operators in JAVA - artihmetic. bitwise, relational and logical
    Arithmetic: 
        + - * / % ++ -- (all numeric and char :D )
       
       !Moduo % is integer value
        x++ is the same as x = x + 1;
    
        x = 10
        y = ++x now y is 11
        y = x++ now y is 10 
        in both cases x will be 11 at the end
    
    Relational and logical
        == != > < => =<
        & | ^ || && !
        ^ (if diferent then true)
        || && - short circuit logical operators (always use these since if first satisfies )
        
    Assigment operator is " = " it pushes right value to left like x = y = z = 100 all are 100 now
        What is interesting here, if values are comaptible 
        type conversion will occure int will become float like in hte following exaple
        if neccecery ofcourse like int i; double y; i =10 y = i;
    Short hand assigment x += 10 it is like x = x + 10
    
    
   