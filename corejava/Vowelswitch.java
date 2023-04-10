package com.corejava;

import java.util.Scanner;

public class Vowelswitch {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char ch = sc.next().charAt(0);
		switch(ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("The given character is vowel: "+ch);
			break;
		default:
			System.out.println("The given character is consonent: "+ch);
		
			
		}
	}
}
