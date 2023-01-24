package Default;

import java.util.Scanner;

public class Totalandavg_marks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three subjects marks: ");
		int a,b,c,total;
		float avg;
		System.out.println("Enter a marks: ");
		a=sc.nextInt();
		System.out.println("Enter b marks: ");
		b=sc.nextInt();
		System.out.println("Enter c marks: ");
		c=sc.nextInt();
		total = a + b + c;
		avg = total / 3;
		System.out.println("Total marks :"+total);
		System.out.println("Average marks :"+avg);
	}
}
		
		