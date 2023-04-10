package com.corejava;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
  public static void main (String [] args) {
//   int [] array = {45,12,85,32,89,39,69,44,42,1,6,8};
	  Scanner sc = new Scanner(System.in);
	int[] array = new int[5];
	for(int i=0;i<array.length;i++)
		array[i]=sc.nextInt();
   //Arrays.sort(array);
	Arrays.sort(array);
   for (int i = 0; i < array.length; i++) {
   System.out.println(" array:" +array[i]);
   }
   
   
   for (int i = 0; i < array.length; i++)   
   {  
   for (int j = i + 1; j < array.length; j++)   
   {  
   int tmp;  
   if (array[i] > array[j])   
   {  
   tmp = array[i];  
   array[i] = array[j];  
   array[j] = tmp;  
   }  
   }  
   //prints the sorted element of the array  
   System.out.println(array[i]);  
   } 

  }
}









//import java.util.Collections;
//import java.util.Scanner;
//
//public class Array {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int[] intArray = {52, 45, 32, 64, 12, 87, 78, 98, 23, 7}; 
//		 
//        System.out.printf("Original Array : %s", Arrays.toString(intArray)); 
 
//        Arrays.sort(intArray, Collections.reverseOrder()); 
//        Arrays.sort(intArray); 
 
//        System.out.printf("\n\nSorted Array : %s", Arrays.toString(intArray)); 
		
		
		
//		int[] a = new int[5];
//		for(int i=0;i<a.length;i++) {
//			a[i]=sc.nextInt();
////			System.out.println("array index "+(a[i]));
//		}
//		Arrays.sort(a);  