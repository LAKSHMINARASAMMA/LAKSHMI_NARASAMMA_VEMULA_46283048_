package com.corejava;

public class Concat {
	public static void main(String args[]) {
		String s1="java string";    
		// The string s1 does not get changed, even though it is invoking the method      
		// concat(), as it is immutable. Therefore, the explicit assignment is required here.  
		s1.concat(" is immutable");    
		System.out.println(s1);    
		s1=s1.concat(" is immutable so assign it explicitly");    
		System.out.println(s1);    
		String s2="Concatenation";
		System.out.println(s1+" "+s2);
		System.out.println(s2.toString());
		System.out.println(StringFormatter.reverseString("my name is khan"));
		System.out.println(StringFormatter.reverseString("I am sonoo jaiswal"));
		
		}    
	}
class StringFormatter {  
public static String reverseString(String str){  
    StringBuilder sb=new StringBuilder(str);  
    sb.reverse();  
    return sb.toString();  
}  
}  