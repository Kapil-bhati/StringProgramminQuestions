package com.string.programs;

import java.util.Scanner;

public class Demo_FabonacciSeries {

	public static void main(String[] args) {
		int temp,a=0,b=1,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter temp value :");
		temp=sc.nextInt();
		for(int i=1;i<=temp;i++)
		{
			System.out.println(a+ " ");
			c=a+b;
			a=b;
			b=c;
			
			
		}

	}

}
