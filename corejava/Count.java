package com.corejava;
import java.util.*;
public class Count {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
//		String str = sc.nextLine();
		String str="Lakshmi Devisri";
		int cnt=1;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) != ' ')
				cnt++;
		}
		System.out.println(cnt );
		
	}

}
