package com.Transation;

public class Transation {
		public int IsTargetAchieved(int[] array, int target) {
			int status = -1;
			long sum = 0;
			for(int i=0;i<array.length;i++) {
				sum+=array[i];
				if(sum>=target) {
					status=i+1;
					break;
				}	
			}
			return status;
		}
	}

