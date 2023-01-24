package Default;
import java.util.*;
public class Bubblesort {
	public static void main(String args[]) {
		int n, temp;
		int arr[] = new int[15];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements to be entered:" );
		n = sc.nextInt();
		System.out.println("Enter elements:");
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("The sorted elements are : ");
		for(int i=0;i<n;i++) {
			System.out.println("  "+arr[i]);
		}
	}
	

}
