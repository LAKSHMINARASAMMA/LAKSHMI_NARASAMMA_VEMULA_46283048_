package com.corejava;
import java.util.*;
public class Spaynumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0,product=1,lastdigit,n;
		System.out.println("enter a number: ");
		n=sc.nextInt();
		while(n>0) {
			lastdigit=n%10;
			sum=sum+lastdigit;
			product=product*lastdigit;
			n=n/10;
	}
		if(product==sum) {
			System.out.println("Given number is spy number: "+sum);
		}else {
			System.out.println("Given number is not a spy number : "+sum);
		}
	}

}
