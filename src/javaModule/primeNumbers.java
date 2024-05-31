package javaModule;

import java.util.Scanner;

public class primeNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting number: ");
		int start = sc.nextInt();
		System.out.println("Enter ending number: ");
		int end = sc.nextInt();
		
		for(int i=1; i<=end; i++) {
			boolean isPrime = true;
			for(int j=2; j<=i/2; j++)
			{
				if(i%j == 0) {
					isPrime =false;
					break;
				}
			}
			if(isPrime) {
				System.out.print(i+" ");
			}
		}
	}
}
