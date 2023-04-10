package com.corejava;
import java.util.*;
public class Leapyear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any year: ");
		int year=sc.nextInt();
		if(year%4 == 0 || year%400 == 0 ) {
			if(year%100!=0) {
				System.out.println("leap year:");
			}
		}else {
			System.out.println("non leap year");
		}
	}

}
