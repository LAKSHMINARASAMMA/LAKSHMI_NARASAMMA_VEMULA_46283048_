package com.corejava;
import java.util.*;
public class Stringextractchar {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a string value: ");
	      String str = sc.nextLine();
	      char charArray[] = str.toCharArray();
	      Arrays.sort(charArray);
	      System.out.println(charArray);
//	      System.out.println(new String(charArray));
	   }
	}