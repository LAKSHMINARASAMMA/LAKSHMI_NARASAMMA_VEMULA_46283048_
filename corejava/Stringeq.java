package com.corejava;
import java.util.*;
public class Stringeq {
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter first string: ");
		String s1 = sc.nextLine(),s3="";
		System.out.println("Enter second string");
		String s2 = sc.nextLine();
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.replace("a", ""));
		for(int i=s1.length()-1;i>=0;i--) {
			s3=s3+s1.charAt(i);
			
		}
		System.out.println(s3);
		if(s1.equals(s3)) {
			System.out.println("Palindrom");
		}else {
			System.out.println("Not palindrom");
		}
	}
}
