package com.corejava;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayfirstlastswap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n=sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int temp;
		temp=arr[0];
		arr[0]=arr[n-1];
		arr[n-1]=temp;
		System.out.println("After swapping : "+Arrays.toString(arr));
//		for(int i=0;i<n;i++) {
//		  System.out.println("after swaping :"+arr[i]);
//	}
	}
}
