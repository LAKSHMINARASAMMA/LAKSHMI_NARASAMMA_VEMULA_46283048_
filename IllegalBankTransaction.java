package Objectoriented;

import java.util.Scanner;

public class IllegalBankTransaction extends Exception{
	public IllegalBankTransaction(String str) {
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double balance=sc.nextDouble();
		double withdraw=sc.nextDouble();
		
		
		try {
			if(balance<=0) {
				System.out.println("Please check your balance:");
				
			}
			else {
				System.out.println("Your balance is:"+(balance-withdraw));
				throw new IllegalBankTransaction("msg");
			}
		}catch(IllegalBankTransaction e) {
			System.out.println(e);
		}
		

	}

}
