package com.corejava;

public class Sampl {
	
	public static void main(String[] args) {
		String str = "Sachin tendulkar";
		char chars[] = str.toCharArray();
		for(int i=chars.length-1;i>=0;i--) {
			System.out.println(chars[i]);
		}
	}
}
