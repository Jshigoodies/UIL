import java.io.*;
import java.util.Scanner;

public class Festivals {
	public static void main(String args[]) throws IOException
	{
		File f = new File("festivals.dat");
		Scanner input = new Scanner(f);
		
		int c = input.nextInt();
		
		for(int i = 0; i<c; i++)
		{
			int year = input.nextInt();
			//System.out.println(year);
			if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) //check to see if it is a leap year
			{
				//check festivals that are leap years else it is just a leap year
				if(year % 18 == 0)
				{
					System.out.println(year + " is a Brimborion festival year.\n");
				}
				else
				{
					System.out.println(year + " is a leap year.\n");
				}
			}
			else //it is not a leap year
			{
				//check festivals that are not leap years, else it is just an ordinary year
				if(year % 25 == 0)
				{
					System.out.println(year + " is a Narishkeit festival year.\n");
				}
				else
				{
					System.out.println(year + " is a ordinary year.\n");
				}
				
			}
		}
	}
}