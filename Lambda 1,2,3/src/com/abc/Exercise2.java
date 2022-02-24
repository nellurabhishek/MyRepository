package com.abc;

public class Exercise2 {
	public static void main(String []args)
	{
		StringBuffer sb =new StringBuffer();
		Exercise2Driver k=(str)->
		{
			for(int i=0;i<str.length();i++)
			{
				sb.append(str.charAt(i)+" ");
			}
			return sb;
		};
		StringBuffer str2=k.CG("Abhi");
		System.out.println(str2);
	}

}
interface Exercise2Driver
{
	public StringBuffer CG(String str);
}