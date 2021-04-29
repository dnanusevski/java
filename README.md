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
        sum += i++ is the same as sum = sum +i; i++;
        
    
    Relational and logical
        == != > < => =<
        &  |  ^  ||  &&  !
        ^ (if diferent then true)
        || && - short circuit logical operators (always use these since if first satisfies )
        
    Assigment operator is " = " it pushes right value to left like x = y = z = 100 all are 100 now
        What is interesting here, if values are comaptible 
        type conversion will occure int will become float like in hte following exaple
        if neccecery ofcourse like int i; double y; i =10 y = i;
    Short hand assigment x += 10 it is like x = x + 10
    
    compound assignment  means += or similar since they assign and do additional operation

TYPE CONVERSION

    when compatible types are mixed in conversion is automatic integer can be converted to float for example
    as long as the receiving val is larger then the one that will be converted. 
    Meaning two condition has to be method
    ● The two types are compatible.
    ● The destination type is larger than the source type.
    
    long to double can be converted but not other way around
    char and numeric or bollean not compatible
    
    Within an expression, it is possible to mix two or more different types of data as long as
    they are compatible with each other.
    
    First, all char, byte, and short values are promoted to int. Then, if one operand is a
    long, the whole expression is promoted to long. If one operand is a float operand, the
    entire expression is promoted to float. If any of the operands is double, the result is
    double.
    
    Type promotion can, however, lead to somewhat unexpected results. For example,
    when an arithmetic operation involves two byte values, the following sequence occurs:
    First, the byte operands are promoted to int.
    Same with cahr a + cahr be the result is int

CASTING
    
    We can cast incopatible types using cast oeprator (int) (double) (String)
    
OPERATOR PRECEDENCE    
    
    what comes first you might ask
    ++
    -- ~ ! 
    * / %
    + -
    >> <<
    > < >= <=
    == !=
    & ^ |  &&  ||
    ->
    = 
    op=
    
PROGRAM CONTROL STATEMENTS
    
    selection statements: if else switch
    iteration statements: for while do while
    jump statements: break, continue, return
    
        for loop condition is tested before the code block is started
        for loop can be versatile like
        for(int x = 0, int j = 10; i < j; i++, i--)
        in the case above the x is initialized inside the for loop and will disapear afterwords
        
        while loop condition is tested bofore the code block
        
        Use a for loop when performing a known number of iterations based on the
        value of a loop control variable. Use the dowhile
        when you need a loop that will
        always perform at least one iteration. The while is best used when the loop will
        repeat until some condition becomes false.
        
        break is interesting as break can exit specific labeled code block
        for ecample one: {   that was labeled block of code, and you can just break one;
        break with the label has to bi insede that label or else it wont work
        
        
CLASSES

    We will move to Cls.java file and continue from there regarding examples ofcourse.
    Class is a template that defines the form of an object. Java uses class specification to construct objects. 
    And object is instance of a class. It is not until the object is created that the physical memory is occpied
    
    Methods and variables are called members of the class. And data members or variables are called instance variables
    Class definition creates new data type
    Access instance variables using the dot anotation. like Class.var
    When object is created using new() a memory is alocated and a reference to that memory is returned
    Vehicle car1 = new Vehicle ();
    Vehicle car2 = car1;
    Vehicle car3 = new Vehicle ();
    car 1 and 2 same object car 3 diferent object. These are jsut references pointing to memory location
    
    Methods. Each method has at least one statement
    
    Each method has parathesis ( nad ) that is how we recognize if it is method
    PARAMTERES AND ARGUMENTS
    each method can have PARAMTERES they are variables that receive the value of ARGUMENTS
    methods typicaly provide acces to object data
    Method can acess its own class variables without this. Last book explaine it by saying 
    that java searches first within its class and then parent class etc
    this new book sad, it is normal fro a method to use instance variables since they are always invoked
    on already created objects. and on them the method is called, and theid instance variables are expected
    
    Void methods can stop their execution when the closing bracket is reached, or when return; statement is reached
    
    a very imprtant thing to know is that when primitiv vars are passed to parameters of fuctions
    they are being copied. But if objecst are passed (and since they are reference values)
    if you change someting inside the function, the change is reflected to original object
    
    reference to a class belongs to that class, so it can not show to another
    
    Class1 x = new Class1();
    Class1 y;
    y = x; // this is ok
    Class2 z;
    z = x; // this wont work
    
    this howere is allowed for superclass, meaning superclass reference can reference subclass
    but still it will not have access to its sublcass vars
    where us this usefull ?
    well it is usefull in for example when you use class for cionstructor
    following is an example of that
    
    class TwoDShape = {}
    class Triangle  extends TwoDShape {}
    class Square    extends TwoDShape {}
    
    TwoDShape shapes [] = new TwoDSHape[5];
    shapes[0] = new Triangle();
    shapes[1] = new Square();
    shapes[2] = new TwoDShape();
    

    Explain how inheritance, method overriding, and abstract classes are used to
    support polymorphism.
    
    Inheritance, method overriding, and abstract classes support polymorphism by
    enabling you to create a generalized class structure that can be implemented by a
    variety of classes. Thus, the abstract class defines a consistent interface that is shared
    by all implementing classes. This embodies the concept of “one interface, multiple
    methods.”


ABSTRACT CLASSES

    Sometimes you will want to create a superclass that defines only a generalized form that
    will be shared by all of its subclasses.
    Abstrac methods of hte class only tell the story, you need to create them and define them in subclasses
    it is a contract.
    A class that has on or more abstrac methods must be declared as abstract class.
    Abstract class can not be instatiated. it will result in an error(compile error)
    
    ABstract class will beahve compleatly the same as regular class when we look at the inheritance
    , except it can not be instantiated. it is used only to be inherited
    and if it has abstract methods THEY MUST be declared and defined in subclass if not compile time error will occure
    
    What is an abstract class? if somebdy asks you will say...
    An abstract class contains at least one abstract method.
      
    Abstract methods in abstract class can not have a body; or it will generate an error
    Abstract class can have regular methods that are inherited

INTERFACES

    Similar to abstract class but one step further...
    An interface is syntactically similar to an abstract class, in that you can specify one or
    more methods that have no body.
    
    access is either public or not used. When no access modifier
    is included, then default access results, and the interface is available only to other
    members of its package.

    In the traditional form of an interface, methods are declared using only their return
    type and signature. They are, essentially, abstract methods. Thus, each class that
    includes such an interface must implement all of its methods. In an interface,
    methods are implicitly !!!public!!!.
   
    Variables declared in an interface are not instance variables. Instead, they are
    implicitly public, final, and static and must be initialized. Thus, they are essentially
    constants.
    
    here is an exaple of interface
        // since it is public it can be used in classes outside package
        public interface Series{ 
            int getNext();
        }
    
    and to implemnt it do something like this
    
    class _classname_ extends _superclass_ implements _interface_ {
    }
    
   
    Methods of the class that implement an interface methods from interface must be declared public. 
    Also, the type
    signature of the implementing method must match exactly the type signature specified
    in the interface definition.
    
    Tested in cls3 -> inteface can have its variable and it can be used in classes that implement it
    
    One more point: If a class includes an interface but does not fully implement the
    methods defined by that interface, then that class must be declared abstract. No
    objects of such a class can be created, but it can be used as an abstract superclass,
    allowing subclasses to provide the complete implementation.
    
    As not so expected, you can create a reference of interface type, but the methods are the ones of the object
    In this case this reference can be used only to call methods that reference knows of
    
    
    IN java, constants can be  held in interfaces. this is not recomended ofcourse, and classes that need them usualy implement those constants
    so that thay can access them similar to this
    all of them will be public final and static, they can be accessed easily then
    
    interface IConst {
        int MIN = 0;
        int MAX = 0;
        String ERRORMSG = "BOundry error";
    }
    
    please remeber this can never be instance variables, those are always static and final
    Make a class implement this interface and you got constants in your hand
    
    interface can also extend interface, so the pour class has to implement all
    
    interface can also have default method or so called extension method(ONLY AFTER JAVA 9)
    it is mostly used if a lot of classes already implement some interface
    and we would llike to add something to it that will give this functionality to all classes
    
    it goes like this, the class does not have to define default methods of the interface
    but it can use it like it was inherited from superclass
    
    default int getAdminId(){
        return 1;
    }
    
    default methods can override its inherited default method, inside of them you can refer to 
    super interface method by using
    
    InterdaceName.super.methodName(); 
    
    after java 8 interfaces can also use static methods
    you call it compleatly the same as a class static method
    InterfaceName.staticMethodName
    thay are not inhertied further down the line
    
    with java 9
    Interface can have private method that can be used onl by that interface, usualy in default methods
    
  
METHOD OVERRIDING

    Method overriding is not as method overloading. Method overriding is when sublcass method
    has the same name and parameters as its superclass. This time, reference will decide.
    First and always the last sublcasss method of the reference will be called.
    You can still call it in the method of sublcass bu using super
    super.show() // this is how you call super class method or use parameters 
    if hte methods od the super class nad subclass have same name but diferent parameters
    then the overloading will occure and adequate function will be called based on parameters
    
    Method overriding forms the basis for one of Java’s most powerful concepts: dynamic method dispatch. 
    Dynamic  method dispatch is the mechanism by which a call to an overridden method is resolved
    at run time rather than compile time. Dynamic method dispatch is important because
    this is how Java implements runtime polymorphism.
    
    The above sentece actualy wants to tell us following. THe object that is calling the method 
    determinates what method will be called. That is all.
    and that is actualy polimorfphizm for java (that in java works at runtime)
  

PACKAGES

    Packages allow JAVA t oput all classes that do similar actions in one package, 
    this is also connected to namspacing, as a package defines namespace for clasees
    CLass can now be private inside package and accessable to only classes inside package 
    if you want them like that
    
    if you want a class to belong to a package you need to add
    package nameOfThePackage;
    at the beginign of a class definition
    
    CLasses that belong to the same package they must be in a folder called the same as package
    case senzitive ofcourse
    
    we can also have miltilevel packages similar case goes with them also
    
    package pack1.poack2.pack3
    
    folder structure would be
        pack1   
            pack2
                pack3
                

    First, by default, the Java runtime
    system uses the current working
    directory as its starting point. Thus, if your package is in a subdirectory of the current
    directory, it will be found. Second, you can specify a directory path or paths by setting
    the CLASSPATH environmental variable. Third, you can use the classpath
    option
    with java and javac to specify the path to your classes. It is useful to point out that,
    beginning with JDK 9, a package can be part of a module
    
    
    here is an example 
   
    package mypack
    
    In order for a program to find mypack, the program can be executed from a directory
    immediately above mypack, or CLASSPATH must be set to include the path to
    mypack, or the classpath
    option must specify the path to mypack when the
    program is run via java.
    
    build it by saying javac mypack/ClassWithMain
    
    run it like java mypack.ClassWithMain
    
   
    A top level class has only two possible
    access levels: default and public. When a class is declared as public, it is accessible
    outside its package. If a class has default access, it can be accessed only by other code
    within its same package. Also, a class that is declared public must reside in a file by the
    same name.
    
    Ofcourse packages have to be used somehow and you can use full class name with namespace
    like
    
    bookpack.Book [] books  = new bookpack.Book[2];
	
    but wen you import it like
    import bookpack.* // or specificaly ask for a book class
    Book [] books  = new Book[2];
    
    


FINAL

    - final method
        OK if you do not want subclass to override mehtods ude word FINAL, thus such methods can not be overridern
        changed by the subclass if you try a compiletime error will result.
        
        final void calculate(){
        }
    
    - final class
        You can also prevent a class to be ingerited (thus preventing change of the class)
        Just declare class as final
        final class A
    
    - final variable
        Final instance variable is unmutable value.
        final int SOMENAME = 6; cant change it anymore it will stay 6

    As a point of style, many Java programmers use uppercase identifiers for final
    constants, as does the preceding example. But this is not a hard and fast rule.

    All in all word final can be used on almost anything, method parameters, static methods, local vars,
    all in all once initialized once that is that can not change it anymore
  
CLASSES CONSTRUCTOR 
    does not have return value and is named the same as the class is named
    when you use new (Vehicle v = new Vehicle) that "new" wil lalocate memory for new Vehicle object
    if there is no memory a run time error will occure


OBJECT CLASS
    
   In java, we have object class that is superclass of all objects. All classes inherit object class
   that means all classes have follwing methods
   clone()
   equals()
   finalize() - called before obj is destroyed
   getClass() - get the name of the class
   hashCode() - evey object in java has hash code with it
   toStrin() - describe object
   ... ()notify notifyAll ... wait

METHOD OVERLOADING
    
    
    Two methods can have same name as long as they have diferent parameters, that is called method overloading
    You must observe one important restriction: the type and/or number of the parameters of each overloaded 
    method must differ
    
    Shor explanation - yo can name fucntions the same way as long as the parameters are diferent in number or type
    In the case of byte and short, Java automatically converts them
    to int. Thus, f(int) is invoked. In the case of float, the value is converted to double
    and f(double) is called.
    
    constructors can also be overloaded. most common use is in example cls2
    
    interesting is that if return types are diferent but parameters are the same we will not have overload
    we will have an error :)
    
    

STATIC
    There will be times when you will want to define a class member that will be used
    independently of any object of that class.
    Static vars are globals, whole app shares the same value -- all objects share same static var.
    it is important to understand that. Review example cls2.java
    
    In java you can access statis var using instantiated object, 
    and then alter its value for all instantiated objects
    
    This is definitly one interesting point to java
    
    Static methods are a bit trickier to it. THey can call other static methods and use other static vars
    but they can not use other vars or methods that are not static
    
OBJECT STATIC BLOCK

    It has the same name but means someting else. What it means is following
    you can place a static bloc in the class definition, and during initialization
    this static bloc will fire before anything else ! Mind the gap
    this static block is fired ofcourse only the first time for the first object of that class
    when another object is created it wont fire again.
 

INNER CLASSES
    
    An inner class is a nonstatic nested class.
    A nested class does not exist independently of its enclosing class. Thus, the scope of a
    nested class is bounded by its outer class.
    A static nested class is one that has the static modifier applied. Because it is
    static, it can access only other static members of the enclosing class directly. It
    must access other members of its outer class through an object reference.
   
INHERITANCE

    In the language of Java, a class that is inherited is called a 
    superclass. 
   
    The class that
    does the inheriting is called a 
    subclass.
    
    Private access modifier in superclass disallows use of it in subclass 
    that is why we need to create access methods to those private members OR
    
    - Constructors in inherited classes
        The constructor for the superclass constructs the superclass
        portion of the object, and the constructor for the subclass constructs the subclass part.
   
    - Super - a constructor of superclass
    
    
        super(parameterlist);
        
        Here, parameterlist specifies any parameters needed by the constructor in the
        superclass. super( ) must always be the first statement executed inside a subclass
        constructor.
        
        Let’s review the key concepts behind super( ). When a subclass calls super( ), it is
        calling the constructor of its immediate superclass. Thus, super( ) always refers to the
        superclass immediately above the calling class. This is true even in a multilevel
        hierarchy. Also, super( ) must always be the first statement executed inside a subclass
        constructor.
        
        word super can also access superclass member variables, usualy used whn sublass has the same name var
        this is used to hide superclass variable
        
    - multilevel hiararchy
        every subclass pciks up all from super classes above. meaning sub sub sub class can call all the methods 
        that belon to all superclasses
        
        it is important to know that first constrctor to run is the constructor of the most superclass
   
JAVA SIGNATURE 
    signature is actualy the name of the function plus its parameter list (it does not include return value)

VARARGS METHOD or VARIABLEARITY METHOD
    method that can accept uknown number of arguments,
    definition is like this
    static void vaTest(int ... v)
    vararg parameter must be last one to be added
    you can also overlaod them like any other method
    Somewhat unexpected errors can result when overloading a method that takes a variable length
    argument. These errors involve ambiguity. Meaning if you overload function and call it without parameters
    error will occure: here is an example of amibuity
    
    varArgTest(int ... v)
    varArgTest(int i, int ... v)
    
JAVA ACCESS MODIFIERS

    three access modifiers: public, private, and protected
    private is only accessed within the class, and public can be accessed fron anyware.
    protected is liek private but can be accessed from inherited class
    default is public unless a package is used. Will be explained later
    
    The key point is this: A private member can be used freely by other members of its
    class, but it cannot be accessed by code outside its class.
    Access modifiers are also affected when using module features discussed later in the book
  
RECURSIVE FUNCTION

    a function that calls itself and goes back from down to up. each call h=goes deaper remembering 
    from where it was called
     
  
ARRAYS
    
    regular java array looks like this
    * type array-name[] = new type [size]
    
    THere are diferent ways to sort an array. Herre are some: quicksort, shaker, shell. 
    The most fameous is Bubble sort but it is used on small arrays.
    The quickes is quicksort
    
    //two dimensional arrays
    int table[][] = new int[10][20];
    // in the mutlidimensional array world only the first array dimension needs to have length specified
    int table[][] = new int[10][]; // liek so
    but then you need to add dimension on the first use
    int table[4] = new int[10]; // liek so
    
    // htere is an alternativ way to initialize an array
    int [] sqrt = new int [4];
    
    having arrays as objects in java, remebmer new initiatior
    this means the new array will return a reference to objct of type of some array
    since array is a object. He holds his instance variables
    on of instance variables is length, so just use it to get the length
    
    The array that we talked all along is a LINEAR LIST
    it suppoerts random access to its elements
    We also have stack - a list of elements that is accessed like first in first last outputed
        it is like a stack of plates, the last one that was put on stack is the first used
    and queue - first in first out  - line in the bank. the first waiting is the first served  
    
    In the example we will use queue - first in first out array.
    it has put and get. Every get(retrievel) will "remove" element from it
    a queue can be circular and not. A circular queue will not remove a spot when element is removed.
    a non circular queue destroys a spot when element is removed. making him exost when all are removed
    
    FOREACH loop is enhanced for loop and was implemented in java 5
    definition is (type var: collection)

STRINGS 

    A string in other languages is usualy array of characters. In java STRING is object
    so you can create it like String str = new String("Hello");
    But it is usualy done like this String str = "Hello";
    Since string is an class here are some of its methods that helps us during harship
    
    str.equeals(str2)   - boolean true of false
    str.length()        - int length of string
    charAt(int index)   - char returns character at given position 
    compareTo(str2)     - int returns 0 if equals, less then zero if not. and more hten 0 if yes
    indexOf(str2)       - int returns the index of first occurence or -1
    lastIndexOf(str2)   - int returns the index of last occurence or -1
    substring(int start, int stop)  -   extracts sub string of the given string
    
    String can not be altered. THey are imutable in java. SO just copy one and let the last 
    to garbage collector
    
    Input arguments are following: during program lunch like java Exaple2 one two three (that one two three are arguments)
    we can pick them up in main methos bu using args[0] or 1 or 2 ...
    
    JUSTA NOTE
    All lower case character are 32 lower in value from uppercas

TYPE INFERENCE

       This means pick up type from the value that was given to the variable. 
       Like in many other programing langages
       especialy in js
       
       it goes like this
        
       var avg = 10.00; // and this is equivalent of  double avg = 10.00
       menaing recognise the type of the 10.00 and give it to the avg variable
       var is a context sensitive indentifier !!! THat means that sometimes it will be used to GUESS the type
       in other it can be easily the name of your variable
       
       like 
       
       int var = 3;
       
       // we can also do someting like this
       var k = -var;
       
       var can only be used to instace local variables but not in the class or sometgin like that
       also you have to initialize the variable typed woth var so following is forbiden
       
       var test; // no initializatioin for the test, var can not be used
       
       var is mostly used for objects and not for other thingis
       
       There seams to be some restrictions regarding var;
       oml one variable can be initialized, and it can not be NULL
       also for arrays
       var myArray = new int [10] this is ok
       var myArray = new int {1,2,3} this is NOT ok
       var can not be the neam of class interface or enumerations or annottation
       tray catch to catch with var you can not
       lambda expressions also can not be var
       
THE ? OPERATOR

       Exp1 ? Exp2 : Exp3;
       
     
EXCEPTION HANDLING TRY CATCH BLOCK  
  
    Exception is an error that happens at runtime
    
    Exception is derived from class Throwable, also error is derived from same class
    only that we can not affect it
    we can only catch exception and not error.
    
    Java exception handling is managed via five keywords: try, catch, throw, throws,
    and finally.
    
    here is a general form:
        try {
            // block of code to monitor for errors
        }
        catch (ExcepType1 exOb) {
            // handler for ExcepType1
        }
        catch (ExcepType2 exOb) {
            // handler for ExcepType2
        }
    exception can be cought no metter how deep inside methods it is thrown. as long as it was inside try cathc block
    exception will be cought by the first catch there is. if mehtod has its on try catch then it will be cought there.
    
    if exeption is not cought then java JVM will get it and stop program exection and it will display stack trace
    One important rule that we have already learned is super class of exception should not be first 
    like this
    
    catch(Exception e){
    }
    
    // this exxception can not be reached ever, because superclass will catch it 
    catch (ArrayIndexOutOfBoundsException exc){
    }
    // thus this creates an error vile compiling
    
    all in all exception is cought once and all other cathc are skipped no metter if subclass is beneath
    it will not catch already cought exception
    
    try catch can be nested one in another
    as in any programing language, exceptions can be thrown, or generated by themself
    goes like this
    
        throw excObj
    real example
        throw new Exception();
        
    Every exceotion object has following methods
    String getLocalizedMessage()                - localized description of the exception
    String getMessage()                         - get message of exception
    void printStackTrace()                      - print all that led to exception
    void printStackTrace(PrintStream stream)    - sends strack trace to some stream
    String toString();                          - returns standard error message
    
    toString actualy  shows regular java exception text, so it is not that helpfull
    
    in try catch we also have finally. Finally will run no metter what
    
    try{
        //
    }catch{
        //    
    }finally{
        //   
    }
    
    One wery imortant rule, if mehtod does not handle excetion 
    that it will throw, you must say that in method definition
    like void lokosi(int a) throws exception-list{
    }
    this is onlu for those classes of exceptions that are not a sublcass of Error or RuntimeError
    all other have to be declared IF they do not handle posiible exception with try catch
    MANING if you have try catch catchin exception you do not need to set that that method throws anything
    
    one more thing about catching exceotion is that you can use sometihing like this
    catch (ArithmeticException | ArrayIndexOutOfBoundsException e)
    
    You can also define your own exception
    Just extend Exception (throwable)
    
    since java 7 we have 3 new cath options
    
    multi cahtch
    automatic resource mangement (meaning if reource to the file is used in try cathc, if exception stops execution, release file resource 
    final rethrow or rethrow
    
    
    Multi catch
        try{
        
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException ex){
        
        }
        
    Java lang defines two types fpr exceptions
    unchecked (no need to mark function that it will throw them)
    checked(funciton needs to tell us that it will throw exception if it does not intend to handle them)
    (both list of exceptinos can be found at str 400 in the book java a beginers guide eight edition or on the net)
    
    important !! only functionas can bear merkings of throws 
    function lokosi () throws errorme
    not class class does not throw
    
    
I/O JAVA

    Java has bytes and character strams, but deep down all becomes byte stram
    lets remeber java.lang is imported automaticaly and it comes with System class
    that has in. out and err
    System.in is InputStream and System.out and System.err are PrintStream
    Byte strams are usualy for files, and character streams are for text and are internationalized sinc unicode are they
    
    ROOT OF Byte io is InputStram and OutputStram classes
    ROOT OF Character / Unicode are Reader and Writer classes
    
    In order to read from console you can usualy use
   
        Syste.in.read() -> this will return reference to InputStream
    This code above actually calls a constructor that can return one byte from input
    or it can put it in array like in example Cls4.java
    and regarding writing to the console you will probably use 
        
        println()
        
    or 
        
        print()
        
    as it prints string to console
    or you can use 
        
        write ()
    But you will have to call write('\n') as it will be used to output it it is like pressing enter
    
    
    
IO FILES
    
    we will connect (create stram link) to a file using byte streams -> 
    FileInputStream (tu put to) or 
    FileOutputStream (to read from)
    
    to open up a file for input use FIleInputStram
    FileInputStram(String fileName) throws FIleNotFoundException -> subclass of IOException
    
    when file is oppned we can use read() - reads byte by byte untill -1 is returned
    we nned to close it after that with close()
    
    WHen you are reading the file, after the last character you will get -1 meaning you have reached end of file
    and if error occures during the read or anything else an exception will be thrown
    
WRITING TO A FILES
    fin = new FileInputStream("test.txt"); // this opens a file for read but bytes only
    
READING FROM A FILES
    FileOutputStram(String fileName)                    - to overwrite current file
    FileOutputStram(String fileName, boolean append)    - if append true it will just continue where file has been finished
        also both of them bytes only (characters with 8 bytes or ASKII)
    
    In both of these cases reading and writing we need to close the file in order to avoid memory leackage
    But since java 7 has introduced try with resource we can use that.
    
    try (closable resource){ // this means that this resource needs to be able to close whatever it closes :)
    }
    
    now we would like to write integers double and other to a file
    to do hat you need to use 
    DataInputStream
    DataOutputStream - implements interface DataOutput that defines methods for a lot of datatypes writing 
    
    both of the above require class that writes to a file or somethin else in their constructor
    here is an example of constructor
    
    DataOutputStream(OutputStram SomeObjectOfOutputStram) // FileOutputStram
    DataInputStream(InputStram SomeObjectOfInputStram)  // usualu FileInputStram
   
    all those above were probably byte streams now we will talk about character streams
   
    CHARACTER STRAMS
    
    Lets talk about reading from System.In - that is byte strem
    in order to do so we will use BufferedReader - he supports BufferedInputStream
	we are going to use it for Systtem.In and system in is byte stream
	so we need a class called InputStreamReader and this class converts bytes to characters
    so we will have something like this 
    
    BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
    he also has read method to read from
    like
    int read()
    int ready(char [] data)
    int read (char [] data, int start, int stop )
    
    it also has readLine that will read one string that was inputed
    
    
    usualy for writing to a console it is prefered to use PrintWriter instead of System.out
    like it is more profesional :D
    here is the example of usage
    PrintWriter pw = new PrintWriter(System.out, true); 
    this true as second parameter tells to flush imidiatly to output stream
     - constructor is like this PrintWriter(OutputStream os, boolean flushingOn)
    
    now we use it like this
    pw.println("HELLO")
    
    WRITE CHAR TO A FILES
    
    for this purppose we use FileWriter, if we want to insert characters and not bytes
    
    here is the example of that fileWriter class
    FIleWriter(String fileName)
    FIleWriter(String fileName, boolean append)
    
    
    
    note : We can presume htat outputStreamWriter converts char to bytes in order to write someware, maybe not
    
    
BYTE I/O
    
    At the top we have InputStram and OutputStram abstract classes that define caracteristic of ll the others
    
    InputStram is byte stream and it has a lot of methods ()all found on 417 page of the a beginers guide
        int available (how much to readable)
        void close()
        void  mark
        boolean markSupported
        int read
        int read(byte buffer[])
        ...
        void reset
        long skip
        long transferTo
    
    OutputStram also has a lot of methods that are described at page 418
    
        void close
        void flush
        void write
        write(byte buffer[])
        write(byte buffer[], int offset, int numBytes)
    Here are most commont byte Stram classes
    
    BufferedInputStram
    BufferedOutputStream
    
    ByteArrayInputStram
    ByteArrayOutputStream
    
    Data... (meaning DataInputStream and output stram)
    File
    Filter
    Object
    Piped
    PrintStream
    InputStream
    
CHARACTER I/O

    Main two abstract classes in character strams are Reader and Writer
    Frome reader and Writer are derived concrete sublcasses
    .. dots mean name sohud be appened to Reader Writer like
    
    File... -> FileReader FileWriter are the name of classes
    
    Reader
    Writer
   
    BufferedReader
    BufferedWriter
    CharArrayReader
    CharArrayWriter
    File...
    Filter...
    InputStreamReader / only - converts bytes to characters
    LineNumberReader / only
    String...
    Piped...
    
WE ALSO HAVE 2 INTERFACESES DataInput and DataOutput
  
    they define standart input and output methods like writeInt readInt and so on

MULTITHREAD PROGRAMING IN JAVA

    Java multithread programing is based on main class called Thread and it implements interface Runnable
    noth are in java.lang
    If you want to use multithread programing you must eather extend thread class or implement runnable interface
    
    most comonly ysed methods for multithread is following
    getName
    getPriority
    isAlive
    join        --wait fo the thread to terminate
    run
	sleep
    start
    
    
    Ok we will focuse on implementing runnable interface
    you instantiate Thread object of the class that implements interface
    once created it will not begin imidiatly you need to start() it :)
    
    class that implements runnable interface
        MyThread mt = new MyThread("Child #1");	
    from my thread object we crate thread classes, and since they use same interface that is ok
        Thread newThrd = new Thread(mt);
    lets get that tread on the run, this start method calles run method
        newThrd.start();
    
    in the example above we have created our one name for hte thread and passed it in the consutrcotr("Child #1")
    We can skip that part and use it llike this
    Thread newThrd = new Thread(mt,"Child #1"); 
    and then later on take the name using method getName()
    also if you have forgoten to add the name you can add it later using the setName() on a thread object
    
    So here above we had one variation form the regular therad use (show ad first one in cls5.java)
    
    The second variation that we will use is a autmatic starting of thread during creation.
    using contructor like this
    MyThread(String name){
        thrd = new Thread(this, name);
    }
    This method holds thread as thrd variable of a class so that you can use it like this
    MyThread myThrd = new MyThread(name)
    after this constructor we have instance variable alraedy set to be a THread object
    and we can now do someting like this
    myThrd.thrd.start();
    
    
    Also instead of implementing runnable you can also use class thread and extend it if it is more convininet
    then override run (similar to runnable )
    
    So now that we know about this whcih method to use
    well use runnable interface, becaouse extending class usualy mean you are going to do some powerfull stuff
    thet you probaby wond to :)
    
    It is important to know when will thread end do that main method is finished last
    usualy do that by wrapping up all threds in do while where while will test threads if they are alive
    using isAlive on the thread object
    
    this can also be achived using join()
    
    join is called on the thread object and it tells the thread that is currently runiing to wait for the
    thread on which join si called to finish
    here is the explanation
    
    public static void main(String args []){
        threadMyThread.join() -> thell main thread to wait for the threadMyThread to finish
    
	lets explain join a bit better
	join is called on the thread from the thread. For example
	thread.MyThread.join() -> this function is called on from the main thread 
	on the MyThread telling main thread to wait for the MyThread

    
    WHat we also can do with threads is seting priorities. 
    values are from 1 to 10    
    and you set them using
    setPriority(int 0-10)
    you can also see what is the current priority of the thread
    getPirority()
    }
    
    
    Sometimes it can happen that two or more threas want to acces the same resource
    this making things bad for example 2 threads are reducing money from account
    this is well know issue
    and we need synhrinization for this purpose
    IN java all objects have something called monitor
    this monitors tracks thread that is using it and if neccecery it can set it to occupied and no other thread can come
    and the workd for that is synchronized
    
    Sometimes it will not be possible for you to place synchronization on a method, if for some reason methods 
    are out of reach of yor code(for example some included class method from some util or something like that).
    
    In those cases if you still need to use synchronization you will need to use synchronization block
    
    synchronized(obj){
        //statements to be accassed by threads one by one
    }
    
    You can tell threads to wait. using wait
    The current thread will wait untill it is notified to go on
    here are the methods
    
    final void wait() - wait until notified
    final void wait(long miliseconds) - wait for a specific amount of miliseconds OR UNTILL NOTIFIED
    final void wait(long miliseconds, int nanosecundes)
    
    And how do we notifie those threads that they should now go on with their work
    Well we notifie them using notify function :)
    
    notify()
    notifyAll()
    
    ok now we know what is wait. it means wait until you get notified. 
	In newver versions of java we do not have functions like suspend, resume and stop
	so we need to find a better way to do it.
    