package CollectionsGenerics;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) 
	{
//		// TODO Auto-generated method stub
//		Set<Integer> s=new HashSet<>();
//		s.add(20);
//		s.add(9);
//		s.add(0);
//		s.add(20);
//		for(Integer i : s)
//		{
//			System.out.println(i);
//		}//Prints random order due to hashing
//		
		//For printing in order:-
		Set<Integer> s=new TreeSet<>();
		s.add(20);
		s.add(9);
		s.add(0);
		s.add(20);
		for(Integer i : s)
		{
			System.out.println(i);
		}

	}

}
