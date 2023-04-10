package com.corejava;
import java.util.*;
public class Loewertoupperstring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String str = sc.nextLine();
		System.out.println("Convert lower to upper case characters in string : "+(str.toUpperCase()));
		System.out.println("Convert upper case to lower case characters in string : "+(str.toLowerCase()));
		char[] ch = new char[str.length()];
		for(int i=0;i<str.length();i++) {
			ch[i]=str.charAt(i);
			if(ch[i]>='a' && ch[i]<='z') {
				System.out.println(Character.isUpperCase(ch[i]));
			}else {
				System.out.println(Character.isLowerCase(ch[i]));
			}
		}
	}

}
