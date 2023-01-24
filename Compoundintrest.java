package Default;
import java.util.*;
public class Compoundintrest
{
    public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
	    float p, r, t,n;
	    System.out.println("Enter the Principal : ");
	    p = sc.nextFloat();   
	    System.out.println("Enter the Rate of interest : ");
	    r = sc.nextFloat();    
	    System.out.println("Enter the Time period : ");
	    t = sc.nextFloat(); 
	    double si = (p * t * r) / 100;
	    System.out.println("Simple intrest is : "+si);
	    System.out.println("Enter the number of times that interest is compounded per unit");
	    n=sc.nextFloat();
		double amount = p * Math.pow(1 + (r / n), n * t);
	    double ci = amount - p;
	    System.out.println("Compound Interest after " + t + " years: "+ci);
	}
}