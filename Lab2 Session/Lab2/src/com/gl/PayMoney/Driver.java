package com.gl.PayMoney;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter the size of transactions");
				
		int size = scan.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("enter the values of array");
		
		 for(int i=0;i<arr.length;i++)
			 
			 arr[i]	= scan.nextInt();
		
		System.out.println("Enter the total no of targets to be achieved");
		
		int targetNo= scan.nextInt();
		
		while(targetNo-->0) {
			boolean achieved = false;
			long target;
			System.out.println("enter the value of target");
			target = scan.nextLong();
			
			long sum =0;
			
			for(int i=0;i<size;i++) {
				sum+=arr[i];
			
			if(sum>=target) {
				System.out.println("Target achieved after " + (i+1) + "transactions");
				achieved = true;
				break;
			}
		}
			if(!achieved) {
				System.out.println("Given target is not achieved");
				
			}
			
			
		}
		
		scan.close();
	}
	
}
	

