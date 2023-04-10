package com.corejava;
import java.util.*;
public class Studentmarks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks : ");
		int marks = sc.nextInt();
		
		if(marks>90) {
			System.out.println("A");
		}
		else if(marks<90 || marks>=80) {
			System.out.println("B");
		}
		else if(marks<80 || marks>=70) {
			System.out.println("c");
		}else{
			System.out.println("Failed");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
