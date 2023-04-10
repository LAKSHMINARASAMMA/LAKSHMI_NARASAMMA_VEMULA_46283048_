package com.corejava;
import java.util.*;
public class Fact {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact = fact * i;
//			System.out.println("Factorial of number: "+(fact*i));
			System.out.println("multiplication table: "+i*n);
		}
		System.out.println("Factorial of a number:"+fact);
	}
}
