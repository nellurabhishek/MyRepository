package lab6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Exercise1 
{
	private static List getValues(Map<Integer, Integer> values)
	{
		List<Integer> valueList=new ArrayList<>(values.values());
		Collections.sort(valueList);
		 
		
		
		
		return valueList; 
		
	}
	
	public static void main(String args[])
	{
		Map<Integer,Integer> values=new HashMap<>();
		values.put(1,20);
		values.put(2,12);
		values.put(3, 16);
		List<Integer> ans=getValues(values);
		Iterator<Integer> i=ans.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

	 
}
