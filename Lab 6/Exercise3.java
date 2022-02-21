package lab6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Exercise3 {

	private static Map<Integer, Integer> getSquares(List<Integer> arr) 
	{
		Map<Integer,Integer> ans=new TreeMap<>();
		 Iterator<Integer> i=arr.iterator();
		 while(i.hasNext())
		 {
			 Integer num=i.next();
			 ans.put(num, num*num);
		 }
		 return ans;
	}
	public static void main(String[] args) 
	{
		 List<Integer> list=new ArrayList<>();
		 list.add(10);
		 list.add(20);
		 list.add(30);
		 Map<Integer,Integer>ans=getSquares(list);
		 System.out.println(ans);
	}

}
