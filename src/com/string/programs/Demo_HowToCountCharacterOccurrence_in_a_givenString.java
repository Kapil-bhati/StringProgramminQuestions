package com.string.programs;

public class Demo_HowToCountCharacterOccurrence_in_a_givenString {

	public static void main(String[] args) {
		
		String str="My My name is is kapil kapil";
				
		int result=str.length()-str.replaceAll("a", "").length();
		System.out.println(result);
	
	}

}
