import java.util.*;
import java.io.File;
import java.io.IOException;
public class MainRunner {
	public static void main(String args[]) throws IOException {
		
		File data = new File("./brianna.dat"); 
		//this works, but it can't do the ./brianna.dat or just brianna.dat file no matter where i put it 
		
		Scanner Input = new Scanner(data);
		int small = Input.nextInt();
		int big = small;
		while(Input.hasNextInt())
		{
			int var = Input.nextInt();
			if(small > var)
			{
				small = var;
			}
			if(big < var)
			{
				big = var;
			}
			
		}
		System.out.println(small + " " + big + " " + (big-small));
		
	}
}
