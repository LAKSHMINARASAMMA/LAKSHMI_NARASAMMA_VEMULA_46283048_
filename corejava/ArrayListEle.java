package com.corejava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListEle {
	public static void main(String[] args) {
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("Lakshmi");
		arr.add("Nandu");
		arr.add("Radhika");
		arr.add("Hemalatha");
		arr.add("Manasa");
		System.out.println("Before ArrayList:");
		System.out.println(arr);
	    Collections.reverse(arr);
	    System.out.println("Reverse of Arraylist:\n"+arr);
				
		
	}

}
