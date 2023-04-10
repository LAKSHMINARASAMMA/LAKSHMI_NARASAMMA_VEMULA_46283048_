package com.corejava;
import java.util.*;
public class ArrayEvenPosition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elements in array:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			if(i%2==0) {
				System.out.println("Even positions in a array : "+arr[i]);
			}
		}
		for(int i=0;i<n;i+=2) {
			System.out.println("Even positions in array : "+arr[i]);
			
		}
	}

}
