package CollectionsTest;
import java.util.*;
public class TreesetTest {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>(); 
		ts.add("kiwi");
		ts.add("Starfruit");
		ts.add("Cherry");
		ts.add("Tamarind");
		ts.add("Blackberry");
		ts.add("Apricots");
		ts.add("Plum");
		ts.add("Sapota");
		ts.add("Cheery");
		ts.add("kiwi");
		 Iterator<String> i=ts.iterator();  
		  while(i.hasNext()){  
		   System.out.println(i.next());  
		  }  

	}

}
