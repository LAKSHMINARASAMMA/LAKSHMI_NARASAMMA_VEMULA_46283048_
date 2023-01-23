package Objectoriented;
import java.util.*;
abstract class DessertItem{
	
	abstract int getCase();
}
class Candy extends DessertItem{
	private String item;
	private int rupee;
	Candy(String item, int rupee){
		super();
	}
	public void setCase(String item, int rupee) {
		this.item = item;
		this.rupee = rupee;
		
	}
	public int getCase() {
		return this.rupee;
	}
}


class Cookie extends DessertItem{
	
	private String item;
	private int rupee;
	Cookie(String item, int rupee){
		super();
	}
	public void setCase(String item, int rupee) {
		this.item = item;
		this.rupee = rupee;
		
	}
	public int getCase() {
		return this.rupee;
	}	
}


class IceCreame extends DessertItem{
	private String item;
	private int rupee;
	IceCreame(String item, int rupee){
		super();
	}
	public void setCase(String item, int rupee) {
		this.item = item;
		this.rupee = rupee;
		
	}
	public int getCase() {
		return this.rupee;
	}	
}


class DessertItemstext {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("What is your role customer or owner:");
		String str = sc.nextLine();
		String owner,customer;
		if(str=="owner") {
			if(item=="Candy")
		}else {
			
		}

	}

}
