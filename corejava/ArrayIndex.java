package com.corejava;

import java.util.Scanner;

public class ArrayIndex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr=new int[5];
		System.out.println("Enter n value: ");
		int n=sc.nextInt();
		System.out.println("enter array elemts: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter search element :");
		int ele=sc.nextInt();
		int index=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==ele) {
				index = i;
				System.out.println("Array of given element present in array: "+ele+" with index "+index);
			}
		}
		
	}

}
