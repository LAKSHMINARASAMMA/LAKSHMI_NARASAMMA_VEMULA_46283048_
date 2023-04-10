package com.corejava;
import java.lang.*;
public class Reverse {
	public static void main(String[] args) {
		String str="Lakshmi";
		StringBuffer s = new StringBuffer(str);
		s.reverse();
		System.out.println(s);
		
		
		StringBuilder s1 = new StringBuilder(s);
		s1.reverse();
		System.out.println(s1);
		}

}
