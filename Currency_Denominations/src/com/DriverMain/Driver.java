package com.DriverMain;

import java.util.Arrays;
import java.util.Scanner;
import com.MergeSorting.MergeSort;
import com.NotesCount.NotesCount;

	public class Driver {

		public static void main(String args[] ) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of denominations used");
			int num = sc.nextInt();
			int arr[] = new int[num];
			System.out.println("Enter the denomination values");
			for(int i=0;i<num;i++) {
				arr[i]=sc.nextInt();
			}
			MergeSort merge= new MergeSort();
			merge.sort(arr, 0, num-1);
			
			System.out.println("enter the amount to pay");
			int payment=sc.nextInt();
			System.out.println("Your Payment approach in order to give Minimum Number of Notes : ");
			NotesCount count = new NotesCount();
			count.countDenominations(arr, payment);
			sc.close();
		}
	}


