package javaModule;

import java.util.Scanner;

public class exceptions {
	
	
	public static void main(String[] args) {
		
		String str =null;
		try {
			
				System.out.println("Length of the string: "+ str.length());
			
		}catch(NullPointerException e) {
			System.out.println("Null point Exception Occured: "+e.getMessage());
		}	
		System.out.println("NullPointerException handled successfully");
	}
}
