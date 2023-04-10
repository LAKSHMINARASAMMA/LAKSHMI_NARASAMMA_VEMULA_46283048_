package com.corejava;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
		int sum=0,r,n1=n;
		while(n!=0) {
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		if(sum==n1) {
		System.out.println("Given number is Armstrong: "+sum);
	}
		else {
			System.out.println("Given number is not armstrong: "+sum);
		}
	}

}
