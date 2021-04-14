package com.class06;
import java.util.Scanner;
public class recap {

	public static void main(String[] args) {
		
		String str = "Hello";
		String str1 = "hello";
		
		boolean yesOrNo = str.equals(str1);  //false
		System.out.println(yesOrNo);
		
		boolean yesOrNo1 = str.equalsIgnoreCase(str1); //true
		System.out.println(yesOrNo1);
	}

}
