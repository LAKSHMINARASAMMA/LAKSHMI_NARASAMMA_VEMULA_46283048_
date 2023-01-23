package Exceptionhandlingtext;
import java.util.*;
public class Arithmaticexception {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int n1, n2,n3;
			System.out.println("Enter divisor: ");
			n1=sc.nextInt();
			System.out.println("Enter dividend: ");
			n2=sc.nextInt();
		try {
			if(n2!=n1) {
				n3 = n1/n2;
				System.out.println("n1 is divided by n2 = "+n3);
			}else {
				System.out.println("n1 is not divided by n2");
			}
			
		}catch(ArithmeticException e ) {
			System.out.println(e);
		}

	}

}