package Default;
import java.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
public class CurrentHashMapexample {
	
	    public static void main(String[] args) {
	        HashMap<String, Integer> evenNumbers = new HashMap<>();
	        evenNumbers.put("Two", 2);
	        evenNumbers.put("Four", 4);
	        System.out.println("HashMap: " + evenNumbers);
	        ConcurrentHashMap<String, Integer> numbers = new ConcurrentHashMap<>(evenNumbers);
	        numbers.put("Three", 3);
	        System.out.println("ConcurrentHashMap: " + numbers);
	    }
	}

