import java.util.HashSet;
import java.util.Set;

public class JavaSetHash {
	public static void main(String args[])
	{
		Set<Integer> vals;
		vals = new HashSet<Integer>(); 
		
		vals.add(3);
		vals.add(4);
		vals.add(5); 
		
		System.out.println(vals.add(3)); //already added so it shows false
		
		vals.add(-5);
		
		System.out.println(vals); //no order
		
		Set<String> vals2;
		vals2 = new HashSet<String>(); //Works for Strings
		
		vals2.add("a");
		vals2.add("ch");
		vals2.add("cheeee"); //pretty sure it is the ASCII value order from least to greatest
		
		System.out.println(vals2);
		
		Set<Double> vals3;
		vals3 = new HashSet<Double>(); //Works for Doubles
		vals3.add(0.1);
		vals3.add(0.9);
		vals3.add(0.3);
		
		System.out.println(vals3); //no order
		
		vals3.remove(0.9);
		
		System.out.println(vals3);
	}
}
