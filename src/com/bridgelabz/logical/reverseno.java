package com.bridgelabz.logical;

import java.util.Scanner;

public class reverseno{
     public static void main(String[] args) {
    	 int remainder, reverse=0;
    	 try (Scanner sc= new Scanner(System.in)) {
			System.out.println("enter a number:");
			int n = sc.nextInt();
			while(n!=0) {
			remainder = n % 10;
			reverse = reverse * 10 + remainder;
			n /= 10;
			
			}
			System.out.println("reverse number " +reverse);
		}
     }    
}




