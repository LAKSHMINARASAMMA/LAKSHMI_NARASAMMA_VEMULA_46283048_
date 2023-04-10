package com.corejava;
import java.util.*;
public class Fib {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=0,b=1,c=1;
		System.out.println(a);
		System.out.println(b);
		System.out.println("Enter no of  nos");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			a=b;
			b=c;
			c=a+b;
		    System.out.println(a);
		
		}
	}

}
