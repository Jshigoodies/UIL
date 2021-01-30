//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GraphRunner
{
	public static void main( String[] args ) throws IOException
	{
		Scanner file = new Scanner(new File("graph1.dat"));
		int howManyTimes = file.nextInt();
		file.nextLine();
		for(int x=0; x<howManyTimes; x++)
		{
			//add code here
			String input = file.nextLine(); //that whole line of paired letters need to be converted into a string array in the Graph class
			Graph letList = new Graph(input);
			
			input = file.nextLine(); //the checking phase
			String start = input.substring(0,1);
			String stop = input.substring(1);
			//System.out.println(start + " " + stop); //printing out the right letters
			
			if(letList.contains(start)&&letList.contains(stop))
			{
				letList.check(start, stop, "");
			}

				System.out.println(start + " CONNECTS TO " + stop + " == " + letList);
			
			
			
		}
	}
}