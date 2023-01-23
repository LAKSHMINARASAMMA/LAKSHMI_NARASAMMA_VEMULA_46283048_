package CollectionsTest;
import java.util.*;
public class TreeMaptest {

	public static void main(String[] args) {
		Contact c1 = new Contact(11111111, "lakshmi", "lakshmi@gmail.com", "female");
		Contact c2 = new Contact(22222222, "saritha", "saritha@gmail.com", "female");
		Contact c3 = new Contact(33333333, "haritha", "haritha@gmail.com", "female");
		
		Map<Long,Contact> cnt = new TreeMap<>(Collections.reverseOrder());
		cnt.put(c1.getPhno(), c1);
		cnt.put(c2.getPhno(), c2);
		cnt.put(c3.getPhno(), c3);
		
		for(long l: cnt.keySet())
			System.out.println(l+" ");
		System.out.println("\n");
		
		for(Contact l: cnt.values()) {
			System.out.println(l.getName()+" ");
			System.out.println(l.getEmail()+" ");
			System.out.println(l.getGender()+" ");
		}
		System.out.println("\n");
		System.out.println(cnt+" ");
		
		for(Map.Entry<Long,Contact> entry : cnt.entrySet()) {
			System.out.println("Key: "+entry.getKey());
			System.out.println("Name: "+entry.getValue().getName());
			System.out.println("Email id: "+entry.getValue().getEmail());
			System.out.println("Gender: "+entry.getValue().getGender());
			System.out.println("\n");
		}
	}

}
