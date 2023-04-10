package com.corejava;

import java.util.Arrays;
public class MinOfArray {
	public int[] findTheMin(int[] a,int[] b,int[] c)
	{
	Arrays.sort(a);
	Arrays.sort(b);
	
	Arrays.sort(c);
	int Min_absoluteSum = Integer.MAX_VALUE;
	int[] minArray = new int[3];
	int i=0,j=0,k=0,absolute_sum=0;
	int MinOutOfTheThree;
	while(i<a.length && j<b.length && k<c.length){
		if(absolute_sum < Min_absoluteSum){
			absolute_sum = Math.abs(a[i]-b[j]) + Math.abs(b[j]-c[k]) + Math.abs(c[k]-a[i]);
			if(absolute_sum < Min_absoluteSum){
				Min_absoluteSum = absolute_sum;minArray[0] = a[i];minArray[1] = b[j];
				minArray[2] = c[k];
				}
			}MinOutOfTheThree = a[i];
				//Here we increment the index of the array containing the element with the smallest value
				if(MinOutOfTheThree > b[j]){
					MinOutOfTheThree = b[j];
					j++;
				} else if(MinOutOfTheThree > c[k]){
					MinOutOfTheThree = c[k];
					k++;
					} else {
						i++;
						}
				}return minArray;
				}

}
