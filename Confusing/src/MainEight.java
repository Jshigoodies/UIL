import java.util.Random;

public class MainEight {
	public static void main(String args[])
	{
		Random r = new Random();
		double d = r.nextDouble();
		System.out.printf("%1.1f", d);
		//https://www.geeksforgeeks.org/random-nextdouble-method-in-java-with-examples/
		
		//Returns the nextDouble() from a range of 0.0 to 1.0
		//the 'f string' is the the decimal format. The numbers literally don't matter.
		
		//Random.nextInt(int n) = returns an int from 0 inclusive to 'n' exclusive
		
		
		
		//regex
		//https://www.w3schools.com/java/java_regex.asp
		
		
		
		System.out.println();
		switch(2) //this whole swtich case is a "while loop"
		{
		//testing '2'
		case 1: System.out.println("case 1"); break;
		case 2: System.out.println("case 2"); //break;
		case 3:	System.out.println("case 3"); //break;
		case 4: System.out.println("case 4");
		case 5: System.out.println("case 5");
		default: System.out.println("Default");
		case 6: System.out.println("case 6");
		}
		/*
		 * It will go through all the cases including the default case unless there is a break statement
		 */
		
		
	}
}
