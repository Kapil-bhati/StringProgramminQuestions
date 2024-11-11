package com.string.programs;

public class Demo_EvenlengthWordsInAString {

	public static void main(String[] args) {
		String str="I Love my indiaa";
		String[] words = str.split(" ");
		for(String word :words)
		{
			//int len=word.length();
			if(word.length() % 2==0)
			{
				System.out.println(word);
			}
		}
		

	}

}
