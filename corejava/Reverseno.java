package com.corejava;
import java.util.*;
public class Reverseno {
	public static void main(String[] args) {
		int n,r,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter a number: ");
		n=sc.nextInt();
		while(n!=0) {
			r = n%10;
			sum = sum * 10 + r;
			n = n/10;
		}
		System.out.println("Reverse of number: "+sum);
	}

}
