package com.corejava;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Arrayrev {
	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
	}
		
	}

}


//public class Main {   
//    public static void reverse(Integer[] arr) {
//        Collections.reverse(Arrays.asList(arr));
//        System.out.println(Arrays.asList(arr));
//    }   
//    public static void main(String[] args) {
//        Integer[] arr = {1,2,3,4,5};
//        reverse(arr);
//    }
//}
