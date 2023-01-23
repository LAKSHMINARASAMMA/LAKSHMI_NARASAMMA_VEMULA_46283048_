package Stringsjava;

public class JavaStrings {

	public static void main(String[] args) {
		
		String str="Java String pool refers to collection of String which are stored in heap memory";
		String str1="java string pool refers to collection of string which are stored in heap memory";
		
		System.out.println("Given string converted into loewer case: "+(str.toLowerCase())+"\n");
		System.out.println("Given string converted into upper case: "+(str.toUpperCase())+"\n");
		System.out.println("Replace to a to $ in a given string : "+(str.replace('a','$'))+"\n");
		System.out.println("Given String contain collection are not : "+(str.contains("collection")));
		System.out.println("Given string and new string are matched are not : "+(str==str1));
		System.out.println("Given string and new string are matched are not : "+(str.equals(str1)));
	}

}
