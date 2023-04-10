package com.corejava;
import java.util.*;
public class Squareandcube {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a  number : ");
		int n=sc.nextInt();
		while(n>0) {
			 n = n;
		}
		if(n%2==0) {
			System.out.println("Squares of a number: "+(n*n));
		}else {
			System.out.println("Cubes of a number: "+(n*n*n));
		}
	}
}
