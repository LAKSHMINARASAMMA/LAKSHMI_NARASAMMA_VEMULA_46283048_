package com.corejava;

import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
//		int a=0,b=1;
		int temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value:");
		int a=sc.nextInt();
		System.out.println("Enter b value: ");
		int b=sc.nextInt();
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping : "+a+" "+b);
	}

}
