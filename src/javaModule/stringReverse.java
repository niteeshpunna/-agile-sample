package javaModule;

import java.util.Scanner;

public class stringReverse {
	
	//creating a method for reversing a string
	public String strRev(String str) {
		
		//creating a empty string to store the chars 
		String revString = "";
		
		for(int i=0; i<str.length(); i++) {
			revString = str.charAt(i)+revString;
		}
		return revString;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String string= sc.nextLine();
		
		//Creating a object for the class to access strRev method
		stringReverse myObj = new stringReverse();
		
		
			System.out.println(myObj.strRev(string));
	}
}
