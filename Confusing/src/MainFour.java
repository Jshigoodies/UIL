
public class MainFour {
	public static void main(String args[])
	{
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Short.MAX_VALUE);
		
		
		
		
		
		
		int x = 4, y =-4, a= -2;
		while(a<=2)
		{
			if(a++ > 0 && x-- == ++y)
			{
				System.out.print("# ");
			}
			else
			{
				System.out.print("* ");
			}
			System.out.println(x+ " " + y + " " + a);
		}
		System.out.println(x+ " " + y + " " + a);
		//The if condition is where i went wrong. It only checks the first a++ > 0. If it's false, then it doesn't even need to do to the next conditional statements
		
		
		
		
		String r = "apple";
		String R = "apple";
		String p = new String("apple");
		String s = p;
		System.out.print(r.equals(p) + " ");
		System.out.print((r == p) + " ");
		System.out.println((r == s) + " ");
		
		
		/*
		 * Queue<String> list = new LinkedList<String>();
		 * .poll() goes to the first one and returns it and then deletes it
		 * .remove() goes to the first one and returns it and then deletes it
		 * .peek() goes to the first one and returns it
		 */
		
		
		
		
		
		
		
		
		
		
		//https://www.baeldung.com/java-algorithm-complexity    <--- Big O notation
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * A variable may not begin with any non-letter character other than an underscore (_) or a dollar sign ($)
		 */
		
		
		
		
		
		//https://en.wikipedia.org/wiki/List_of_logic_symbols        <-- Truth Table
	}
}

