//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;
import static java.lang.System.*;

public class BiDirectionalGraphRunner
{
	public static void main( String[] args ) throws IOException
	{
		Scanner input = new Scanner(new File("ibidgraph.dat"));
		int cases = input.nextInt();
		input.nextLine();
		for(int i = 0; i < cases; i++)
		{
			BiDirectionalGraph test = new BiDirectionalGraph(input.nextLine());
			String[] names = input.nextLine().split(" ");
			
			String start = names[0];
			String stop = names[1];
			
			boolean chk = false;
			
			if(test.contains(start)&&test.contains(stop))
			{
				test.check(start,  stop,  new TreeSet<String>());
			}
			System.out.println(test);
		}
	}
}