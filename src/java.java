import java.util.Scanner;

class Calc
{
	int num1;
	int num2;
	
	int result;
	
	public Calc()
	{
		num1=5;
		num2=10;
		System.out.println("Default Constructor");
		System.out.println(num1+" "+num2);
	}
	
	public Calc(double num1, int num2)
	{
		this.num1=(int)num1;
		this.num2=num2;
		System.out.println("Parameterized Constructor");
		System.out.println(num1+" "+num2);
	}
 	
	public void add()
	{
		result=num1+num2;
		System.out.println(result);
	}
}

class Emp
{
	int id;
	int salary;
	static String ceo;
	//Static block to initialize static variables
	static //Executed when class is loaded
	{
		ceo="Mukesh";
	}
	public Emp()
	{
		id=0;
		salary=50000;
	}
	public void show()
	{
		System.out.println(id+"-"+salary+"-"+ceo);
	}
}

class Outer
{
	static int a=100;
	class Inner
	{
		public void display()
		{
			System.out.println("Inside Inner class");
		}
	}
	static class InnerStatic
	{
		public void display()
		{
			System.out.println("Inside Static Inner class");
		}
	}
}

class VarargsCalc
{
	public int add(int ... n)
	{
		int sum=0;
		for(int i : n)
		{
			sum+=i;
		}
		return sum;
	}
}

//Inheritance
class calc1           //Superclass or Parent
{
	public int add(int i,int j)
	{
		return i+j;
	}
}

class calcadv extends calc1     //Subclass or Child
{
	public int sub(int i,int j)
	{
		return i-j;
	}
}

class calcveryadv extends calcadv
{
	public int mul(int i, int j)
	{
		return i*j;
	}
}

class A
{
	int i=10;
	public A()
	{
		System.out.println("In A");
	}
	public A(int i)
	{
		System.out.println("In A para");
	}
	public void show()
	{
		System.out.println("A");
	}
}

class B extends A
{
	public B()
	{
		System.out.println("In B");
	}
	public B(int i)
	{
		//super(10);
		System.out.println("In B para");
	}
	public void show()
	{
		//super keyword used to reference parent class
		super.show(); //Makes sure that show() of A is called instead of being overridden 
		System.out.println("B");
		System.out.println(super.i);
	}
}

//Encapsulation - Binding data with methods
class Students
{
	private int rollno;
	private String name;
	
	public int getRollno() {
		System.out.print("Roll Number is : ");
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		System.out.print("Name is : ");
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

//Abstract class
abstract class car
{
	int price;
	abstract void start(); //Abstract function.
	//Abstract function needs an abstract class to be in
}

class BMW extends car
{
	@Override
	void start() 
	{
		// TODO Auto-generated method stub
		System.out.println("BMW is starting");
	}
}

class Audi extends car
{
	@Override
	void start() 
	{
		// TODO Auto-generated method stub
		System.out.println("Audi is starting");
	}
}

interface Writer
{
	void write(); //methods in interface are public abstract by default
	//Only abstract methods allowed in interface
	//But abstract class allows defining a method
}

class Pen implements Writer //Inheritance for interface
{
	@Override
	public void write() 
	{
		// TODO Auto-generated method stub
		System.out.println("Using a Pen :---");	
	}
}

class Pencil implements Writer
{
	@Override
	public void write() 
	{
		// TODO Auto-generated method stub
		System.out.println("Using a Pencil :---");
	}
}

class Kit
{
	public void doSomething(Writer p)
	{
		p.write();
	}
}

@FunctionalInterface //Functional Interface is possible if only one non default method exists
interface ABCD
{
	double pi=3.14; //variable inside interface becomes constant (final) by default
	static void test() //static method can be called without creating an object
	{
		System.out.println("Static Method");
	}
	void lol();
	default void show() //Default method enables defining methods in interfaces. (Only in higher versions of Java)
	{
		System.out.println("Demo of Default keyword");
	}
}

class Implementor implements ABCD
{
	@Override
	public void lol() 
	{
		// TODO Auto-generated method stub
		System.out.println("LOL");
		//pi=pi+1; Cannot be assigned
	}
}

interface Demo1
{
	default void display()
	{
		System.out.println("In Demo1");
	}
}

interface Demo2
{
	default void display()
	{
		System.out.println("In Demo2");
	}
}

class Demo implements Demo1, Demo2
{
	@Override //Either define self display method or override as shown
	public void display() {
		// TODO Auto-generated method stub
		Demo1.super.display();
		//Chooses display method of Demo1 interface thus resolving the multiple inheritance ambiguity 
	}
	
}

public class java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Ishan");
//		System.out.println("Lol");
//		
//		int a = 9889;
//		int b = 3883;
//		
//		//Typecasting
//		System.out.println((double)(a/b));
//		System.out.println((double)a/b);
//		double i = (double)a/b;
//		System.out.println(i);
//		
//		//Taking User Input
//		Scanner sc = new Scanner(System.in);
//		//Integer Input
//		System.out.println("Enter Age : ");
//		int age = sc.nextInt();
//		System.out.println(age);
//		//Float Input
//		System.out.println("Enter Height in cm : ");
//		float height = sc.nextFloat();
//		System.out.println(height);
//		
//		//String Input
//		sc.nextLine();
//		System.out.println("Enter name : ");
//		String name = sc.nextLine();
//		System.out.println(name);
		
//		//Objects and Classes
//		Calc obj=new Calc();
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter number 1 : ");
//		obj.num1=sc.nextInt();
//		System.out.println("Enter number 2 : ");
//		obj.num2=sc.nextInt();
//		obj.add();
//		Calc o=new Calc(10,10);
//		Calc ob=new Calc(9.5,8);
		
//		//Arrays
//		int nums[]=new int[4];
//		for(int i=0;i<4;i++)
//		{
//			System.out.println(nums[i]);
//		}
//		//Array of objects
//		Emp e1=new Emp();
//		Emp e2=new Emp();
//		Emp e3=new Emp();
//		Emp e4=new Emp();
//		Emp e[]= {e1,e2,e3,e4};
//		for(int i=0;i<4;i++)
//		{
//			e[i].show();
//		}
//		//2D Array
//		int a[]= {2,4,6,8};
//		int b[]= {1,3,5,7};
//		int c[]= {0,9,9,0};
//		int d[][]= {a,b,c};
//		for(int i=0;i<3;i++)
//		{
//			for(int j=0;j<4;j++)
//			{
//				System.out.println(d[i][j]);
//			}
//		}
//		//Jagged Array
//		int z[][]= {
//				{2,4,6,8},
//				{1,3,7},
//				{0}
//		};
//		for(int i=0;i<z.length;i++)
//		{
//			for(int j=0;j<z[i].length;j++)
//			{
//				System.out.print(z[i][j] + " ");
//			}
//			System.out.println();
//		}
//		
//		//Enhanced For Loop
//		int x[]= {10,100,1000};
//		for(int k : x)
//		{
//			System.out.print(k + " ");
//		}
//		System.out.println();
//		for(int k[] : z)
//		{
//			for(int l : k)
//			{
//				System.out.print(l + " ");
//			}
//			System.out.println();
//		}
		
//		//Variable length arguments
//		VarargsCalc obj = new VarargsCalc();
//		System.out.println(obj.add(1,2,3,400,5,100));
		
//		//Inheritance
//		calcveryadv obj=new calcveryadv();
//		System.out.println(obj.mul(10, 100));
//		System.out.println(obj.add(-10000, 1000));
		//Multiple Inheritance is not supported in Java directly
		
//		//Overiding in Inheritance, Super Method
//		//Example of Runtime Polymorphism
//		B obj=new B(1000);
//		obj.show();
		
//		//Encapsulation 
//		Students s=new Students();
//		s.setRollno(100);
//		System.out.println(s.getRollno());
		
//		//Wrapper Class
//		int i=5; //Primitive Datatype
//		Integer ii=new Integer(i);//Boxing or Wrapping
//		int j=ii.intValue();//Unboxing or Unwrapping
//		Integer value=i;//Autoboxing
//		int k=value;//Autounboxing
//		System.out.println(k);
//		
//		//Using parseInt from Integer class
//		String str="123";
//		int i1=Integer.parseInt(str);
//		System.out.println(i1);
		
		//final Keyword
		//final with variable - constant variable creation
		//final with class - makes a class uninheritable
		//final with method - makes a method unoveridable	
		
//		//Abstract Class 
//		Audi audi=new Audi();
//		audi.start();
		
//		//Interface - allows multiple inheritance feature
//		Kit k=new Kit();
//		Writer p=new Pen(); //Creating a reference of interface
//		Writer pc=new Pencil(); //Cannot create an object of interface
//		k.doSomething(pc);
//		k.doSomething(p);
		
//		//Creating object of Interface
//		//Objects of interface can't be created directly.
//		//Therefore another implementor class is required
//		ABCD obj=new Implementor();
//		obj.lol();
//		
//		//Anonymous Class
//		A obj=new A() {
//						public void show() {
//							System.out.println("Overiding A");
//						}
//		};
//		obj.show();
		//Can also be used for interfaces to create objects
		//of interface directly without implementor class
		
//		//Types of Interfaces
//		//1. Normal Interface - Multiple methods
//		//2. Single Abstract Method Interface - Single Method. Also called Functional Interface --> Lambda Expression
//		//3. Marker Interface - No method
//		//Creating object of interface in single line using Lambda Expression :-
//		ABCD obj=() -> System.out.println("Lambda");
//		obj.lol();
		
//		//Default keyword (See Interface and Class)
//		ABCD ob=new Implementor();
//		ob.lol();
//		ob.show();
		
//		//Multiple Inheritance using Interface
//		Demo obj=new Demo();
//		obj.display();
		
//		//static and final in interface
//		//static method in an interface can be called without creating an object of interface
//		ABCD.test();
//		//variable defined in an interface is final by default
//		System.out.println(ABCD.pi);
		
	}

}
