package Default;
import java.util.*;
public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, num1,rem,sum=0;
		num=sc.nextInt();
		num1=num;
		while(num1!=0) {
			rem = num1 % 10;
			sum = sum +(rem * rem * rem);
			num1 = num1 / 10;
		}
		if(sum==num) {
			System.out.println("The number is armstrong: "+num);
		}else {
			System.out.println("The number is not armstrong: "+num);
		}

	}

}
