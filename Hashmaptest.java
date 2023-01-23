package GenericsAss;
import java.util.HashMap;

public class Hashmaptest {

	
	public static void main(String[] args) {
		
		HashMap<Integer,Double> hashmap = new HashMap<>();
		
		hashmap.put(111, 1.11);
		hashmap.put(222,2.22);
		hashmap.put(333,3.33);
		hashmap.put(444,4.44);
		hashmap.put(555,5.55);
		hashmap.put(666,6.66);
		hashmap.put(777,7.77);
		hashmap.put(888,8.88);
		hashmap.put(999,9.99);
		hashmap.put(1000,10.00);
		
		hashmap.forEach((k,v) -> System.out.println(k + " "+v));
	}

}
