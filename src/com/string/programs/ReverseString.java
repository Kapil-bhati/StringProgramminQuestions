package com.string.programs;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		/*String str="kapil Bhati";
		String rev = " "; 
		for(int i=str.length()-1; i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);*/
		
	//	String str="abba";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String :");
		String org_String=sc.next();
		String rev="";
		for(int i=org_String.length()-1;i>=0;i--)
		{
			rev=rev+org_String.charAt(i);
		}
		System.out.println(rev);
		if(rev.equals(org_String))
		{
			System.out.println("String is Palindeome");
		}
		else
		{
			System.out.println("String is not Palindeome");
		}
	}

}
