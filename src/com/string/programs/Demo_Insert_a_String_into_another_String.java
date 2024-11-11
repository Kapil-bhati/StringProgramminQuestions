package com.string.programs;

public class Demo_Insert_a_String_into_another_String
{
public static void insertString(String fstring,String endstring,int index)
{
	String result = new String();
	for(int i=0;i<fstring.length();i++)
	{
	        result=result+fstring.charAt(i);
	        if(i==index)
	        {
	        	result=result+endstring;
	        }
	}
    System.out.println(result);
	
}
	public static void main(String[] args) 
	{
      String fstring="Kapil Bhati";
      String endstring="Gujjar";
      int index=4;
      System.out.println("The first string is defined as: " + fstring);
      System.out.println("The second string is defined as: " + endstring);
      System.out.println("String to be inserted at index: " + index);
      System.out.println("The result is: ");
      insertString(fstring, endstring, index);
    		  
	}
}