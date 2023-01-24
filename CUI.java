package Default;
import java.util.*;
public class CUI {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter password: ");
		String pwd = sc.nextLine();
		for(int i=0;i<3;i++) {
		System.out.println("Re enter name: ");
		String name1 = sc.nextLine();
		System.out.println("Re enter password: ");
		String pwd1 = sc.nextLine();
			int cnt=0;
		if((name.equals(name1)) && (pwd.equals(pwd1))) {
			System.out.println(name+" "+"welcome");
			System.exit(0);
			  
		}else {
			
				cnt=cnt+1;
				
		if(cnt<=3) {
				System.out.println("Contact Admin");
				
			}
		}
		break;
		}
}
}

