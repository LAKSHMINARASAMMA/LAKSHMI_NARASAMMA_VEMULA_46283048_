package Objectoriented;
import java.util.*;
public class Bank {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enetr your account type:\n1.saving\n2.current");
		int n=s.nextInt();
		
		switch(n) {
		case 1:
		Savings obj1=new Savings();
		obj1.Amount(100000,23434 );
		break;
		case 2:
		Current obj2=new Current();
		obj2.Amount(1000000, 32433534);
		break;
	}

	}

}
class Savings{
	public void Amount(long amt, long deposite) {
		
		amt = amt + deposite;
		System.out.println("Amount in your account: "+amt);
	}
	
}
class Current{
	public void Amount(long amt, long credit) {
		amt = amt + credit;
		System.out.println("Amount in your account:"+amt);
	}
}
