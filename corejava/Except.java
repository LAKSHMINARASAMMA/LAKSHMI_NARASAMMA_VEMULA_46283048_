package com.corejava;

import java.util.Scanner;

public class Except {
	public static void main(String[] args) throws Exception {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		a=sc.nextInt();
		System.out.println("Enter b value: ");
		b=sc.nextInt();
		try {
			System.out.println(a/b);
		}catch(ArithmeticException e){
			System.out.println("Exception");
		}
	}

}
