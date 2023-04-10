package com.corejava;
import java.util.*;
public class Arrayeven {
	public static void main(String[] args) {
		int n,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n value: ");
		n=sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elements in array: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println("Reverse of array : "+arr[i]);
		}
		for( int i=0;i<n;i++) {
			sum = sum +arr[i];
		}
		System.out.println("Sum of elements in array : "+ sum);
	}

}
