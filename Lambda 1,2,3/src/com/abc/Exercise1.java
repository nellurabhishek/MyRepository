package com.abc;


@FunctionalInterface
interface Exer{
   int a(int x,int y);
}
public class Exercise1 {
	
	Exer a=(x,y)->{
		return(int)(Math.pow(x,y));};
		public static void main(String[]args)
		{
			Exer i=(x,y)->
			{
				return(int)(Math.pow(x,y));
			};
			System.out.println(i.a(5,6));
				
			
	}

}
