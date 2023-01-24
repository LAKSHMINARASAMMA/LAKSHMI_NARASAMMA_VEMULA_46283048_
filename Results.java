package Default;

import java.util.Scanner;

public class Results {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three subjects marks: ");
		int m,p,c;
		System.out.println("Enter maths marks: ");
		m=sc.nextInt();
		System.out.println("Enter physics marks: ");
		p=sc.nextInt();
		System.out.println("Enter chemistry marks: ");
		c=sc.nextInt();
		
		if(m>60 && p>60 && c>60) {
			System.out.println("PASS");
		}else if(m>60 && p>60 || c>60) {
			System.out.println("Promoted");
		}
		else{
			System.out.println("Failed");
		}

	}
 
}
