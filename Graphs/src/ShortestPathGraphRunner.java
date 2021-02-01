//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class ShortestPathGraphRunner
{
	public static void main( String[] args ) throws IOException
	{
		File input = new File("graph2.dat");
		Scanner file = new Scanner(input);
		
		int howManyTimes = file.nextInt();
		file.nextLine();
		for(int x=0; x<howManyTimes; x++)
		{
			String input1 = file.nextLine();
			ShortestPathGraph test = new ShortestPathGraph(input1);

			input1=file.nextLine();
			String start = input1.substring(0,1);
			String stop = input1.substring(1,2);

			if(test.contains(start)&&test.contains(stop))
			   test.check(input1.substring(0,1),input1.substring(1,2),"",0);

			out.println(start + " connects to " + stop + " == " + test);
		}
		
	}
}