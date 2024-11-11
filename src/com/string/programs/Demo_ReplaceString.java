package com.string.programs;

import java.util.HashMap;
import java.util.Map;

public class Demo_ReplaceString {

	public static void main(String[] args) {
		/*String oldStr="Kapil";
		String newStr="Gujjar";
		String newStr1 = oldStr.replace(oldStr, newStr);
		System.out.println(newStr1);*/

		String str="My My name is is kapil kapil";
		
		Map<String, Integer> hs=new HashMap<String, Integer>();
		Integer count=1;
		//System.out.println(str.length());
		String[] words = str.split(" ");
		for(int i=0;i<words.length;i++)
		{
			if(!hs.containsKey(words[i]))
			{
				hs.put(words[i], count);
			}else
			{
				hs.put(words[i],hs.get(words[i])+1);
			}
			
		}
		for(String x : hs.keySet())
		{
			System.out.println("The count of word :"+x+ " = "+hs.get(x));
		}

	}

}

