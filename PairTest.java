package GenericsAss;
import java.util.Date;
class Pair<k,v> {

	private k obj1;
	private v obj2;
	
	public Pair(k obj1, v obj2) {
		this.obj1 = obj1;
		this.obj2=obj2;
	}
	public k getObj1() {
		return obj1; 
	}
	public v getObj2() {
		return obj2; 
	}

}
public class PairTest{
	public static void main(String[] args) {
		Pair<String, String> p1 = new Pair<String, String>("1","Hello");
		System.out.println(p1.getObj1()+ "=" +p1.getObj2());
		
		Date date=new Date();
		Pair<String, java.util.Date> p2 = new Pair<String, java.util.Date>("Today is ",date);
		System.out.println(p2.getObj1()+ "=" +p2.getObj2());
		
	}
}


