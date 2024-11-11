package com.string.programs;

public class Demo3_Insert_A_String_into_Another_String {

	public static void main(String[] args) {
		 String str1="Kapil Gujjar";
			String str2="Bhati";
			int index=5;
			StringBuffer sb=new StringBuffer(str1);
		StringBuffer strnew = sb.insert(index,str2);
			
			System.out.println(strnew);

	}

}
