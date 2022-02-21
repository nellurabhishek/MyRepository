package lab6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Exercise4 
{
	private static Map<Integer, String> getStudents(Map<Integer, Integer> student) 
	{
		  Map<Integer,String> ans=new HashMap<>();
		  Set<Map.Entry<Integer,Integer>> set=student.entrySet();
		  Iterator<Map.Entry<Integer,Integer>> i=set.iterator();
		  while(i.hasNext())
		  {
			  Map.Entry<Integer,Integer> entry=i.next();
			  Integer k=entry.getKey();
			  Integer v=entry.getValue();
			  String medal = null;
			  if(v>=90)
			   medal="Gold";
			  else if(v<90 && v>=80)
				  medal="Silver";
			  else if(v<80 && v>=70)
				  medal="Bronze";
			  ans.put(k,medal);
		  }
		  return ans;
	}
	public static void main(String[] args) 
	{
		Map<Integer,Integer> student=new LinkedHashMap<>();
		student.put(101,90);
		student.put(103,70);
		student.put(104,85);
		student.put(105,92);
		Map<Integer,String>ans=getStudents(student);
		System.out.println(ans);
	}

}
