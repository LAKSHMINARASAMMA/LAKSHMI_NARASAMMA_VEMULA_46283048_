package com.corejava;
import java.util.*;
public class Abslt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k=0;
		System.out.println("Enter n value: ");
		int n=sc.nextInt();
		int[] a1=new int[n];
		int[] a2=new int[n];
		int[] a3=new int[n];
		System.out.println("Enter first array elements: ");
		for(int i=0;i<n;i++) {
			a1[i]=sc.nextInt();
		}
		System.out.println("Enter second array elements: ");
		for(int i=0;i<n;i++) {
			a2[i]=sc.nextInt();
		}
		System.out.println("Enter third array elements: ");
		for(int i=0;i<n;i++) {
			a3[i]=sc.nextInt();
		}
		
		System.out.println("Enter a value: ");
		int a=sc.nextInt();
		System.out.println("Enter b value: ");
		int b=sc.nextInt();
		System.out.println("Enter c value: ");
		int c=sc.nextInt();
		int a1len=a1.length, a2len=a2.length, a3len=a3.length;
		int[] array=new int[a1len+a2len+a3len];
		int min=array[0];
		Arrays.sort(array);
		for(int i=0;i<array.length;i++,k++) {
			array[k]=a1[i];
		}
		for(int i=0;i<array.length;i++,k++) {
			array[k]=a2[i];
		}
		for(int i=0;i<array.length;i++,k++) {
			array[k]=a3[i];
		}
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
//		for(int i=0;i<n;i++) {
//			if(array[i]==a) {
//				if(array[i]==b) {
//					if(array[i]==c) {
//						if(array[i]<min) {
//							System.out.println(Math.abs(a-b)+Math.abs(b-c)+Math.abs(c-a));
////						System.out.println(res);
//				}
//			}
//		  }
//		}
//	}
}
}
			
