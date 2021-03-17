//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import static java.lang.System.*;

public class StackTestRunner
{
	public static void main ( String[] args )
	{
		//add test cases
		StackTester obj = new StackTester();
		
		obj.setStack("a b c d e f g h i");
		
		System.out.println(obj);
		
		obj.popEmAll();
	}
}
