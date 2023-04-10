package com.corejava;

import java.util.ArrayList;

public class ArrayListSearch {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Lakshmi");
		arr.add("Minnu");
		arr.add("Saritha");
		if(arr.contains("Lakshmi")) {
			System.out.println("Lakshmi is present in arraylist:");
		}else {
			System.out.println("Lakshmi is not present in arraylist:");
		}
		
	}

}
