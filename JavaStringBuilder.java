package Stringsjava;

public class JavaStringBuilder {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("StringBuffer ");
		sb.append("Is a peer of class string ");
		sb.append("that provides much of ");
		sb.append("the functionallity of string");
		System.out.println(sb);
		
		StringBuilder str = new StringBuilder();
		
		
		str.append("It is used to _ at the specified index position");
		int index = str.indexOf("_");
		System.out.println(index);
		str.insert(index, "insert text");
		System.out.println(str);
		
		StringBuilder str1 = new StringBuilder();
		str1.append("This method returns the reverse object on which It was called");
		str1.reverse();
		System.out.println(str1);
		
	}

}
