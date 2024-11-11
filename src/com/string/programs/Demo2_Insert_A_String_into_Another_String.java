package com.string.programs;

public class Demo2_Insert_A_String_into_Another_String 
{
	public static void main(String[] args) 
	{
		    String str1="Kapil Gujjar";
			String str2="Bhati";
			int index=5;
			String result=new String();
			for(int i=0;i<str1.length();i++)
			{
				result=result+str1.charAt(i);
				if(i==index)
				{
					result=result+str2;
				}
		              
			}
			System.out.println(result);
			
  }

}
