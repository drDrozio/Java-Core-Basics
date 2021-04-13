package CollectionsGenerics;

import java.util.Map;
import java.util.HashMap;
import java.util.HashMap;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Map<String,String> map=new HashMap<>();
		map.put("Parth", "Developer");
		map.put("Ayush", "Accounts");
		map.put("Ishan", "Manager");
		
		Set<String> key=map.keySet();
		for(String k : key)
		{
			System.out.println(k + " : "+map.get(k));
		}
	}

}
