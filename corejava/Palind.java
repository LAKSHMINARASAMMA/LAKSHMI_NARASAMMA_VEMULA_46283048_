package com.corejava;
import java.util.*; 
public class  Palind{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num , reversedNum = 0, remainder;
	    num=sc.nextInt();
	    // store the number to originalNum
	    int originalNum = num;
	    
	    // get the reverse of originalNum
	    // store it in variable
	    while (num != 0) {
	      remainder = num % 10;
	      reversedNum = reversedNum*10  + remainder;
	      num /= 10;
	    }
	    //System.out.println(reversedNum);
	    // check if reversedNum and originalNum are equal
	    if (originalNum == reversedNum) {
	      System.out.println(originalNum + " is Palindrome.");
	    }
	    else {
	      System.out.println(originalNum + " is not Palindrome.");
	    }
	  }
	}