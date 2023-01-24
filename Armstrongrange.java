package Default;
import java.util.*;
public class Armstrongrange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num,num1,num2,rem,sum=0;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		for(int i=num1+1;i<num2;i++) {
			num=i;
			while(num>0) {
			rem = num % 10;
			sum = sum +(rem * rem * rem);
			num = num / 10;
		}
			 if(sum == i)
	            {
	                    System.out.print(i+"\n");
	            }
	          
			
			 sum=0;
		}
		sc.close();
	}
}

