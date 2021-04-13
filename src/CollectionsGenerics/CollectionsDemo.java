package CollectionsGenerics;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

class Stud implements Comparable<Stud>
{
	int rollno;
	String name;
	int marks;
	public Stud(int rollno, String name, int marks) 
	{
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	public String print()
	{
		return "Stud ["+rollno+" "+name+" "+marks+"] ";
	}
	public int compareTo(Stud s)
	{
		return rollno>s.rollno?1:-1;
	}
}

public class CollectionsDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
//		//Collection is an interface
//		//Collection(Interface) -> List(Interface) -> ArrayList(Class)
//		Collection values=new ArrayList();
//		values.add(4);
//		values.add(69);
//		values.add(96);
//		System.out.println(values);//Prints whole arraylist
//		//Iterator since indexing doesnt work with collections
//		Iterator it = values.iterator();
//		//Iterating elements one by one
//		while(it.hasNext())//If next element is present
//		{
//			System.out.println(it.next());
//		}
//		//Elements can't be inserted in between
//		//Therefore referencing List
//		List lol=new ArrayList();
//		lol.add(4); //4 belongs to Integer. Object of Integer (Wrapper Class)
//		lol.add(69);
//		lol.add(96);
//		lol.add(2,0);//Inserted 0 to index 2
		
//		//Iterating with indexes is possible
//		for(int i=0;i<lol.size();i++)
//		{
//			System.out.println(lol.get(i));
//		}
		
//		//We can insert string, float etc to same List
		
//		//Using enhanced for loop since elements inside list are stored in form of objects
//		for(Object o : lol)
//		{
//			System.out.println(o);
//		}
		
//		//Generics - only specific data types allowed
//		List<Integer> lol=new ArrayList<Integer>();
//		lol.add(40); //4 belongs to Integer. Object of Integer (Wrapper Class)
//		lol.add(69);
//		lol.add(36);
//		lol.add(21);
//		for(Integer o : lol)
//		{
//			System.out.println(o);
//		}
//		//Methods from Collections class
//		Collections.sort(lol);
//		System.out.println(lol);
//		Collections.reverse(lol);
//		System.out.println(lol);
//		Collections.shuffle(lol);
//		System.out.println(lol);
		
//		//Sort using Comparator
//		Comparator<Integer> c=new Comparator<Integer>()
//				{
//				public int compare(Integer i,Integer j)
//				{
//					return i%10>j%10?1:-1;
//				}};
//		Collections.sort(lol,c); //Sort using units place
//		System.out.println(lol);
//		//Using Lambda expression and in decreasing order:-
//		Comparator<Integer> c=(i,j) -> i%10<j%10?1:-1;
//		Collections.sort(lol,c); //Sort using units place in decreasing order
//		System.out.println(lol);
		
		//Custom Comparator for User Defined class objects
		List<Stud> list=new ArrayList<Stud>();
		list.add(new Stud(3400,"Ishan Sarkar",69));
		list.add(new Stud(3388,"Hrithik Raina",96));
		list.add(new Stud(3401,"Ayush Goel",100));
		for(Stud s : list)
		{
			System.out.println(s.print());
		}
		//Sorting by rollno of students - Comparable interface used above
		System.out.println();
		Collections.sort(list);
		for(Stud s : list)
		{
			System.out.println(s.print());
		}
		
		
		
	}

}
