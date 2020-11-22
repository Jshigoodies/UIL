import java.util.TreeSet;
import java.util.Iterator;
import java.util.Set;

public class JavaSetTree {
	public static void main(String args[])
	{
		Set<Integer> vals = new TreeSet<Integer>();
		vals.add(99);
		vals.add(-93);
		vals.add(63);
		
		System.out.println(vals.add(99)); //already added
		
		vals.add(-67);
		
		System.out.println(vals); //order
		
		Set<String> vals2 = new TreeSet<String>();
		vals2.add("a");
		vals2.add("c");
		vals2.add("b");
		
		System.out.println(vals2); //order
		
		Set<Double> value = new TreeSet<Double>(); //puts it in order
		value.add(2.3445);
		value.add(3.645);
		value.add(-2.45);
		Iterator<Double> it = value.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//or
		
		for(double dec : value)
		{
			System.out.println(dec);
		}
		
	}
}
