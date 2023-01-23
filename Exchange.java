package GenericsAss;
import java.util.ArrayList;
class Exchange1<E> {
	
	ArrayList<E> arrlist = new ArrayList<>();
	public void swap(E a, E b){
		arrlist.add(b);
		arrlist.add(a);
	}

}
public class Exchange{
	public static void main(String[] args) {
		ArrayList<Integer> arrlist = new ArrayList<>();
		arrlist.add(1000);
		arrlist.add(1001);
		arrlist.add(1002);
		arrlist.add(1003);
		
		
		Exchange1<Integer> ex = new Exchange1<>();
		for(int i=1;i<arrlist.size();i+=2) {
			ex.swap(arrlist.get(i-1), arrlist.get(i));
		}
		for(Integer a:ex.arrlist) {
			System.out.println(a);
		}
	}

}
