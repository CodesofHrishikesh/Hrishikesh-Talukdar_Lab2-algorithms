package com.Driver;

import java.util.Scanner;

import com.Transation.Transation;

       public class DriverMain {

			public static void main(String[] args) {
		
			Transation transaction= new Transation();
			int transactionArray[];
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size of transaction array");
			int size = sc.nextInt();
			transactionArray = new int[size];
			for(int i=0;i<size;i++) {
				System.out.println("Enter the value of transation array "+(i+1));
				transactionArray[i]=sc.nextInt();
			}
			
			System.out.println("Enter the number of targets to be achieved");
			int noOfTargets = sc.nextInt();
			for(int j=0;j<noOfTargets;j++) {
				System.out.println("Enter the value of Target");
				int target=sc.nextInt();
				int transactionNumber=transaction.IsTargetAchieved(transactionArray, target);
				if(transactionNumber==-1) {
					System.out.println("Target not achieved");
				}
				else {
					System.out.println("Target achieved at "+transactionNumber+" transaction");
				     }
			    } 
		
		    }
	}


