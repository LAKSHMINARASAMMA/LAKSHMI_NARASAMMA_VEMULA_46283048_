package Default;
import java.util.*;
public class Arraytext {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[15];  
		
		System.out.println("Enetr elements in array: ");
		for(int i=0; i<5; i++)  
		{   
			arr[i]=sc.nextInt();  
		}  
		System.out.println("Array elements are: ");  
		 
		for (int i=0; i<5; i++)   
		{  
			System.out.print(arr[i]+"  ");  
		}  
		System.out.println("\nEnter element you want to search: "); 
		int n = sc.nextInt();
		
		for (int i=0; i<5; i++)   
		{   
			if(arr[i]==n) {
				System.out.print(arr[i]+" is found ");  
			}
	}  
	}
}

		